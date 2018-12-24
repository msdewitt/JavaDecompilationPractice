package org.powerbot.script;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import java.util.zip.Adler32;
import javax.imageio.ImageIO;
import org.powerbot.Configuration;
import org.powerbot.bot.ScriptClassLoader;
import org.powerbot.bot.ScriptController;
import org.powerbot.gui.BotChrome;
import org.powerbot.misc.ScriptBundle;
import org.powerbot.misc.ScriptList;
import org.powerbot.util.HttpUtils;
import org.powerbot.util.IOUtils;
import org.powerbot.util.Ini;








public abstract class AbstractScript<C extends ClientContext>
  implements Script
{
  public final Logger log = Logger.getLogger(getClass().getName());
  


  protected final C ctx;
  

  protected final Properties settings;
  

  private final List<Runnable>[] exec;
  

  private final File dir;
  


  public AbstractScript()
  {
    List[] arrayOfList = (List[])new List[Script.State.values().length];
    exec = arrayOfList;
    for (int i = 0; i < exec.length; i++) {
      exec[i] = new CopyOnWriteArrayList();
    }
    
    ClientContext localClientContext = currentThreadgetContextClassLoaderctx;
    Class[] arrayOfClass = { (Class)ScriptList.getScriptTypeArg(getClass()), null };
    arrayOfClass[1] = (arrayOfClass[0] == null ? null : ScriptList.getPrimaryClientContext(arrayOfClass[0]));
    if ((arrayOfClass[0] != null) && (arrayOfClass[0] != arrayOfClass[1])) {
      try {
        Constructor localConstructor = arrayOfClass[0].getDeclaredConstructor(new Class[] { arrayOfClass[1] });
        boolean bool = localConstructor.isAccessible();
        localConstructor.setAccessible(true);
        
        localObject2 = (ClientContext)localConstructor.newInstance(new Object[] { localClientContext });
        localConstructor.setAccessible(bool);
        ctx = ((ClientContext)localObject2);
      } catch (Exception localException1) {
        throw new IllegalStateException(localException1);
      }
    }
    else {
      localObject1 = localClientContext;
      if (localObject1 == null) {
        throw new IllegalStateException("context unset");
      }
      ctx = ((ClientContext)localObject1);
    }
    
    Object localObject1 = { null, getName(), getClass().getName() };
    String str = "-";
    

    Object localObject2 = (ScriptController)ctx.controller;
    Object localObject3 = bundle != null ? (ScriptBundle)bundle.get() : null;
    if ((localObject3 != null) && (definition != null)) {
      localObject1[0] = definition.getID().replace('/', '-');
    }
    
    for (Object localObject5 : localObject1) {
      if ((localObject5 != null) && (!localObject5.isEmpty())) {
        str = localObject5.replace("[^\\w\\s]", "_").trim();
        break;
      }
    }
    
    dir = new File(new File(Configuration.TEMP, "RSBot"), str);
    if (!dir.isDirectory()) {
      dir.mkdirs();
    }
    ??? = new File(dir, "settings.1.ini");
    settings = new Properties();
    
    if ((((File)???).isFile()) && (((File)???).canRead())) {
      settings.putAll(new Ini().read((File)???).get().getMap());
    }
    
    exec[Script.State.STOP.ordinal()].add(new Runnable()
    {
      public void run() {
        if (settings.isEmpty()) {
          if (val$ini.isFile()) {
            val$ini.delete();
          }
        } else {
          if (!dir.isDirectory()) {
            dir.mkdirs();
          }
          
          HashMap localHashMap = new HashMap(settings.size());
          synchronized (settings) {
            for (Map.Entry localEntry : settings.entrySet()) {
              localHashMap.put(localEntry.getKey().toString(), localEntry.getValue().toString());
            }
          }
          new Ini().put(localHashMap).write(val$ini);
        }
      }
    });
  }
  



  public final List<Runnable> getExecQueue(Script.State arg0)
  {
    return exec[arg0.ordinal()];
  }
  




  public long getTotalRuntime()
  {
    AtomicLong[] arrayOfAtomicLong = ctx.controller).times;
    long l = arrayOfAtomicLong[Script.State.STOP.ordinal()].get();
    return TimeUnit.NANOSECONDS.toMillis((l == 0L ? System.nanoTime() : l) - arrayOfAtomicLong[Script.State.START.ordinal()].get());
  }
  




  public long getRuntime()
  {
    AtomicLong[] arrayOfAtomicLong = ctx.controller).times;
    long l = arrayOfAtomicLong[Script.State.STOP.ordinal()].get();
    return TimeUnit.NANOSECONDS.toMillis((l == 0L ? System.nanoTime() : l) - arrayOfAtomicLong[Script.State.START.ordinal()].get() - arrayOfAtomicLong[Script.State.RESUME.ordinal()].get());
  }
  




  public File getStorageDirectory()
  {
    if (!dir.isDirectory()) {
      dir.mkdirs();
    }
    return dir;
  }
  




  public Script.Manifest getManifest()
  {
    return getClass().isAnnotationPresent(Script.Manifest.class) ? (Script.Manifest)getClass().getAnnotation(Script.Manifest.class) : null;
  }
  




  public String getName()
  {
    Script.Manifest localManifest = getManifest();
    return (localManifest == null) || (localManifest.name() == null) ? "" : localManifest.name();
  }
  




  public String getDescription()
  {
    Script.Manifest localManifest = getManifest();
    return (localManifest == null) || (localManifest.description() == null) ? "" : localManifest.description();
  }
  




  public Map<String, String> getProperties()
  {
    Script.Manifest localManifest = getManifest();
    String str;
    if ((localManifest == null) || ((str = localManifest.properties()) == null)) {
      return Collections.emptyMap();
    }
    return ScriptBundle.parseProperties(str);
  }
  





  public File getFile(String arg0)
  {
    File localFile = getStorageDirectory();
    
    for (String str : arg0.split("\\|/")) {
      localFile = new File(localFile, str);
    }
    
    ??? = localFile.getParentFile();
    if (??? != null) {
      ((File)???).mkdirs();
    }
    
    return localFile;
  }
  






  public File download(String arg0, String arg1)
  {
    File localFile = getFile(arg1);
    URL localURL;
    try
    {
      localURL = new URL(arg0);
    } catch (MalformedURLException localMalformedURLException) {
      return localFile;
    }
    try
    {
      HttpUtils.download(localURL, localFile);
    }
    catch (IOException localIOException) {}catch (SecurityException localSecurityException) {}
    

    return localFile;
  }
  





  public String downloadString(String arg0)
  {
    String str1 = "http/" + Integer.toHexString(arg0.hashCode());
    download(arg0, str1);
    FileInputStream localFileInputStream = null;
    try {
      localFileInputStream = new FileInputStream(getFile(str1));
      return IOUtils.readString(localFileInputStream);
    }
    catch (IOException localIOException4) {}finally {
      if (localFileInputStream != null) {
        try {
          localFileInputStream.close();
        }
        catch (IOException localIOException3) {}
      }
    }
    return "";
  }
  





  public BufferedImage downloadImage(String arg0)
  {
    Adler32 localAdler32 = new Adler32();
    localAdler32.update(StringUtils.getBytesUtf8(arg0));
    File localFile = download(arg0, "images/" + Long.toHexString(localAdler32.getValue()));
    try {
      return ImageIO.read(localFile);
    } catch (IOException localIOException) {
      localFile.delete(); }
    return new BufferedImage(1, 1, 2);
  }
  
  public void openURL(String arg0)
  {
    String str1;
    try {
      str1 = "." + new URL(arg0).getHost();
    } catch (MalformedURLException localMalformedURLException) {
      return;
    }
    
    localMalformedURLException = new ArrayList();
    localMalformedURLException.add("powerbot.org");
    localMalformedURLException.add("runescape.com");
    
    for (String str2 : localMalformedURLException) {
      if (str1.endsWith("." + str2)) {
        BotChrome.openURL(arg0);
        return;
      }
    }
  }
  



  public String toString()
  {
    String str = getName();
    return (str == null) || (str.isEmpty()) ? getClass().getSimpleName() : str;
  }
}
