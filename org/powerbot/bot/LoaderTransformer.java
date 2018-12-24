package org.powerbot.bot;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.instrument.ClassFileTransformer;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipInputStream;















public class LoaderTransformer
  implements ClassFileTransformer
{
  public static final Object jdField_null = new Object();
  private static final ConcurrentHashMap<String, String> jdField_byte = new ConcurrentHashMap();
  public static final Hashtable<String, byte[]> jdField_new = new Hashtable();
  
  static { 1; int tmp39_38 = 1;tmp39_38;void = tmp39_38;
    

    1;
    int i; int tmp61_60 = 1;tmp61_60; if (64 > tmp61_60) { int tmp70_69 = 1;tmp70_69; if (91 < tmp70_69) {
        int tmp79_78 = ;;;;; break label166; throw i; } }
    int tmp95_94 = 1;tmp95_94; if (96 > tmp95_94) { int tmp104_103 = 1;tmp104_103; if (123 < tmp104_103) {
        int tmp113_112 = ;;;;; break label166; throw i; } }
    int tmp129_128 = 1;tmp129_128; if (47 > tmp129_128) { 1; int 
        tmp147_146 = i; int tmp150_149 = 1;tmp150_149;tmp147_146[tmp147_146] = (4 + tmp150_149);
    }
    int tmp163_162 = 1;(58 < tmp138_137 ? void : tmp163_162);i[-1] = tmp163_162;
    label166:
    i++;
    









    int tmp179_178 = 1;tmp179_178; int tmp184_183 = 1;tmp184_183;tmp179_178[62] = tmp184_183; int 
      tmp193_192 = 1;tmp193_192; int tmp198_197 = 1;tmp198_197;tmp193_192[62] = tmp198_197; int 
      tmp207_206 = 1;tmp207_206; int tmp212_211 = 1;tmp212_211;tmp207_206[63] = tmp212_211; int 
      tmp221_220 = 1;tmp221_220; int tmp226_225 = 1;tmp226_225;tmp221_220[63] = tmp226_225;
  }
  


































  private static final int[] jdField_void;
  

































  public static void param(String a, String a)
  {
    byte.put(a, a);
  }
  

























































  private static byte[] jdMethod_this(ZipInputStream a)
    throws IOException
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    1; int tmp17_16 = 1;tmp17_16;int ? = tmp17_16;
    
    while (a.available() > 0) {
      int tmp30_29 = 1;tmp30_29; int tmp33_32 = ?;
      int i; if ((i = 0.read(tmp33_32, tmp30_29, tmp33_32.length)) < 0) { tmpTernaryOp = localByteArrayOutputStream;
        break label64; throw a;
      }
      int tmp52_51 = 1;tmp52_51;?.write(0, tmp52_51, i);tmpTernaryOp = a; continue;throw localByteArrayOutputStream; }
    label64:
    return localByteArrayOutputStream.toByteArray();
  }
  
  private static byte[] jdMethod_this(String a) {
    int i = a.length(); int 
      tmp7_6 = 1;tmp7_6; if (tmp7_6 == i) {
      int tmp15_14 = 1;tmp15_14; int tmp20_19 = 1;tmp20_19;return tmp20_19;throw new byte[tmp15_14];
    }
    1; int tmp32_31 = 1;tmp32_31;int j = i & 3 + tmp32_31;
    1; int tmp44_43 = 1;tmp44_43;int k = j * (4 / tmp44_43); int 
      tmp53_52 = 1;tmp53_52; if (j <= 2 - tmp53_52) {
      k -= 2;tmpTernaryOp = k; break label182; throw i;
    } else {
      1;
      
      k -= 2;
      
      n = void[m];
      1;
      k -= 2;
      1; int 
      

        tmp137_136 = 1; int tmp138_137 = tmp137_136;tmp138_137;int m = j.charAt(tmp137_136 - tmp138_137);
      


      n = void[m]; int 
        tmp173_172 = 1;tmp173_172; if (-1 != tmp173_172) {}
    }
    

    label182:
    

    tmp185_184 = 1; tmp185_184;int ? = tmp185_184; int 
      tmp191_190 = 1;tmp191_190;int n = tmp191_190;
    i = a.length(); int 
      tmp202_201 = 1;tmp202_201;j = tmp202_201;
    
    1; int tmp217_216 = 1;tmp217_216; int tmp222_221 = 1;tmp222_221; int tmp226_225 = 1;tmp226_225;tmp222_221[-1] = tmp226_225; int tmp231_230 = 1;tmp231_230; int tmp235_234 = 1; int tmp236_235 = tmp235_234;tmp236_235;tmp235_234[-1] = tmp236_235; int tmp242_241 = 1;tmp242_241; int tmp246_245 = 1;tmp246_245;tmp242_241[-1] = tmp246_245; int tmp252_251 = 1;tmp252_251; int tmp256_255 = 1;tmp256_255;tmp252_251[-1] = tmp256_255;int ? = 3; int 
      tmp262_261 = 1;tmp262_261; int i1; if ((i1 = tmp262_261) + j < i) { 1;
      int i2;
      if ((i2 = a.charAt(i1 + j)) < void.length) {
        ?[i1] = void[i2];
      }
      i1++;
    }
    



    (n++); int tmp333_332 = 1;tmp333_332; int tmp338_337 = 1; int tmp339_338 = tmp338_337;tmp339_338; int tmp344_343 = 1;tmp344_343;(2 << tmp333_332)[?] = ((byte)(tmp338_337[tmp339_338] | 4 >>> tmp344_343));
    1;1;
    j += 2;
    
    (n++);1; int tmp391_390 = 1;tmp391_390; int tmp395_394 = 1; int tmp396_395 = tmp395_394;tmp396_395; int tmp401_400 = 1;tmp401_400;'ð'[tmp391_390] = ((byte)(? | tmp395_394[tmp396_395] & 4 << tmp401_400));
    1;1;
    j += 3;
    
    (???++); int tmp443_442 = 1;tmp443_442; int tmp449_448 = 1;tmp449_448; int tmp456_455 = 1;tmp456_455;
    j += 4;?[2[tmp443_442]] = ((byte)(6 << tmp449_448 | 0xC0 & tmp456_455));
    


    return ?;
  }
  
  public LoaderTransformer() {}
  
  /* Error */
  public byte[] transform(ClassLoader a, String a, Class<?> a, java.security.ProtectionDomain a, byte[] a)
    throws java.lang.instrument.IllegalClassFormatException
  {
    // Byte code:
    //   0: aload_2
    //   1: ldc 34
    //   3: invokestatic 40	org/powerbot/script/rt6/BasicObject:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   6: invokevirtual 46	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   9: ifne +7 -> 16
    //   12: aload 5
    //   14: areturn
    //   15: athrow
    //   16: new 48	z/lPT6
    //   19: dup
    //   20: invokespecial 49	z/lPT6:<init>	()V
    //   23: astore_1
    //   24: new 51	z/lpT1
    //   27: dup
    //   28: aload 5
    //   30: invokespecial 54	z/lpT1:<init>	([B)V
    //   33: aload_1
    //   34: iconst_2
    //   35: iconst_1
    //   36: dup
    //   37: pop2
    //   38: invokevirtual 57	z/lpT1:this	(Lz/cOn;I)V
    //   41: aload_1
    //   42: getfield 60	z/lPT6:void	Ljava/util/List;
    //   45: invokeinterface 66 1 0
    //   50: astore_2
    //   51: aload_2
    //   52: invokeinterface 72 1 0
    //   57: ifeq +433 -> 490
    //   60: aload_2
    //   61: invokeinterface 76 1 0
    //   66: checkcast 78	z/Com9
    //   69: dup
    //   70: astore_3
    //   71: getfield 82	z/Com9:Ua	I
    //   74: bipush 8
    //   76: iconst_1
    //   77: dup
    //   78: pop2
    //   79: iand
    //   80: bipush 8
    //   82: iconst_1
    //   83: dup
    //   84: pop2
    //   85: if_icmpeq +8 -> 93
    //   88: aload_2
    //   89: goto -37 -> 52
    //   92: athrow
    //   93: aload_3
    //   94: getfield 86	z/Com9:rb	Ljava/lang/String;
    //   97: ldc 88
    //   99: invokestatic 89	z/lpT1:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   102: invokevirtual 93	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   105: ifne +7 -> 112
    //   108: aload_2
    //   109: goto -57 -> 52
    //   112: new 95	org/powerbot/bot/InsnSearcher
    //   115: dup
    //   116: aload_3
    //   117: invokespecial 98	org/powerbot/bot/InsnSearcher:<init>	(Lz/Com9;)V
    //   120: dup
    //   121: astore 4
    //   123: iconst_4
    //   124: iconst_1
    //   125: dup
    //   126: pop2
    //   127: newarray int
    //   129: iconst_1
    //   130: dup
    //   131: pop2
    //   132: dup
    //   133: iconst_0
    //   134: iconst_1
    //   135: dup
    //   136: pop2
    //   137: bipush 25
    //   139: iconst_1
    //   140: dup
    //   141: pop2
    //   142: iastore
    //   143: dup
    //   144: iconst_1
    //   145: dup
    //   146: pop2
    //   147: bipush 16
    //   149: iconst_1
    //   150: dup_x1
    //   151: dup
    //   152: pop2
    //   153: iastore
    //   154: dup
    //   155: iconst_2
    //   156: iconst_1
    //   157: dup
    //   158: pop2
    //   159: sipush 182
    //   162: iconst_1
    //   163: dup
    //   164: pop2
    //   165: iastore
    //   166: dup
    //   167: iconst_3
    //   168: iconst_1
    //   169: dup
    //   170: pop2
    //   171: bipush 58
    //   173: iconst_1
    //   174: dup
    //   175: pop2
    //   176: iastore
    //   177: invokevirtual 102	org/powerbot/bot/InsnSearcher:getNext	([I)Lz/COm9;
    //   180: ifnull -129 -> 51
    //   183: aload 4
    //   185: bipush 16
    //   187: iconst_1
    //   188: dup
    //   189: pop2
    //   190: invokevirtual 106	org/powerbot/bot/InsnSearcher:getPrevious	(I)Lz/COm9;
    //   193: checkcast 108	z/T
    //   196: dup
    //   197: astore 6
    //   199: getfield 110	z/T:new	I
    //   202: bipush 6
    //   204: iconst_1
    //   205: dup
    //   206: pop2
    //   207: if_icmpeq +8 -> 215
    //   210: aload 4
    //   212: goto -89 -> 123
    //   215: aload 4
    //   217: iconst_4
    //   218: iconst_1
    //   219: dup
    //   220: pop2
    //   221: newarray int
    //   223: iconst_1
    //   224: dup
    //   225: pop2
    //   226: dup
    //   227: iconst_0
    //   228: iconst_1
    //   229: dup
    //   230: pop2
    //   231: bipush 25
    //   233: iconst_1
    //   234: dup
    //   235: pop2
    //   236: iastore
    //   237: dup
    //   238: iconst_1
    //   239: dup
    //   240: pop2
    //   241: bipush 25
    //   243: iconst_1
    //   244: dup_x1
    //   245: dup
    //   246: pop2
    //   247: iastore
    //   248: dup
    //   249: iconst_2
    //   250: iconst_1
    //   251: dup
    //   252: pop2
    //   253: bipush 25
    //   255: iconst_1
    //   256: dup
    //   257: pop2
    //   258: iastore
    //   259: dup
    //   260: iconst_3
    //   261: iconst_1
    //   262: dup
    //   263: pop2
    //   264: sipush 182
    //   267: iconst_1
    //   268: dup
    //   269: pop2
    //   270: iastore
    //   271: invokevirtual 102	org/powerbot/bot/InsnSearcher:getNext	([I)Lz/COm9;
    //   274: ifnull -223 -> 51
    //   277: aload 4
    //   279: invokevirtual 114	org/powerbot/bot/InsnSearcher:current	()Lz/COm9;
    //   282: checkcast 116	z/CB
    //   285: dup
    //   286: astore 7
    //   288: getfield 118	z/CB:byte	Ljava/lang/String;
    //   291: ldc 120
    //   293: invokestatic 40	org/powerbot/script/rt6/BasicObject:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   296: invokevirtual 124	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   299: ifeq -84 -> 215
    //   302: aload 7
    //   304: getfield 126	z/CB:null	Ljava/lang/String;
    //   307: ldc -128
    //   309: invokestatic 89	z/lpT1:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   312: invokevirtual 124	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   315: ifne +8 -> 323
    //   318: aload 4
    //   320: goto -103 -> 217
    //   323: aload_3
    //   324: getfield 132	z/Com9:TB	Lz/Xa;
    //   327: new 134	z/CoM9
    //   330: aload 7
    //   332: dup_x1
    //   333: dup
    //   334: pop2
    //   335: dup
    //   336: bipush 25
    //   338: iconst_1
    //   339: dup
    //   340: pop2
    //   341: aload 7
    //   343: invokevirtual 137	z/CB:true	()Lz/COm9;
    //   346: invokevirtual 140	z/COm9:true	()Lz/COm9;
    //   349: checkcast 134	z/CoM9
    //   352: getfield 141	z/CoM9:new	I
    //   355: invokespecial 144	z/CoM9:<init>	(II)V
    //   358: dup
    //   359: astore 8
    //   361: invokevirtual 149	z/Xa:true	(Lz/COm9;Lz/COm9;)V
    //   364: aload_3
    //   365: getfield 132	z/Com9:TB	Lz/Xa;
    //   368: new 134	z/CoM9
    //   371: aload 8
    //   373: dup_x1
    //   374: dup
    //   375: pop2
    //   376: dup
    //   377: bipush 25
    //   379: iconst_1
    //   380: dup
    //   381: pop2
    //   382: aload 7
    //   384: invokevirtual 137	z/CB:true	()Lz/COm9;
    //   387: checkcast 134	z/CoM9
    //   390: getfield 141	z/CoM9:new	I
    //   393: invokespecial 144	z/CoM9:<init>	(II)V
    //   396: dup
    //   397: astore 8
    //   399: invokevirtual 149	z/Xa:true	(Lz/COm9;Lz/COm9;)V
    //   402: aload_3
    //   403: getfield 132	z/Com9:TB	Lz/Xa;
    //   406: new 116	z/CB
    //   409: aload 8
    //   411: dup_x1
    //   412: dup
    //   413: pop2
    //   414: dup
    //   415: sipush 184
    //   418: iconst_1
    //   419: dup
    //   420: pop2
    //   421: ldc 2
    //   423: invokevirtual 155	java/lang/Class:getName	()Ljava/lang/String;
    //   426: bipush 46
    //   428: iconst_1
    //   429: dup
    //   430: pop2
    //   431: bipush 47
    //   433: iconst_1
    //   434: dup
    //   435: pop2
    //   436: invokevirtual 159	java/lang/String:replace	(CC)Ljava/lang/String;
    //   439: ldc -95
    //   441: invokestatic 40	org/powerbot/script/rt6/BasicObject:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   444: ldc -93
    //   446: invokestatic 89	z/lpT1:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   449: iconst_0
    //   450: iconst_1
    //   451: dup
    //   452: pop2
    //   453: invokespecial 166	z/CB:<init>	(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    //   456: invokevirtual 149	z/Xa:true	(Lz/COm9;Lz/COm9;)V
    //   459: new 168	z/fb
    //   462: dup
    //   463: iconst_3
    //   464: iconst_1
    //   465: dup
    //   466: pop2
    //   467: invokespecial 171	z/fb:<init>	(I)V
    //   470: astore 9
    //   472: aload_1
    //   473: aload 9
    //   475: dup_x1
    //   476: invokevirtual 174	z/lPT6:this	(Lz/cOn;)V
    //   479: invokevirtual 177	z/fb:this	()[B
    //   482: astore 5
    //   484: goto -433 -> 51
    //   487: nop
    //   488: nop
    //   489: athrow
    //   490: aload_1
    //   491: getfield 179	z/lPT6:new	Ljava/util/List;
    //   494: invokeinterface 66 1 0
    //   499: astore_2
    //   500: aload_2
    //   501: invokeinterface 72 1 0
    //   506: ifeq +214 -> 720
    //   509: aload_2
    //   510: invokeinterface 76 1 0
    //   515: checkcast 181	z/dA
    //   518: dup
    //   519: astore_3
    //   520: getfield 184	z/dA:final	Ljava/lang/String;
    //   523: ldc -70
    //   525: invokestatic 40	org/powerbot/script/rt6/BasicObject:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   528: invokevirtual 124	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   531: ifeq -31 -> 500
    //   534: aload_1
    //   535: getfield 60	z/lPT6:void	Ljava/util/List;
    //   538: invokeinterface 66 1 0
    //   543: astore 4
    //   545: aload 4
    //   547: invokeinterface 72 1 0
    //   552: ifeq -52 -> 500
    //   555: aload 4
    //   557: invokeinterface 76 1 0
    //   562: checkcast 78	z/Com9
    //   565: dup
    //   566: astore 6
    //   568: getfield 189	z/Com9:bA	Ljava/lang/String;
    //   571: ldc -65
    //   573: invokestatic 89	z/lpT1:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   576: invokevirtual 124	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   579: ifeq -34 -> 545
    //   582: aload 6
    //   584: getfield 86	z/Com9:rb	Ljava/lang/String;
    //   587: ldc -63
    //   589: invokestatic 40	org/powerbot/script/rt6/BasicObject:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   592: invokevirtual 124	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   595: ifne +8 -> 603
    //   598: aload 4
    //   600: goto -53 -> 547
    //   603: aload 6
    //   605: dup
    //   606: getfield 132	z/Com9:TB	Lz/Xa;
    //   609: new 134	z/CoM9
    //   612: dup
    //   613: bipush 25
    //   615: iconst_1
    //   616: dup
    //   617: pop2
    //   618: iconst_1
    //   619: dup
    //   620: dup
    //   621: pop2
    //   622: invokespecial 144	z/CoM9:<init>	(II)V
    //   625: dup
    //   626: astore 7
    //   628: invokevirtual 196	z/Xa:true	(Lz/COm9;)V
    //   631: getfield 132	z/Com9:TB	Lz/Xa;
    //   634: new 116	z/CB
    //   637: aload 7
    //   639: dup_x1
    //   640: dup
    //   641: pop2
    //   642: dup
    //   643: sipush 184
    //   646: iconst_1
    //   647: dup
    //   648: pop2
    //   649: ldc 2
    //   651: invokevirtual 155	java/lang/Class:getName	()Ljava/lang/String;
    //   654: bipush 46
    //   656: iconst_1
    //   657: dup
    //   658: pop2
    //   659: bipush 47
    //   661: iconst_1
    //   662: dup
    //   663: pop2
    //   664: invokevirtual 159	java/lang/String:replace	(CC)Ljava/lang/String;
    //   667: ldc -58
    //   669: invokestatic 89	z/lpT1:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   672: ldc -63
    //   674: invokestatic 40	org/powerbot/script/rt6/BasicObject:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   677: iconst_0
    //   678: iconst_1
    //   679: dup
    //   680: pop2
    //   681: invokespecial 166	z/CB:<init>	(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    //   684: invokevirtual 149	z/Xa:true	(Lz/COm9;Lz/COm9;)V
    //   687: new 168	z/fb
    //   690: dup
    //   691: iconst_3
    //   692: iconst_1
    //   693: dup
    //   694: pop2
    //   695: invokespecial 171	z/fb:<init>	(I)V
    //   698: astore 8
    //   700: aload_1
    //   701: aload 8
    //   703: dup_x1
    //   704: invokevirtual 174	z/lPT6:this	(Lz/cOn;)V
    //   707: invokevirtual 177	z/fb:this	()[B
    //   710: astore 5
    //   712: aload 4
    //   714: goto -167 -> 547
    //   717: nop
    //   718: nop
    //   719: athrow
    //   720: aload 5
    //   722: areturn
    // Line number table:
    //   Java source line #59	-> byte code offset #0
    //   Java source line #60	-> byte code offset #12
    //   Java source line #62	-> byte code offset #16
    //   Java source line #63	-> byte code offset #24
    //   Java source line #64	-> byte code offset #33
    //   Java source line #66	-> byte code offset #41
    //   Java source line #67	-> byte code offset #71
    //   Java source line #68	-> byte code offset #89
    //   Java source line #70	-> byte code offset #93
    //   Java source line #71	-> byte code offset #109
    //   Java source line #73	-> byte code offset #112
    //   Java source line #74	-> byte code offset #123
    //   Java source line #75	-> byte code offset #183
    //   Java source line #76	-> byte code offset #199
    //   Java source line #77	-> byte code offset #212
    //   Java source line #79	-> byte code offset #215
    //   Java source line #80	-> byte code offset #277
    //   Java source line #81	-> byte code offset #288
    //   Java source line #82	-> byte code offset #320
    //   Java source line #85	-> byte code offset #323
    //   Java source line #86	-> byte code offset #364
    //   Java source line #87	-> byte code offset #402
    //   Java source line #88	-> byte code offset #423
    //   Java source line #87	-> byte code offset #456
    //   Java source line #91	-> byte code offset #459
    //   Java source line #92	-> byte code offset #472
    //   Java source line #93	-> byte code offset #479
    //   Java source line #94	-> byte code offset #484
    //   Java source line #98	-> byte code offset #487
    //   Java source line #100	-> byte code offset #490
    //   Java source line #101	-> byte code offset #520
    //   Java source line #102	-> byte code offset #534
    //   Java source line #103	-> byte code offset #568
    //   Java source line #104	-> byte code offset #600
    //   Java source line #107	-> byte code offset #603
    //   Java source line #108	-> byte code offset #631
    //   Java source line #109	-> byte code offset #651
    //   Java source line #108	-> byte code offset #684
    //   Java source line #112	-> byte code offset #687
    //   Java source line #113	-> byte code offset #700
    //   Java source line #114	-> byte code offset #707
    //   Java source line #115	-> byte code offset #714
    //   Java source line #117	-> byte code offset #717
    //   Java source line #118	-> byte code offset #720
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	723	0	a	LoaderTransformer
    //   0	723	1	a	ClassLoader
    //   0	723	2	a	String
    //   0	723	3	a	Class
    //   0	723	4	a	java.security.ProtectionDomain
    //   0	723	5	a	byte[]
  }
  
  /* Error */
  public static void accept(byte[] a)
  {
    // Byte code:
    //   0: new 226	java/util/Hashtable
    //   3: dup
    //   4: invokespecial 227	java/util/Hashtable:<init>	()V
    //   7: astore_1
    //   8: aconst_null
    //   9: astore_2
    //   10: new 229	java/util/zip/ZipInputStream
    //   13: dup
    //   14: new 231	java/io/ByteArrayInputStream
    //   17: dup
    //   18: aload_0
    //   19: invokespecial 232	java/io/ByteArrayInputStream:<init>	([B)V
    //   22: invokespecial 235	java/util/zip/ZipInputStream:<init>	(Ljava/io/InputStream;)V
    //   25: astore_3
    //   26: aload_3
    //   27: invokevirtual 239	java/util/zip/ZipInputStream:getNextEntry	()Ljava/util/zip/ZipEntry;
    //   30: dup
    //   31: astore 4
    //   33: ifnull +101 -> 134
    //   36: aload 4
    //   38: invokevirtual 242	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   41: dup
    //   42: astore 5
    //   44: ldc -12
    //   46: invokestatic 89	z/lpT1:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   49: invokevirtual 247	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   52: ifeq +35 -> 87
    //   55: aload_1
    //   56: iconst_0
    //   57: iconst_1
    //   58: dup
    //   59: pop2
    //   60: aload 5
    //   62: dup_x1
    //   63: invokevirtual 251	java/lang/String:length	()I
    //   66: bipush 6
    //   68: iconst_1
    //   69: dup
    //   70: pop2
    //   71: isub
    //   72: invokevirtual 255	java/lang/String:substring	(II)Ljava/lang/String;
    //   75: aload_3
    //   76: invokestatic 258	org/powerbot/bot/LoaderTransformer:this	(Ljava/util/zip/ZipInputStream;)[B
    //   79: invokevirtual 259	java/util/Hashtable:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   82: pop
    //   83: goto -57 -> 26
    //   86: athrow
    //   87: aload 5
    //   89: ldc_w 261
    //   92: invokestatic 40	org/powerbot/script/rt6/BasicObject:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   95: invokevirtual 124	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   98: ifeq -72 -> 26
    //   101: aload_3
    //   102: invokestatic 258	org/powerbot/bot/LoaderTransformer:this	(Ljava/util/zip/ZipInputStream;)[B
    //   105: astore_2
    //   106: goto -80 -> 26
    //   109: nop
    //   110: nop
    //   111: nop
    //   112: athrow
    //   113: astore 5
    //   115: getstatic 267	java/lang/System:out	Ljava/io/PrintStream;
    //   118: ldc_w 269
    //   121: invokestatic 89	z/lpT1:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   124: invokevirtual 275	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   127: iconst_1
    //   128: dup
    //   129: dup
    //   130: pop2
    //   131: invokestatic 278	java/lang/System:exit	(I)V
    //   134: aload_2
    //   135: ifnull +313 -> 448
    //   138: aload_1
    //   139: invokevirtual 281	java/util/Hashtable:clear	()V
    //   142: getstatic 213	org/powerbot/bot/LoaderTransformer:byte	Ljava/util/concurrent/ConcurrentHashMap;
    //   145: ldc_w 283
    //   148: invokestatic 40	org/powerbot/script/rt6/BasicObject:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   151: invokevirtual 287	java/util/concurrent/ConcurrentHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   154: checkcast 42	java/lang/String
    //   157: astore 5
    //   159: getstatic 213	org/powerbot/bot/LoaderTransformer:byte	Ljava/util/concurrent/ConcurrentHashMap;
    //   162: ldc_w 289
    //   165: invokestatic 89	z/lpT1:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   168: invokevirtual 287	java/util/concurrent/ConcurrentHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   171: checkcast 42	java/lang/String
    //   174: astore_3
    //   175: aload 5
    //   177: ifnull +22 -> 199
    //   180: aload_3
    //   181: ifnull +18 -> 199
    //   184: aload 5
    //   186: invokevirtual 292	java/lang/String:isEmpty	()Z
    //   189: ifne +10 -> 199
    //   192: aload_3
    //   193: invokevirtual 292	java/lang/String:isEmpty	()Z
    //   196: ifeq +22 -> 218
    //   199: getstatic 267	java/lang/System:out	Ljava/io/PrintStream;
    //   202: ldc_w 294
    //   205: invokestatic 40	org/powerbot/script/rt6/BasicObject:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   208: invokevirtual 275	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   211: iconst_1
    //   212: dup
    //   213: dup
    //   214: pop2
    //   215: invokestatic 278	java/lang/System:exit	(I)V
    //   218: ldc_w 296
    //   221: invokestatic 89	z/lpT1:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   224: invokestatic 302	javax/crypto/Cipher:getInstance	(Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   227: astore 6
    //   229: aload_2
    //   230: aload 6
    //   232: dup_x1
    //   233: iconst_2
    //   234: iconst_1
    //   235: dup
    //   236: pop2
    //   237: new 304	javax/crypto/spec/SecretKeySpec
    //   240: dup
    //   241: aload 5
    //   243: invokestatic 307	org/powerbot/bot/LoaderTransformer:this	(Ljava/lang/String;)[B
    //   246: ldc_w 309
    //   249: invokestatic 40	org/powerbot/script/rt6/BasicObject:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   252: invokespecial 312	javax/crypto/spec/SecretKeySpec:<init>	([BLjava/lang/String;)V
    //   255: new 314	javax/crypto/spec/IvParameterSpec
    //   258: dup
    //   259: aload_3
    //   260: invokestatic 307	org/powerbot/bot/LoaderTransformer:this	(Ljava/lang/String;)[B
    //   263: invokespecial 315	javax/crypto/spec/IvParameterSpec:<init>	([B)V
    //   266: invokevirtual 319	javax/crypto/Cipher:init	(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    //   269: invokevirtual 323	javax/crypto/Cipher:doFinal	([B)[B
    //   272: astore_2
    //   273: invokestatic 327	java/util/jar/Pack200:newUnpacker	()Ljava/util/jar/Pack200$Unpacker;
    //   276: astore_3
    //   277: new 329	java/io/ByteArrayOutputStream
    //   280: dup
    //   281: ldc_w 330
    //   284: invokespecial 331	java/io/ByteArrayOutputStream:<init>	(I)V
    //   287: astore 6
    //   289: new 333	java/util/jar/JarOutputStream
    //   292: dup
    //   293: aload 6
    //   295: invokespecial 336	java/util/jar/JarOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   298: astore 7
    //   300: new 338	java/util/zip/GZIPInputStream
    //   303: dup
    //   304: new 231	java/io/ByteArrayInputStream
    //   307: dup
    //   308: aload_2
    //   309: invokespecial 232	java/io/ByteArrayInputStream:<init>	([B)V
    //   312: invokespecial 339	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   315: astore_2
    //   316: aload_3
    //   317: aload_2
    //   318: aload 7
    //   320: invokeinterface 343 3 0
    //   325: new 345	java/util/jar/JarInputStream
    //   328: dup
    //   329: new 231	java/io/ByteArrayInputStream
    //   332: dup
    //   333: aload 6
    //   335: invokevirtual 348	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   338: invokespecial 232	java/io/ByteArrayInputStream:<init>	([B)V
    //   341: invokespecial 349	java/util/jar/JarInputStream:<init>	(Ljava/io/InputStream;)V
    //   344: astore_2
    //   345: aload_2
    //   346: invokevirtual 353	java/util/jar/JarInputStream:getNextJarEntry	()Ljava/util/jar/JarEntry;
    //   349: dup
    //   350: astore 4
    //   352: ifnull +96 -> 448
    //   355: aload 4
    //   357: invokevirtual 242	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   360: dup
    //   361: astore_3
    //   362: ldc -12
    //   364: invokestatic 89	z/lpT1:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   367: invokevirtual 247	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   370: ifeq -25 -> 345
    //   373: aload_2
    //   374: invokestatic 258	org/powerbot/bot/LoaderTransformer:this	(Ljava/util/zip/ZipInputStream;)[B
    //   377: astore 6
    //   379: aload_3
    //   380: bipush 47
    //   382: iconst_1
    //   383: dup
    //   384: pop2
    //   385: bipush 46
    //   387: iconst_1
    //   388: dup
    //   389: pop2
    //   390: invokevirtual 159	java/lang/String:replace	(CC)Ljava/lang/String;
    //   393: astore_3
    //   394: iconst_0
    //   395: iconst_1
    //   396: dup
    //   397: pop2
    //   398: aload_3
    //   399: dup_x1
    //   400: invokevirtual 251	java/lang/String:length	()I
    //   403: bipush 6
    //   405: iconst_1
    //   406: dup
    //   407: pop2
    //   408: isub
    //   409: invokevirtual 255	java/lang/String:substring	(II)Ljava/lang/String;
    //   412: astore_3
    //   413: aload_1
    //   414: aload_3
    //   415: aload 6
    //   417: invokevirtual 259	java/util/Hashtable:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   420: pop
    //   421: goto -76 -> 345
    //   424: nop
    //   425: nop
    //   426: athrow
    //   427: astore 5
    //   429: iconst_1
    //   430: dup
    //   431: dup
    //   432: pop2
    //   433: invokestatic 278	java/lang/System:exit	(I)V
    //   436: getstatic 267	java/lang/System:out	Ljava/io/PrintStream;
    //   439: ldc_w 355
    //   442: invokestatic 40	org/powerbot/script/rt6/BasicObject:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   445: invokevirtual 275	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   448: getstatic 357	org/powerbot/bot/LoaderTransformer:null	Ljava/lang/Object;
    //   451: dup
    //   452: astore 5
    //   454: monitorenter
    //   455: getstatic 359	org/powerbot/bot/LoaderTransformer:new	Ljava/util/Hashtable;
    //   458: invokevirtual 281	java/util/Hashtable:clear	()V
    //   461: getstatic 359	org/powerbot/bot/LoaderTransformer:new	Ljava/util/Hashtable;
    //   464: aload_1
    //   465: invokevirtual 363	java/util/Hashtable:putAll	(Ljava/util/Map;)V
    //   468: aload 5
    //   470: monitorexit
    //   471: return
    //   472: astore 8
    //   474: aload 5
    //   476: monitorexit
    //   477: aload 8
    //   479: athrow
    //   480: athrow
    // Line number table:
    //   Java source line #126	-> byte code offset #0
    //   Java source line #127	-> byte code offset #8
    //   Java source line #129	-> byte code offset #10
    //   Java source line #132	-> byte code offset #26
    //   Java source line #133	-> byte code offset #36
    //   Java source line #134	-> byte code offset #44
    //   Java source line #135	-> byte code offset #55
    //   Java source line #136	-> byte code offset #87
    //   Java source line #137	-> byte code offset #101
    //   Java source line #139	-> byte code offset #106
    //   Java source line #143	-> byte code offset #110
    //   Java source line #140	-> byte code offset #113
    //   Java source line #141	-> byte code offset #115
    //   Java source line #142	-> byte code offset #127
    //   Java source line #145	-> byte code offset #134
    //   Java source line #147	-> byte code offset #138
    //   Java source line #149	-> byte code offset #142
    //   Java source line #150	-> byte code offset #175
    //   Java source line #151	-> byte code offset #199
    //   Java source line #152	-> byte code offset #211
    //   Java source line #154	-> byte code offset #218
    //   Java source line #155	-> byte code offset #229
    //   Java source line #156	-> byte code offset #269
    //   Java source line #157	-> byte code offset #273
    //   Java source line #158	-> byte code offset #277
    //   Java source line #159	-> byte code offset #289
    //   Java source line #160	-> byte code offset #300
    //   Java source line #161	-> byte code offset #316
    //   Java source line #162	-> byte code offset #325
    //   Java source line #163	-> byte code offset #345
    //   Java source line #164	-> byte code offset #355
    //   Java source line #165	-> byte code offset #362
    //   Java source line #166	-> byte code offset #373
    //   Java source line #167	-> byte code offset #379
    //   Java source line #168	-> byte code offset #394
    //   Java source line #169	-> byte code offset #413
    //   Java source line #171	-> byte code offset #421
    //   Java source line #175	-> byte code offset #424
    //   Java source line #172	-> byte code offset #427
    //   Java source line #173	-> byte code offset #429
    //   Java source line #174	-> byte code offset #436
    //   Java source line #178	-> byte code offset #448
    //   Java source line #179	-> byte code offset #455
    //   Java source line #180	-> byte code offset #461
    //   Java source line #181	-> byte code offset #468
    //   Java source line #182	-> byte code offset #480
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	481	0	a	byte[]
    // Exception table:
    //   from	to	target	type
    //   26	86	113	java/io/IOException
    //   87	109	113	java/io/IOException
    //   138	424	427	java/lang/Exception
    //   455	471	472	finally
    //   472	477	472	finally
  }
}
