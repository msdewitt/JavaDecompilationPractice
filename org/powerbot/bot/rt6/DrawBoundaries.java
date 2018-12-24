package org.powerbot.bot.rt6;

import java.awt.Point;
import org.powerbot.script.PaintListener;
import org.powerbot.script.rt6.ClientAccessor;
import org.powerbot.script.rt6.ClientContext;







public class DrawBoundaries
  extends ClientAccessor
  implements PaintListener
{
  public DrawBoundaries(ClientContext a)
  {
    a.<init>(a);
  }
  
  /* Error */
  public void repaint(java.awt.Graphics a)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 20	org/powerbot/bot/rt6/DrawBoundaries:ctx	Lorg/powerbot/script/ClientContext;
    //   4: checkcast 22	org/powerbot/script/rt6/ClientContext
    //   7: getfield 26	org/powerbot/script/rt6/ClientContext:game	Lorg/powerbot/script/rt6/Game;
    //   10: invokevirtual 32	org/powerbot/script/rt6/Game:loggedIn	()Z
    //   13: ifne +5 -> 18
    //   16: return
    //   17: athrow
    //   18: aload_0
    //   19: getfield 20	org/powerbot/bot/rt6/DrawBoundaries:ctx	Lorg/powerbot/script/ClientContext;
    //   22: checkcast 22	org/powerbot/script/rt6/ClientContext
    //   25: invokevirtual 36	org/powerbot/script/rt6/ClientContext:client	()Lorg/powerbot/script/Client;
    //   28: checkcast 38	org/powerbot/bot/rt6/client/Client
    //   31: astore_2
    //   32: aload_0
    //   33: getfield 20	org/powerbot/bot/rt6/DrawBoundaries:ctx	Lorg/powerbot/script/ClientContext;
    //   36: checkcast 22	org/powerbot/script/rt6/ClientContext
    //   39: getfield 42	org/powerbot/script/rt6/ClientContext:players	Lorg/powerbot/script/rt6/Players;
    //   42: invokevirtual 48	org/powerbot/script/rt6/Players:local	()Lorg/powerbot/script/rt6/Player;
    //   45: invokevirtual 54	org/powerbot/script/rt6/Player:relative	()Lorg/powerbot/script/rt6/RelativeLocation;
    //   48: astore_3
    //   49: aload_0
    //   50: aload_3
    //   51: dup
    //   52: invokevirtual 60	org/powerbot/script/rt6/RelativeLocation:x	()F
    //   55: fstore_3
    //   56: invokevirtual 63	org/powerbot/script/rt6/RelativeLocation:z	()F
    //   59: fstore 4
    //   61: getfield 20	org/powerbot/bot/rt6/DrawBoundaries:ctx	Lorg/powerbot/script/ClientContext;
    //   64: checkcast 22	org/powerbot/script/rt6/ClientContext
    //   67: getfield 26	org/powerbot/script/rt6/ClientContext:game	Lorg/powerbot/script/rt6/Game;
    //   70: invokevirtual 67	org/powerbot/script/rt6/Game:mapComponent	()Lorg/powerbot/script/rt6/Component;
    //   73: astore 5
    //   75: aload_2
    //   76: aload 5
    //   78: dup
    //   79: invokevirtual 73	org/powerbot/script/rt6/Component:scrollWidth	()I
    //   82: istore 6
    //   84: invokevirtual 76	org/powerbot/script/rt6/Component:scrollHeight	()I
    //   87: istore 7
    //   89: iload 6
    //   91: iconst_2
    //   92: iconst_1
    //   93: dup
    //   94: pop2
    //   95: idiv
    //   96: iload 7
    //   98: iconst_2
    //   99: iconst_1
    //   100: dup
    //   101: pop2
    //   102: idiv
    //   103: invokestatic 82	java/lang/Math:max	(II)I
    //   106: bipush 10
    //   108: iconst_1
    //   109: dup
    //   110: pop2
    //   111: iadd
    //   112: istore 8
    //   114: invokevirtual 85	org/powerbot/bot/rt6/client/Client:getMinimapSettings	()I
    //   117: i2l
    //   118: aload_2
    //   119: getfield 89	org/powerbot/bot/rt6/client/Client:reflector	Lorg/powerbot/bot/Reflector;
    //   122: ldc 91
    //   124: invokestatic 97	z/A:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   127: invokevirtual 103	org/powerbot/bot/Reflector:getConstant	(Ljava/lang/String;)J
    //   130: lcmp
    //   131: ifne +11 -> 142
    //   134: iconst_1
    //   135: dup
    //   136: dup
    //   137: pop2
    //   138: goto +8 -> 146
    //   141: athrow
    //   142: iconst_0
    //   143: iconst_1
    //   144: dup
    //   145: pop2
    //   146: istore 9
    //   148: aload_0
    //   149: getfield 20	org/powerbot/bot/rt6/DrawBoundaries:ctx	Lorg/powerbot/script/ClientContext;
    //   152: checkcast 22	org/powerbot/script/rt6/ClientContext
    //   155: getfield 107	org/powerbot/script/rt6/ClientContext:camera	Lorg/powerbot/script/rt6/Camera;
    //   158: invokevirtual 112	org/powerbot/script/rt6/Camera:rotation	()F
    //   161: f2d
    //   162: ldc2_w 113
    //   165: dmul
    //   166: ldc2_w 115
    //   169: ddiv
    //   170: dstore 10
    //   172: sipush 16383
    //   175: iconst_1
    //   176: dup
    //   177: pop2
    //   178: dload 10
    //   180: d2i
    //   181: iand
    //   182: istore 12
    //   184: iload 9
    //   186: ifne +20 -> 206
    //   189: sipush 16383
    //   192: iconst_1
    //   193: dup
    //   194: pop2
    //   195: aload_2
    //   196: invokevirtual 119	org/powerbot/bot/rt6/client/Client:getMinimapOffset	()I
    //   199: dload 10
    //   201: d2i
    //   202: iadd
    //   203: iand
    //   204: istore 12
    //   206: getstatic 123	org/powerbot/script/rt6/Game:SIN_TABLE	[I
    //   209: iload 12
    //   211: iaload
    //   212: istore 10
    //   214: getstatic 126	org/powerbot/script/rt6/Game:COS_TABLE	[I
    //   217: iload 12
    //   219: iaload
    //   220: istore 12
    //   222: iload 9
    //   224: ifne +44 -> 268
    //   227: sipush 256
    //   230: iconst_1
    //   231: dup
    //   232: pop2
    //   233: aload_2
    //   234: invokevirtual 129	org/powerbot/bot/rt6/client/Client:getMinimapScale	()I
    //   237: iadd
    //   238: istore 9
    //   240: sipush 256
    //   243: iconst_1
    //   244: dup
    //   245: pop2
    //   246: iload 10
    //   248: imul
    //   249: iload 9
    //   251: idiv
    //   252: istore 10
    //   254: sipush 256
    //   257: iconst_1
    //   258: dup
    //   259: pop2
    //   260: iload 12
    //   262: imul
    //   263: iload 9
    //   265: idiv
    //   266: istore 12
    //   268: aload_0
    //   269: getfield 20	org/powerbot/bot/rt6/DrawBoundaries:ctx	Lorg/powerbot/script/ClientContext;
    //   272: checkcast 22	org/powerbot/script/rt6/ClientContext
    //   275: getfield 133	org/powerbot/script/rt6/ClientContext:movement	Lorg/powerbot/script/rt6/Movement;
    //   278: invokevirtual 139	org/powerbot/script/rt6/Movement:collisionMap	()Lorg/powerbot/script/rt6/CollisionMap;
    //   281: dup
    //   282: astore 9
    //   284: dup
    //   285: invokevirtual 144	org/powerbot/script/rt6/CollisionMap:width	()I
    //   288: bipush 6
    //   290: iconst_1
    //   291: dup
    //   292: pop2
    //   293: isub
    //   294: istore_2
    //   295: invokevirtual 147	org/powerbot/script/rt6/CollisionMap:height	()I
    //   298: bipush 6
    //   300: iconst_1
    //   301: dup
    //   302: pop2
    //   303: isub
    //   304: istore 11
    //   306: iload_2
    //   307: iload 11
    //   309: multianewarray 149 2
    //   313: astore 13
    //   315: aload 5
    //   317: invokevirtual 153	org/powerbot/script/rt6/Component:screenPoint	()Ljava/awt/Point;
    //   320: astore 5
    //   322: iconst_0
    //   323: iconst_1
    //   324: dup
    //   325: pop2
    //   326: dup
    //   327: istore 14
    //   329: iload_2
    //   330: if_icmpge +92 -> 422
    //   333: iconst_0
    //   334: iconst_1
    //   335: dup
    //   336: pop2
    //   337: dup
    //   338: istore 15
    //   340: iload 11
    //   342: if_icmpge +72 -> 414
    //   345: aload_0
    //   346: iload 14
    //   348: iload 15
    //   350: fload_3
    //   351: fload 4
    //   353: iload 6
    //   355: iload 7
    //   357: iload 8
    //   359: iload 10
    //   361: iload 12
    //   363: aload 5
    //   365: invokevirtual 156	org/powerbot/bot/rt6/DrawBoundaries:this	(IIFFIIIIILjava/awt/Point;)Ljava/awt/Point;
    //   368: dup
    //   369: astore 16
    //   371: getfield 161	java/awt/Point:x	I
    //   374: iconst_m1
    //   375: iconst_1
    //   376: dup
    //   377: pop2
    //   378: if_icmpeq +15 -> 393
    //   381: aload 16
    //   383: getfield 164	java/awt/Point:y	I
    //   386: iconst_m1
    //   387: iconst_1
    //   388: dup
    //   389: pop2
    //   390: if_icmpne +6 -> 396
    //   393: aconst_null
    //   394: astore 16
    //   396: aload 13
    //   398: iload 14
    //   400: aaload
    //   401: iload 15
    //   403: aload 16
    //   405: iinc 15 1
    //   408: aastore
    //   409: iload 15
    //   411: goto -71 -> 340
    //   414: iinc 14 1
    //   417: iload 14
    //   419: goto -90 -> 329
    //   422: getstatic 170	org/powerbot/script/rt6/CollisionFlag:DEAD_BLOCK	Lorg/powerbot/script/rt6/CollisionFlag;
    //   425: getstatic 173	org/powerbot/script/rt6/CollisionFlag:OBJECT_BLOCK	Lorg/powerbot/script/rt6/CollisionFlag;
    //   428: invokevirtual 177	org/powerbot/script/rt6/CollisionFlag:mark	(Lorg/powerbot/script/rt6/CollisionFlag;)Lorg/powerbot/script/rt6/CollisionFlag;
    //   431: astore 14
    //   433: iconst_1
    //   434: dup
    //   435: dup
    //   436: pop2
    //   437: dup
    //   438: istore 15
    //   440: iload_2
    //   441: iconst_1
    //   442: dup
    //   443: dup
    //   444: pop2
    //   445: isub
    //   446: if_icmpge +296 -> 742
    //   449: iconst_1
    //   450: dup
    //   451: dup
    //   452: pop2
    //   453: dup
    //   454: istore 16
    //   456: iload 11
    //   458: iconst_1
    //   459: dup
    //   460: dup
    //   461: pop2
    //   462: isub
    //   463: if_icmpge +271 -> 734
    //   466: aload 13
    //   468: dup
    //   469: dup2
    //   470: iload 15
    //   472: aaload
    //   473: iload 16
    //   475: aaload
    //   476: astore_3
    //   477: iload 15
    //   479: iconst_1
    //   480: dup
    //   481: dup
    //   482: pop2
    //   483: iadd
    //   484: aaload
    //   485: iload 16
    //   487: aaload
    //   488: astore 4
    //   490: iload 15
    //   492: iconst_1
    //   493: dup
    //   494: dup
    //   495: pop2
    //   496: iadd
    //   497: aaload
    //   498: iload 16
    //   500: iconst_1
    //   501: dup
    //   502: dup
    //   503: pop2
    //   504: iadd
    //   505: aaload
    //   506: astore 5
    //   508: iload 15
    //   510: aaload
    //   511: iload 16
    //   513: iconst_1
    //   514: dup
    //   515: dup
    //   516: pop2
    //   517: iadd
    //   518: aaload
    //   519: astore 6
    //   521: aload_3
    //   522: ifnull +204 -> 726
    //   525: aload 4
    //   527: ifnull +199 -> 726
    //   530: aload 5
    //   532: ifnull +194 -> 726
    //   535: aload 6
    //   537: ifnull +189 -> 726
    //   540: aload_1
    //   541: aload 9
    //   543: iload 15
    //   545: iload 16
    //   547: invokevirtual 181	org/powerbot/script/rt6/CollisionMap:flagAt	(II)Lorg/powerbot/script/rt6/CollisionFlag;
    //   550: aload 14
    //   552: invokevirtual 185	org/powerbot/script/rt6/CollisionFlag:contains	(Lorg/powerbot/script/rt6/CollisionFlag;)Z
    //   555: new 187	java/awt/Color
    //   558: swap
    //   559: ifeq +29 -> 588
    //   562: dup
    //   563: sipush 255
    //   566: iconst_1
    //   567: dup
    //   568: pop2
    //   569: iconst_0
    //   570: iconst_1
    //   571: dup
    //   572: pop2
    //   573: iconst_0
    //   574: iconst_1
    //   575: dup
    //   576: pop2
    //   577: bipush 50
    //   579: iconst_1
    //   580: dup
    //   581: pop2
    //   582: invokespecial 190	java/awt/Color:<init>	(IIII)V
    //   585: goto +26 -> 611
    //   588: dup
    //   589: iconst_1
    //   590: dup
    //   591: pop2
    //   592: sipush 255
    //   595: iconst_1
    //   596: dup
    //   597: pop2
    //   598: iconst_0
    //   599: dup_x1
    //   600: iconst_1
    //   601: dup
    //   602: pop2
    //   603: bipush 50
    //   605: iconst_1
    //   606: dup
    //   607: pop2
    //   608: invokespecial 190	java/awt/Color:<init>	(IIII)V
    //   611: invokevirtual 196	java/awt/Graphics:setColor	(Ljava/awt/Color;)V
    //   614: aload_1
    //   615: iconst_4
    //   616: iconst_1
    //   617: dup
    //   618: pop2
    //   619: newarray int
    //   621: iconst_1
    //   622: dup
    //   623: pop2
    //   624: dup
    //   625: iconst_0
    //   626: iconst_1
    //   627: dup
    //   628: pop2
    //   629: aload_3
    //   630: getfield 161	java/awt/Point:x	I
    //   633: iastore
    //   634: dup
    //   635: iconst_1
    //   636: dup
    //   637: dup
    //   638: pop2
    //   639: aload 4
    //   641: getfield 161	java/awt/Point:x	I
    //   644: iastore
    //   645: dup
    //   646: iconst_2
    //   647: iconst_1
    //   648: dup
    //   649: pop2
    //   650: aload 5
    //   652: getfield 161	java/awt/Point:x	I
    //   655: iastore
    //   656: dup
    //   657: iconst_3
    //   658: iconst_1
    //   659: dup
    //   660: pop2
    //   661: aload 6
    //   663: getfield 161	java/awt/Point:x	I
    //   666: iastore
    //   667: iconst_4
    //   668: iconst_1
    //   669: dup
    //   670: pop2
    //   671: newarray int
    //   673: iconst_1
    //   674: dup
    //   675: pop2
    //   676: dup
    //   677: iconst_0
    //   678: iconst_1
    //   679: dup
    //   680: pop2
    //   681: aload_3
    //   682: getfield 164	java/awt/Point:y	I
    //   685: iastore
    //   686: dup
    //   687: iconst_1
    //   688: dup
    //   689: dup
    //   690: pop2
    //   691: aload 4
    //   693: getfield 164	java/awt/Point:y	I
    //   696: iastore
    //   697: dup
    //   698: iconst_2
    //   699: iconst_1
    //   700: dup
    //   701: pop2
    //   702: aload 5
    //   704: getfield 164	java/awt/Point:y	I
    //   707: iastore
    //   708: dup
    //   709: iconst_3
    //   710: iconst_1
    //   711: dup
    //   712: pop2
    //   713: aload 6
    //   715: getfield 164	java/awt/Point:y	I
    //   718: iastore
    //   719: iconst_4
    //   720: iconst_1
    //   721: dup
    //   722: pop2
    //   723: invokevirtual 200	java/awt/Graphics:fillPolygon	([I[II)V
    //   726: iinc 16 1
    //   729: iload 16
    //   731: goto -275 -> 456
    //   734: iinc 15 1
    //   737: iload 15
    //   739: goto -299 -> 440
    //   742: return
    // Line number table:
    //   Java source line #25	-> byte code offset #0
    //   Java source line #26	-> byte code offset #16
    //   Java source line #29	-> byte code offset #18
    //   Java source line #30	-> byte code offset #32
    //   Java source line #31	-> byte code offset #50
    //   Java source line #32	-> byte code offset #56
    //   Java source line #33	-> byte code offset #61
    //   Java source line #34	-> byte code offset #76
    //   Java source line #35	-> byte code offset #84
    //   Java source line #36	-> byte code offset #89
    //   Java source line #38	-> byte code offset #114
    //   Java source line #39	-> byte code offset #148
    //   Java source line #40	-> byte code offset #172
    //   Java source line #41	-> byte code offset #184
    //   Java source line #42	-> byte code offset #189
    //   Java source line #44	-> byte code offset #206
    //   Java source line #45	-> byte code offset #222
    //   Java source line #46	-> byte code offset #227
    //   Java source line #47	-> byte code offset #240
    //   Java source line #48	-> byte code offset #254
    //   Java source line #51	-> byte code offset #268
    //   Java source line #52	-> byte code offset #284
    //   Java source line #53	-> byte code offset #295
    //   Java source line #54	-> byte code offset #306
    //   Java source line #55	-> byte code offset #315
    //   Java source line #56	-> byte code offset #322
    //   Java source line #57	-> byte code offset #333
    //   Java source line #58	-> byte code offset #345
    //   Java source line #59	-> byte code offset #371
    //   Java source line #60	-> byte code offset #393
    //   Java source line #63	-> byte code offset #396
    //   Java source line #57	-> byte code offset #409
    //   Java source line #56	-> byte code offset #414
    //   Java source line #66	-> byte code offset #422
    //   Java source line #67	-> byte code offset #433
    //   Java source line #68	-> byte code offset #449
    //   Java source line #69	-> byte code offset #466
    //   Java source line #70	-> byte code offset #477
    //   Java source line #71	-> byte code offset #490
    //   Java source line #72	-> byte code offset #508
    //   Java source line #73	-> byte code offset #521
    //   Java source line #74	-> byte code offset #540
    //   Java source line #75	-> byte code offset #614
    //   Java source line #68	-> byte code offset #726
    //   Java source line #67	-> byte code offset #734
    //   Java source line #79	-> byte code offset #742
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	743	0	a	DrawBoundaries
    //   0	743	1	a	java.awt.Graphics
  }
  
  Point jdMethod_this(int a, int a, float a, float a, int a, int a, int a, int a, int a, Point a)
  {
    int tmp3_2 = 1;tmp3_2;a = 4 * tmp3_2 - a / 128.0F; int 
      tmp16_15 = 1;tmp16_15;a = 4 * tmp16_15 - a / 128.0F;
    
    if ((int)Math.round(Math.sqrt(Math.pow(a, 2.0D) + Math.pow(a, 2.0D))) >= a) {
      int tmp62_61 = 1;tmp62_61; int tmp66_65 = 1;tmp66_65;tmp62_61.<init>(-1, tmp66_65);return -1;throw new java/awt/Point;
    }
    
    int tmp88_87 = 1;tmp88_87;a = 14 >> tmp88_87; int 
      tmp107_106 = 1;tmp107_106;a = 14 >> tmp107_106; int 
      tmp116_115 = 1;tmp116_115;a = a + 2 / tmp116_115; int 
      tmp124_123 = 1;tmp124_123;a = -1 * tmp124_123; int 
      tmp133_132 = 1;tmp133_132;a = a + 2 / tmp133_132; int 
    
      tmp141_140 = 1;tmp141_140; if (4 > tmp141_140) { int tmp151_150 = 1;tmp151_150; if (a < 4 - tmp151_150) { int tmp160_159 = 1;tmp160_159; if (4 > tmp160_159) { int tmp170_169 = 1;tmp170_169; if (a < 4 - tmp170_169)
          {
            a = a + (int)a.getX();
            a += (int)a.getY();
            return new Point(a, a);throw a;
          }
        } } }
    int tmp211_210 = 1;tmp211_210; int tmp215_214 = 1;tmp215_214;tmp211_210.<init>(-1, tmp215_214);return -1;
  }
}
