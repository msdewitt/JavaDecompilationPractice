package org.powerbot.bot.rt4;

import java.awt.Color;
import org.powerbot.script.PaintListener;
import org.powerbot.script.rt4.ClientAccessor;
import org.powerbot.script.rt4.ClientContext;









public class DrawProjectiles
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
    //   1: getfield 22	org/powerbot/bot/rt4/DrawProjectiles:ctx	Lorg/powerbot/script/ClientContext;
    //   4: checkcast 24	org/powerbot/script/rt4/ClientContext
    //   7: getfield 28	org/powerbot/script/rt4/ClientContext:game	Lorg/powerbot/script/rt4/Game;
    //   10: invokevirtual 34	org/powerbot/script/rt4/Game:clientState	()I
    //   13: bipush 30
    //   15: iconst_1
    //   16: dup
    //   17: pop2
    //   18: if_icmpeq +5 -> 23
    //   21: return
    //   22: athrow
    //   23: aload_0
    //   24: getfield 22	org/powerbot/bot/rt4/DrawProjectiles:ctx	Lorg/powerbot/script/ClientContext;
    //   27: checkcast 24	org/powerbot/script/rt4/ClientContext
    //   30: getfield 38	org/powerbot/script/rt4/ClientContext:players	Lorg/powerbot/script/rt4/Players;
    //   33: invokevirtual 44	org/powerbot/script/rt4/Players:local	()Lorg/powerbot/script/rt4/Player;
    //   36: ifnonnull +5 -> 41
    //   39: return
    //   40: athrow
    //   41: aload_1
    //   42: invokevirtual 50	java/awt/Graphics:getFontMetrics	()Ljava/awt/FontMetrics;
    //   45: dup
    //   46: astore_2
    //   47: invokevirtual 55	java/awt/FontMetrics:getHeight	()I
    //   50: istore_3
    //   51: new 57	java/util/HashMap
    //   54: dup
    //   55: invokespecial 60	java/util/HashMap:<init>	()V
    //   58: astore 4
    //   60: aload_0
    //   61: getfield 22	org/powerbot/bot/rt4/DrawProjectiles:ctx	Lorg/powerbot/script/ClientContext;
    //   64: checkcast 24	org/powerbot/script/rt4/ClientContext
    //   67: getfield 64	org/powerbot/script/rt4/ClientContext:projectiles	Lorg/powerbot/script/rt4/Projectiles;
    //   70: invokevirtual 70	org/powerbot/script/rt4/Projectiles:select	()Lorg/powerbot/script/AbstractQuery;
    //   73: checkcast 72	org/powerbot/script/rt4/IdQuery
    //   76: invokevirtual 76	org/powerbot/script/rt4/IdQuery:iterator	()Ljava/util/Iterator;
    //   79: dup
    //   80: astore 5
    //   82: invokeinterface 82 1 0
    //   87: ifeq +320 -> 407
    //   90: aload 5
    //   92: invokeinterface 86 1 0
    //   97: checkcast 88	org/powerbot/script/rt4/Projectile
    //   100: astore 6
    //   102: new 90	org/powerbot/script/Tile
    //   105: dup
    //   106: aload 6
    //   108: invokevirtual 93	org/powerbot/script/rt4/Projectile:getX	()I
    //   111: aload 6
    //   113: invokevirtual 96	org/powerbot/script/rt4/Projectile:getY	()I
    //   116: aload_0
    //   117: getfield 22	org/powerbot/bot/rt4/DrawProjectiles:ctx	Lorg/powerbot/script/ClientContext;
    //   120: checkcast 24	org/powerbot/script/rt4/ClientContext
    //   123: invokevirtual 100	org/powerbot/script/rt4/ClientContext:client	()Lorg/powerbot/script/Client;
    //   126: checkcast 102	org/powerbot/bot/rt4/client/Client
    //   129: invokevirtual 105	org/powerbot/bot/rt4/client/Client:getFloor	()I
    //   132: invokespecial 108	org/powerbot/script/Tile:<init>	(III)V
    //   135: astore 7
    //   137: aload 4
    //   139: aload 7
    //   141: invokeinterface 114 2 0
    //   146: ifne +27 -> 173
    //   149: aload 4
    //   151: new 116	java/util/concurrent/atomic/AtomicInteger
    //   154: aload 7
    //   156: dup_x1
    //   157: dup
    //   158: pop2
    //   159: dup
    //   160: iconst_0
    //   161: iconst_1
    //   162: dup
    //   163: pop2
    //   164: invokespecial 119	java/util/concurrent/atomic/AtomicInteger:<init>	(I)V
    //   167: invokeinterface 123 3 0
    //   172: pop
    //   173: aload 7
    //   175: aload_0
    //   176: getfield 22	org/powerbot/bot/rt4/DrawProjectiles:ctx	Lorg/powerbot/script/ClientContext;
    //   179: checkcast 24	org/powerbot/script/rt4/ClientContext
    //   182: invokevirtual 127	org/powerbot/script/Tile:matrix	(Lorg/powerbot/script/rt4/ClientContext;)Lorg/powerbot/script/rt4/TileMatrix;
    //   185: invokevirtual 133	org/powerbot/script/rt4/TileMatrix:centerPoint	()Ljava/awt/Point;
    //   188: dup
    //   189: astore 8
    //   191: getfield 139	java/awt/Point:x	I
    //   194: iconst_m1
    //   195: iconst_1
    //   196: dup
    //   197: pop2
    //   198: if_icmpne +8 -> 206
    //   201: aload 5
    //   203: goto -121 -> 82
    //   206: aload_1
    //   207: aload 8
    //   209: aload_1
    //   210: getstatic 145	java/awt/Color:black	Ljava/awt/Color;
    //   213: invokevirtual 149	java/awt/Graphics:setColor	(Ljava/awt/Color;)V
    //   216: getfield 139	java/awt/Point:x	I
    //   219: iconst_1
    //   220: dup
    //   221: dup
    //   222: pop2
    //   223: isub
    //   224: aload 8
    //   226: getfield 152	java/awt/Point:y	I
    //   229: iconst_1
    //   230: dup
    //   231: dup
    //   232: pop2
    //   233: isub
    //   234: iconst_2
    //   235: iconst_1
    //   236: dup
    //   237: pop2
    //   238: iconst_2
    //   239: iconst_1
    //   240: dup
    //   241: pop2
    //   242: invokevirtual 156	java/awt/Graphics:fillRect	(IIII)V
    //   245: ldc -98
    //   247: invokestatic 164	z/LPT2:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   250: iconst_2
    //   251: iconst_1
    //   252: dup
    //   253: pop2
    //   254: anewarray 166	java/lang/Object
    //   257: iconst_1
    //   258: dup
    //   259: pop2
    //   260: dup
    //   261: iconst_0
    //   262: iconst_1
    //   263: dup
    //   264: pop2
    //   265: aload 6
    //   267: invokevirtual 169	org/powerbot/script/rt4/Projectile:id	()I
    //   270: invokestatic 175	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   273: aastore
    //   274: dup
    //   275: iconst_1
    //   276: dup
    //   277: dup
    //   278: pop2
    //   279: aload 6
    //   281: invokevirtual 179	org/powerbot/script/rt4/Projectile:getTarget	()Lorg/powerbot/script/rt4/Actor;
    //   284: aastore
    //   285: invokestatic 185	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   288: astore 9
    //   290: aload 6
    //   292: aload 8
    //   294: dup
    //   295: getfield 152	java/awt/Point:y	I
    //   298: iload_3
    //   299: iconst_2
    //   300: iconst_1
    //   301: dup
    //   302: pop2
    //   303: idiv
    //   304: isub
    //   305: istore 6
    //   307: getfield 139	java/awt/Point:x	I
    //   310: aload_2
    //   311: aload 9
    //   313: invokevirtual 189	java/awt/FontMetrics:stringWidth	(Ljava/lang/String;)I
    //   316: iconst_2
    //   317: iconst_1
    //   318: dup
    //   319: pop2
    //   320: idiv
    //   321: isub
    //   322: istore 8
    //   324: invokevirtual 179	org/powerbot/script/rt4/Projectile:getTarget	()Lorg/powerbot/script/rt4/Actor;
    //   327: aload_0
    //   328: getfield 22	org/powerbot/bot/rt4/DrawProjectiles:ctx	Lorg/powerbot/script/ClientContext;
    //   331: checkcast 24	org/powerbot/script/rt4/ClientContext
    //   334: getfield 38	org/powerbot/script/rt4/ClientContext:players	Lorg/powerbot/script/rt4/Players;
    //   337: invokevirtual 44	org/powerbot/script/rt4/Players:local	()Lorg/powerbot/script/rt4/Player;
    //   340: invokevirtual 194	org/powerbot/script/rt4/Actor:equals	(Ljava/lang/Object;)Z
    //   343: aload_1
    //   344: swap
    //   345: ifeq +18 -> 363
    //   348: getstatic 196	org/powerbot/bot/rt4/DrawProjectiles:void	[Ljava/awt/Color;
    //   351: iconst_4
    //   352: iconst_1
    //   353: dup
    //   354: pop2
    //   355: aaload
    //   356: invokevirtual 149	java/awt/Graphics:setColor	(Ljava/awt/Color;)V
    //   359: aload_1
    //   360: goto +15 -> 375
    //   363: getstatic 196	org/powerbot/bot/rt4/DrawProjectiles:void	[Ljava/awt/Color;
    //   366: iconst_0
    //   367: iconst_1
    //   368: dup
    //   369: pop2
    //   370: aaload
    //   371: invokevirtual 149	java/awt/Graphics:setColor	(Ljava/awt/Color;)V
    //   374: aload_1
    //   375: aload 9
    //   377: iload 8
    //   379: iload 6
    //   381: iload_3
    //   382: aload 4
    //   384: aload 7
    //   386: invokeinterface 200 2 0
    //   391: checkcast 116	java/util/concurrent/atomic/AtomicInteger
    //   394: invokevirtual 203	java/util/concurrent/atomic/AtomicInteger:getAndIncrement	()I
    //   397: imul
    //   398: isub
    //   399: invokevirtual 207	java/awt/Graphics:drawString	(Ljava/lang/String;II)V
    //   402: aload 5
    //   404: goto -322 -> 82
    //   407: return
    // Line number table:
    //   Java source line #30	-> byte code offset #0
    //   Java source line #31	-> byte code offset #21
    //   Java source line #33	-> byte code offset #23
    //   Java source line #34	-> byte code offset #36
    //   Java source line #35	-> byte code offset #39
    //   Java source line #37	-> byte code offset #41
    //   Java source line #38	-> byte code offset #47
    //   Java source line #40	-> byte code offset #51
    //   Java source line #41	-> byte code offset #60
    //   Java source line #42	-> byte code offset #102
    //   Java source line #43	-> byte code offset #137
    //   Java source line #44	-> byte code offset #149
    //   Java source line #46	-> byte code offset #173
    //   Java source line #47	-> byte code offset #191
    //   Java source line #48	-> byte code offset #203
    //   Java source line #51	-> byte code offset #206
    //   Java source line #52	-> byte code offset #216
    //   Java source line #54	-> byte code offset #245
    //   Java source line #55	-> byte code offset #292
    //   Java source line #56	-> byte code offset #307
    //   Java source line #58	-> byte code offset #324
    //   Java source line #59	-> byte code offset #348
    //   Java source line #61	-> byte code offset #363
    //   Java source line #63	-> byte code offset #374
    //   Java source line #65	-> byte code offset #404
    //   Java source line #66	-> byte code offset #407
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	408	0	a	DrawProjectiles
    //   0	408	1	a	java.awt.Graphics
  }
  
  public DrawProjectiles(ClientContext a)
  {
    a.<init>(a);
  }
}
