package org.powerbot.bot.rt6;

import java.awt.Graphics;
import org.powerbot.bot.DebugHelper;
import org.powerbot.script.PaintListener;
import org.powerbot.script.TextPaintListener;
import org.powerbot.script.rt6.ClientAccessor;
import org.powerbot.script.rt6.ClientContext;
import org.powerbot.script.rt6.Projectiles;

public class DrawProjectiles
  extends ClientAccessor
  implements PaintListener, TextPaintListener
{
  public DrawProjectiles(ClientContext a)
  {
    a.<init>(a);
  }
  
  /* Error */
  public void repaint(Graphics a)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 22	org/powerbot/bot/rt6/DrawProjectiles:ctx	Lorg/powerbot/script/ClientContext;
    //   4: checkcast 24	org/powerbot/script/rt6/ClientContext
    //   7: getfield 28	org/powerbot/script/rt6/ClientContext:game	Lorg/powerbot/script/rt6/Game;
    //   10: invokevirtual 34	org/powerbot/script/rt6/Game:loggedIn	()Z
    //   13: ifne +5 -> 18
    //   16: return
    //   17: athrow
    //   18: aload_0
    //   19: getfield 22	org/powerbot/bot/rt6/DrawProjectiles:ctx	Lorg/powerbot/script/ClientContext;
    //   22: checkcast 24	org/powerbot/script/rt6/ClientContext
    //   25: getfield 38	org/powerbot/script/rt6/ClientContext:projectiles	Lorg/powerbot/script/rt6/Projectiles;
    //   28: invokevirtual 44	org/powerbot/script/rt6/Projectiles:select	()Lorg/powerbot/script/AbstractQuery;
    //   31: checkcast 46	org/powerbot/script/rt6/IdQuery
    //   34: invokevirtual 50	org/powerbot/script/rt6/IdQuery:iterator	()Ljava/util/Iterator;
    //   37: dup
    //   38: astore_2
    //   39: invokeinterface 55 1 0
    //   44: ifeq +141 -> 185
    //   47: aload_2
    //   48: invokeinterface 59 1 0
    //   53: checkcast 61	org/powerbot/script/rt6/Projectile
    //   56: invokevirtual 65	org/powerbot/script/rt6/Projectile:tile	()Lorg/powerbot/script/Tile;
    //   59: astore_3
    //   60: new 67	org/powerbot/script/rt6/TileMatrix
    //   63: dup
    //   64: aload_0
    //   65: getfield 22	org/powerbot/bot/rt6/DrawProjectiles:ctx	Lorg/powerbot/script/ClientContext;
    //   68: checkcast 24	org/powerbot/script/rt6/ClientContext
    //   71: aload_3
    //   72: invokespecial 70	org/powerbot/script/rt6/TileMatrix:<init>	(Lorg/powerbot/script/rt6/ClientContext;Lorg/powerbot/script/Tile;)V
    //   75: dup
    //   76: astore_3
    //   77: invokevirtual 73	org/powerbot/script/rt6/TileMatrix:valid	()Z
    //   80: ifne +8 -> 88
    //   83: aload_2
    //   84: goto -45 -> 39
    //   87: athrow
    //   88: aload_3
    //   89: aload_1
    //   90: sipush 255
    //   93: aload_3
    //   94: bipush 6
    //   96: iconst_1
    //   97: dup
    //   98: pop2
    //   99: newarray int
    //   101: iconst_1
    //   102: dup
    //   103: pop2
    //   104: dup
    //   105: iconst_0
    //   106: iconst_1
    //   107: dup
    //   108: pop2
    //   109: bipush -128
    //   111: iconst_1
    //   112: dup
    //   113: pop2
    //   114: iastore
    //   115: dup
    //   116: iconst_1
    //   117: dup
    //   118: pop2
    //   119: sipush 128
    //   122: iconst_1
    //   123: dup_x1
    //   124: dup
    //   125: pop2
    //   126: iastore
    //   127: dup
    //   128: iconst_2
    //   129: iconst_1
    //   130: dup
    //   131: pop2
    //   132: sipush 65280
    //   135: iconst_1
    //   136: dup
    //   137: pop2
    //   138: iastore
    //   139: dup
    //   140: iconst_3
    //   141: iconst_1
    //   142: dup
    //   143: pop2
    //   144: iconst_0
    //   145: iconst_1
    //   146: dup
    //   147: pop2
    //   148: iastore
    //   149: dup
    //   150: iconst_4
    //   151: iconst_1
    //   152: dup
    //   153: pop2
    //   154: bipush -128
    //   156: iconst_1
    //   157: dup
    //   158: pop2
    //   159: iastore
    //   160: dup
    //   161: iconst_5
    //   162: iconst_1
    //   163: dup
    //   164: pop2
    //   165: sipush 128
    //   168: iconst_1
    //   169: dup
    //   170: pop2
    //   171: iastore
    //   172: invokevirtual 77	org/powerbot/script/rt6/TileMatrix:bounds	([I)V
    //   175: iconst_1
    //   176: dup
    //   177: pop2
    //   178: invokevirtual 81	org/powerbot/script/rt6/TileMatrix:draw	(Ljava/awt/Graphics;I)V
    //   181: aload_2
    //   182: goto -143 -> 39
    //   185: return
    // Line number table:
    //   Java source line #22	-> byte code offset #0
    //   Java source line #23	-> byte code offset #16
    //   Java source line #26	-> byte code offset #18
    //   Java source line #27	-> byte code offset #56
    //   Java source line #28	-> byte code offset #60
    //   Java source line #29	-> byte code offset #77
    //   Java source line #30	-> byte code offset #84
    //   Java source line #32	-> byte code offset #88
    //   Java source line #33	-> byte code offset #175
    //   Java source line #34	-> byte code offset #182
    //   Java source line #35	-> byte code offset #185
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	186	0	a	DrawProjectiles
    //   0	186	1	a	Graphics
  }
  
  public int draw(int a, Graphics a)
  {
    DebugHelper.drawLine(a, new StringBuilder(), ctx).projectiles.size());
    return a;
  }
}
