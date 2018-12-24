package org.powerbot.bot.rt6;

import org.powerbot.script.PaintListener;
import org.powerbot.script.rt6.ClientAccessor;
import org.powerbot.script.rt6.ClientContext;









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
    //   1: getfield 20	org/powerbot/bot/rt6/DrawGroundItems:ctx	Lorg/powerbot/script/ClientContext;
    //   4: checkcast 22	org/powerbot/script/rt6/ClientContext
    //   7: getfield 26	org/powerbot/script/rt6/ClientContext:game	Lorg/powerbot/script/rt6/Game;
    //   10: invokevirtual 32	org/powerbot/script/rt6/Game:loggedIn	()Z
    //   13: ifne +5 -> 18
    //   16: return
    //   17: athrow
    //   18: aload_0
    //   19: getfield 20	org/powerbot/bot/rt6/DrawGroundItems:ctx	Lorg/powerbot/script/ClientContext;
    //   22: checkcast 22	org/powerbot/script/rt6/ClientContext
    //   25: getfield 36	org/powerbot/script/rt6/ClientContext:players	Lorg/powerbot/script/rt6/Players;
    //   28: invokevirtual 42	org/powerbot/script/rt6/Players:local	()Lorg/powerbot/script/rt6/Player;
    //   31: dup
    //   32: astore_2
    //   33: ifnonnull +5 -> 38
    //   36: return
    //   37: athrow
    //   38: aload_2
    //   39: invokevirtual 48	org/powerbot/script/rt6/Player:tile	()Lorg/powerbot/script/Tile;
    //   42: dup
    //   43: astore_2
    //   44: ifnonnull +4 -> 48
    //   47: return
    //   48: aload_1
    //   49: invokevirtual 54	java/awt/Graphics:getFontMetrics	()Ljava/awt/FontMetrics;
    //   52: astore_3
    //   53: aload_0
    //   54: aload_3
    //   55: invokevirtual 60	java/awt/FontMetrics:getHeight	()I
    //   58: istore 4
    //   60: getfield 20	org/powerbot/bot/rt6/DrawGroundItems:ctx	Lorg/powerbot/script/ClientContext;
    //   63: checkcast 22	org/powerbot/script/rt6/ClientContext
    //   66: getfield 26	org/powerbot/script/rt6/ClientContext:game	Lorg/powerbot/script/rt6/Game;
    //   69: invokevirtual 63	org/powerbot/script/rt6/Game:floor	()I
    //   72: istore 5
    //   74: new 65	java/util/ArrayList
    //   77: dup
    //   78: invokespecial 68	java/util/ArrayList:<init>	()V
    //   81: astore 6
    //   83: aload_0
    //   84: getfield 20	org/powerbot/bot/rt6/DrawGroundItems:ctx	Lorg/powerbot/script/ClientContext;
    //   87: checkcast 22	org/powerbot/script/rt6/ClientContext
    //   90: getfield 72	org/powerbot/script/rt6/ClientContext:groundItems	Lorg/powerbot/script/rt6/GroundItems;
    //   93: bipush 10
    //   95: iconst_1
    //   96: dup
    //   97: pop2
    //   98: invokevirtual 78	org/powerbot/script/rt6/GroundItems:select	(I)Lorg/powerbot/script/rt6/GroundItemQuery;
    //   101: aload 6
    //   103: invokevirtual 84	org/powerbot/script/rt6/GroundItemQuery:addTo	(Ljava/util/Collection;)Lorg/powerbot/script/AbstractQuery;
    //   106: aload_2
    //   107: invokevirtual 89	org/powerbot/script/Tile:x	()I
    //   110: bipush 10
    //   112: iconst_1
    //   113: dup
    //   114: pop2
    //   115: isub
    //   116: istore 7
    //   118: pop
    //   119: iload 7
    //   121: aload_2
    //   122: invokevirtual 89	org/powerbot/script/Tile:x	()I
    //   125: bipush 10
    //   127: iconst_1
    //   128: dup
    //   129: pop2
    //   130: iadd
    //   131: if_icmpgt +356 -> 487
    //   134: aload_2
    //   135: invokevirtual 92	org/powerbot/script/Tile:y	()I
    //   138: bipush 10
    //   140: iconst_1
    //   141: dup
    //   142: pop2
    //   143: isub
    //   144: dup
    //   145: istore 8
    //   147: aload_2
    //   148: invokevirtual 92	org/powerbot/script/Tile:y	()I
    //   151: bipush 10
    //   153: iconst_1
    //   154: dup
    //   155: pop2
    //   156: iadd
    //   157: if_icmpgt +322 -> 479
    //   160: iconst_0
    //   161: iconst_1
    //   162: dup
    //   163: pop2
    //   164: istore 9
    //   166: new 86	org/powerbot/script/Tile
    //   169: dup
    //   170: iload 7
    //   172: iload 8
    //   174: iload 5
    //   176: invokespecial 95	org/powerbot/script/Tile:<init>	(III)V
    //   179: astore 10
    //   181: aload_0
    //   182: getfield 20	org/powerbot/bot/rt6/DrawGroundItems:ctx	Lorg/powerbot/script/ClientContext;
    //   185: checkcast 22	org/powerbot/script/rt6/ClientContext
    //   188: getfield 72	org/powerbot/script/rt6/ClientContext:groundItems	Lorg/powerbot/script/rt6/GroundItems;
    //   191: aload 6
    //   193: invokevirtual 98	org/powerbot/script/rt6/GroundItems:select	(Ljava/lang/Iterable;)Lorg/powerbot/script/AbstractQuery;
    //   196: checkcast 80	org/powerbot/script/rt6/GroundItemQuery
    //   199: aload 10
    //   201: invokevirtual 102	org/powerbot/script/rt6/GroundItemQuery:at	(Lorg/powerbot/script/Locatable;)Lorg/powerbot/script/rt6/GroundItemQuery;
    //   204: invokevirtual 106	org/powerbot/script/rt6/GroundItemQuery:iterator	()Ljava/util/Iterator;
    //   207: dup
    //   208: astore 11
    //   210: invokeinterface 111 1 0
    //   215: ifeq +256 -> 471
    //   218: aload 11
    //   220: invokeinterface 115 1 0
    //   225: checkcast 117	org/powerbot/script/rt6/GroundItem
    //   228: astore 12
    //   230: new 119	org/powerbot/script/rt6/TileMatrix
    //   233: dup
    //   234: aload_0
    //   235: getfield 20	org/powerbot/bot/rt6/DrawGroundItems:ctx	Lorg/powerbot/script/ClientContext;
    //   238: checkcast 22	org/powerbot/script/rt6/ClientContext
    //   241: aload 10
    //   243: invokespecial 122	org/powerbot/script/rt6/TileMatrix:<init>	(Lorg/powerbot/script/rt6/ClientContext;Lorg/powerbot/script/Tile;)V
    //   246: invokevirtual 126	org/powerbot/script/rt6/TileMatrix:centerPoint	()Ljava/awt/Point;
    //   249: dup
    //   250: astore 13
    //   252: getfield 131	java/awt/Point:x	I
    //   255: iconst_m1
    //   256: iconst_1
    //   257: dup
    //   258: pop2
    //   259: if_icmpeq +212 -> 471
    //   262: aload 13
    //   264: getfield 133	java/awt/Point:y	I
    //   267: iconst_m1
    //   268: iconst_1
    //   269: dup
    //   270: pop2
    //   271: if_icmpne +6 -> 277
    //   274: goto +197 -> 471
    //   277: aload 12
    //   279: invokevirtual 137	org/powerbot/script/rt6/GroundItem:name	()Ljava/lang/String;
    //   282: astore 14
    //   284: ldc -117
    //   286: astore 15
    //   288: new 141	java/lang/StringBuilder
    //   291: dup
    //   292: invokespecial 142	java/lang/StringBuilder:<init>	()V
    //   295: iconst_0
    //   296: aload 15
    //   298: invokevirtual 146	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   301: aload 12
    //   303: invokevirtual 149	org/powerbot/script/rt6/GroundItem:id	()I
    //   306: invokevirtual 153	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   309: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   312: astore 15
    //   314: aload 14
    //   316: invokevirtual 161	java/lang/String:isEmpty	()Z
    //   319: ifne +34 -> 353
    //   322: new 141	java/lang/StringBuilder
    //   325: dup
    //   326: invokespecial 142	java/lang/StringBuilder:<init>	()V
    //   329: iconst_0
    //   330: aload 15
    //   332: invokevirtual 146	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   335: ldc -93
    //   337: invokestatic 169	org/powerbot/script/Vector3:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   340: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   343: aload 14
    //   345: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   348: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   351: astore 15
    //   353: aload 12
    //   355: invokevirtual 175	org/powerbot/script/rt6/GroundItem:stackSize	()I
    //   358: iconst_1
    //   359: dup
    //   360: dup
    //   361: pop2
    //   362: if_icmple +45 -> 407
    //   365: new 141	java/lang/StringBuilder
    //   368: dup
    //   369: invokespecial 142	java/lang/StringBuilder:<init>	()V
    //   372: iconst_0
    //   373: aload 15
    //   375: invokevirtual 146	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   378: ldc -79
    //   380: invokestatic 180	org/powerbot/script/rt6/CacheVarbitConfig:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   383: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   386: aload 12
    //   388: invokevirtual 175	org/powerbot/script/rt6/GroundItem:stackSize	()I
    //   391: invokevirtual 153	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   394: ldc -74
    //   396: invokestatic 169	org/powerbot/script/Vector3:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   399: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   402: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   405: astore 15
    //   407: aload 13
    //   409: iinc 9 1
    //   412: dup
    //   413: getfield 133	java/awt/Point:y	I
    //   416: iload 4
    //   418: iload 9
    //   420: imul
    //   421: isub
    //   422: iload 4
    //   424: iconst_2
    //   425: iconst_1
    //   426: dup
    //   427: pop2
    //   428: idiv
    //   429: iadd
    //   430: istore 12
    //   432: getfield 131	java/awt/Point:x	I
    //   435: aload_3
    //   436: aload 15
    //   438: invokevirtual 186	java/awt/FontMetrics:stringWidth	(Ljava/lang/String;)I
    //   441: iconst_2
    //   442: iconst_1
    //   443: dup
    //   444: pop2
    //   445: idiv
    //   446: isub
    //   447: istore 13
    //   449: aload 11
    //   451: aload 15
    //   453: iload 13
    //   455: aload_1
    //   456: dup_x2
    //   457: getstatic 192	java/awt/Color:green	Ljava/awt/Color;
    //   460: invokevirtual 196	java/awt/Graphics:setColor	(Ljava/awt/Color;)V
    //   463: iload 12
    //   465: invokevirtual 200	java/awt/Graphics:drawString	(Ljava/lang/String;II)V
    //   468: goto -258 -> 210
    //   471: iinc 8 1
    //   474: iload 8
    //   476: goto -329 -> 147
    //   479: iinc 7 1
    //   482: iload 7
    //   484: goto -363 -> 121
    //   487: return
    // Line number table:
    //   Java source line #25	-> byte code offset #0
    //   Java source line #26	-> byte code offset #16
    //   Java source line #29	-> byte code offset #18
    //   Java source line #30	-> byte code offset #33
    //   Java source line #31	-> byte code offset #36
    //   Java source line #33	-> byte code offset #38
    //   Java source line #34	-> byte code offset #44
    //   Java source line #35	-> byte code offset #47
    //   Java source line #38	-> byte code offset #48
    //   Java source line #39	-> byte code offset #54
    //   Java source line #40	-> byte code offset #60
    //   Java source line #41	-> byte code offset #74
    //   Java source line #42	-> byte code offset #83
    //   Java source line #43	-> byte code offset #106
    //   Java source line #45	-> byte code offset #134
    //   Java source line #46	-> byte code offset #160
    //   Java source line #47	-> byte code offset #166
    //   Java source line #48	-> byte code offset #181
    //   Java source line #49	-> byte code offset #230
    //   Java source line #50	-> byte code offset #252
    //   Java source line #51	-> byte code offset #274
    //   Java source line #53	-> byte code offset #277
    //   Java source line #54	-> byte code offset #284
    //   Java source line #55	-> byte code offset #288
    //   Java source line #56	-> byte code offset #314
    //   Java source line #57	-> byte code offset #322
    //   Java source line #59	-> byte code offset #353
    //   Java source line #60	-> byte code offset #358
    //   Java source line #61	-> byte code offset #365
    //   Java source line #63	-> byte code offset #407
    //   Java source line #64	-> byte code offset #432
    //   Java source line #65	-> byte code offset #451
    //   Java source line #66	-> byte code offset #463
    //   Java source line #67	-> byte code offset #468
    //   Java source line #45	-> byte code offset #471
    //   Java source line #43	-> byte code offset #479
    //   Java source line #70	-> byte code offset #487
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	488	0	a	DrawGroundItems
    //   0	488	1	a	java.awt.Graphics
  }
}
