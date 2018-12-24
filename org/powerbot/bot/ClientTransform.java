package org.powerbot.bot;

import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.SecretKeySpec;
import org.powerbot.bot.rt6.NodeQueue;
import org.powerbot.gui.BotChrome;
import org.powerbot.gui.coM1;
import org.powerbot.misc.GoogleAnalytics;
import org.powerbot.script.Input;
import org.powerbot.script.StringUtils;
import org.powerbot.util.HttpUtils;

class ClientTransform
{
  private static final String jdField_byte = Input.jdMethod_this("BY@ML^Q");
  private static final String jdField_new = NodeQueue.jdMethod_this("S_5");
  private static final String jdField_void = Input.jdMethod_this("XKJ2");
  
  ClientTransform() {}
  
  /* Error */
  public static String hash(Map<String, byte[]> a)
  {
    // Byte code:
    //   0: ldc 28
    //   2: invokestatic 34	org/powerbot/script/Input:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   5: invokestatic 40	java/security/MessageDigest:getInstance	(Ljava/lang/String;)Ljava/security/MessageDigest;
    //   8: astore_1
    //   9: goto +14 -> 23
    //   12: athrow
    //   13: astore_2
    //   14: new 42	java/lang/RuntimeException
    //   17: dup
    //   18: aload_2
    //   19: invokespecial 45	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   22: athrow
    //   23: new 47	java/util/TreeSet
    //   26: dup
    //   27: aload_0
    //   28: invokeinterface 53 1 0
    //   33: invokespecial 56	java/util/TreeSet:<init>	(Ljava/util/Collection;)V
    //   36: dup
    //   37: astore_2
    //   38: invokeinterface 62 1 0
    //   43: dup
    //   44: astore_2
    //   45: invokeinterface 68 1 0
    //   50: ifeq +32 -> 82
    //   53: aload_2
    //   54: invokeinterface 72 1 0
    //   59: checkcast 74	java/lang/String
    //   62: astore_3
    //   63: aload_1
    //   64: aload_0
    //   65: aload_3
    //   66: invokeinterface 78 2 0
    //   71: checkcast 80	[B
    //   74: invokevirtual 84	java/security/MessageDigest:update	([B)V
    //   77: aload_2
    //   78: goto -33 -> 45
    //   81: athrow
    //   82: aload_1
    //   83: invokevirtual 88	java/security/MessageDigest:digest	()[B
    //   86: invokestatic 94	org/powerbot/script/StringUtils:byteArrayToHexString	([B)Ljava/lang/String;
    //   89: areturn
    // Line number table:
    //   Java source line #35	-> byte code offset #0
    //   Java source line #38	-> byte code offset #9
    //   Java source line #36	-> byte code offset #13
    //   Java source line #37	-> byte code offset #14
    //   Java source line #39	-> byte code offset #23
    //   Java source line #40	-> byte code offset #38
    //   Java source line #41	-> byte code offset #63
    //   Java source line #42	-> byte code offset #78
    //   Java source line #43	-> byte code offset #82
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	a	Map
    // Exception table:
    //   from	to	target	type
    //   0	9	13	java/security/NoSuchAlgorithmException
  }
  
  public static ReflectorSpec get(String a, String a)
    throws IOException
  {
    Object localObject1 = a; int 
    

      tmp27_26 = 1;tmp27_26; int tmp32_31 = 1;tmp32_31;Object localObject2 = tmp32_31;
    MessageDigest localMessageDigest;
    try
    {
      localMessageDigest = MessageDigest.getInstance(Input.jdMethod_this("XKJ2"));
    } catch (NoSuchAlgorithmException localNoSuchAlgorithmException) {
      throw new IOException(localNoSuchAlgorithmException); }
    throw localMessageDigest;
    
    throw new byte[tmp27_26];16.update(StringUtils.getBytesUtf8(a)); int 
      tmp79_78 = 1;tmp79_78; int tmp83_82 = 1;tmp83_82; Object tmp86_85 = localObject2;System.arraycopy(tmp79_78, 0, tmp86_85, tmp83_82, tmp86_85.length); int 
      tmp97_96 = 1;tmp97_96; Object tmp100_99 = localObject2;0.<init>(tmp100_99, tmp97_96, tmp100_99.length, NodeQueue.jdMethod_this("@NBZNIS"));localNoSuchAlgorithmException = new javax/crypto/spec/SecretKeySpec; int 
    
      tmp123_122 = 1;tmp123_122; int tmp129_128 = 1;tmp129_128; int tmp131_129 = tmp129_128; int tmp134_133 = 1;tmp134_133;0[tmp134_133] = a; int tmp138_131 = tmp131_129; int tmp140_139 = 1; int tmp141_140 = tmp140_139;tmp141_140;tmp140_139[tmp141_140] = a;tmp131_129.<init>(String.format(tmp138_131, tmp138_131)); HttpURLConnection 
      tmp156_155 = (localObject2 = HttpUtils.jdMethod_this(new Object[tmp123_122]));tmp156_155.connect();
    a = tmp156_155.getResponseCode();
    GoogleAnalytics.getInstance().pageview((String)localObject1, Integer.toString(a)); int 
      tmp180_179 = 1;tmp180_179; if (200 == tmp180_179)
    {
      try
      {
        int tmp197_196 = ;;;;
      } catch (GeneralSecurityException localGeneralSecurityException1) {
        throw new IOException(localGeneralSecurityException1); }
      throw a;
      try {
        return ReflectorSpec.parse(new CipherInputStream(HttpUtils.jdMethod_this((URLConnection)localObject2), (Cipher)localObject1));
      } catch (NullPointerException localNullPointerException1) {
        throw new IOException(localNullPointerException1);
      } }
    int tmp253_252 = 1;tmp253_252; if (403 != tmp253_252) { int tmp263_262 = 1;tmp263_262; if (404 != tmp263_262) {}
    } else { throw new IOException(new IllegalStateException());
    }
    
    throw new IOException(new RuntimeException());
  }
  
