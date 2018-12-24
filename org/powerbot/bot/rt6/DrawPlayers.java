package org.powerbot.bot.rt6;

import org.powerbot.script.PaintListener;
import org.powerbot.script.rt6.ClientAccessor;
import org.powerbot.script.rt6.ClientContext;




public class DrawPlayers
  extends ClientAccessor
  implements PaintListener
{
  public DrawPlayers(ClientContext a)
  {
    a.<init>(a);
  }
  
  /* Error */
  public void repaint(java.awt.Graphics a)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 20	org/powerbot/bot/rt6/DrawPlayers:ctx	Lorg/powerbot/script/ClientContext;
    //   4: checkcast 22	org/powerbot/script/rt6/ClientContext
    //   7: getfield 26	org/powerbot/script/rt6/ClientContext:game	Lorg/powerbot/script/rt6/Game;
    //   10: invokevirtual 32	org/powerbot/script/rt6/Game:loggedIn	()Z
    //   13: ifne +5 -> 18
    //   16: return
    //   17: athrow
    //   18: aload_1
    //   19: invokevirtual 38	java/awt/Graphics:getFontMetrics	()Ljava/awt/FontMetrics;
    //   22: astore_2
    //   23: aload_0
    //   24: getfield 20	org/powerbot/bot/rt6/DrawPlayers:ctx	Lorg/powerbot/script/ClientContext;
    //   27: checkcast 22	org/powerbot/script/rt6/ClientContext
    //   30: getfield 42	org/powerbot/script/rt6/ClientContext:players	Lorg/powerbot/script/rt6/Players;
    //   33: invokevirtual 48	org/powerbot/script/rt6/Players:select	()Lorg/powerbot/script/AbstractQuery;
    //   36: checkcast 50	org/powerbot/script/rt6/PlayerQuery
    //   39: invokevirtual 54	org/powerbot/script/rt6/PlayerQuery:iterator	()Ljava/util/Iterator;
    //   42: astore_3
    //   43: aload_3
    //   44: invokeinterface 59 1 0
    //   49: ifeq +689 -> 738
    //   52: aload_3
    //   53: invokeinterface 63 1 0
    //   58: checkcast 65	org/powerbot/script/rt6/Player
    //   61: dup
    //   62: astore 4
    //   64: invokevirtual 69	org/powerbot/script/rt6/Player:centerPoint	()Ljava/awt/Point;
    //   67: dup
    //   68: astore 5
    //   70: getfield 75	java/awt/Point:x	I
    //   73: iconst_m1
    //   74: iconst_1
    //   75: dup
    //   76: pop2
    //   77: if_icmpeq -34 -> 43
    //   80: aload 5
    //   82: getfield 78	java/awt/Point:y	I
    //   85: iconst_m1
    //   86: iconst_1
    //   87: dup
    //   88: pop2
    //   89: if_icmpne +8 -> 97
    //   92: aload_3
    //   93: goto -49 -> 44
    //   96: athrow
    //   97: aload_1
    //   98: aload 5
    //   100: aload_1
    //   101: dup_x1
    //   102: getstatic 84	java/awt/Color:RED	Ljava/awt/Color;
    //   105: invokevirtual 88	java/awt/Graphics:setColor	(Ljava/awt/Color;)V
    //   108: invokevirtual 92	java/awt/Point:getX	()D
    //   111: d2i
    //   112: iconst_1
    //   113: dup
    //   114: dup
    //   115: pop2
    //   116: isub
    //   117: aload 5
    //   119: invokevirtual 95	java/awt/Point:getY	()D
    //   122: d2i
    //   123: iconst_1
    //   124: dup
    //   125: dup
    //   126: pop2
    //   127: isub
    //   128: iconst_2
    //   129: iconst_1
    //   130: dup
    //   131: pop2
    //   132: iconst_2
    //   133: iconst_1
    //   134: dup
    //   135: pop2
    //   136: invokevirtual 99	java/awt/Graphics:fillRect	(IIII)V
    //   139: new 101	java/lang/StringBuilder
    //   142: dup
    //   143: invokespecial 104	java/lang/StringBuilder:<init>	()V
    //   146: iconst_0
    //   147: aload 4
    //   149: invokevirtual 108	org/powerbot/script/rt6/Player:name	()Ljava/lang/String;
    //   152: invokevirtual 112	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   155: ldc 114
    //   157: invokestatic 120	org/powerbot/script/Calculations:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   160: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: aload 4
    //   165: invokevirtual 128	org/powerbot/script/rt6/Player:combatLevel	()I
    //   168: invokevirtual 131	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   171: ldc -123
    //   173: invokestatic 136	org/powerbot/util/prn:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   176: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   179: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   182: astore 6
    //   184: aload 4
    //   186: invokevirtual 142	org/powerbot/script/rt6/Player:inCombat	()Z
    //   189: ifeq +9 -> 198
    //   192: getstatic 84	java/awt/Color:RED	Ljava/awt/Color;
    //   195: goto +20 -> 215
    //   198: aload 4
    //   200: invokevirtual 145	org/powerbot/script/rt6/Player:inMotion	()Z
    //   203: ifeq +9 -> 212
    //   206: getstatic 148	java/awt/Color:GREEN	Ljava/awt/Color;
    //   209: goto +6 -> 215
    //   212: getstatic 151	java/awt/Color:WHITE	Ljava/awt/Color;
    //   215: invokevirtual 88	java/awt/Graphics:setColor	(Ljava/awt/Color;)V
    //   218: aload 4
    //   220: dup
    //   221: aload_1
    //   222: aload 5
    //   224: getfield 75	java/awt/Point:x	I
    //   227: aload_2
    //   228: aload 6
    //   230: dup_x2
    //   231: invokevirtual 157	java/awt/FontMetrics:stringWidth	(Ljava/lang/String;)I
    //   234: iconst_2
    //   235: iconst_1
    //   236: dup
    //   237: pop2
    //   238: idiv
    //   239: isub
    //   240: aload 5
    //   242: getfield 78	java/awt/Point:y	I
    //   245: aload_2
    //   246: invokevirtual 160	java/awt/FontMetrics:getHeight	()I
    //   249: iconst_2
    //   250: iconst_1
    //   251: dup
    //   252: pop2
    //   253: idiv
    //   254: isub
    //   255: invokevirtual 164	java/awt/Graphics:drawString	(Ljava/lang/String;II)V
    //   258: invokevirtual 167	org/powerbot/script/rt6/Player:overheadMessage	()Ljava/lang/String;
    //   261: astore 7
    //   263: iconst_0
    //   264: iconst_1
    //   265: dup
    //   266: pop2
    //   267: istore 8
    //   269: invokevirtual 170	org/powerbot/script/rt6/Player:animation	()I
    //   272: iconst_m1
    //   273: iconst_1
    //   274: dup
    //   275: pop2
    //   276: if_icmpne +27 -> 303
    //   279: aload 4
    //   281: invokevirtual 173	org/powerbot/script/rt6/Player:stance	()I
    //   284: iconst_m1
    //   285: iconst_1
    //   286: dup
    //   287: pop2
    //   288: if_icmpne +15 -> 303
    //   291: aload 4
    //   293: invokevirtual 176	org/powerbot/script/rt6/Player:npcId	()I
    //   296: iconst_m1
    //   297: iconst_1
    //   298: dup
    //   299: pop2
    //   300: if_icmpeq +368 -> 668
    //   303: ldc -78
    //   305: astore 6
    //   307: new 101	java/lang/StringBuilder
    //   310: dup
    //   311: invokespecial 104	java/lang/StringBuilder:<init>	()V
    //   314: iconst_0
    //   315: aload 6
    //   317: invokevirtual 112	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   320: ldc -76
    //   322: invokestatic 120	org/powerbot/script/Calculations:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   325: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   328: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   331: astore 6
    //   333: aload 4
    //   335: invokevirtual 176	org/powerbot/script/rt6/Player:npcId	()I
    //   338: iconst_m1
    //   339: iconst_1
    //   340: dup
    //   341: pop2
    //   342: if_icmpeq +45 -> 387
    //   345: new 101	java/lang/StringBuilder
    //   348: dup
    //   349: invokespecial 104	java/lang/StringBuilder:<init>	()V
    //   352: iconst_0
    //   353: aload 6
    //   355: invokevirtual 112	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   358: ldc -74
    //   360: invokestatic 136	org/powerbot/util/prn:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   363: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   366: aload 4
    //   368: invokevirtual 176	org/powerbot/script/rt6/Player:npcId	()I
    //   371: invokevirtual 131	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   374: ldc -72
    //   376: invokestatic 120	org/powerbot/script/Calculations:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   379: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   382: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   385: astore 6
    //   387: aload 4
    //   389: invokevirtual 187	org/powerbot/script/rt6/Player:prayerIcon	()I
    //   392: iconst_m1
    //   393: iconst_1
    //   394: dup
    //   395: pop2
    //   396: if_icmpeq +45 -> 441
    //   399: new 101	java/lang/StringBuilder
    //   402: dup
    //   403: invokespecial 104	java/lang/StringBuilder:<init>	()V
    //   406: iconst_0
    //   407: aload 6
    //   409: invokevirtual 112	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   412: ldc -67
    //   414: invokestatic 136	org/powerbot/util/prn:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   417: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   420: aload 4
    //   422: invokevirtual 187	org/powerbot/script/rt6/Player:prayerIcon	()I
    //   425: invokevirtual 131	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   428: ldc -72
    //   430: invokestatic 120	org/powerbot/script/Calculations:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   433: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   436: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   439: astore 6
    //   441: aload 4
    //   443: invokevirtual 192	org/powerbot/script/rt6/Player:skullIcon	()I
    //   446: iconst_m1
    //   447: iconst_1
    //   448: dup
    //   449: pop2
    //   450: if_icmpeq +45 -> 495
    //   453: new 101	java/lang/StringBuilder
    //   456: dup
    //   457: invokespecial 104	java/lang/StringBuilder:<init>	()V
    //   460: iconst_0
    //   461: aload 6
    //   463: invokevirtual 112	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   466: ldc -62
    //   468: invokestatic 136	org/powerbot/util/prn:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   471: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   474: aload 4
    //   476: invokevirtual 192	org/powerbot/script/rt6/Player:skullIcon	()I
    //   479: invokevirtual 131	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   482: ldc -72
    //   484: invokestatic 120	org/powerbot/script/Calculations:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   487: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   490: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   493: astore 6
    //   495: aload 4
    //   497: invokevirtual 170	org/powerbot/script/rt6/Player:animation	()I
    //   500: iconst_m1
    //   501: iconst_1
    //   502: dup
    //   503: pop2
    //   504: if_icmpne +11 -> 515
    //   507: aload 4
    //   509: invokevirtual 173	org/powerbot/script/rt6/Player:stance	()I
    //   512: ifle +61 -> 573
    //   515: new 101	java/lang/StringBuilder
    //   518: dup
    //   519: invokespecial 104	java/lang/StringBuilder:<init>	()V
    //   522: iconst_0
    //   523: aload 6
    //   525: invokevirtual 112	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   528: ldc -60
    //   530: invokestatic 136	org/powerbot/util/prn:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   533: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   536: aload 4
    //   538: invokevirtual 170	org/powerbot/script/rt6/Player:animation	()I
    //   541: invokevirtual 131	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   544: ldc -58
    //   546: invokestatic 120	org/powerbot/script/Calculations:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   549: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   552: aload 4
    //   554: invokevirtual 173	org/powerbot/script/rt6/Player:stance	()I
    //   557: invokevirtual 131	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   560: ldc -56
    //   562: invokestatic 136	org/powerbot/util/prn:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   565: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   568: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   571: astore 6
    //   573: aload 6
    //   575: iconst_0
    //   576: iconst_1
    //   577: dup
    //   578: pop2
    //   579: aload 6
    //   581: ldc -72
    //   583: invokestatic 120	org/powerbot/script/Calculations:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   586: invokevirtual 205	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   589: invokevirtual 209	java/lang/String:substring	(II)Ljava/lang/String;
    //   592: astore 6
    //   594: new 101	java/lang/StringBuilder
    //   597: dup
    //   598: invokespecial 104	java/lang/StringBuilder:<init>	()V
    //   601: iconst_0
    //   602: aload 6
    //   604: invokevirtual 112	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   607: ldc -123
    //   609: invokestatic 136	org/powerbot/util/prn:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   612: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   615: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   618: astore 6
    //   620: iconst_1
    //   621: aload_1
    //   622: aload 5
    //   624: getfield 75	java/awt/Point:x	I
    //   627: aload_2
    //   628: aload 6
    //   630: dup_x2
    //   631: invokevirtual 157	java/awt/FontMetrics:stringWidth	(Ljava/lang/String;)I
    //   634: iconst_2
    //   635: iconst_1
    //   636: dup
    //   637: pop2
    //   638: idiv
    //   639: isub
    //   640: aload 5
    //   642: getfield 78	java/awt/Point:y	I
    //   645: aload_2
    //   646: invokevirtual 160	java/awt/FontMetrics:getHeight	()I
    //   649: iconst_3
    //   650: iconst_1
    //   651: dup
    //   652: pop2
    //   653: imul
    //   654: iconst_2
    //   655: iconst_1
    //   656: dup
    //   657: pop2
    //   658: idiv
    //   659: isub
    //   660: invokevirtual 164	java/awt/Graphics:drawString	(Ljava/lang/String;II)V
    //   663: iconst_1
    //   664: dup
    //   665: pop2
    //   666: istore 8
    //   668: aload 7
    //   670: ifnull -627 -> 43
    //   673: aload 7
    //   675: aload 5
    //   677: aload_1
    //   678: dup_x2
    //   679: getstatic 212	java/awt/Color:ORANGE	Ljava/awt/Color;
    //   682: invokevirtual 88	java/awt/Graphics:setColor	(Ljava/awt/Color;)V
    //   685: getfield 75	java/awt/Point:x	I
    //   688: aload_2
    //   689: aload 7
    //   691: invokevirtual 157	java/awt/FontMetrics:stringWidth	(Ljava/lang/String;)I
    //   694: iconst_2
    //   695: iconst_1
    //   696: dup
    //   697: pop2
    //   698: idiv
    //   699: isub
    //   700: aload 5
    //   702: getfield 78	java/awt/Point:y	I
    //   705: aload_2
    //   706: invokevirtual 160	java/awt/FontMetrics:getHeight	()I
    //   709: iload 8
    //   711: ifeq +10 -> 721
    //   714: iconst_5
    //   715: iconst_1
    //   716: dup
    //   717: pop2
    //   718: goto +7 -> 725
    //   721: iconst_3
    //   722: iconst_1
    //   723: dup
    //   724: pop2
    //   725: imul
    //   726: iconst_2
    //   727: iconst_1
    //   728: dup
    //   729: pop2
    //   730: idiv
    //   731: isub
    //   732: invokevirtual 164	java/awt/Graphics:drawString	(Ljava/lang/String;II)V
    //   735: goto -692 -> 43
    //   738: return
    // Line number table:
    //   Java source line #20	-> byte code offset #0
    //   Java source line #21	-> byte code offset #16
    //   Java source line #23	-> byte code offset #18
    //   Java source line #24	-> byte code offset #23
    //   Java source line #25	-> byte code offset #64
    //   Java source line #26	-> byte code offset #70
    //   Java source line #27	-> byte code offset #93
    //   Java source line #29	-> byte code offset #97
    //   Java source line #30	-> byte code offset #108
    //   Java source line #31	-> byte code offset #139
    //   Java source line #32	-> byte code offset #184
    //   Java source line #33	-> byte code offset #221
    //   Java source line #34	-> byte code offset #258
    //   Java source line #35	-> byte code offset #263
    //   Java source line #36	-> byte code offset #269
    //   Java source line #37	-> byte code offset #303
    //   Java source line #38	-> byte code offset #307
    //   Java source line #39	-> byte code offset #333
    //   Java source line #40	-> byte code offset #345
    //   Java source line #42	-> byte code offset #387
    //   Java source line #43	-> byte code offset #399
    //   Java source line #45	-> byte code offset #441
    //   Java source line #46	-> byte code offset #453
    //   Java source line #48	-> byte code offset #495
    //   Java source line #49	-> byte code offset #515
    //   Java source line #52	-> byte code offset #573
    //   Java source line #53	-> byte code offset #594
    //   Java source line #55	-> byte code offset #621
    //   Java source line #56	-> byte code offset #663
    //   Java source line #58	-> byte code offset #668
    //   Java source line #59	-> byte code offset #673
    //   Java source line #60	-> byte code offset #685
    //   Java source line #62	-> byte code offset #735
    //   Java source line #63	-> byte code offset #738
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	739	0	a	DrawPlayers
    //   0	739	1	a	java.awt.Graphics
  }
}
