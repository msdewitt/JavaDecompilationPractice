package org.powerbot.bot.rt6;

import java.util.concurrent.atomic.AtomicInteger;
import org.powerbot.script.rt6.ClientContext;


public class WindowPattern
  extends Antipattern.Module
{
  public WindowPattern(ClientContext a)
  {
    a.<init>(a); int 
      tmp12_11 = 1;tmp12_11;15.set(tmp12_11);
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 39	org/powerbot/bot/rt6/WindowPattern:isAggressive	()Z
    //   4: istore_1
    //   5: iconst_0
    //   6: iconst_1
    //   7: dup
    //   8: pop2
    //   9: istore_2
    //   10: invokestatic 43	org/powerbot/script/rt6/Hud$Window:values	()[Lorg/powerbot/script/rt6/Hud$Window;
    //   13: astore_3
    //   14: iconst_0
    //   15: iconst_1
    //   16: dup
    //   17: pop2
    //   18: dup
    //   19: istore 4
    //   21: aload_3
    //   22: arraylength
    //   23: if_icmpge +80 -> 103
    //   26: aload_3
    //   27: iload 4
    //   29: aaload
    //   30: astore 5
    //   32: aload_0
    //   33: getfield 47	org/powerbot/bot/rt6/WindowPattern:ctx	Lorg/powerbot/script/ClientContext;
    //   36: checkcast 49	org/powerbot/script/rt6/ClientContext
    //   39: getfield 53	org/powerbot/script/rt6/ClientContext:hud	Lorg/powerbot/script/rt6/Hud;
    //   42: aload 5
    //   44: invokevirtual 57	org/powerbot/script/rt6/Hud:floating	(Lorg/powerbot/script/rt6/Hud$Window;)Z
    //   47: ifeq +48 -> 95
    //   50: aload_0
    //   51: getfield 47	org/powerbot/bot/rt6/WindowPattern:ctx	Lorg/powerbot/script/ClientContext;
    //   54: checkcast 49	org/powerbot/script/rt6/ClientContext
    //   57: getfield 53	org/powerbot/script/rt6/ClientContext:hud	Lorg/powerbot/script/rt6/Hud;
    //   60: aload 5
    //   62: invokevirtual 60	org/powerbot/script/rt6/Hud:opened	(Lorg/powerbot/script/rt6/Hud$Window;)Z
    //   65: ifeq +7 -> 72
    //   68: goto +27 -> 95
    //   71: athrow
    //   72: aload 5
    //   74: invokevirtual 64	org/powerbot/script/rt6/Hud$Window:menu	()Lorg/powerbot/script/rt6/Hud$Menu;
    //   77: getstatic 68	org/powerbot/script/rt6/Hud$Menu:NONE	Lorg/powerbot/script/rt6/Hud$Menu;
    //   80: if_acmpne +7 -> 87
    //   83: goto +12 -> 95
    //   86: athrow
    //   87: aload_3
    //   88: iload_2
    //   89: aload 5
    //   91: iinc 2 1
    //   94: aastore
    //   95: iinc 4 1
    //   98: iload 4
    //   100: goto -79 -> 21
    //   103: aload_3
    //   104: iload_2
    //   105: invokestatic 74	java/util/Arrays:copyOf	([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   108: checkcast 76	[Lorg/powerbot/script/rt6/Hud$Window;
    //   111: dup
    //   112: astore_3
    //   113: arraylength
    //   114: iconst_1
    //   115: dup
    //   116: dup
    //   117: pop2
    //   118: if_icmpge +4 -> 122
    //   121: return
    //   122: iload_1
    //   123: ifeq +17 -> 140
    //   126: iconst_0
    //   127: iconst_1
    //   128: dup
    //   129: pop2
    //   130: iconst_3
    //   131: iconst_1
    //   132: dup
    //   133: pop2
    //   134: invokestatic 82	org/powerbot/script/Random:nextInt	(II)I
    //   137: goto +7 -> 144
    //   140: iconst_2
    //   141: iconst_1
    //   142: dup
    //   143: pop2
    //   144: istore 4
    //   146: iload 4
    //   148: iconst_4
    //   149: iconst_1
    //   150: dup
    //   151: pop2
    //   152: if_icmpge +57 -> 209
    //   155: iconst_0
    //   156: iconst_1
    //   157: dup
    //   158: pop2
    //   159: aload_3
    //   160: dup_x1
    //   161: arraylength
    //   162: invokestatic 82	org/powerbot/script/Random:nextInt	(II)I
    //   165: aaload
    //   166: astore 5
    //   168: aload_0
    //   169: getfield 47	org/powerbot/bot/rt6/WindowPattern:ctx	Lorg/powerbot/script/ClientContext;
    //   172: checkcast 49	org/powerbot/script/rt6/ClientContext
    //   175: getfield 53	org/powerbot/script/rt6/ClientContext:hud	Lorg/powerbot/script/rt6/Hud;
    //   178: aload 5
    //   180: invokevirtual 85	org/powerbot/script/rt6/Hud:open	(Lorg/powerbot/script/rt6/Hud$Window;)Z
    //   183: ifne +4 -> 187
    //   186: return
    //   187: iload_1
    //   188: ifeq +13 -> 201
    //   191: sipush 1200
    //   194: iconst_1
    //   195: dup
    //   196: pop2
    //   197: invokestatic 91	org/powerbot/script/Condition:sleep	(I)I
    //   200: pop
    //   201: iinc 4 1
    //   204: iload 4
    //   206: goto -58 -> 148
    //   209: return
    // Line number table:
    //   Java source line #18	-> byte code offset #0
    //   Java source line #20	-> byte code offset #5
    //   Java source line #21	-> byte code offset #10
    //   Java source line #22	-> byte code offset #14
    //   Java source line #23	-> byte code offset #26
    //   Java source line #24	-> byte code offset #32
    //   Java source line #25	-> byte code offset #68
    //   Java source line #27	-> byte code offset #72
    //   Java source line #28	-> byte code offset #83
    //   Java source line #31	-> byte code offset #87
    //   Java source line #22	-> byte code offset #95
    //   Java source line #33	-> byte code offset #103
    //   Java source line #34	-> byte code offset #113
    //   Java source line #35	-> byte code offset #121
    //   Java source line #38	-> byte code offset #122
    //   Java source line #39	-> byte code offset #155
    //   Java source line #40	-> byte code offset #168
    //   Java source line #41	-> byte code offset #186
    //   Java source line #44	-> byte code offset #187
    //   Java source line #45	-> byte code offset #191
    //   Java source line #38	-> byte code offset #201
    //   Java source line #48	-> byte code offset #209
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	210	0	a	WindowPattern
  }
}
