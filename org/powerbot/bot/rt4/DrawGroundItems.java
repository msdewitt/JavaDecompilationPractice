package org.powerbot.bot.rt4;

import org.powerbot.script.PaintListener;
import org.powerbot.script.rt4.ClientAccessor;
import org.powerbot.script.rt4.ClientContext;










public class DrawGroundItems
  extends ClientAccessor
  implements PaintListener
{
  public DrawGroundItems(ClientContext a)
  {
    a.<init>(a);
  }
  
  /* Error */
  public void repaint(java.awt.Graphics a)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 20	org/powerbot/bot/rt4/DrawGroundItems:ctx	Lorg/powerbot/script/ClientContext;
    //   4: checkcast 22	org/powerbot/script/rt4/ClientContext
    //   7: getfield 26	org/powerbot/script/rt4/ClientContext:game	Lorg/powerbot/script/rt4/Game;
    //   10: invokevirtual 32	org/powerbot/script/rt4/Game:clientState	()I
    //   13: bipush 30
    //   15: iconst_1
    //   16: dup
    //   17: pop2
    //   18: if_icmpeq +5 -> 23
    //   21: return
    //   22: athrow
    //   23: aload_0
    //   24: getfield 20	org/powerbot/bot/rt4/DrawGroundItems:ctx	Lorg/powerbot/script/ClientContext;
    //   27: checkcast 22	org/powerbot/script/rt4/ClientContext
    //   30: getfield 36	org/powerbot/script/rt4/ClientContext:players	Lorg/powerbot/script/rt4/Players;
    //   33: invokevirtual 42	org/powerbot/script/rt4/Players:local	()Lorg/powerbot/script/rt4/Player;
    //   36: dup
    //   37: astore_2
    //   38: ifnonnull +5 -> 43
    //   41: return
    //   42: athrow
    //   43: aload_2
    //   44: invokevirtual 48	org/powerbot/script/rt4/Player:tile	()Lorg/powerbot/script/Tile;
    //   47: dup
    //   48: astore_2
    //   49: ifnonnull +4 -> 53
    //   52: return
    //   53: aload_1
    //   54: invokevirtual 54	java/awt/Graphics:getFontMetrics	()Ljava/awt/FontMetrics;
    //   57: dup
    //   58: astore_3
    //   59: invokevirtual 59	java/awt/FontMetrics:getHeight	()I
    //   62: istore 4
    //   64: new 61	java/util/ArrayList
    //   67: dup
    //   68: invokespecial 64	java/util/ArrayList:<init>	()V
    //   71: astore 5
    //   73: aload_0
    //   74: getfield 20	org/powerbot/bot/rt4/DrawGroundItems:ctx	Lorg/powerbot/script/ClientContext;
    //   77: checkcast 22	org/powerbot/script/rt4/ClientContext
    //   80: getfield 68	org/powerbot/script/rt4/ClientContext:groundItems	Lorg/powerbot/script/rt4/GroundItems;
    //   83: bipush 10
    //   85: iconst_1
    //   86: dup
    //   87: pop2
    //   88: invokevirtual 74	org/powerbot/script/rt4/GroundItems:select	(I)Lorg/powerbot/script/rt4/BasicQuery;
    //   91: aload 5
    //   93: invokevirtual 80	org/powerbot/script/rt4/BasicQuery:addTo	(Ljava/util/Collection;)Lorg/powerbot/script/AbstractQuery;
    //   96: bipush -10
    //   98: iconst_1
    //   99: dup
    //   100: pop2
    //   101: istore 6
    //   103: pop
    //   104: iload 6
    //   106: bipush 10
    //   108: iconst_1
    //   109: dup
    //   110: pop2
    //   111: if_icmpgt +328 -> 439
    //   114: bipush -10
    //   116: iconst_1
    //   117: dup
    //   118: pop2
    //   119: dup
    //   120: istore 7
    //   122: bipush 10
    //   124: iconst_1
    //   125: dup
    //   126: pop2
    //   127: if_icmpgt +304 -> 431
    //   130: iconst_0
    //   131: iconst_1
    //   132: dup
    //   133: pop2
    //   134: istore 8
    //   136: aload_2
    //   137: iload 6
    //   139: iload 7
    //   141: invokevirtual 86	org/powerbot/script/Tile:derive	(II)Lorg/powerbot/script/Tile;
    //   144: astore 9
    //   146: new 88	org/powerbot/script/rt4/TileMatrix
    //   149: dup
    //   150: aload_0
    //   151: getfield 20	org/powerbot/bot/rt4/DrawGroundItems:ctx	Lorg/powerbot/script/ClientContext;
    //   154: checkcast 22	org/powerbot/script/rt4/ClientContext
    //   157: aload 9
    //   159: invokespecial 91	org/powerbot/script/rt4/TileMatrix:<init>	(Lorg/powerbot/script/rt4/ClientContext;Lorg/powerbot/script/Tile;)V
    //   162: invokevirtual 95	org/powerbot/script/rt4/TileMatrix:centerPoint	()Ljava/awt/Point;
    //   165: dup
    //   166: astore 10
    //   168: getfield 101	java/awt/Point:x	I
    //   171: iconst_m1
    //   172: iconst_1
    //   173: dup
    //   174: pop2
    //   175: if_icmpne +6 -> 181
    //   178: goto +245 -> 423
    //   181: aload_0
    //   182: getfield 20	org/powerbot/bot/rt4/DrawGroundItems:ctx	Lorg/powerbot/script/ClientContext;
    //   185: checkcast 22	org/powerbot/script/rt4/ClientContext
    //   188: getfield 68	org/powerbot/script/rt4/ClientContext:groundItems	Lorg/powerbot/script/rt4/GroundItems;
    //   191: aload 5
    //   193: invokevirtual 104	org/powerbot/script/rt4/GroundItems:select	(Ljava/lang/Iterable;)Lorg/powerbot/script/AbstractQuery;
    //   196: checkcast 76	org/powerbot/script/rt4/BasicQuery
    //   199: aload 9
    //   201: invokevirtual 108	org/powerbot/script/rt4/BasicQuery:at	(Lorg/powerbot/script/Locatable;)Lorg/powerbot/script/rt4/BasicQuery;
    //   204: invokevirtual 112	org/powerbot/script/rt4/BasicQuery:iterator	()Ljava/util/Iterator;
    //   207: dup
    //   208: astore 9
    //   210: invokeinterface 118 1 0
    //   215: ifeq +208 -> 423
    //   218: aload 9
    //   220: invokeinterface 122 1 0
    //   225: checkcast 124	org/powerbot/script/rt4/GroundItem
    //   228: dup
    //   229: astore 11
    //   231: invokevirtual 128	org/powerbot/script/rt4/GroundItem:name	()Ljava/lang/String;
    //   234: astore 12
    //   236: ldc -126
    //   238: astore 13
    //   240: new 132	java/lang/StringBuilder
    //   243: dup
    //   244: invokespecial 133	java/lang/StringBuilder:<init>	()V
    //   247: iconst_0
    //   248: aload 13
    //   250: invokevirtual 137	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   253: aload 11
    //   255: invokevirtual 140	org/powerbot/script/rt4/GroundItem:id	()I
    //   258: invokevirtual 144	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   261: invokevirtual 147	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   264: astore 13
    //   266: aload 12
    //   268: invokevirtual 152	java/lang/String:isEmpty	()Z
    //   271: ifne +34 -> 305
    //   274: new 132	java/lang/StringBuilder
    //   277: dup
    //   278: invokespecial 133	java/lang/StringBuilder:<init>	()V
    //   281: iconst_0
    //   282: aload 13
    //   284: invokevirtual 137	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   287: ldc -102
    //   289: invokestatic 160	org/powerbot/script/rt4/HintArrow:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   292: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   295: aload 12
    //   297: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   300: invokevirtual 147	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   303: astore 13
    //   305: aload 11
    //   307: invokevirtual 166	org/powerbot/script/rt4/GroundItem:stackSize	()I
    //   310: dup
    //   311: istore 11
    //   313: iconst_1
    //   314: dup
    //   315: dup
    //   316: pop2
    //   317: if_icmple +42 -> 359
    //   320: new 132	java/lang/StringBuilder
    //   323: dup
    //   324: invokespecial 133	java/lang/StringBuilder:<init>	()V
    //   327: iconst_0
    //   328: aload 13
    //   330: invokevirtual 137	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   333: ldc -88
    //   335: invokestatic 171	org/powerbot/util/prn:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   338: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   341: iload 11
    //   343: invokevirtual 144	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   346: ldc -83
    //   348: invokestatic 160	org/powerbot/script/rt4/HintArrow:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   351: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   354: invokevirtual 147	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   357: astore 13
    //   359: aload 10
    //   361: iinc 8 1
    //   364: dup
    //   365: getfield 176	java/awt/Point:y	I
    //   368: iload 4
    //   370: iload 8
    //   372: imul
    //   373: isub
    //   374: iload 4
    //   376: iconst_2
    //   377: iconst_1
    //   378: dup
    //   379: pop2
    //   380: idiv
    //   381: iadd
    //   382: istore 11
    //   384: getfield 101	java/awt/Point:x	I
    //   387: aload_3
    //   388: aload 13
    //   390: invokevirtual 180	java/awt/FontMetrics:stringWidth	(Ljava/lang/String;)I
    //   393: iconst_2
    //   394: iconst_1
    //   395: dup
    //   396: pop2
    //   397: idiv
    //   398: isub
    //   399: istore 12
    //   401: aload 9
    //   403: aload 13
    //   405: iload 12
    //   407: aload_1
    //   408: dup_x2
    //   409: getstatic 186	java/awt/Color:green	Ljava/awt/Color;
    //   412: invokevirtual 190	java/awt/Graphics:setColor	(Ljava/awt/Color;)V
    //   415: iload 11
    //   417: invokevirtual 194	java/awt/Graphics:drawString	(Ljava/lang/String;II)V
    //   420: goto -210 -> 210
    //   423: iinc 7 1
    //   426: iload 7
    //   428: goto -306 -> 122
    //   431: iinc 6 1
    //   434: iload 6
    //   436: goto -330 -> 106
    //   439: return
    // Line number table:
    //   Java source line #26	-> byte code offset #0
    //   Java source line #27	-> byte code offset #21
    //   Java source line #30	-> byte code offset #23
    //   Java source line #31	-> byte code offset #38
    //   Java source line #32	-> byte code offset #41
    //   Java source line #34	-> byte code offset #43
    //   Java source line #35	-> byte code offset #49
    //   Java source line #36	-> byte code offset #52
    //   Java source line #39	-> byte code offset #53
    //   Java source line #40	-> byte code offset #59
    //   Java source line #41	-> byte code offset #64
    //   Java source line #42	-> byte code offset #73
    //   Java source line #43	-> byte code offset #96
    //   Java source line #44	-> byte code offset #114
    //   Java source line #45	-> byte code offset #130
    //   Java source line #46	-> byte code offset #136
    //   Java source line #47	-> byte code offset #146
    //   Java source line #48	-> byte code offset #168
    //   Java source line #49	-> byte code offset #178
    //   Java source line #51	-> byte code offset #181
    //   Java source line #52	-> byte code offset #231
    //   Java source line #53	-> byte code offset #236
    //   Java source line #54	-> byte code offset #240
    //   Java source line #55	-> byte code offset #266
    //   Java source line #56	-> byte code offset #274
    //   Java source line #58	-> byte code offset #305
    //   Java source line #59	-> byte code offset #313
    //   Java source line #60	-> byte code offset #320
    //   Java source line #62	-> byte code offset #359
    //   Java source line #63	-> byte code offset #384
    //   Java source line #64	-> byte code offset #403
    //   Java source line #65	-> byte code offset #415
    //   Java source line #66	-> byte code offset #420
    //   Java source line #44	-> byte code offset #423
    //   Java source line #43	-> byte code offset #431
    //   Java source line #69	-> byte code offset #439
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	440	0	a	DrawGroundItems
    //   0	440	1	a	java.awt.Graphics
  }
}
