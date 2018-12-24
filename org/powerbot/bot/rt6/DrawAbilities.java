package org.powerbot.bot.rt6;

import org.powerbot.script.PaintListener;
import org.powerbot.script.rt6.ClientAccessor;
import org.powerbot.script.rt6.ClientContext;





public class DrawAbilities
  extends ClientAccessor
  implements PaintListener
{
  public DrawAbilities(ClientContext a)
  {
    a.<init>(a);
  }
  
  /* Error */
  public void repaint(java.awt.Graphics a)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 20	org/powerbot/bot/rt6/DrawAbilities:ctx	Lorg/powerbot/script/ClientContext;
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
    //   26: invokestatic 42	org/powerbot/bot/rt6/NodeQueue:this	(Ljava/lang/Object;)Ljava/lang/String;
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
    //   51: getfield 20	org/powerbot/bot/rt6/DrawAbilities:ctx	Lorg/powerbot/script/ClientContext;
    //   54: checkcast 22	org/powerbot/script/rt6/ClientContext
    //   57: getfield 65	org/powerbot/script/rt6/ClientContext:combatBar	Lorg/powerbot/script/rt6/CombatBar;
    //   60: invokevirtual 71	org/powerbot/script/rt6/CombatBar:actions	()[Lorg/powerbot/script/rt6/Action;
    //   63: dup
    //   64: astore_2
    //   65: arraylength
    //   66: istore_3
    //   67: iconst_0
    //   68: iconst_1
    //   69: dup
    //   70: pop2
    //   71: dup
    //   72: istore 4
    //   74: iload_3
    //   75: if_icmpge +86 -> 161
    //   78: aload_2
    //   79: iload 4
    //   81: aaload
    //   82: dup
    //   83: astore 5
    //   85: invokevirtual 77	org/powerbot/script/rt6/Action:component	()Lorg/powerbot/script/rt6/Component;
    //   88: invokevirtual 83	org/powerbot/script/rt6/Component:screenPoint	()Ljava/awt/Point;
    //   91: astore 6
    //   93: new 85	java/lang/StringBuilder
    //   96: aload_1
    //   97: dup_x1
    //   98: dup
    //   99: pop2
    //   100: dup
    //   101: invokespecial 88	java/lang/StringBuilder:<init>	()V
    //   104: aload 5
    //   106: invokevirtual 92	org/powerbot/script/rt6/Action:id	()I
    //   109: invokevirtual 96	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   112: ldc 98
    //   114: invokestatic 101	z/auX:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   117: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: aload 5
    //   122: invokevirtual 108	org/powerbot/script/rt6/Action:bind	()Ljava/lang/String;
    //   125: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: ldc 110
    //   130: invokestatic 42	org/powerbot/bot/rt6/NodeQueue:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   133: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: invokevirtual 113	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   139: aload 6
    //   141: dup
    //   142: getfield 119	java/awt/Point:x	I
    //   145: iinc 4 1
    //   148: swap
    //   149: getfield 122	java/awt/Point:y	I
    //   152: invokevirtual 125	java/awt/Graphics:drawString	(Ljava/lang/String;II)V
    //   155: iload 4
    //   157: goto -83 -> 74
    //   160: athrow
    //   161: return
    // Line number table:
    //   Java source line #22	-> byte code offset #0
    //   Java source line #23	-> byte code offset #16
    //   Java source line #25	-> byte code offset #18
    //   Java source line #26	-> byte code offset #44
    //   Java source line #27	-> byte code offset #50
    //   Java source line #28	-> byte code offset #85
    //   Java source line #29	-> byte code offset #88
    //   Java source line #30	-> byte code offset #93
    //   Java source line #27	-> byte code offset #155
    //   Java source line #32	-> byte code offset #161
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	162	0	a	DrawAbilities
    //   0	162	1	a	java.awt.Graphics
  }
}
