package org.powerbot.bot.rt6;

import java.awt.Color;
import org.powerbot.script.PaintListener;
import org.powerbot.script.rt6.ClientAccessor;
import org.powerbot.script.rt6.ClientContext;






public class DrawObjects
  extends ClientAccessor
  implements PaintListener
{
  static
  {
    1; int tmp8_7 = 1;tmp8_7; int tmp13_12 = 1;tmp13_12;0[tmp13_12] = Color.GREEN; int tmp21_20 = 1; int tmp22_21 = tmp21_20;tmp22_21;tmp21_20[tmp22_21] = Color.WHITE; int tmp31_30 = 1;tmp31_30;2[tmp31_30] = Color.BLACK; int tmp40_39 = 1;tmp40_39;3[tmp40_39] = Color.BLUE; int tmp49_48 = 1;tmp49_48;4[tmp49_48] = Color.PINK; } private static final Color[] jdField_void = tmp8_7;
  
  /* Error */
  public void repaint(java.awt.Graphics a)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 27	org/powerbot/bot/rt6/DrawObjects:ctx	Lorg/powerbot/script/ClientContext;
    //   4: checkcast 29	org/powerbot/script/rt6/ClientContext
    //   7: getfield 33	org/powerbot/script/rt6/ClientContext:game	Lorg/powerbot/script/rt6/Game;
    //   10: invokevirtual 39	org/powerbot/script/rt6/Game:loggedIn	()Z
    //   13: ifne +5 -> 18
    //   16: return
    //   17: athrow
    //   18: aload_0
    //   19: getfield 27	org/powerbot/bot/rt6/DrawObjects:ctx	Lorg/powerbot/script/ClientContext;
    //   22: checkcast 29	org/powerbot/script/rt6/ClientContext
    //   25: getfield 43	org/powerbot/script/rt6/ClientContext:players	Lorg/powerbot/script/rt6/Players;
    //   28: invokevirtual 49	org/powerbot/script/rt6/Players:local	()Lorg/powerbot/script/rt6/Player;
    //   31: ifnonnull +5 -> 36
    //   34: return
    //   35: athrow
    //   36: aload_1
    //   37: invokevirtual 55	java/awt/Graphics:getFontMetrics	()Ljava/awt/FontMetrics;
    //   40: dup
    //   41: astore_2
    //   42: invokevirtual 61	java/awt/FontMetrics:getHeight	()I
    //   45: istore_3
    //   46: new 63	java/util/HashMap
    //   49: dup
    //   50: invokespecial 66	java/util/HashMap:<init>	()V
    //   53: astore 4
    //   55: aload_0
    //   56: getfield 27	org/powerbot/bot/rt6/DrawObjects:ctx	Lorg/powerbot/script/ClientContext;
    //   59: checkcast 29	org/powerbot/script/rt6/ClientContext
    //   62: getfield 70	org/powerbot/script/rt6/ClientContext:objects	Lorg/powerbot/script/rt6/Objects;
    //   65: bipush 15
    //   67: iconst_1
    //   68: dup
    //   69: pop2
    //   70: invokevirtual 76	org/powerbot/script/rt6/Objects:select	(I)Lorg/powerbot/script/rt6/MobileIdNameQuery;
    //   73: invokevirtual 82	org/powerbot/script/rt6/MobileIdNameQuery:iterator	()Ljava/util/Iterator;
    //   76: dup
    //   77: astore 5
    //   79: invokeinterface 87 1 0
    //   84: ifeq +442 -> 526
    //   87: aload 5
    //   89: invokeinterface 91 1 0
    //   94: checkcast 11	org/powerbot/script/rt6/GameObject
    //   97: dup
    //   98: astore 6
    //   100: invokevirtual 95	org/powerbot/script/rt6/GameObject:tile	()Lorg/powerbot/script/Tile;
    //   103: astore 7
    //   105: aload 4
    //   107: aload 7
    //   109: invokeinterface 101 2 0
    //   114: ifne +27 -> 141
    //   117: aload 4
    //   119: new 103	java/util/concurrent/atomic/AtomicInteger
    //   122: aload 7
    //   124: dup_x1
    //   125: dup
    //   126: pop2
    //   127: dup
    //   128: iconst_0
    //   129: iconst_1
    //   130: dup
    //   131: pop2
    //   132: invokespecial 106	java/util/concurrent/atomic/AtomicInteger:<init>	(I)V
    //   135: invokeinterface 110 3 0
    //   140: pop
    //   141: aload 6
    //   143: invokevirtual 114	org/powerbot/script/rt6/GameObject:centerPoint	()Ljava/awt/Point;
    //   146: dup
    //   147: astore 8
    //   149: getfield 120	java/awt/Point:x	I
    //   152: iconst_m1
    //   153: iconst_1
    //   154: dup
    //   155: pop2
    //   156: if_icmpne +8 -> 164
    //   159: aload 5
    //   161: goto -82 -> 79
    //   164: aload_1
    //   165: aload 8
    //   167: aload_1
    //   168: getstatic 126	java/awt/Color:black	Ljava/awt/Color;
    //   171: invokevirtual 130	java/awt/Graphics:setColor	(Ljava/awt/Color;)V
    //   174: getfield 120	java/awt/Point:x	I
    //   177: iconst_1
    //   178: dup
    //   179: dup
    //   180: pop2
    //   181: isub
    //   182: aload 8
    //   184: getfield 133	java/awt/Point:y	I
    //   187: iconst_1
    //   188: dup
    //   189: dup
    //   190: pop2
    //   191: isub
    //   192: iconst_2
    //   193: iconst_1
    //   194: dup
    //   195: pop2
    //   196: iconst_2
    //   197: iconst_1
    //   198: dup
    //   199: pop2
    //   200: invokevirtual 137	java/awt/Graphics:fillRect	(IIII)V
    //   203: aload 6
    //   205: dup
    //   206: dup_x1
    //   207: invokevirtual 140	org/powerbot/script/rt6/GameObject:mainId	()I
    //   210: istore 9
    //   212: invokevirtual 143	org/powerbot/script/rt6/GameObject:animation	()I
    //   215: istore 10
    //   217: invokevirtual 147	org/powerbot/script/rt6/GameObject:name	()Ljava/lang/String;
    //   220: astore 11
    //   222: new 149	java/lang/StringBuilder
    //   225: dup
    //   226: invokespecial 150	java/lang/StringBuilder:<init>	()V
    //   229: aload 11
    //   231: invokevirtual 155	java/lang/String:isEmpty	()Z
    //   234: ifeq +8 -> 242
    //   237: ldc -99
    //   239: goto +27 -> 266
    //   242: new 149	java/lang/StringBuilder
    //   245: dup
    //   246: invokespecial 150	java/lang/StringBuilder:<init>	()V
    //   249: iconst_0
    //   250: aload 11
    //   252: invokevirtual 161	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   255: ldc -93
    //   257: invokestatic 169	org/powerbot/util/IOUtils:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   260: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   263: invokevirtual 176	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   266: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   269: aload 6
    //   271: invokevirtual 179	org/powerbot/script/rt6/GameObject:id	()I
    //   274: invokevirtual 182	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   277: invokevirtual 176	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   280: astore 11
    //   282: iload 10
    //   284: iconst_m1
    //   285: iconst_1
    //   286: dup
    //   287: pop2
    //   288: if_icmpeq +42 -> 330
    //   291: new 149	java/lang/StringBuilder
    //   294: dup
    //   295: invokespecial 150	java/lang/StringBuilder:<init>	()V
    //   298: iconst_0
    //   299: aload 11
    //   301: invokevirtual 161	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   304: ldc -72
    //   306: invokestatic 187	z/Gb:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   309: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   312: iload 10
    //   314: invokevirtual 182	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   317: ldc -67
    //   319: invokestatic 169	org/powerbot/util/IOUtils:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   322: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   325: invokevirtual 176	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   328: astore 11
    //   330: iload 9
    //   332: iconst_m1
    //   333: iconst_1
    //   334: dup
    //   335: pop2
    //   336: if_icmpeq +108 -> 444
    //   339: iload 10
    //   341: iconst_m1
    //   342: iconst_1
    //   343: dup
    //   344: pop2
    //   345: if_icmpeq +60 -> 405
    //   348: new 149	java/lang/StringBuilder
    //   351: dup
    //   352: invokespecial 150	java/lang/StringBuilder:<init>	()V
    //   355: iconst_0
    //   356: aload 11
    //   358: bipush 41
    //   360: iconst_1
    //   361: dup
    //   362: pop2
    //   363: bipush 44
    //   365: iconst_1
    //   366: dup
    //   367: pop2
    //   368: invokevirtual 193	java/lang/String:replace	(CC)Ljava/lang/String;
    //   371: invokevirtual 161	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   374: ldc -61
    //   376: invokestatic 187	z/Gb:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   379: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   382: iload 9
    //   384: invokevirtual 182	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   387: ldc -67
    //   389: invokestatic 169	org/powerbot/util/IOUtils:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   392: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   395: invokevirtual 176	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   398: astore 11
    //   400: aload 8
    //   402: goto +44 -> 446
    //   405: new 149	java/lang/StringBuilder
    //   408: dup
    //   409: invokespecial 150	java/lang/StringBuilder:<init>	()V
    //   412: iconst_0
    //   413: aload 11
    //   415: invokevirtual 161	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   418: ldc -59
    //   420: invokestatic 187	z/Gb:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   423: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   426: iload 9
    //   428: invokevirtual 182	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   431: ldc -67
    //   433: invokestatic 169	org/powerbot/util/IOUtils:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   436: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   439: invokevirtual 176	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   442: astore 11
    //   444: aload 8
    //   446: getfield 133	java/awt/Point:y	I
    //   449: iload_3
    //   450: iconst_2
    //   451: iconst_1
    //   452: dup
    //   453: pop2
    //   454: idiv
    //   455: isub
    //   456: istore 9
    //   458: aload 8
    //   460: getfield 120	java/awt/Point:x	I
    //   463: aload_2
    //   464: aload 11
    //   466: invokevirtual 201	java/awt/FontMetrics:stringWidth	(Ljava/lang/String;)I
    //   469: iconst_2
    //   470: iconst_1
    //   471: dup
    //   472: pop2
    //   473: idiv
    //   474: isub
    //   475: istore 8
    //   477: aload 11
    //   479: iload 8
    //   481: aload_1
    //   482: dup_x2
    //   483: getstatic 203	org/powerbot/bot/rt6/DrawObjects:void	[Ljava/awt/Color;
    //   486: aload 6
    //   488: invokevirtual 207	org/powerbot/script/rt6/GameObject:type	()Lorg/powerbot/script/rt6/GameObject$Type;
    //   491: invokevirtual 210	org/powerbot/script/rt6/GameObject$Type:ordinal	()I
    //   494: aaload
    //   495: invokevirtual 130	java/awt/Graphics:setColor	(Ljava/awt/Color;)V
    //   498: iload 9
    //   500: iload_3
    //   501: aload 4
    //   503: aload 7
    //   505: invokeinterface 214 2 0
    //   510: checkcast 103	java/util/concurrent/atomic/AtomicInteger
    //   513: invokevirtual 217	java/util/concurrent/atomic/AtomicInteger:getAndIncrement	()I
    //   516: imul
    //   517: isub
    //   518: invokevirtual 221	java/awt/Graphics:drawString	(Ljava/lang/String;II)V
    //   521: aload 5
    //   523: goto -444 -> 79
    //   526: return
    // Line number table:
    //   Java source line #27	-> byte code offset #0
    //   Java source line #28	-> byte code offset #16
    //   Java source line #30	-> byte code offset #18
    //   Java source line #31	-> byte code offset #31
    //   Java source line #32	-> byte code offset #34
    //   Java source line #34	-> byte code offset #36
    //   Java source line #35	-> byte code offset #42
    //   Java source line #37	-> byte code offset #46
    //   Java source line #38	-> byte code offset #55
    //   Java source line #39	-> byte code offset #100
    //   Java source line #40	-> byte code offset #105
    //   Java source line #41	-> byte code offset #117
    //   Java source line #44	-> byte code offset #141
    //   Java source line #45	-> byte code offset #149
    //   Java source line #46	-> byte code offset #161
    //   Java source line #49	-> byte code offset #164
    //   Java source line #50	-> byte code offset #174
    //   Java source line #52	-> byte code offset #203
    //   Java source line #53	-> byte code offset #212
    //   Java source line #54	-> byte code offset #217
    //   Java source line #55	-> byte code offset #222
    //   Java source line #56	-> byte code offset #282
    //   Java source line #57	-> byte code offset #291
    //   Java source line #59	-> byte code offset #330
    //   Java source line #60	-> byte code offset #339
    //   Java source line #61	-> byte code offset #348
    //   Java source line #63	-> byte code offset #405
    //   Java source line #66	-> byte code offset #444
    //   Java source line #67	-> byte code offset #458
    //   Java source line #68	-> byte code offset #481
    //   Java source line #69	-> byte code offset #498
    //   Java source line #70	-> byte code offset #523
    //   Java source line #71	-> byte code offset #526
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	527	0	a	DrawObjects
    //   0	527	1	a	java.awt.Graphics
  }
  
  public DrawObjects(ClientContext a)
  {
    a.<init>(a);
  }
}
