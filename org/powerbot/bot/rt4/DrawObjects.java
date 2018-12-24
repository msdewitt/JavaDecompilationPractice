package org.powerbot.bot.rt4;

import java.awt.Color;
import org.powerbot.script.PaintListener;
import org.powerbot.script.rt4.ClientAccessor;
import org.powerbot.script.rt4.ClientContext;







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
    //   1: getfield 27	org/powerbot/bot/rt4/DrawObjects:ctx	Lorg/powerbot/script/ClientContext;
    //   4: checkcast 29	org/powerbot/script/rt4/ClientContext
    //   7: getfield 33	org/powerbot/script/rt4/ClientContext:game	Lorg/powerbot/script/rt4/Game;
    //   10: invokevirtual 39	org/powerbot/script/rt4/Game:clientState	()I
    //   13: bipush 30
    //   15: iconst_1
    //   16: dup
    //   17: pop2
    //   18: if_icmpeq +5 -> 23
    //   21: return
    //   22: athrow
    //   23: aload_0
    //   24: getfield 27	org/powerbot/bot/rt4/DrawObjects:ctx	Lorg/powerbot/script/ClientContext;
    //   27: checkcast 29	org/powerbot/script/rt4/ClientContext
    //   30: getfield 43	org/powerbot/script/rt4/ClientContext:players	Lorg/powerbot/script/rt4/Players;
    //   33: invokevirtual 49	org/powerbot/script/rt4/Players:local	()Lorg/powerbot/script/rt4/Player;
    //   36: ifnonnull +5 -> 41
    //   39: return
    //   40: athrow
    //   41: aload_1
    //   42: invokevirtual 55	java/awt/Graphics:getFontMetrics	()Ljava/awt/FontMetrics;
    //   45: dup
    //   46: astore_2
    //   47: invokevirtual 60	java/awt/FontMetrics:getHeight	()I
    //   50: istore_3
    //   51: new 62	java/util/HashMap
    //   54: dup
    //   55: invokespecial 65	java/util/HashMap:<init>	()V
    //   58: astore 4
    //   60: aload_0
    //   61: getfield 27	org/powerbot/bot/rt4/DrawObjects:ctx	Lorg/powerbot/script/ClientContext;
    //   64: checkcast 29	org/powerbot/script/rt4/ClientContext
    //   67: getfield 69	org/powerbot/script/rt4/ClientContext:objects	Lorg/powerbot/script/rt4/Objects;
    //   70: bipush 8
    //   72: iconst_1
    //   73: dup
    //   74: pop2
    //   75: invokevirtual 75	org/powerbot/script/rt4/Objects:select	(I)Lorg/powerbot/script/rt4/BasicQuery;
    //   78: invokevirtual 81	org/powerbot/script/rt4/BasicQuery:iterator	()Ljava/util/Iterator;
    //   81: dup
    //   82: astore 5
    //   84: invokeinterface 87 1 0
    //   89: ifeq +339 -> 428
    //   92: aload 5
    //   94: invokeinterface 91 1 0
    //   99: checkcast 11	org/powerbot/script/rt4/GameObject
    //   102: dup
    //   103: astore 6
    //   105: invokevirtual 95	org/powerbot/script/rt4/GameObject:tile	()Lorg/powerbot/script/Tile;
    //   108: dup
    //   109: astore 7
    //   111: ifnonnull +8 -> 119
    //   114: aload 5
    //   116: goto -32 -> 84
    //   119: aload 4
    //   121: aload 7
    //   123: invokeinterface 101 2 0
    //   128: ifne +27 -> 155
    //   131: aload 4
    //   133: new 103	java/util/concurrent/atomic/AtomicInteger
    //   136: aload 7
    //   138: dup_x1
    //   139: dup
    //   140: pop2
    //   141: dup
    //   142: iconst_0
    //   143: iconst_1
    //   144: dup
    //   145: pop2
    //   146: invokespecial 106	java/util/concurrent/atomic/AtomicInteger:<init>	(I)V
    //   149: invokeinterface 110 3 0
    //   154: pop
    //   155: aload 6
    //   157: invokevirtual 114	org/powerbot/script/rt4/GameObject:centerPoint	()Ljava/awt/Point;
    //   160: dup
    //   161: astore 8
    //   163: getfield 120	java/awt/Point:x	I
    //   166: iconst_m1
    //   167: iconst_1
    //   168: dup
    //   169: pop2
    //   170: if_icmpne +8 -> 178
    //   173: aload 5
    //   175: goto -91 -> 84
    //   178: aload_1
    //   179: aload 6
    //   181: aload 8
    //   183: aload_1
    //   184: dup_x1
    //   185: getstatic 126	java/awt/Color:black	Ljava/awt/Color;
    //   188: invokevirtual 130	java/awt/Graphics:setColor	(Ljava/awt/Color;)V
    //   191: getfield 120	java/awt/Point:x	I
    //   194: iconst_1
    //   195: dup
    //   196: dup
    //   197: pop2
    //   198: isub
    //   199: aload 8
    //   201: getfield 133	java/awt/Point:y	I
    //   204: iconst_1
    //   205: dup
    //   206: dup
    //   207: pop2
    //   208: isub
    //   209: iconst_2
    //   210: iconst_1
    //   211: dup
    //   212: pop2
    //   213: iconst_2
    //   214: iconst_1
    //   215: dup
    //   216: pop2
    //   217: invokevirtual 137	java/awt/Graphics:fillRect	(IIII)V
    //   220: invokevirtual 140	org/powerbot/script/rt4/GameObject:id	()I
    //   223: invokestatic 146	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   226: astore 9
    //   228: aload 8
    //   230: dup
    //   231: getfield 133	java/awt/Point:y	I
    //   234: iload_3
    //   235: iconst_2
    //   236: iconst_1
    //   237: dup
    //   238: pop2
    //   239: idiv
    //   240: isub
    //   241: istore 8
    //   243: getfield 120	java/awt/Point:x	I
    //   246: aload_2
    //   247: aload 9
    //   249: invokevirtual 150	java/awt/FontMetrics:stringWidth	(Ljava/lang/String;)I
    //   252: iconst_2
    //   253: iconst_1
    //   254: dup
    //   255: pop2
    //   256: idiv
    //   257: isub
    //   258: istore 10
    //   260: getstatic 152	org/powerbot/bot/rt4/DrawObjects:void	[Ljava/awt/Color;
    //   263: aload 6
    //   265: invokevirtual 156	org/powerbot/script/rt4/GameObject:type	()Lorg/powerbot/script/rt4/GameObject$Type;
    //   268: invokevirtual 159	org/powerbot/script/rt4/GameObject$Type:ordinal	()I
    //   271: aaload
    //   272: invokevirtual 130	java/awt/Graphics:setColor	(Ljava/awt/Color;)V
    //   275: new 161	java/lang/StringBuilder
    //   278: dup
    //   279: aload 9
    //   281: invokespecial 164	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   284: astore 9
    //   286: aload 6
    //   288: invokevirtual 168	org/powerbot/script/rt4/GameObject:name	()Ljava/lang/String;
    //   291: dup
    //   292: astore 11
    //   294: invokevirtual 173	java/lang/String:isEmpty	()Z
    //   297: ifne +95 -> 392
    //   300: aload 11
    //   302: ldc -81
    //   304: invokestatic 181	org/powerbot/script/rt4/HintArrow:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   307: invokevirtual 184	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   310: ifne +82 -> 392
    //   313: aload 6
    //   315: invokevirtual 188	org/powerbot/script/rt4/GameObject:meshIds	()[I
    //   318: dup
    //   319: astore 6
    //   321: arraylength
    //   322: iconst_1
    //   323: dup
    //   324: dup
    //   325: pop2
    //   326: if_icmpge +24 -> 350
    //   329: iconst_1
    //   330: dup
    //   331: dup
    //   332: pop2
    //   333: newarray int
    //   335: iconst_1
    //   336: dup
    //   337: pop2
    //   338: dup
    //   339: iconst_0
    //   340: iconst_1
    //   341: dup
    //   342: pop2
    //   343: iconst_m1
    //   344: iconst_1
    //   345: dup
    //   346: pop2
    //   347: iastore
    //   348: astore 6
    //   350: aload 9
    //   352: ldc -66
    //   354: invokestatic 193	z/coM8:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   357: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   360: aload 11
    //   362: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   365: bipush 47
    //   367: iconst_1
    //   368: dup
    //   369: pop2
    //   370: invokevirtual 200	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   373: aload 6
    //   375: iconst_0
    //   376: iconst_1
    //   377: dup
    //   378: pop2
    //   379: iaload
    //   380: invokevirtual 203	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   383: bipush 41
    //   385: iconst_1
    //   386: dup
    //   387: pop2
    //   388: invokevirtual 200	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   391: pop
    //   392: aload_1
    //   393: aload 9
    //   395: invokevirtual 205	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   398: iload 10
    //   400: iload 8
    //   402: iload_3
    //   403: aload 4
    //   405: aload 7
    //   407: invokeinterface 209 2 0
    //   412: checkcast 103	java/util/concurrent/atomic/AtomicInteger
    //   415: invokevirtual 212	java/util/concurrent/atomic/AtomicInteger:getAndIncrement	()I
    //   418: imul
    //   419: isub
    //   420: invokevirtual 216	java/awt/Graphics:drawString	(Ljava/lang/String;II)V
    //   423: aload 5
    //   425: goto -341 -> 84
    //   428: return
    // Line number table:
    //   Java source line #28	-> byte code offset #0
    //   Java source line #29	-> byte code offset #21
    //   Java source line #31	-> byte code offset #23
    //   Java source line #32	-> byte code offset #36
    //   Java source line #33	-> byte code offset #39
    //   Java source line #35	-> byte code offset #41
    //   Java source line #36	-> byte code offset #47
    //   Java source line #38	-> byte code offset #51
    //   Java source line #39	-> byte code offset #60
    //   Java source line #40	-> byte code offset #105
    //   Java source line #41	-> byte code offset #111
    //   Java source line #42	-> byte code offset #116
    //   Java source line #44	-> byte code offset #119
    //   Java source line #45	-> byte code offset #131
    //   Java source line #47	-> byte code offset #155
    //   Java source line #48	-> byte code offset #163
    //   Java source line #49	-> byte code offset #175
    //   Java source line #52	-> byte code offset #178
    //   Java source line #53	-> byte code offset #191
    //   Java source line #55	-> byte code offset #220
    //   Java source line #56	-> byte code offset #228
    //   Java source line #57	-> byte code offset #243
    //   Java source line #58	-> byte code offset #260
    //   Java source line #59	-> byte code offset #275
    //   Java source line #60	-> byte code offset #286
    //   Java source line #61	-> byte code offset #294
    //   Java source line #62	-> byte code offset #313
    //   Java source line #63	-> byte code offset #321
    //   Java source line #64	-> byte code offset #329
    //   Java source line #66	-> byte code offset #350
    //   Java source line #68	-> byte code offset #392
    //   Java source line #69	-> byte code offset #425
    //   Java source line #70	-> byte code offset #428
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	429	0	a	DrawObjects
    //   0	429	1	a	java.awt.Graphics
  }
  
  public DrawObjects(ClientContext a)
  {
    a.<init>(a);
  }
}
