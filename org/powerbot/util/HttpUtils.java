package org.powerbot.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.URL;
import org.powerbot.script.Calculations;
import z.COm8;






public class HttpUtils
{
  private static final String jdField_new;
  private static final String jdField_void;
  
  static
  {
    boolean bool = System.getProperty(Calculations.jdMethod_this("b\020Kp\027r\r?\001p\021pK|\nu\000}")).equals(COm8.jdMethod_this("\024v")); int 
      tmp26_25 = 1;tmp26_25;60.<init>(tmp26_25);StringBuilder localStringBuilder = new java/lang/StringBuilder; int 
    
      tmp45_44 = 1;tmp45_44; int tmp54_53 = 1;tmp54_53;'ᮭ'.append(tmp54_53).append(COm8.jdMethod_this("\002j"));
    switch (CoN.void[org.powerbot.Configuration.byte.ordinal()]) {
    case 1: 
    case 2: 
      while (0 != 0) {} localStringBuilder.append(Calculations.jdMethod_this("F\f\001~\022bE_11")).append(System.getProperty(COm8.jdMethod_this("M1\f4G0Q+M,")));
      if (bool) {
        StringBuilder tmp140_139 = localStringBuilder;;; break label250; throw 47.append(tmp45_44);
      }
      break;
    case 3: 
      int tmp181_180 = 1;tmp181_180; int tmp198_197 = ;;;;;;
      break label250; throw 32.append(tmp181_180);
    case 4: 
      localStringBuilder.append(Calculations.jdMethod_this("IT ^1)x\013d\0351")).append(bool ? COm8.jdMethod_this("Zz\024\035\024v") : Calculations.jdMethod_this("\f']'"));
    }
    
    
    label250:
    void = localStringBuilder.toString();
    
    int tmp285_284 = 1;tmp285_284;0.setLength(tmp285_284);"o-X+N.Cm\027l\022b\n!M/R#V+@.Gy\002\017q\013gb\023r\fr\031bu+L&M5Qbl\026\002t\fs\031b"
      .append(COm8.jdMethod_this(localStringBuilder));
    if (bool) {
      localStringBuilder.append(Calculations.jdMethod_this("F*FS%^1"));
    }
    
    new = localStringBuilder.toString();
    
    CookieHandler.setDefault(new CookieManager());localStringBuilder.append(COm8.jdMethod_this("v0K&G,Vm\024l\022k"));
  }
  















































  public static HttpURLConnection download(URL a, File a)
    throws IOException
  {
    return jdMethod_this(jdMethod_this(a), a);
  }
  
























  public static InputStream openStream(URL a)
    throws IOException
  {
    return jdMethod_this(jdMethod_this(a));
  }
  
  public HttpUtils() {}
  
