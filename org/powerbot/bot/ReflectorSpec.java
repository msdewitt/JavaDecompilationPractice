package org.powerbot.bot;

import java.util.HashMap;
import java.util.Map;


public class ReflectorSpec
{
  public final Map<String, String> jdField_byte;
  public final Map<String, Reflector.FieldConfig> jdField_new;
  public final Map<String, Long> jdField_void;
  
  private ReflectorSpec()
  {
    a;a.<init>();jdField_byte = a;
    a;a.<init>();jdField_new = a;
    a;a.<init>();jdField_void = a;
  }
  
  /* Error */
  public static ReflectorSpec parse(java.io.InputStream a)
  {
    // Byte code:
    //   0: new 2	org/powerbot/bot/ReflectorSpec
    //   3: dup
    //   4: invokespecial 37	org/powerbot/bot/ReflectorSpec:<init>	()V
    //   7: astore_1
    //   8: aconst_null
    //   9: astore_2
    //   10: new 39	java/io/BufferedReader
    //   13: dup
    //   14: new 41	java/io/InputStreamReader
    //   17: dup
    //   18: new 43	java/io/ByteArrayInputStream
    //   21: dup
    //   22: aload_0
    //   23: invokestatic 49	org/powerbot/util/IOUtils:true	(Ljava/io/InputStream;)[B
    //   26: invokespecial 52	java/io/ByteArrayInputStream:<init>	([B)V
    //   29: invokespecial 55	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   32: invokespecial 58	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   35: astore_2
    //   36: aload_2
    //   37: invokevirtual 62	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   40: dup
    //   41: astore_3
    //   42: ifnull +515 -> 557
    //   45: aload_3
    //   46: invokevirtual 67	java/lang/String:trim	()Ljava/lang/String;
    //   49: dup
    //   50: astore_3
    //   51: invokevirtual 71	java/lang/String:isEmpty	()Z
    //   54: ifne -18 -> 36
    //   57: aload_3
    //   58: bipush 35
    //   60: iconst_1
    //   61: dup
    //   62: pop2
    //   63: invokevirtual 75	java/lang/String:indexOf	(I)I
    //   66: ifne +8 -> 74
    //   69: aload_2
    //   70: goto -33 -> 37
    //   73: athrow
    //   74: aload_3
    //   75: dup
    //   76: bipush 58
    //   78: iconst_1
    //   79: dup
    //   80: pop2
    //   81: invokevirtual 75	java/lang/String:indexOf	(I)I
    //   84: istore 4
    //   86: bipush 61
    //   88: iconst_1
    //   89: dup
    //   90: pop2
    //   91: iload 4
    //   93: iconst_m1
    //   94: iconst_1
    //   95: dup
    //   96: pop2
    //   97: if_icmpne +11 -> 108
    //   100: iconst_0
    //   101: iconst_1
    //   102: dup
    //   103: pop2
    //   104: goto +6 -> 110
    //   107: athrow
    //   108: iload 4
    //   110: invokevirtual 78	java/lang/String:indexOf	(II)I
    //   113: istore 5
    //   115: iload 4
    //   117: iconst_m1
    //   118: iconst_1
    //   119: dup
    //   120: pop2
    //   121: if_icmpeq -85 -> 36
    //   124: iload 5
    //   126: iconst_m1
    //   127: iconst_1
    //   128: dup
    //   129: pop2
    //   130: if_icmpne +7 -> 137
    //   133: aload_2
    //   134: goto -97 -> 37
    //   137: aload_3
    //   138: iconst_0
    //   139: iconst_1
    //   140: dup
    //   141: pop2
    //   142: iload 4
    //   144: invokevirtual 82	java/lang/String:substring	(II)Ljava/lang/String;
    //   147: astore 6
    //   149: iload 4
    //   151: iconst_1
    //   152: dup
    //   153: dup
    //   154: pop2
    //   155: iadd
    //   156: iload 5
    //   158: if_icmpne +8 -> 166
    //   161: ldc 84
    //   163: goto +16 -> 179
    //   166: aload_3
    //   167: iload 4
    //   169: iconst_1
    //   170: dup
    //   171: dup
    //   172: pop2
    //   173: iadd
    //   174: iload 5
    //   176: invokevirtual 82	java/lang/String:substring	(II)Ljava/lang/String;
    //   179: astore 7
    //   181: iload 5
    //   183: iconst_1
    //   184: dup
    //   185: dup
    //   186: pop2
    //   187: iadd
    //   188: aload_3
    //   189: invokevirtual 88	java/lang/String:length	()I
    //   192: if_icmpne +16 -> 208
    //   195: iconst_0
    //   196: iconst_1
    //   197: dup
    //   198: pop2
    //   199: anewarray 64	java/lang/String
    //   202: iconst_1
    //   203: dup
    //   204: pop2
    //   205: goto +22 -> 227
    //   208: aload_3
    //   209: iload 5
    //   211: iconst_1
    //   212: dup
    //   213: dup
    //   214: pop2
    //   215: iadd
    //   216: invokevirtual 91	java/lang/String:substring	(I)Ljava/lang/String;
    //   219: ldc 93
    //   221: invokestatic 99	org/powerbot/util/prn:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   224: invokevirtual 103	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   227: astore 8
    //   229: aload 6
    //   231: astore 5
    //   233: iconst_m1
    //   234: iconst_1
    //   235: dup
    //   236: pop2
    //   237: istore 6
    //   239: aload 5
    //   241: invokevirtual 106	java/lang/String:hashCode	()I
    //   244: lookupswitch	default:+108->352, -567811164:+85->329, 97427706:+36->280, 502623545:+62->306
    //   280: aload 5
    //   282: ldc 108
    //   284: invokestatic 111	org/powerbot/bot/rt4/NodeQueue:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   287: invokevirtual 115	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   290: ifeq +62 -> 352
    //   293: iconst_0
    //   294: iconst_1
    //   295: dup
    //   296: pop2
    //   297: dup
    //   298: istore 6
    //   300: goto +54 -> 354
    //   303: goto +28 -> 331
    //   306: aload 5
    //   308: ldc 117
    //   310: invokestatic 99	org/powerbot/util/prn:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   313: invokevirtual 115	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   316: ifeq +36 -> 352
    //   319: iconst_1
    //   320: dup
    //   321: dup
    //   322: pop2
    //   323: dup
    //   324: istore 6
    //   326: goto +28 -> 354
    //   329: aload 5
    //   331: iconst_0
    //   332: ifne -29 -> 303
    //   335: ldc 119
    //   337: invokestatic 111	org/powerbot/bot/rt4/NodeQueue:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   340: invokevirtual 115	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   343: ifeq +9 -> 352
    //   346: iconst_2
    //   347: iconst_1
    //   348: dup
    //   349: pop2
    //   350: istore 6
    //   352: iload 6
    //   354: tableswitch	default:+200->554, 0:+26->380, 1:+104->458, 2:+129->483
    //   380: aload 8
    //   382: iconst_0
    //   383: ifne +97 -> 480
    //   386: arraylength
    //   387: iconst_3
    //   388: iconst_1
    //   389: dup
    //   390: pop2
    //   391: if_icmple +16 -> 407
    //   394: aload 8
    //   396: iconst_3
    //   397: iconst_1
    //   398: dup
    //   399: pop2
    //   400: aaload
    //   401: invokestatic 125	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   404: goto +4 -> 408
    //   407: lconst_1
    //   408: lstore 9
    //   410: aload_1
    //   411: getfield 28	org/powerbot/bot/ReflectorSpec:new	Ljava/util/Map;
    //   414: new 7	org/powerbot/bot/Reflector$FieldConfig
    //   417: aload 7
    //   419: dup_x1
    //   420: dup
    //   421: pop2
    //   422: dup
    //   423: aload 8
    //   425: iconst_0
    //   426: iconst_1
    //   427: dup
    //   428: pop2
    //   429: aaload
    //   430: aload 8
    //   432: iconst_1
    //   433: dup
    //   434: dup
    //   435: pop2
    //   436: aaload
    //   437: aload 8
    //   439: iconst_2
    //   440: iconst_1
    //   441: dup
    //   442: pop2
    //   443: aaload
    //   444: lload 9
    //   446: invokespecial 128	org/powerbot/bot/Reflector$FieldConfig:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    //   449: invokeinterface 134 3 0
    //   454: pop
    //   455: goto -419 -> 36
    //   458: aload_1
    //   459: getfield 26	org/powerbot/bot/ReflectorSpec:byte	Ljava/util/Map;
    //   462: aload 7
    //   464: aload 8
    //   466: iconst_0
    //   467: iconst_1
    //   468: dup
    //   469: pop2
    //   470: aaload
    //   471: invokeinterface 134 3 0
    //   476: pop
    //   477: goto -441 -> 36
    //   480: goto -98 -> 382
    //   483: aload 8
    //   485: arraylength
    //   486: iconst_2
    //   487: iconst_1
    //   488: dup
    //   489: pop2
    //   490: if_icmpne -454 -> 36
    //   493: aload 8
    //   495: iconst_1
    //   496: dup
    //   497: dup
    //   498: pop2
    //   499: aaload
    //   500: ldc -120
    //   502: invokestatic 99	org/powerbot/util/prn:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   505: invokevirtual 140	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   508: ifne +21 -> 529
    //   511: aload 8
    //   513: iconst_1
    //   514: dup
    //   515: dup
    //   516: pop2
    //   517: aaload
    //   518: ldc -114
    //   520: invokestatic 111	org/powerbot/bot/rt4/NodeQueue:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   523: invokevirtual 140	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   526: ifeq -490 -> 36
    //   529: aload_1
    //   530: getfield 30	org/powerbot/bot/ReflectorSpec:void	Ljava/util/Map;
    //   533: aload 7
    //   535: aload 8
    //   537: iconst_0
    //   538: iconst_1
    //   539: dup
    //   540: pop2
    //   541: aaload
    //   542: invokestatic 125	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   545: invokestatic 146	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   548: invokeinterface 134 3 0
    //   553: pop
    //   554: goto -518 -> 36
    //   557: aload_2
    //   558: ifnonnull +7 -> 565
    //   561: aload_0
    //   562: goto +4 -> 566
    //   565: aload_2
    //   566: astore_3
    //   567: aload_3
    //   568: ifnull +77 -> 645
    //   571: aload_3
    //   572: invokeinterface 151 1 0
    //   577: goto +68 -> 645
    //   580: astore 4
    //   582: goto +63 -> 645
    //   585: astore_3
    //   586: aload_2
    //   587: ifnonnull +7 -> 594
    //   590: aload_0
    //   591: goto +4 -> 595
    //   594: aload_2
    //   595: astore_3
    //   596: aload_3
    //   597: ifnull +48 -> 645
    //   600: aload_3
    //   601: invokeinterface 151 1 0
    //   606: goto +39 -> 645
    //   609: astore 4
    //   611: goto +34 -> 645
    //   614: astore 11
    //   616: aload_2
    //   617: ifnonnull +7 -> 624
    //   620: aload_0
    //   621: goto +4 -> 625
    //   624: aload_2
    //   625: astore_3
    //   626: aload_3
    //   627: ifnull +15 -> 642
    //   630: aload_3
    //   631: invokeinterface 151 1 0
    //   636: aload 11
    //   638: goto +6 -> 644
    //   641: astore_2
    //   642: aload 11
    //   644: athrow
    //   645: aload_1
    //   646: areturn
    // Line number table:
    //   Java source line #21	-> byte code offset #0
    //   Java source line #23	-> byte code offset #8
    //   Java source line #25	-> byte code offset #10
    //   Java source line #28	-> byte code offset #36
    //   Java source line #29	-> byte code offset #45
    //   Java source line #30	-> byte code offset #51
    //   Java source line #31	-> byte code offset #70
    //   Java source line #34	-> byte code offset #74
    //   Java source line #35	-> byte code offset #115
    //   Java source line #36	-> byte code offset #134
    //   Java source line #39	-> byte code offset #137
    //   Java source line #40	-> byte code offset #181
    //   Java source line #41	-> byte code offset #229
    //   Java source line #43	-> byte code offset #380
    //   Java source line #44	-> byte code offset #410
    //   Java source line #45	-> byte code offset #455
    //   Java source line #47	-> byte code offset #458
    //   Java source line #48	-> byte code offset #477
    //   Java source line #50	-> byte code offset #483
    //   Java source line #51	-> byte code offset #493
    //   Java source line #52	-> byte code offset #529
    //   Java source line #57	-> byte code offset #554
    //   Java source line #60	-> byte code offset #557
    //   Java source line #61	-> byte code offset #567
    //   Java source line #63	-> byte code offset #571
    //   Java source line #65	-> byte code offset #577
    //   Java source line #64	-> byte code offset #580
    //   Java source line #67	-> byte code offset #582
    //   Java source line #58	-> byte code offset #585
    //   Java source line #60	-> byte code offset #586
    //   Java source line #61	-> byte code offset #596
    //   Java source line #63	-> byte code offset #600
    //   Java source line #65	-> byte code offset #606
    //   Java source line #64	-> byte code offset #609
    //   Java source line #67	-> byte code offset #611
    //   Java source line #60	-> byte code offset #614
    //   Java source line #61	-> byte code offset #626
    //   Java source line #63	-> byte code offset #630
    //   Java source line #65	-> byte code offset #638
    //   Java source line #64	-> byte code offset #641
    //   Java source line #67	-> byte code offset #642
    //   Java source line #69	-> byte code offset #645
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	647	0	a	java.io.InputStream
    //   7	639	1	localReflectorSpec	ReflectorSpec
    //   9	616	2	localBufferedReader1	java.io.BufferedReader
    //   641	1	2	localIOException3	java.io.IOException
    //   641	1	2	localIOException4	java.io.IOException
    //   41	531	3	localObject1	Object
    //   585	46	3	localIOException1	java.io.IOException
    //   585	1	3	localIOException5	java.io.IOException
    //   595	36	3	localBufferedReader2	java.io.BufferedReader
    //   84	84	4	i	int
    //   580	1	4	localIOException	java.io.IOException
    //   580	1	4	localIOException6	java.io.IOException
    //   609	1	4	localIOException2	java.io.IOException
    //   609	1	4	localIOException7	java.io.IOException
    //   113	97	5	j	int
    //   231	99	5	localObject2	Object
    //   147	83	6	str1	String
    //   237	116	6	k	int
    //   179	355	7	str2	String
    //   227	309	8	arrayOfString	String[]
    //   408	37	9	l	long
    //   614	29	11	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   571	577	580	java/io/IOException
    //   10	73	585	java/io/IOException
    //   74	107	585	java/io/IOException
    //   108	557	585	java/io/IOException
    //   600	606	609	java/io/IOException
    //   10	73	614	finally
    //   74	107	614	finally
    //   108	557	614	finally
    //   614	616	614	finally
    //   630	636	641	java/io/IOException
  }
}
