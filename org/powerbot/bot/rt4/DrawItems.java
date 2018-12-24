package org.powerbot.bot.rt4;

import org.powerbot.script.PaintListener;
import org.powerbot.script.rt4.ClientAccessor;
import org.powerbot.script.rt4.ClientContext;




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
    //   1: getfield 20	org/powerbot/bot/rt4/DrawItems:ctx	Lorg/powerbot/script/ClientContext;
    //   4: checkcast 22	org/powerbot/script/rt4/ClientContext
    //   7: getfield 26	org/powerbot/script/rt4/ClientContext:game	Lorg/powerbot/script/rt4/Game;
    //   10: invokevirtual 32	org/powerbot/script/rt4/Game:loggedIn	()Z
    //   13: ifne +5 -> 18
    //   16: return
    //   17: athrow
    //   18: aload_1
    //   19: dup
    //   20: new 34	java/awt/Font
    //   23: dup
    //   24: ldc 36
    //   26: invokestatic 42	z/LPT2:this	(Ljava/lang/Object;)Ljava/lang/String;
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
    //   51: getfield 20	org/powerbot/bot/rt4/DrawItems:ctx	Lorg/powerbot/script/ClientContext;
    //   54: checkcast 22	org/powerbot/script/rt4/ClientContext
    //   57: getfield 65	org/powerbot/script/rt4/ClientContext:inventory	Lorg/powerbot/script/rt4/Inventory;
    //   60: invokevirtual 71	org/powerbot/script/rt4/Inventory:select	()Lorg/powerbot/script/AbstractQuery;
    //   63: checkcast 73	org/powerbot/script/rt4/ItemQuery
    //   66: invokevirtual 77	org/powerbot/script/rt4/ItemQuery:iterator	()Ljava/util/Iterator;
    //   69: dup
    //   70: astore_2
    //   71: invokeinterface 82 1 0
    //   76: ifeq +84 -> 160
    //   79: aload_2
    //   80: invokeinterface 86 1 0
    //   85: checkcast 88	org/powerbot/script/rt4/Item
    //   88: dup
    //   89: astore_3
    //   90: invokevirtual 92	org/powerbot/script/rt4/Item:centerPoint	()Ljava/awt/Point;
    //   93: astore 4
    //   95: aload_2
    //   96: aload 4
    //   98: bipush -21
    //   100: iconst_1
    //   101: dup
    //   102: pop2
    //   103: bipush -18
    //   105: iconst_1
    //   106: dup
    //   107: pop2
    //   108: invokevirtual 98	java/awt/Point:translate	(II)V
    //   111: new 100	java/lang/StringBuilder
    //   114: aload_1
    //   115: dup_x1
    //   116: dup
    //   117: pop2
    //   118: dup
    //   119: invokespecial 103	java/lang/StringBuilder:<init>	()V
    //   122: aload_3
    //   123: invokevirtual 107	org/powerbot/script/rt4/Item:id	()I
    //   126: invokevirtual 111	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   129: ldc 113
    //   131: invokevirtual 116	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   137: aload 4
    //   139: dup
    //   140: getfield 124	java/awt/Point:x	I
    //   143: swap
    //   144: getfield 127	java/awt/Point:y	I
    //   147: bipush 36
    //   149: iconst_1
    //   150: dup
    //   151: pop2
    //   152: iadd
    //   153: invokevirtual 130	java/awt/Graphics:drawString	(Ljava/lang/String;II)V
    //   156: goto -85 -> 71
    //   159: athrow
    //   160: return
    // Line number table:
    //   Java source line #20	-> byte code offset #0
    //   Java source line #21	-> byte code offset #16
    //   Java source line #24	-> byte code offset #18
    //   Java source line #25	-> byte code offset #44
    //   Java source line #27	-> byte code offset #50
    //   Java source line #28	-> byte code offset #90
    //   Java source line #29	-> byte code offset #96
    //   Java source line #30	-> byte code offset #111
    //   Java source line #31	-> byte code offset #156
    //   Java source line #32	-> byte code offset #160
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	161	0	a	DrawItems
    //   0	161	1	a	java.awt.Graphics
  }
}
