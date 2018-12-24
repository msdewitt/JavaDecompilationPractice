package org.powerbot.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class NUl extends java.util.logging.Handler
{
  private final File jdField_null;
  private WeakReference<OutputStream> jdField_byte;
  private final Formatter jdField_new;
  private final Charset jdField_void;
  
  public NUl(File a, Formatter a) throws java.io.FileNotFoundException
  {
    jdField_null = a;
    jdField_new = a;
    a;a.<init>(new FileOutputStream(a));jdField_byte = a;
    ":Q)(W"jdField_void = Charset.forName(org.powerbot.bot.cache.CacheWorker.jdMethod_this(a));
  }
  
  public void publish(LogRecord a)
  {
    synchronized (jdField_null) {
      try {
        Object localObject1;
        if (jdField_byte == null) {
          a;a.<init>(localObject1 = new FileOutputStream(jdField_null));jdField_byte = a;tmpTernaryOp = localObject1; break label93; throw a;

        }
        else if ((localObject1 = (OutputStream)jdField_byte.get()) == null) {
          a;new WeakReference(tmp84_72); int tmp78_77 = 1; int tmp79_78 = tmp78_77;tmp79_78;jdField_null.<init>(tmp78_77, tmp79_78);localObject1 = tmp72_69;jdField_byte = a;
        }
        label93:
        ((OutputStream)localObject1).write(jdField_new.format(a).getBytes(jdField_void)); tmpTernaryOp = ???;
      }
      catch (IOException localIOException1) {
        return;
      }
      throw new java/lang/ref/WeakReference;
    }
  }
  
  /* Error */
  public void flush()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 27	org/powerbot/util/NUl:null	Ljava/io/File;
    //   4: dup
    //   5: astore_2
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 41	org/powerbot/util/NUl:byte	Ljava/lang/ref/WeakReference;
    //   11: ifnull +17 -> 28
    //   14: aload_0
    //   15: getfield 41	org/powerbot/util/NUl:byte	Ljava/lang/ref/WeakReference;
    //   18: invokevirtual 65	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   21: checkcast 67	java/io/OutputStream
    //   24: goto +5 -> 29
    //   27: athrow
    //   28: aconst_null
    //   29: astore_1
    //   30: aload_2
    //   31: monitorexit
    //   32: aload_1
    //   33: goto +10 -> 43
    //   36: athrow
    //   37: astore_3
    //   38: aload_2
    //   39: monitorexit
    //   40: aload_3
    //   41: athrow
    //   42: athrow
    //   43: ifnull +9 -> 52
    //   46: aload_1
    //   47: invokevirtual 98	java/io/OutputStream:flush	()V
    //   50: return
    //   51: astore_2
    //   52: return
    // Line number table:
    //   Java source line #49	-> byte code offset #0
    //   Java source line #50	-> byte code offset #7
    //   Java source line #51	-> byte code offset #30
    //   Java source line #53	-> byte code offset #42
    //   Java source line #55	-> byte code offset #46
    //   Java source line #57	-> byte code offset #50
    //   Java source line #56	-> byte code offset #51
    //   Java source line #59	-> byte code offset #52
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	53	0	a	NUl
    // Exception table:
    //   from	to	target	type
    //   7	27	37	finally
    //   28	32	37	finally
    //   37	40	37	finally
    //   46	50	51	java/io/IOException
  }
  
  /* Error */
  public void close()
    throws java.lang.SecurityException
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 27	org/powerbot/util/NUl:null	Ljava/io/File;
    //   4: dup
    //   5: astore_2
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 41	org/powerbot/util/NUl:byte	Ljava/lang/ref/WeakReference;
    //   11: ifnull +17 -> 28
    //   14: aload_0
    //   15: getfield 41	org/powerbot/util/NUl:byte	Ljava/lang/ref/WeakReference;
    //   18: invokevirtual 65	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   21: checkcast 67	java/io/OutputStream
    //   24: goto +5 -> 29
    //   27: athrow
    //   28: aconst_null
    //   29: astore_1
    //   30: aload_2
    //   31: monitorexit
    //   32: aload_1
    //   33: goto +10 -> 43
    //   36: athrow
    //   37: astore_3
    //   38: aload_2
    //   39: monitorexit
    //   40: aload_3
    //   41: athrow
    //   42: athrow
    //   43: ifnull +18 -> 61
    //   46: aload_1
    //   47: invokevirtual 103	java/io/OutputStream:close	()V
    //   50: return
    //   51: astore_2
    //   52: new 101	java/lang/SecurityException
    //   55: dup
    //   56: aload_2
    //   57: invokespecial 106	java/lang/SecurityException:<init>	(Ljava/lang/Throwable;)V
    //   60: athrow
    //   61: return
    // Line number table:
    //   Java source line #64	-> byte code offset #0
    //   Java source line #65	-> byte code offset #7
    //   Java source line #66	-> byte code offset #30
    //   Java source line #68	-> byte code offset #42
    //   Java source line #70	-> byte code offset #46
    //   Java source line #73	-> byte code offset #50
    //   Java source line #71	-> byte code offset #51
    //   Java source line #72	-> byte code offset #52
    //   Java source line #75	-> byte code offset #61
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	a	NUl
    // Exception table:
    //   from	to	target	type
    //   7	27	37	finally
    //   28	32	37	finally
    //   37	40	37	finally
    //   46	50	51	java/io/IOException
  }
}