  /* Error */
  public static HttpURLConnection jdMethod_this(URL a)
    throws IOException
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 37	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   4: checkcast 39	java/net/HttpURLConnection
    //   7: astore_1
    //   8: ldc 41
    //   10: aload_1
    //   11: dup_x1
    //   12: ldc 43
    //   14: ldc 45
    //   16: aload_1
    //   17: dup_x1
    //   18: ldc 47
    //   20: ldc 49
    //   22: aload_1
    //   23: dup_x1
    //   24: ldc 51
    //   26: invokestatic 56	z/COm8:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   29: aload_0
    //   30: invokevirtual 60	java/net/URL:getHost	()Ljava/lang/String;
    //   33: invokevirtual 64	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   36: invokestatic 67	org/powerbot/script/Calculations:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   39: ldc 69
    //   41: invokestatic 56	z/COm8:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   44: invokevirtual 64	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   47: invokestatic 67	org/powerbot/script/Calculations:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   50: ldc 71
    //   52: invokestatic 56	z/COm8:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   55: invokevirtual 64	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   58: invokestatic 67	org/powerbot/script/Calculations:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   61: ldc 73
    //   63: invokestatic 56	z/COm8:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   66: invokevirtual 64	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   69: invokestatic 67	org/powerbot/script/Calculations:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   72: ldc 75
    //   74: invokestatic 56	z/COm8:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   77: invokevirtual 64	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   80: invokestatic 67	org/powerbot/script/Calculations:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   83: new 77	java/lang/StringBuilder
    //   86: dup
    //   87: invokespecial 78	java/lang/StringBuilder:<init>	()V
    //   90: iconst_0
    //   91: ldc 80
    //   93: invokestatic 56	z/COm8:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   96: invokevirtual 84	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   99: aload_0
    //   100: invokevirtual 60	java/net/URL:getHost	()Ljava/lang/String;
    //   103: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: invokevirtual 91	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   109: ldc 93
    //   111: invokestatic 67	org/powerbot/script/Calculations:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   114: invokevirtual 99	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   117: ifeq +10 -> 127
    //   120: getstatic 101	org/powerbot/util/HttpUtils:new	Ljava/lang/String;
    //   123: goto +7 -> 130
    //   126: athrow
    //   127: getstatic 103	org/powerbot/util/HttpUtils:void	Ljava/lang/String;
    //   130: invokevirtual 64	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   133: aload_1
    //   134: dup
    //   135: sipush 10000
    //   138: iconst_1
    //   139: dup
    //   140: pop2
    //   141: invokevirtual 107	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   144: areturn
    // Line number table:
    //   Java source line #60	-> byte code offset #0
    //   Java source line #61	-> byte code offset #8
    //   Java source line #62	-> byte code offset #36
    //   Java source line #63	-> byte code offset #47
    //   Java source line #64	-> byte code offset #58
    //   Java source line #65	-> byte code offset #69
    //   Java source line #66	-> byte code offset #80
    //   Java source line #67	-> byte code offset #133
    //   Java source line #68	-> byte code offset #144
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	145	0	a	URL
  }
  
  /* Error */
  public static HttpURLConnection jdMethod_this(HttpURLConnection a)
    throws IOException
  {
    // Byte code:
    //   0: new 113	java/util/HashMap
    //   3: dup
    //   4: invokespecial 114	java/util/HashMap:<init>	()V
    //   7: astore_1
    //   8: aload_0
    //   9: ldc 116
    //   11: invokestatic 56	z/COm8:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   14: invokevirtual 120	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   17: dup
    //   18: astore_3
    //   19: ifnull +10 -> 29
    //   22: aload_3
    //   23: invokevirtual 124	java/lang/String:isEmpty	()Z
    //   26: ifeq +6 -> 32
    //   29: aload_0
    //   30: areturn
    //   31: athrow
    //   32: aload_1
    //   33: aload_0
    //   34: invokevirtual 128	java/net/HttpURLConnection:getRequestProperties	()Ljava/util/Map;
    //   37: invokeinterface 132 2 0
    //   42: aload_0
    //   43: invokevirtual 136	java/net/HttpURLConnection:getResponseCode	()I
    //   46: tableswitch	default:+71->117, 301:+46->92, 302:+46->92, 303:+71->117, 304:+71->117, 305:+71->117, 306:+71->117, 307:+60->106, 308:+60->106
    //   92: ldc -118
    //   94: iconst_0
    //   95: ifne +19 -> 114
    //   98: invokestatic 67	org/powerbot/script/Calculations:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   101: astore_2
    //   102: goto +17 -> 119
    //   105: athrow
    //   106: aload_0
    //   107: invokevirtual 141	java/net/HttpURLConnection:getRequestMethod	()Ljava/lang/String;
    //   110: astore_2
    //   111: goto +8 -> 119
    //   114: goto -20 -> 94
    //   117: aload_0
    //   118: areturn
    //   119: new 33	java/net/URL
    //   122: dup
    //   123: aload_0
    //   124: invokevirtual 145	java/net/HttpURLConnection:getURL	()Ljava/net/URL;
    //   127: aload_3
    //   128: invokespecial 148	java/net/URL:<init>	(Ljava/net/URL;Ljava/lang/String;)V
    //   131: invokevirtual 37	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   134: checkcast 39	java/net/HttpURLConnection
    //   137: astore_0
    //   138: aload_1
    //   139: aload_0
    //   140: aload_2
    //   141: invokevirtual 152	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   144: invokeinterface 156 1 0
    //   149: invokeinterface 162 1 0
    //   154: astore_2
    //   155: aload_2
    //   156: invokeinterface 167 1 0
    //   161: ifeq +73 -> 234
    //   164: aload_2
    //   165: invokeinterface 171 1 0
    //   170: checkcast 13	java/util/Map$Entry
    //   173: dup
    //   174: astore_3
    //   175: invokeinterface 174 1 0
    //   180: checkcast 176	java/util/List
    //   183: invokeinterface 177 1 0
    //   188: dup
    //   189: astore 4
    //   191: invokeinterface 167 1 0
    //   196: ifeq -41 -> 155
    //   199: aload 4
    //   201: invokeinterface 171 1 0
    //   206: checkcast 95	java/lang/String
    //   209: astore 5
    //   211: aload_0
    //   212: aload_3
    //   213: invokeinterface 180 1 0
    //   218: checkcast 95	java/lang/String
    //   221: aload 5
    //   223: invokevirtual 64	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   226: aload 4
    //   228: goto -37 -> 191
    //   231: nop
    //   232: nop
    //   233: athrow
    //   234: aload_1
    //   235: invokeinterface 183 1 0
    //   240: aload_0
    //   241: goto -232 -> 9
    // Line number table:
    //   Java source line #72	-> byte code offset #0
    //   Java source line #75	-> byte code offset #8
    //   Java source line #76	-> byte code offset #19
    //   Java source line #77	-> byte code offset #29
    //   Java source line #79	-> byte code offset #32
    //   Java source line #81	-> byte code offset #42
    //   Java source line #84	-> byte code offset #92
    //   Java source line #85	-> byte code offset #102
    //   Java source line #89	-> byte code offset #106
    //   Java source line #90	-> byte code offset #111
    //   Java source line #93	-> byte code offset #117
    //   Java source line #96	-> byte code offset #119
    //   Java source line #97	-> byte code offset #139
    //   Java source line #98	-> byte code offset #144
    //   Java source line #99	-> byte code offset #175
    //   Java source line #100	-> byte code offset #211
    //   Java source line #101	-> byte code offset #228
    //   Java source line #102	-> byte code offset #231
    //   Java source line #103	-> byte code offset #234
    //   Java source line #104	-> byte code offset #241
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	244	0	a	HttpURLConnection
  }
  
  /* Error */
  private static HttpURLConnection jdMethod_this(HttpURLConnection a, File a)
    throws IOException
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 199	java/io/File:exists	()Z
    //   4: ifeq +17 -> 21
    //   7: aload_0
    //   8: aload_1
    //   9: invokevirtual 203	java/io/File:lastModified	()J
    //   12: invokevirtual 207	java/net/HttpURLConnection:setIfModifiedSince	(J)V
    //   15: aload_0
    //   16: goto +6 -> 22
    //   19: athrow
    //   20: astore_2
    //   21: aload_0
    //   22: invokevirtual 136	java/net/HttpURLConnection:getResponseCode	()I
    //   25: lookupswitch	default:+64->89, 200:+35->60, 404:+52->77, 410:+52->77
    //   60: aload_0
    //   61: iconst_0
    //   62: ifne -1 -> 61
    //   65: dup
    //   66: invokestatic 210	org/powerbot/util/HttpUtils:this	(Ljava/net/URLConnection;)Ljava/io/InputStream;
    //   69: aload_1
    //   70: invokestatic 215	org/powerbot/util/IOUtils:this	(Ljava/io/InputStream;Ljava/io/File;)V
    //   73: goto +17 -> 90
    //   76: athrow
    //   77: aload_1
    //   78: invokevirtual 199	java/io/File:exists	()Z
    //   81: ifeq +8 -> 89
    //   84: aload_1
    //   85: invokevirtual 218	java/io/File:delete	()Z
    //   88: pop
    //   89: aload_0
    //   90: invokevirtual 221	java/net/HttpURLConnection:disconnect	()V
    //   93: aload_0
    //   94: areturn
    // Line number table:
    //   Java source line #113	-> byte code offset #0
    //   Java source line #115	-> byte code offset #7
    //   Java source line #117	-> byte code offset #16
    //   Java source line #116	-> byte code offset #20
    //   Java source line #120	-> byte code offset #21
    //   Java source line #122	-> byte code offset #60
    //   Java source line #123	-> byte code offset #73
    //   Java source line #126	-> byte code offset #77
    //   Java source line #128	-> byte code offset #84
    //   Java source line #133	-> byte code offset #89
    //   Java source line #134	-> byte code offset #93
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	95	0	a	HttpURLConnection
    //   0	95	1	a	File
    // Exception table:
    //   from	to	target	type
    //   7	15	20	java/lang/IllegalStateException
  }
  
  /* Error */
  public static InputStream jdMethod_this(java.net.URLConnection a)
    throws IOException
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 231	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
    //   4: astore_1
    //   5: aload_0
    //   6: goto +28 -> 34
    //   9: athrow
    //   10: astore_2
    //   11: aload_0
    //   12: instanceof 39
    //   15: ifeq +16 -> 31
    //   18: aload_0
    //   19: checkcast 39	java/net/HttpURLConnection
    //   22: invokevirtual 234	java/net/HttpURLConnection:getErrorStream	()Ljava/io/InputStream;
    //   25: astore_1
    //   26: aload_0
    //   27: goto +7 -> 34
    //   30: athrow
    //   31: aload_2
    //   32: athrow
    //   33: athrow
    //   34: ldc -20
    //   36: invokestatic 56	z/COm8:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   39: invokevirtual 237	java/net/URLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   42: dup
    //   43: astore_2
    //   44: ifnull +10 -> 54
    //   47: aload_2
    //   48: invokevirtual 124	java/lang/String:isEmpty	()Z
    //   51: ifeq +5 -> 56
    //   54: aload_1
    //   55: areturn
    //   56: aload_2
    //   57: ldc -17
    //   59: invokestatic 67	org/powerbot/script/Calculations:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   62: invokevirtual 242	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   65: ifeq +12 -> 77
    //   68: new 244	java/util/zip/GZIPInputStream
    //   71: dup
    //   72: aload_1
    //   73: invokespecial 247	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   76: areturn
    //   77: aload_2
    //   78: ldc -7
    //   80: invokestatic 56	z/COm8:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   83: invokevirtual 242	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   86: ifeq +26 -> 112
    //   89: new 251	java/util/zip/InflaterInputStream
    //   92: dup
    //   93: new 253	java/util/zip/Inflater
    //   96: aload_1
    //   97: dup_x1
    //   98: dup
    //   99: pop2
    //   100: dup
    //   101: iconst_1
    //   102: dup
    //   103: dup
    //   104: pop2
    //   105: invokespecial 256	java/util/zip/Inflater:<init>	(Z)V
    //   108: invokespecial 259	java/util/zip/InflaterInputStream:<init>	(Ljava/io/InputStream;Ljava/util/zip/Inflater;)V
    //   111: areturn
    //   112: aload_1
    //   113: areturn
    // Line number table:
    //   Java source line #145	-> byte code offset #0
    //   Java source line #152	-> byte code offset #6
    //   Java source line #146	-> byte code offset #10
    //   Java source line #147	-> byte code offset #11
    //   Java source line #148	-> byte code offset #18
    //   Java source line #150	-> byte code offset #31
    //   Java source line #153	-> byte code offset #33
    //   Java source line #154	-> byte code offset #44
    //   Java source line #155	-> byte code offset #54
    //   Java source line #157	-> byte code offset #56
    //   Java source line #158	-> byte code offset #68
    //   Java source line #159	-> byte code offset #77
    //   Java source line #160	-> byte code offset #89
    //   Java source line #162	-> byte code offset #112
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	114	0	a	java.net.URLConnection
    // Exception table:
    //   from	to	target	type
    //   0	5	10	java/io/FileNotFoundException
  }
  
  /* Error */
  public static long jdMethod_this(HttpURLConnection a)
  {
    // Byte code:
    //   0: invokestatic 268	java/lang/System:currentTimeMillis	()J
    //   3: lstore_1
    //   4: aload_0
    //   5: ldc_w 270
    //   8: invokestatic 67	org/powerbot/script/Calculations:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   11: invokevirtual 120	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   14: dup
    //   15: astore_3
    //   16: ifnull +10 -> 26
    //   19: aload_3
    //   20: invokevirtual 124	java/lang/String:isEmpty	()Z
    //   23: ifeq +6 -> 29
    //   26: lload_1
    //   27: lreturn
    //   28: athrow
    //   29: ldc_w 272
    //   32: invokestatic 56	z/COm8:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   35: iconst_2
    //   36: iconst_1
    //   37: dup
    //   38: pop2
    //   39: invokestatic 278	java/util/regex/Pattern:compile	(Ljava/lang/String;I)Ljava/util/regex/Pattern;
    //   42: aload_3
    //   43: invokevirtual 282	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   46: dup
    //   47: astore_3
    //   48: invokevirtual 287	java/util/regex/Matcher:find	()Z
    //   51: ifeq +28 -> 79
    //   54: aload_3
    //   55: iconst_1
    //   56: dup
    //   57: dup
    //   58: pop2
    //   59: invokevirtual 291	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   62: invokestatic 297	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   65: lstore 4
    //   67: lload_1
    //   68: getstatic 303	java/util/concurrent/TimeUnit:SECONDS	Ljava/util/concurrent/TimeUnit;
    //   71: lload 4
    //   73: invokevirtual 307	java/util/concurrent/TimeUnit:toMillis	(J)J
    //   76: ladd
    //   77: lreturn
    //   78: athrow
    //   79: aload_0
    //   80: invokevirtual 310	java/net/HttpURLConnection:getExpiration	()J
    //   83: dup2
    //   84: lstore 4
    //   86: lconst_0
    //   87: lcmp
    //   88: ifne +5 -> 93
    //   91: lload_1
    //   92: lreturn
    //   93: lload 4
    //   95: lreturn
    // Line number table:
    //   Java source line #166	-> byte code offset #0
    //   Java source line #167	-> byte code offset #4
    //   Java source line #168	-> byte code offset #16
    //   Java source line #169	-> byte code offset #26
    //   Java source line #171	-> byte code offset #29
    //   Java source line #172	-> byte code offset #42
    //   Java source line #173	-> byte code offset #48
    //   Java source line #174	-> byte code offset #54
    //   Java source line #175	-> byte code offset #67
    //   Java source line #178	-> byte code offset #79
    //   Java source line #179	-> byte code offset #86
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	96	0	a	HttpURLConnection
  }
}
