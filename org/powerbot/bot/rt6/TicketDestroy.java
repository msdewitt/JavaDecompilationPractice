package org.powerbot.bot.rt6;

import org.powerbot.script.Condition.Check;
import org.powerbot.script.PollingScript;
import org.powerbot.script.rt6.ClientContext;
import org.powerbot.script.rt6.Item;
import org.powerbot.script.rt6.Widget;

public class TicketDestroy
  extends PollingScript<ClientContext>
{
  public TicketDestroy() {}
  
  /* Error */
  public void poll()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 26	org/powerbot/bot/rt6/TicketDestroy:ctx	Lorg/powerbot/script/ClientContext;
    //   4: checkcast 28	org/powerbot/script/rt6/ClientContext
    //   7: getfield 32	org/powerbot/script/rt6/ClientContext:properties	Ljava/util/Properties;
    //   10: ldc 34
    //   12: invokestatic 40	org/powerbot/bot/cache/Block:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   15: ldc 42
    //   17: invokevirtual 48	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   20: ldc 50
    //   22: invokestatic 53	org/powerbot/util/prn:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   25: invokevirtual 59	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   28: ifeq +5 -> 33
    //   31: return
    //   32: athrow
    //   33: aload_0
    //   34: getfield 26	org/powerbot/bot/rt6/TicketDestroy:ctx	Lorg/powerbot/script/ClientContext;
    //   37: checkcast 28	org/powerbot/script/rt6/ClientContext
    //   40: getfield 63	org/powerbot/script/rt6/ClientContext:backpack	Lorg/powerbot/script/rt6/Backpack;
    //   43: invokevirtual 69	org/powerbot/script/rt6/Backpack:select	()Lorg/powerbot/script/AbstractQuery;
    //   46: checkcast 71	org/powerbot/script/rt6/ItemQuery
    //   49: getstatic 77	org/powerbot/script/rt6/Constants:TICKETDESTROY_ITEMS	[I
    //   52: invokevirtual 81	org/powerbot/script/rt6/ItemQuery:id	([I)Lorg/powerbot/script/rt6/ItemQuery;
    //   55: invokevirtual 84	org/powerbot/script/rt6/ItemQuery:poll	()Ljava/lang/Object;
    //   58: checkcast 86	org/powerbot/script/rt6/Item
    //   61: dup
    //   62: astore_1
    //   63: invokevirtual 90	org/powerbot/script/rt6/Item:valid	()Z
    //   66: ifeq +41 -> 107
    //   69: aload_0
    //   70: getfield 26	org/powerbot/bot/rt6/TicketDestroy:ctx	Lorg/powerbot/script/ClientContext;
    //   73: checkcast 28	org/powerbot/script/rt6/ClientContext
    //   76: getfield 94	org/powerbot/script/rt6/ClientContext:hud	Lorg/powerbot/script/rt6/Hud;
    //   79: getstatic 98	org/powerbot/script/rt6/Hud$Window:BACKPACK	Lorg/powerbot/script/rt6/Hud$Window;
    //   82: invokevirtual 102	org/powerbot/script/rt6/Hud:opened	(Lorg/powerbot/script/rt6/Hud$Window;)Z
    //   85: ifeq +22 -> 107
    //   88: aload_0
    //   89: getfield 26	org/powerbot/bot/rt6/TicketDestroy:ctx	Lorg/powerbot/script/ClientContext;
    //   92: checkcast 28	org/powerbot/script/rt6/ClientContext
    //   95: getfield 106	org/powerbot/script/rt6/ClientContext:players	Lorg/powerbot/script/rt6/Players;
    //   98: invokevirtual 112	org/powerbot/script/rt6/Players:local	()Lorg/powerbot/script/rt6/Player;
    //   101: invokevirtual 117	org/powerbot/script/rt6/Player:idle	()Z
    //   104: ifne +16 -> 120
    //   107: aload_0
    //   108: getfield 121	org/powerbot/bot/rt6/TicketDestroy:priority	Ljava/util/concurrent/atomic/AtomicInteger;
    //   111: iconst_0
    //   112: iconst_1
    //   113: dup
    //   114: pop2
    //   115: invokevirtual 127	java/util/concurrent/atomic/AtomicInteger:set	(I)V
    //   118: return
    //   119: athrow
    //   120: aload_0
    //   121: dup
    //   122: getfield 121	org/powerbot/bot/rt6/TicketDestroy:priority	Ljava/util/concurrent/atomic/AtomicInteger;
    //   125: iconst_3
    //   126: iconst_1
    //   127: dup
    //   128: pop2
    //   129: invokevirtual 127	java/util/concurrent/atomic/AtomicInteger:set	(I)V
    //   132: getfield 26	org/powerbot/bot/rt6/TicketDestroy:ctx	Lorg/powerbot/script/ClientContext;
    //   135: checkcast 28	org/powerbot/script/rt6/ClientContext
    //   138: getfield 63	org/powerbot/script/rt6/ClientContext:backpack	Lorg/powerbot/script/rt6/Backpack;
    //   141: aload_1
    //   142: invokevirtual 131	org/powerbot/script/rt6/Backpack:scroll	(Lorg/powerbot/script/rt6/Displayable;)Z
    //   145: ifne +4 -> 149
    //   148: return
    //   149: aload_0
    //   150: getfield 26	org/powerbot/bot/rt6/TicketDestroy:ctx	Lorg/powerbot/script/ClientContext;
    //   153: checkcast 28	org/powerbot/script/rt6/ClientContext
    //   156: getfield 135	org/powerbot/script/rt6/ClientContext:varpbits	Lorg/powerbot/script/rt6/Varpbits;
    //   159: sipush 1448
    //   162: iconst_1
    //   163: dup
    //   164: pop2
    //   165: invokevirtual 141	org/powerbot/script/rt6/Varpbits:varpbit	(I)I
    //   168: ldc -114
    //   170: iand
    //   171: bipush 8
    //   173: iconst_1
    //   174: dup
    //   175: pop2
    //   176: iushr
    //   177: aload_1
    //   178: invokevirtual 145	org/powerbot/script/rt6/Item:id	()I
    //   181: getstatic 77	org/powerbot/script/rt6/Constants:TICKETDESTROY_ITEMS	[I
    //   184: iconst_0
    //   185: iconst_1
    //   186: dup
    //   187: pop2
    //   188: iaload
    //   189: if_icmpne +11 -> 200
    //   192: bipush 10
    //   194: iconst_1
    //   195: dup
    //   196: pop2
    //   197: goto +8 -> 205
    //   200: bipush 9
    //   202: iconst_1
    //   203: dup
    //   204: pop2
    //   205: if_icmpge +14 -> 219
    //   208: aload_1
    //   209: ldc -109
    //   211: invokestatic 40	org/powerbot/bot/cache/Block:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   214: invokevirtual 151	org/powerbot/script/rt6/Item:interact	(Ljava/lang/String;)Z
    //   217: pop
    //   218: return
    //   219: aload_1
    //   220: ldc -103
    //   222: invokestatic 53	org/powerbot/util/prn:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   225: invokevirtual 151	org/powerbot/script/rt6/Item:interact	(Ljava/lang/String;)Z
    //   228: ifne +4 -> 232
    //   231: return
    //   232: aload_0
    //   233: getfield 26	org/powerbot/bot/rt6/TicketDestroy:ctx	Lorg/powerbot/script/ClientContext;
    //   236: checkcast 28	org/powerbot/script/rt6/ClientContext
    //   239: getfield 157	org/powerbot/script/rt6/ClientContext:widgets	Lorg/powerbot/script/rt6/Widgets;
    //   242: sipush 1183
    //   245: iconst_1
    //   246: dup
    //   247: pop2
    //   248: invokevirtual 163	org/powerbot/script/rt6/Widgets:widget	(I)Lorg/powerbot/script/rt6/Widget;
    //   251: astore_2
    //   252: new 10	org/powerbot/bot/rt6/TicketDestroy$1
    //   255: dup
    //   256: aload_0
    //   257: aload_2
    //   258: invokespecial 166	org/powerbot/bot/rt6/TicketDestroy$1:<init>	(Lorg/powerbot/bot/rt6/TicketDestroy;Lorg/powerbot/script/rt6/Widget;)V
    //   261: invokestatic 172	org/powerbot/script/Condition:wait	(Ljava/util/concurrent/Callable;)Z
    //   264: ifne +4 -> 268
    //   267: return
    //   268: aconst_null
    //   269: astore_3
    //   270: aload_2
    //   271: invokevirtual 178	org/powerbot/script/rt6/Widget:components	()[Lorg/powerbot/script/rt6/Component;
    //   274: dup
    //   275: astore_2
    //   276: arraylength
    //   277: istore 4
    //   279: iconst_0
    //   280: iconst_1
    //   281: dup
    //   282: pop2
    //   283: dup
    //   284: istore 5
    //   286: iload 4
    //   288: if_icmpge +50 -> 338
    //   291: aload_2
    //   292: iload 5
    //   294: aaload
    //   295: dup
    //   296: astore 6
    //   298: invokevirtual 183	org/powerbot/script/rt6/Component:visible	()Z
    //   301: ifeq +29 -> 330
    //   304: aload 6
    //   306: invokevirtual 187	org/powerbot/script/rt6/Component:tooltip	()Ljava/lang/String;
    //   309: invokevirtual 190	java/lang/String:trim	()Ljava/lang/String;
    //   312: ldc -64
    //   314: invokestatic 40	org/powerbot/bot/cache/Block:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   317: invokevirtual 195	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   320: ifeq +10 -> 330
    //   323: aload 6
    //   325: dup
    //   326: astore_3
    //   327: goto +12 -> 339
    //   330: iinc 5 1
    //   333: iload 5
    //   335: goto -49 -> 286
    //   338: aload_3
    //   339: ifnull +34 -> 373
    //   342: aload_3
    //   343: ldc -103
    //   345: invokestatic 53	org/powerbot/util/prn:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   348: invokevirtual 196	org/powerbot/script/rt6/Component:interact	(Ljava/lang/String;)Z
    //   351: ifeq +22 -> 373
    //   354: new 8	org/powerbot/bot/rt6/TicketDestroy$2
    //   357: dup
    //   358: aload_0
    //   359: aload_1
    //   360: invokespecial 199	org/powerbot/bot/rt6/TicketDestroy$2:<init>	(Lorg/powerbot/bot/rt6/TicketDestroy;Lorg/powerbot/script/rt6/Item;)V
    //   363: sipush 175
    //   366: iconst_1
    //   367: dup
    //   368: pop2
    //   369: invokestatic 202	org/powerbot/script/Condition:wait	(Ljava/util/concurrent/Callable;I)Z
    //   372: pop
    //   373: return
    // Line number table:
    //   Java source line #16	-> byte code offset #0
    //   Java source line #17	-> byte code offset #31
    //   Java source line #19	-> byte code offset #33
    //   Java source line #20	-> byte code offset #63
    //   Java source line #21	-> byte code offset #107
    //   Java source line #22	-> byte code offset #118
    //   Java source line #24	-> byte code offset #120
    //   Java source line #25	-> byte code offset #132
    //   Java source line #26	-> byte code offset #148
    //   Java source line #29	-> byte code offset #149
    //   Java source line #30	-> byte code offset #208
    //   Java source line #31	-> byte code offset #218
    //   Java source line #33	-> byte code offset #219
    //   Java source line #34	-> byte code offset #231
    //   Java source line #37	-> byte code offset #232
    //   Java source line #38	-> byte code offset #252
    //   Java source line #44	-> byte code offset #267
    //   Java source line #47	-> byte code offset #268
    //   Java source line #48	-> byte code offset #270
    //   Java source line #49	-> byte code offset #298
    //   Java source line #50	-> byte code offset #323
    //   Java source line #51	-> byte code offset #327
    //   Java source line #48	-> byte code offset #330
    //   Java source line #54	-> byte code offset #338
    //   Java source line #55	-> byte code offset #354
    //   Java source line #62	-> byte code offset #373
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	374	0	a	TicketDestroy
  }
}
