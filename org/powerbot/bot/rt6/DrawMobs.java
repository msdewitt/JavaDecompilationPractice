package org.powerbot.bot.rt6;

import org.powerbot.script.PaintListener;
import org.powerbot.script.rt6.ClientAccessor;
import org.powerbot.script.rt6.ClientContext;




public class DrawMobs
  extends ClientAccessor
  implements PaintListener
{
  public DrawMobs(ClientContext a)
  {
    a.<init>(a);
  }
  
  /* Error */
  public void repaint(java.awt.Graphics a)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 20	org/powerbot/bot/rt6/DrawMobs:ctx	Lorg/powerbot/script/ClientContext;
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
    //   24: getfield 20	org/powerbot/bot/rt6/DrawMobs:ctx	Lorg/powerbot/script/ClientContext;
    //   27: checkcast 22	org/powerbot/script/rt6/ClientContext
    //   30: getfield 42	org/powerbot/script/rt6/ClientContext:npcs	Lorg/powerbot/script/rt6/Npcs;
    //   33: invokevirtual 48	org/powerbot/script/rt6/Npcs:select	()Lorg/powerbot/script/AbstractQuery;
    //   36: checkcast 50	org/powerbot/script/rt6/MobileIdNameQuery
    //   39: invokevirtual 54	org/powerbot/script/rt6/MobileIdNameQuery:iterator	()Ljava/util/Iterator;
    //   42: astore_3
    //   43: aload_3
    //   44: invokeinterface 59 1 0
    //   49: ifeq +605 -> 654
    //   52: aload_3
    //   53: invokeinterface 63 1 0
    //   58: checkcast 65	org/powerbot/script/rt6/Npc
    //   61: dup
    //   62: astore 4
    //   64: invokevirtual 69	org/powerbot/script/rt6/Npc:centerPoint	()Ljava/awt/Point;
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
    //   102: getstatic 84	java/awt/Color:red	Ljava/awt/Color;
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
    //   149: invokevirtual 108	org/powerbot/script/rt6/Npc:name	()Ljava/lang/String;
    //   152: invokevirtual 112	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   155: ldc 114
    //   157: invokestatic 120	org/powerbot/bot/EventDispatcher:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   160: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: aload 4
    //   165: invokevirtual 128	org/powerbot/script/rt6/Npc:combatLevel	()I
    //   168: invokevirtual 131	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   171: ldc -123
    //   173: invokestatic 136	org/powerbot/script/rt6/BasicObject:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   176: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   179: aload 4
    //   181: invokevirtual 139	org/powerbot/script/rt6/Npc:healthPercent	()I
    //   184: invokevirtual 131	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   187: ldc -115
    //   189: invokestatic 120	org/powerbot/bot/EventDispatcher:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   192: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   195: aload 4
    //   197: invokevirtual 144	org/powerbot/script/rt6/Npc:id	()I
    //   200: invokevirtual 131	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   203: invokevirtual 147	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   206: astore 6
    //   208: aload 4
    //   210: invokevirtual 150	org/powerbot/script/rt6/Npc:inCombat	()Z
    //   213: ifeq +9 -> 222
    //   216: getstatic 153	java/awt/Color:RED	Ljava/awt/Color;
    //   219: goto +20 -> 239
    //   222: aload 4
    //   224: invokevirtual 156	org/powerbot/script/rt6/Npc:inMotion	()Z
    //   227: ifeq +9 -> 236
    //   230: getstatic 159	java/awt/Color:GREEN	Ljava/awt/Color;
    //   233: goto +6 -> 239
    //   236: getstatic 162	java/awt/Color:WHITE	Ljava/awt/Color;
    //   239: invokevirtual 88	java/awt/Graphics:setColor	(Ljava/awt/Color;)V
    //   242: aload 4
    //   244: dup
    //   245: aload_1
    //   246: aload 5
    //   248: getfield 75	java/awt/Point:x	I
    //   251: aload_2
    //   252: aload 6
    //   254: dup_x2
    //   255: invokevirtual 168	java/awt/FontMetrics:stringWidth	(Ljava/lang/String;)I
    //   258: iconst_2
    //   259: iconst_1
    //   260: dup
    //   261: pop2
    //   262: idiv
    //   263: isub
    //   264: aload 5
    //   266: getfield 78	java/awt/Point:y	I
    //   269: aload_2
    //   270: invokevirtual 171	java/awt/FontMetrics:getHeight	()I
    //   273: iconst_2
    //   274: iconst_1
    //   275: dup
    //   276: pop2
    //   277: idiv
    //   278: isub
    //   279: invokevirtual 175	java/awt/Graphics:drawString	(Ljava/lang/String;II)V
    //   282: invokevirtual 178	org/powerbot/script/rt6/Npc:overheadMessage	()Ljava/lang/String;
    //   285: astore 7
    //   287: iconst_0
    //   288: iconst_1
    //   289: dup
    //   290: pop2
    //   291: istore 8
    //   293: invokevirtual 181	org/powerbot/script/rt6/Npc:animation	()I
    //   296: iconst_m1
    //   297: iconst_1
    //   298: dup
    //   299: pop2
    //   300: if_icmpne +15 -> 315
    //   303: aload 4
    //   305: invokevirtual 184	org/powerbot/script/rt6/Npc:stance	()I
    //   308: iconst_m1
    //   309: iconst_1
    //   310: dup
    //   311: pop2
    //   312: if_icmpeq +272 -> 584
    //   315: ldc -70
    //   317: astore 6
    //   319: new 101	java/lang/StringBuilder
    //   322: dup
    //   323: invokespecial 104	java/lang/StringBuilder:<init>	()V
    //   326: iconst_0
    //   327: aload 6
    //   329: invokevirtual 112	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   332: ldc -68
    //   334: invokestatic 136	org/powerbot/script/rt6/BasicObject:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   337: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   340: invokevirtual 147	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   343: astore 6
    //   345: aload 4
    //   347: invokevirtual 191	org/powerbot/script/rt6/Npc:prayerIcon	()I
    //   350: iconst_m1
    //   351: iconst_1
    //   352: dup
    //   353: pop2
    //   354: if_icmpeq +45 -> 399
    //   357: new 101	java/lang/StringBuilder
    //   360: dup
    //   361: invokespecial 104	java/lang/StringBuilder:<init>	()V
    //   364: iconst_0
    //   365: aload 6
    //   367: invokevirtual 112	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   370: ldc -63
    //   372: invokestatic 120	org/powerbot/bot/EventDispatcher:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   375: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   378: aload 4
    //   380: invokevirtual 191	org/powerbot/script/rt6/Npc:prayerIcon	()I
    //   383: invokevirtual 131	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   386: ldc -61
    //   388: invokestatic 136	org/powerbot/script/rt6/BasicObject:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   391: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   394: invokevirtual 147	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   397: astore 6
    //   399: aload 4
    //   401: invokevirtual 181	org/powerbot/script/rt6/Npc:animation	()I
    //   404: iconst_m1
    //   405: iconst_1
    //   406: dup
    //   407: pop2
    //   408: if_icmpne +11 -> 419
    //   411: aload 4
    //   413: invokevirtual 184	org/powerbot/script/rt6/Npc:stance	()I
    //   416: ifle +61 -> 477
    //   419: new 101	java/lang/StringBuilder
    //   422: dup
    //   423: invokespecial 104	java/lang/StringBuilder:<init>	()V
    //   426: iconst_0
    //   427: aload 6
    //   429: invokevirtual 112	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   432: ldc -59
    //   434: invokestatic 120	org/powerbot/bot/EventDispatcher:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   437: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   440: aload 4
    //   442: invokevirtual 181	org/powerbot/script/rt6/Npc:animation	()I
    //   445: invokevirtual 131	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   448: ldc -57
    //   450: invokestatic 136	org/powerbot/script/rt6/BasicObject:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   453: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   456: aload 4
    //   458: invokevirtual 184	org/powerbot/script/rt6/Npc:stance	()I
    //   461: invokevirtual 131	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   464: ldc -55
    //   466: invokestatic 120	org/powerbot/bot/EventDispatcher:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   469: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   472: invokevirtual 147	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   475: astore 6
    //   477: aload 6
    //   479: ldc -61
    //   481: invokestatic 136	org/powerbot/script/rt6/BasicObject:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   484: invokevirtual 207	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   487: ifeq +23 -> 510
    //   490: iconst_0
    //   491: iconst_1
    //   492: dup
    //   493: pop2
    //   494: aload 6
    //   496: dup_x1
    //   497: ldc -55
    //   499: invokestatic 120	org/powerbot/bot/EventDispatcher:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   502: invokevirtual 210	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   505: invokevirtual 214	java/lang/String:substring	(II)Ljava/lang/String;
    //   508: astore 6
    //   510: new 101	java/lang/StringBuilder
    //   513: dup
    //   514: invokespecial 104	java/lang/StringBuilder:<init>	()V
    //   517: iconst_0
    //   518: aload 6
    //   520: invokevirtual 112	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   523: ldc -40
    //   525: invokestatic 136	org/powerbot/script/rt6/BasicObject:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   528: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   531: invokevirtual 147	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   534: astore 6
    //   536: iconst_1
    //   537: aload_1
    //   538: aload 5
    //   540: getfield 75	java/awt/Point:x	I
    //   543: aload_2
    //   544: aload 6
    //   546: dup_x2
    //   547: invokevirtual 168	java/awt/FontMetrics:stringWidth	(Ljava/lang/String;)I
    //   550: iconst_2
    //   551: iconst_1
    //   552: dup
    //   553: pop2
    //   554: idiv
    //   555: isub
    //   556: aload 5
    //   558: getfield 78	java/awt/Point:y	I
    //   561: aload_2
    //   562: invokevirtual 171	java/awt/FontMetrics:getHeight	()I
    //   565: iconst_3
    //   566: iconst_1
    //   567: dup
    //   568: pop2
    //   569: imul
    //   570: iconst_2
    //   571: iconst_1
    //   572: dup
    //   573: pop2
    //   574: idiv
    //   575: isub
    //   576: invokevirtual 175	java/awt/Graphics:drawString	(Ljava/lang/String;II)V
    //   579: iconst_1
    //   580: dup
    //   581: pop2
    //   582: istore 8
    //   584: aload 7
    //   586: ifnull -543 -> 43
    //   589: aload 7
    //   591: aload 5
    //   593: aload_1
    //   594: dup_x2
    //   595: getstatic 219	java/awt/Color:ORANGE	Ljava/awt/Color;
    //   598: invokevirtual 88	java/awt/Graphics:setColor	(Ljava/awt/Color;)V
    //   601: getfield 75	java/awt/Point:x	I
    //   604: aload_2
    //   605: aload 7
    //   607: invokevirtual 168	java/awt/FontMetrics:stringWidth	(Ljava/lang/String;)I
    //   610: iconst_2
    //   611: iconst_1
    //   612: dup
    //   613: pop2
    //   614: idiv
    //   615: isub
    //   616: aload 5
    //   618: getfield 78	java/awt/Point:y	I
    //   621: aload_2
    //   622: invokevirtual 171	java/awt/FontMetrics:getHeight	()I
    //   625: iload 8
    //   627: ifeq +10 -> 637
    //   630: iconst_5
    //   631: iconst_1
    //   632: dup
    //   633: pop2
    //   634: goto +7 -> 641
    //   637: iconst_3
    //   638: iconst_1
    //   639: dup
    //   640: pop2
    //   641: imul
    //   642: iconst_2
    //   643: iconst_1
    //   644: dup
    //   645: pop2
    //   646: idiv
    //   647: isub
    //   648: invokevirtual 175	java/awt/Graphics:drawString	(Ljava/lang/String;II)V
    //   651: goto -608 -> 43
    //   654: return
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
    //   Java source line #32	-> byte code offset #208
    //   Java source line #33	-> byte code offset #245
    //   Java source line #34	-> byte code offset #282
    //   Java source line #35	-> byte code offset #287
    //   Java source line #36	-> byte code offset #293
    //   Java source line #37	-> byte code offset #315
    //   Java source line #38	-> byte code offset #319
    //   Java source line #39	-> byte code offset #345
    //   Java source line #40	-> byte code offset #357
    //   Java source line #42	-> byte code offset #399
    //   Java source line #43	-> byte code offset #419
    //   Java source line #45	-> byte code offset #477
    //   Java source line #46	-> byte code offset #490
    //   Java source line #48	-> byte code offset #510
    //   Java source line #50	-> byte code offset #537
    //   Java source line #51	-> byte code offset #579
    //   Java source line #53	-> byte code offset #584
    //   Java source line #54	-> byte code offset #589
    //   Java source line #55	-> byte code offset #601
    //   Java source line #57	-> byte code offset #651
    //   Java source line #58	-> byte code offset #654
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	655	0	a	DrawMobs
    //   0	655	1	a	java.awt.Graphics
  }
}
