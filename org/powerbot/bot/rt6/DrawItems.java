package org.powerbot.bot.rt6;

import org.powerbot.script.PaintListener;
import org.powerbot.script.rt6.ClientAccessor;
import org.powerbot.script.rt6.ClientContext;







public class DrawItems
  extends ClientAccessor
  implements PaintListener
{
  public DrawItems(ClientContext a)
  {
    a.<init>(a);
  }
  
  /* Error */
  public void repaint(java.awt.Graphics a)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 20	org/powerbot/bot/rt6/DrawItems:ctx	Lorg/powerbot/script/ClientContext;
    //   4: checkcast 22	org/powerbot/script/rt6/ClientContext
    //   7: getfield 26	org/powerbot/script/rt6/ClientContext:game	Lorg/powerbot/script/rt6/Game;
    //   10: invokevirtual 32	org/powerbot/script/rt6/Game:loggedIn	()Z
    //   13: ifne +5 -> 18
    //   16: return
    //   17: athrow
    //   18: aload_1
    //   19: dup
    //   20: new 34	java/awt/Font
    //   23: dup
    //   24: ldc 36
    //   26: invokestatic 42	org/powerbot/util/prn:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   29: iconst_0
    //   30: iconst_1
    //   31: dup
    //   32: pop2
    //   33: bipush 10
    //   35: iconst_1
    //   36: dup
    //   37: pop2
    //   38: invokespecial 45	java/awt/Font:<init>	(Ljava/lang/String;II)V
    //   41: invokevirtual 51	java/awt/Graphics:setFont	(Ljava/awt/Font;)V
    //   44: getstatic 57	java/awt/Color:green	Ljava/awt/Color;
    //   47: invokevirtual 61	java/awt/Graphics:setColor	(Ljava/awt/Color;)V
    //   50: aload_0
    //   51: getfield 20	org/powerbot/bot/rt6/DrawItems:ctx	Lorg/powerbot/script/ClientContext;
    //   54: checkcast 22	org/powerbot/script/rt6/ClientContext
    //   57: getfield 65	org/powerbot/script/rt6/ClientContext:bank	Lorg/powerbot/script/rt6/Bank;
    //   60: invokevirtual 70	org/powerbot/script/rt6/Bank:opened	()Z
    //   63: ifeq +196 -> 259
    //   66: aload_0
    //   67: getfield 20	org/powerbot/bot/rt6/DrawItems:ctx	Lorg/powerbot/script/ClientContext;
    //   70: checkcast 22	org/powerbot/script/rt6/ClientContext
    //   73: getfield 74	org/powerbot/script/rt6/ClientContext:widgets	Lorg/powerbot/script/rt6/Widgets;
    //   76: sipush 762
    //   79: iconst_1
    //   80: dup
    //   81: pop2
    //   82: sipush 213
    //   85: iconst_1
    //   86: dup
    //   87: pop2
    //   88: invokevirtual 80	org/powerbot/script/rt6/Widgets:component	(II)Lorg/powerbot/script/rt6/Component;
    //   91: dup
    //   92: astore_2
    //   93: invokevirtual 86	org/powerbot/script/rt6/Component:viewportRect	()Ljava/awt/Rectangle;
    //   96: dup
    //   97: astore_3
    //   98: ifnull +161 -> 259
    //   101: aload_0
    //   102: getfield 20	org/powerbot/bot/rt6/DrawItems:ctx	Lorg/powerbot/script/ClientContext;
    //   105: checkcast 22	org/powerbot/script/rt6/ClientContext
    //   108: getfield 65	org/powerbot/script/rt6/ClientContext:bank	Lorg/powerbot/script/rt6/Bank;
    //   111: invokevirtual 90	org/powerbot/script/rt6/Bank:select	()Lorg/powerbot/script/AbstractQuery;
    //   114: checkcast 92	org/powerbot/script/rt6/ItemQuery
    //   117: invokevirtual 96	org/powerbot/script/rt6/ItemQuery:iterator	()Ljava/util/Iterator;
    //   120: astore 4
    //   122: aload 4
    //   124: invokeinterface 101 1 0
    //   129: ifeq +130 -> 259
    //   132: aload 4
    //   134: invokeinterface 105 1 0
    //   139: checkcast 107	org/powerbot/script/rt6/Item
    //   142: dup
    //   143: astore 5
    //   145: invokevirtual 110	org/powerbot/script/rt6/Item:component	()Lorg/powerbot/script/rt6/Component;
    //   148: dup
    //   149: astore 6
    //   151: ifnonnull +9 -> 160
    //   154: aload 4
    //   156: goto -32 -> 124
    //   159: athrow
    //   160: aload 6
    //   162: invokevirtual 113	org/powerbot/script/rt6/Component:boundingRect	()Ljava/awt/Rectangle;
    //   165: dup
    //   166: astore 7
    //   168: ifnonnull +8 -> 176
    //   171: aload 4
    //   173: goto -49 -> 124
    //   176: aload 6
    //   178: invokevirtual 117	org/powerbot/script/rt6/Component:relativePoint	()Ljava/awt/Point;
    //   181: getfield 123	java/awt/Point:y	I
    //   184: ifeq -62 -> 122
    //   187: aload_3
    //   188: aload 7
    //   190: invokevirtual 129	java/awt/Rectangle:contains	(Ljava/awt/Rectangle;)Z
    //   193: ifne +8 -> 201
    //   196: aload 4
    //   198: goto -74 -> 124
    //   201: aload 6
    //   203: invokevirtual 132	org/powerbot/script/rt6/Component:screenPoint	()Ljava/awt/Point;
    //   206: astore 7
    //   208: aload 4
    //   210: new 134	java/lang/StringBuilder
    //   213: aload_1
    //   214: dup_x1
    //   215: dup
    //   216: pop2
    //   217: dup
    //   218: invokespecial 137	java/lang/StringBuilder:<init>	()V
    //   221: aload 6
    //   223: invokevirtual 141	org/powerbot/script/rt6/Component:itemId	()I
    //   226: invokevirtual 145	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   229: ldc -109
    //   231: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   234: invokevirtual 154	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   237: aload 7
    //   239: dup
    //   240: getfield 157	java/awt/Point:x	I
    //   243: swap
    //   244: getfield 123	java/awt/Point:y	I
    //   247: aload 6
    //   249: invokevirtual 160	org/powerbot/script/rt6/Component:height	()I
    //   252: iadd
    //   253: invokevirtual 163	java/awt/Graphics:drawString	(Ljava/lang/String;II)V
    //   256: goto -132 -> 124
    //   259: aload_0
    //   260: getfield 20	org/powerbot/bot/rt6/DrawItems:ctx	Lorg/powerbot/script/ClientContext;
    //   263: checkcast 22	org/powerbot/script/rt6/ClientContext
    //   266: getfield 167	org/powerbot/script/rt6/ClientContext:backpack	Lorg/powerbot/script/rt6/Backpack;
    //   269: invokevirtual 170	org/powerbot/script/rt6/Backpack:component	()Lorg/powerbot/script/rt6/Component;
    //   272: invokevirtual 173	org/powerbot/script/rt6/Component:visible	()Z
    //   275: ifeq +113 -> 388
    //   278: aload_0
    //   279: getfield 20	org/powerbot/bot/rt6/DrawItems:ctx	Lorg/powerbot/script/ClientContext;
    //   282: checkcast 22	org/powerbot/script/rt6/ClientContext
    //   285: getfield 167	org/powerbot/script/rt6/ClientContext:backpack	Lorg/powerbot/script/rt6/Backpack;
    //   288: invokevirtual 174	org/powerbot/script/rt6/Backpack:select	()Lorg/powerbot/script/AbstractQuery;
    //   291: checkcast 92	org/powerbot/script/rt6/ItemQuery
    //   294: invokevirtual 96	org/powerbot/script/rt6/ItemQuery:iterator	()Ljava/util/Iterator;
    //   297: dup
    //   298: astore_2
    //   299: invokeinterface 101 1 0
    //   304: ifeq +84 -> 388
    //   307: aload_2
    //   308: invokeinterface 105 1 0
    //   313: checkcast 107	org/powerbot/script/rt6/Item
    //   316: dup
    //   317: astore_3
    //   318: invokevirtual 110	org/powerbot/script/rt6/Item:component	()Lorg/powerbot/script/rt6/Component;
    //   321: dup
    //   322: astore 4
    //   324: ifnonnull +7 -> 331
    //   327: aload_2
    //   328: goto -29 -> 299
    //   331: aload 4
    //   333: invokevirtual 132	org/powerbot/script/rt6/Component:screenPoint	()Ljava/awt/Point;
    //   336: astore 5
    //   338: aload_2
    //   339: new 134	java/lang/StringBuilder
    //   342: aload_1
    //   343: dup_x1
    //   344: dup
    //   345: pop2
    //   346: dup
    //   347: invokespecial 137	java/lang/StringBuilder:<init>	()V
    //   350: aload 4
    //   352: invokevirtual 141	org/powerbot/script/rt6/Component:itemId	()I
    //   355: invokevirtual 145	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   358: ldc -109
    //   360: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   363: invokevirtual 154	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   366: aload 5
    //   368: dup
    //   369: getfield 157	java/awt/Point:x	I
    //   372: swap
    //   373: getfield 123	java/awt/Point:y	I
    //   376: aload 4
    //   378: invokevirtual 160	org/powerbot/script/rt6/Component:height	()I
    //   381: iadd
    //   382: invokevirtual 163	java/awt/Graphics:drawString	(Ljava/lang/String;II)V
    //   385: goto -86 -> 299
    //   388: aload_0
    //   389: getfield 20	org/powerbot/bot/rt6/DrawItems:ctx	Lorg/powerbot/script/ClientContext;
    //   392: checkcast 22	org/powerbot/script/rt6/ClientContext
    //   395: getfield 178	org/powerbot/script/rt6/ClientContext:equipment	Lorg/powerbot/script/rt6/Equipment;
    //   398: invokevirtual 181	org/powerbot/script/rt6/Equipment:component	()Lorg/powerbot/script/rt6/Component;
    //   401: invokevirtual 173	org/powerbot/script/rt6/Component:visible	()Z
    //   404: ifeq +121 -> 525
    //   407: aload_0
    //   408: getfield 20	org/powerbot/bot/rt6/DrawItems:ctx	Lorg/powerbot/script/ClientContext;
    //   411: checkcast 22	org/powerbot/script/rt6/ClientContext
    //   414: getfield 178	org/powerbot/script/rt6/ClientContext:equipment	Lorg/powerbot/script/rt6/Equipment;
    //   417: invokevirtual 182	org/powerbot/script/rt6/Equipment:select	()Lorg/powerbot/script/AbstractQuery;
    //   420: checkcast 92	org/powerbot/script/rt6/ItemQuery
    //   423: invokevirtual 96	org/powerbot/script/rt6/ItemQuery:iterator	()Ljava/util/Iterator;
    //   426: dup
    //   427: astore_2
    //   428: invokeinterface 101 1 0
    //   433: ifeq +92 -> 525
    //   436: aload_2
    //   437: invokeinterface 105 1 0
    //   442: checkcast 107	org/powerbot/script/rt6/Item
    //   445: dup
    //   446: astore_3
    //   447: ifnonnull +7 -> 454
    //   450: aload_2
    //   451: goto -23 -> 428
    //   454: aload_3
    //   455: invokevirtual 110	org/powerbot/script/rt6/Item:component	()Lorg/powerbot/script/rt6/Component;
    //   458: dup
    //   459: astore 4
    //   461: ifnonnull +7 -> 468
    //   464: aload_2
    //   465: goto -37 -> 428
    //   468: aload 4
    //   470: invokevirtual 132	org/powerbot/script/rt6/Component:screenPoint	()Ljava/awt/Point;
    //   473: astore 5
    //   475: aload_2
    //   476: new 134	java/lang/StringBuilder
    //   479: aload_1
    //   480: dup_x1
    //   481: dup
    //   482: pop2
    //   483: dup
    //   484: invokespecial 137	java/lang/StringBuilder:<init>	()V
    //   487: aload 4
    //   489: invokevirtual 141	org/powerbot/script/rt6/Component:itemId	()I
    //   492: invokevirtual 145	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   495: ldc -109
    //   497: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   500: invokevirtual 154	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   503: aload 5
    //   505: dup
    //   506: getfield 157	java/awt/Point:x	I
    //   509: swap
    //   510: getfield 123	java/awt/Point:y	I
    //   513: aload 4
    //   515: invokevirtual 160	org/powerbot/script/rt6/Component:height	()I
    //   518: iadd
    //   519: invokevirtual 163	java/awt/Graphics:drawString	(Ljava/lang/String;II)V
    //   522: goto -94 -> 428
    //   525: return
    // Line number table:
    //   Java source line #23	-> byte code offset #0
    //   Java source line #24	-> byte code offset #16
    //   Java source line #27	-> byte code offset #18
    //   Java source line #28	-> byte code offset #44
    //   Java source line #30	-> byte code offset #50
    //   Java source line #31	-> byte code offset #66
    //   Java source line #32	-> byte code offset #93
    //   Java source line #33	-> byte code offset #98
    //   Java source line #34	-> byte code offset #101
    //   Java source line #35	-> byte code offset #145
    //   Java source line #36	-> byte code offset #151
    //   Java source line #37	-> byte code offset #156
    //   Java source line #39	-> byte code offset #160
    //   Java source line #40	-> byte code offset #168
    //   Java source line #41	-> byte code offset #173
    //   Java source line #43	-> byte code offset #176
    //   Java source line #44	-> byte code offset #198
    //   Java source line #46	-> byte code offset #201
    //   Java source line #47	-> byte code offset #210
    //   Java source line #48	-> byte code offset #256
    //   Java source line #52	-> byte code offset #259
    //   Java source line #53	-> byte code offset #278
    //   Java source line #54	-> byte code offset #318
    //   Java source line #55	-> byte code offset #324
    //   Java source line #56	-> byte code offset #328
    //   Java source line #58	-> byte code offset #331
    //   Java source line #59	-> byte code offset #339
    //   Java source line #60	-> byte code offset #385
    //   Java source line #62	-> byte code offset #388
    //   Java source line #63	-> byte code offset #407
    //   Java source line #64	-> byte code offset #447
    //   Java source line #65	-> byte code offset #451
    //   Java source line #67	-> byte code offset #454
    //   Java source line #68	-> byte code offset #461
    //   Java source line #69	-> byte code offset #465
    //   Java source line #71	-> byte code offset #468
    //   Java source line #72	-> byte code offset #476
    //   Java source line #73	-> byte code offset #522
    //   Java source line #75	-> byte code offset #525
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	526	0	a	DrawItems
    //   0	526	1	a	java.awt.Graphics
  }
}
