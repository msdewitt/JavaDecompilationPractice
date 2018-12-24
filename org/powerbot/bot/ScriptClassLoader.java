package org.powerbot.bot;

import java.net.URL;
import java.util.Map;
import org.powerbot.script.ClientContext;









public final class ScriptClassLoader
  extends ClassLoader
{
  private final URL jdField_new;
  private final Map<String, byte[]> jdField_void;
  public final ClientContext ctx;
  
  public ScriptClassLoader(ClientContext a, URL a)
  {
    ctx = a;
    jdField_new = a;
    jdField_void = null;
  }
  
  /* Error */
  public ScriptClassLoader(ClientContext a, java.util.zip.ZipInputStream a)
  {
    // Byte code:
    //   0: aconst_null
    //   1: aload_0
    //   2: dup_x1
    //   3: dup_x2
    //   4: aload_1
    //   5: aload_0
    //   6: invokespecial 17	java/lang/ClassLoader:<init>	()V
    //   9: putfield 19	org/powerbot/bot/ScriptClassLoader:ctx	Lorg/powerbot/script/ClientContext;
    //   12: putfield 21	org/powerbot/bot/ScriptClassLoader:new	Ljava/net/URL;
    //   15: new 30	java/util/HashMap
    //   18: aload_0
    //   19: dup
    //   20: pop2
    //   21: dup
    //   22: invokespecial 31	java/util/HashMap:<init>	()V
    //   25: putfield 23	org/powerbot/bot/ScriptClassLoader:void	Ljava/util/Map;
    //   28: aload_2
    //   29: invokevirtual 37	java/util/zip/ZipInputStream:getNextEntry	()Ljava/util/zip/ZipEntry;
    //   32: dup
    //   33: astore_1
    //   34: ifnull +41 -> 75
    //   37: aload_1
    //   38: invokevirtual 43	java/util/zip/ZipEntry:isDirectory	()Z
    //   41: ifeq +8 -> 49
    //   44: aload_2
    //   45: goto -16 -> 29
    //   48: athrow
    //   49: aload_0
    //   50: getfield 23	org/powerbot/bot/ScriptClassLoader:void	Ljava/util/Map;
    //   53: aload_1
    //   54: invokevirtual 47	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   57: aload_2
    //   58: invokestatic 53	org/powerbot/util/IOUtils:this	(Ljava/io/InputStream;)[B
    //   61: invokeinterface 59 3 0
    //   66: aload_2
    //   67: invokevirtual 62	java/util/zip/ZipInputStream:closeEntry	()V
    //   70: pop
    //   71: goto -43 -> 28
    //   74: athrow
    //   75: aload_2
    //   76: invokevirtual 65	java/util/zip/ZipInputStream:close	()V
    //   79: return
    //   80: astore_1
    //   81: return
    //   82: astore_1
    //   83: aload_1
    //   84: invokevirtual 68	java/io/IOException:printStackTrace	()V
    //   87: aload_2
    //   88: invokevirtual 65	java/util/zip/ZipInputStream:close	()V
    //   91: return
    //   92: astore_1
    //   93: return
    //   94: astore_3
    //   95: aload_2
    //   96: invokevirtual 65	java/util/zip/ZipInputStream:close	()V
    //   99: aload_3
    //   100: goto +5 -> 105
    //   103: astore_1
    //   104: aload_3
    //   105: athrow
    //   106: athrow
    // Line number table:
    //   Java source line #29	-> byte code offset #0
    //   Java source line #30	-> byte code offset #9
    //   Java source line #31	-> byte code offset #12
    //   Java source line #32	-> byte code offset #15
    //   Java source line #36	-> byte code offset #28
    //   Java source line #37	-> byte code offset #37
    //   Java source line #38	-> byte code offset #45
    //   Java source line #40	-> byte code offset #49
    //   Java source line #41	-> byte code offset #66
    //   Java source line #47	-> byte code offset #75
    //   Java source line #49	-> byte code offset #79
    //   Java source line #48	-> byte code offset #80
    //   Java source line #50	-> byte code offset #81
    //   Java source line #43	-> byte code offset #82
    //   Java source line #44	-> byte code offset #83
    //   Java source line #47	-> byte code offset #87
    //   Java source line #49	-> byte code offset #91
    //   Java source line #48	-> byte code offset #92
    //   Java source line #50	-> byte code offset #93
    //   Java source line #46	-> byte code offset #94
    //   Java source line #47	-> byte code offset #95
    //   Java source line #49	-> byte code offset #100
    //   Java source line #48	-> byte code offset #103
    //   Java source line #50	-> byte code offset #104
    //   Java source line #51	-> byte code offset #106
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	107	0	a	ScriptClassLoader
    //   0	107	1	a	ClientContext
    //   0	107	2	a	java.util.zip.ZipInputStream
    // Exception table:
    //   from	to	target	type
    //   75	79	80	java/io/IOException
    //   28	48	82	java/io/IOException
    //   49	74	82	java/io/IOException
    //   87	91	92	java/io/IOException
    //   28	48	94	finally
    //   49	74	94	finally
    //   82	87	94	finally
    //   94	95	94	finally
    //   95	99	103	java/io/IOException
  }
  
  /* Error */
  public Class<?> loadClass(String a)
    throws java.lang.ClassNotFoundException
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 82	org/powerbot/bot/ScriptClassLoader:findLoadedClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   5: dup
    //   6: astore_2
    //   7: ifnull +6 -> 13
    //   10: aload_2
    //   11: areturn
    //   12: athrow
    //   13: new 84	java/lang/StringBuilder
    //   16: dup
    //   17: invokespecial 85	java/lang/StringBuilder:<init>	()V
    //   20: iconst_0
    //   21: aload_1
    //   22: bipush 46
    //   24: iconst_1
    //   25: dup
    //   26: pop2
    //   27: bipush 47
    //   29: iconst_1
    //   30: dup
    //   31: pop2
    //   32: invokevirtual 91	java/lang/String:replace	(CC)Ljava/lang/String;
    //   35: invokevirtual 95	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   38: ldc 97
    //   40: invokestatic 102	org/powerbot/script/Calculations:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   43: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   49: astore_2
    //   50: aload_0
    //   51: aload_2
    //   52: invokevirtual 113	org/powerbot/bot/ScriptClassLoader:getResourceAsStream	(Ljava/lang/String;)Ljava/io/InputStream;
    //   55: dup
    //   56: astore_3
    //   57: ifnonnull +11 -> 68
    //   60: new 77	java/lang/ClassNotFoundException
    //   63: dup
    //   64: invokespecial 114	java/lang/ClassNotFoundException:<init>	()V
    //   67: athrow
    //   68: aload_0
    //   69: getfield 21	org/powerbot/bot/ScriptClassLoader:new	Ljava/net/URL;
    //   72: ifnonnull +20 -> 92
    //   75: aload_0
    //   76: getfield 23	org/powerbot/bot/ScriptClassLoader:void	Ljava/util/Map;
    //   79: aload_2
    //   80: invokeinterface 118 2 0
    //   85: checkcast 120	[B
    //   88: goto +8 -> 96
    //   91: athrow
    //   92: aload_3
    //   93: invokestatic 123	org/powerbot/util/IOUtils:true	(Ljava/io/InputStream;)[B
    //   96: astore 4
    //   98: aload_0
    //   99: aload_1
    //   100: iconst_0
    //   101: iconst_1
    //   102: dup
    //   103: pop2
    //   104: aload 4
    //   106: dup_x1
    //   107: arraylength
    //   108: invokevirtual 127	org/powerbot/bot/ScriptClassLoader:defineClass	(Ljava/lang/String;[BII)Ljava/lang/Class;
    //   111: areturn
    //   112: astore_2
    //   113: aload_0
    //   114: aload_1
    //   115: invokespecial 129	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   118: areturn
    // Line number table:
    //   Java source line #55	-> byte code offset #0
    //   Java source line #56	-> byte code offset #7
    //   Java source line #57	-> byte code offset #10
    //   Java source line #60	-> byte code offset #13
    //   Java source line #61	-> byte code offset #50
    //   Java source line #62	-> byte code offset #57
    //   Java source line #63	-> byte code offset #60
    //   Java source line #65	-> byte code offset #68
    //   Java source line #66	-> byte code offset #98
    //   Java source line #67	-> byte code offset #112
    //   Java source line #68	-> byte code offset #113
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	119	0	a	ScriptClassLoader
    //   0	119	1	a	String
    // Exception table:
    //   from	to	target	type
    //   13	91	112	java/lang/Exception
    //   92	111	112	java/lang/Exception
  }
  
  /* Error */
  public java.io.InputStream getResourceAsStream(String a)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 21	org/powerbot/bot/ScriptClassLoader:new	Ljava/net/URL;
    //   4: ifnonnull +41 -> 45
    //   7: aload_0
    //   8: getfield 23	org/powerbot/bot/ScriptClassLoader:void	Ljava/util/Map;
    //   11: aload_1
    //   12: invokeinterface 138 2 0
    //   17: ifeq +25 -> 42
    //   20: new 140	java/io/ByteArrayInputStream
    //   23: dup
    //   24: aload_0
    //   25: getfield 23	org/powerbot/bot/ScriptClassLoader:void	Ljava/util/Map;
    //   28: aload_1
    //   29: invokeinterface 118 2 0
    //   34: checkcast 120	[B
    //   37: invokespecial 143	java/io/ByteArrayInputStream:<init>	([B)V
    //   40: areturn
    //   41: athrow
    //   42: aconst_null
    //   43: areturn
    //   44: athrow
    //   45: new 145	java/net/URL
    //   48: dup
    //   49: aload_0
    //   50: getfield 21	org/powerbot/bot/ScriptClassLoader:new	Ljava/net/URL;
    //   53: aload_1
    //   54: invokespecial 148	java/net/URL:<init>	(Ljava/net/URL;Ljava/lang/String;)V
    //   57: invokevirtual 152	java/net/URL:openStream	()Ljava/io/InputStream;
    //   60: areturn
    //   61: astore_1
    //   62: aconst_null
    //   63: areturn
    // Line number table:
    //   Java source line #74	-> byte code offset #0
    //   Java source line #75	-> byte code offset #7
    //   Java source line #78	-> byte code offset #45
    //   Java source line #79	-> byte code offset #61
    //   Java source line #80	-> byte code offset #62
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	64	0	a	ScriptClassLoader
    //   0	64	1	a	String
    // Exception table:
    //   from	to	target	type
    //   45	60	61	java/io/IOException
  }
}