  private static HttpURLConnection jdMethod_this(String a, String a, String a) throws IOException {
    a = HttpUtils.jdMethod_this(new URL(a)); int 
      tmp20_18 = 1;tmp20_18; int tmp26_25 = 1;tmp26_25; int tmp28_26 = tmp26_25; int tmp31_30 = 1;tmp31_30;0[tmp31_30] = NodeQueue.jdMethod_this("SOCsu").toLowerCase();new Object[tmp20_18].addRequestProperty(String.format(tmp28_26, tmp28_26), Input.jdMethod_this("7;2")); int 
      tmp61_59 = 1;tmp61_59; int tmp67_66 = 1;tmp67_66; int tmp69_67 = tmp67_66; int tmp72_71 = 1;tmp72_71;0[tmp72_71] = Input.jdMethod_this("QXAdw").toLowerCase();new Object[tmp61_59].addRequestProperty(String.format(tmp69_67, tmp69_67), a);
    return a;
  }
  
  private static void jdMethod_this(String a, String a, Map<String, byte[]> a) throws IOException, ClientTransform.PendingException
  {
    String str = a; int 
    

      tmp27_26 = 1;tmp27_26; int tmp32_31 = 1;tmp32_31;Object localObject1 = tmp32_31;
    Object localObject2;
    try
    {
      localObject2 = MessageDigest.getInstance(Input.jdMethod_this("XKJ2"));
    } catch (NoSuchAlgorithmException localNoSuchAlgorithmException) {
      return; }
    throw ((Throwable)localObject2);
    
    throw new byte[tmp27_26];16.update(StringUtils.getBytesUtf8(a)); int 
      tmp72_71 = 1;tmp72_71; int tmp76_75 = 1;tmp76_75; Object tmp80_78 = localObject1;System.arraycopy(tmp72_71, 0, tmp80_78, tmp76_75, tmp80_78.length); int 
      tmp91_90 = 1;tmp91_90; Object tmp95_93 = localObject1;0.<init>(tmp95_93, tmp91_90, tmp95_93.length, NodeQueue.jdMethod_this("@NBZNIS"));localNoSuchAlgorithmException = new javax/crypto/spec/SecretKeySpec;
    
    1; int tmp118_117 = 1;tmp118_117; int tmp120_118 = tmp118_117; int tmp123_122 = 1;tmp123_122;0[tmp123_122] = a; HttpURLConnection 
      tmp138_136 = (localObject1 = jdMethod_this(String.format(tmp120_118, tmp120_118), a, a)); HttpURLConnection tmp139_138 = tmp138_136; int tmp142_141 = 1;tmp142_141;0.setInstanceFollowRedirects(tmp142_141);tmp139_138
      .connect();
    int i = tmp138_136.getResponseCode();
    GoogleAnalytics.getInstance().pageview(Input.jdMethod_this("$sylhfxp"), Integer.toString(i));
    switch (tmp139_138
    


      .getResponseCode()) {
    case 303: 
      while (0 != 0) {}
      a = jdMethod_this(((HttpURLConnection)localObject1).getHeaderField(NodeQueue.jdMethod_this("Pn`hhso")), a, a);
      a.setRequestMethod(Input.jdMethod_this("S^W")); int 
        tmp252_251 = 1;tmp252_251;1.setDoOutput(tmp252_251);
      
      try
      {
        int tmp269_268 = ;;;;;
      } catch (GeneralSecurityException localGeneralSecurityException) {
        throw new IOException(localGeneralSecurityException);
      }
      localGeneralSecurityException = new CipherOutputStream(new GZIPOutputStream(a.getOutputStream()), (Cipher)localObject2); String tmp315_314 = a; GeneralSecurityException 
        tmp319_317 = localGeneralSecurityException; GeneralSecurityException tmp320_319 = tmp319_317;jdMethod_this(a, tmp320_319);tmp319_317
        .flush();tmp320_319
        .close();
      i = tmp315_314.getResponseCode();tmp315_314
        .disconnect();
      GoogleAnalytics.getInstance().pageview(Input.jdMethod_this(",{qd`npx,~sgljg"), Integer.toString(i)); int 
        tmp379_378 = 1;tmp379_378; if (200 != tmp379_378) { int tmp390_389 = 1;tmp390_389; if (202 != tmp390_389) {}
      } else { throw new PendingException(180030);
      }
      throw new IOException(Integer.toString(i) + Input.jdMethod_this("*"));
    
    case 202: 
      throw new PendingException(180030);
    }
    GoogleAnalytics.getInstance().pageview(NodeQueue.jdMethod_this(".~tjyu3g}hptnd"), "");
    throw new IOException(Integer.toString(((HttpURLConnection)localObject1).getResponseCode()) + NodeQueue.jdMethod_this("("));
  }
  
  public static void submit(Logger a, String a, String a, Map<String, byte[]> a, BotChrome a)
  {
    for (;;) {
      int tmp21_20 = 1;tmp21_20; int tmp26_25 = 1;tmp26_25;a.warning(tmp21_20.substring(6, tmp26_25) + NodeQueue.jdMethod_this("(<―<qpd}ry!k`uu"));
      try {
        jdMethod_this(a, a, a);
        return;throw new StringBuilder().insert(0, Input.jdMethod_this("Ol|mgljgbml#~sobf++"));







      }
      catch (IOException localIOException)
      {






        return;throw a;
      }
      catch (PendingException localPendingException)
      {
        int tmp72_71 = 1;tmp72_71;int i = 1000 / tmp72_71;
        a;a.<init>();1;1;1; int tmp171_170 = 1;tmp171_170;i.warning(60 < tmp127_126 ? i + Input.jdMethod_this("+pn`dmop") : i.append((int)Math.ceil(60 / tmp171_170)).append(NodeQueue.jdMethod_this("<luoiuyr")).toString()); int 
        
          tmp211_210 = 1;tmp211_210;a.<init>(0, tmp211_210, "");
        ActionEvent localActionEvent; ActionListener[] arrayOfActionListener; int j = (arrayOfActionListener = jdField_null.get()).jdField_super.getActionListeners()).length;;;;;
        

        try {}catch (InterruptedException localInterruptedException1)
        {
          int k;
          
          return;
        }
        



        throw (localActionEvent = new java/awt/event/ActionEvent);
      }
    }
  }
  
  /* Error */
  private static void jdMethod_this(Map<String, byte[]> a, OutputStream a)
    throws IOException
  {
    // Byte code:
    //   0: ldc_w 381
    //   3: aload_1
    //   4: invokestatic 384	org/powerbot/bot/ClientTransform:this	(ILjava/io/OutputStream;)V
    //   7: aload_0
    //   8: invokeinterface 388 1 0
    //   13: invokeinterface 391 1 0
    //   18: dup
    //   19: astore_2
    //   20: invokeinterface 68 1 0
    //   25: ifeq +29 -> 54
    //   28: aload_2
    //   29: invokeinterface 72 1 0
    //   34: checkcast 80	[B
    //   37: dup
    //   38: astore_3
    //   39: arraylength
    //   40: aload_1
    //   41: invokestatic 384	org/powerbot/bot/ClientTransform:this	(ILjava/io/OutputStream;)V
    //   44: aload_2
    //   45: aload_1
    //   46: aload_3
    //   47: invokevirtual 394	java/io/OutputStream:write	([B)V
    //   50: goto -30 -> 20
    //   53: athrow
    //   54: iconst_1
    //   55: dup
    //   56: dup
    //   57: pop2
    //   58: aload_1
    //   59: invokestatic 384	org/powerbot/bot/ClientTransform:this	(ILjava/io/OutputStream;)V
    //   62: return
    // Line number table:
    //   Java source line #179	-> byte code offset #0
    //   Java source line #181	-> byte code offset #7
    //   Java source line #182	-> byte code offset #39
    //   Java source line #183	-> byte code offset #45
    //   Java source line #184	-> byte code offset #50
    //   Java source line #186	-> byte code offset #54
    //   Java source line #187	-> byte code offset #62
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	63	0	a	Map
    //   0	63	1	a	OutputStream
  }
  
  private static void jdMethod_this(int a, OutputStream a)
    throws IOException
  {
    int tmp11_10 = 1;tmp11_10;a.write(24 >>> tmp11_10); int 
      tmp20_19 = 1;tmp20_19; int tmp27_26 = 1;tmp27_26;(16 >>> tmp20_19).write(0xFF & tmp27_26); int 
      tmp36_35 = 1;tmp36_35; int tmp43_42 = 1;tmp43_42;(8 >>> tmp36_35).write(0xFF & tmp43_42); int 
      tmp53_52 = 1;tmp53_52;a.write(0xFF & tmp53_52);
  }
  
  public static final class PendingException extends Exception {
    private static final long serialVersionUID = -6937383190630297216L;
    private final int jdField_void;
    
    PendingException(int a) {
      jdField_void = a;
    }
    
    int jdMethod_this() {
      return jdField_void;
    }
  }
}
