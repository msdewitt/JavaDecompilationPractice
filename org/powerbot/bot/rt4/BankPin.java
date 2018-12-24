package org.powerbot.bot.rt4;

import java.util.concurrent.atomic.AtomicInteger;
import org.powerbot.misc.GameAccounts;
import org.powerbot.misc.GameAccounts.Account;
import org.powerbot.script.Condition.Check;
import org.powerbot.script.PollingScript;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Component;

public class BankPin extends PollingScript<ClientContext>
{
  private int jdField_void;
  
  public BankPin()
  {
    int tmp8_7 = 1;tmp8_7;0jdField_void = tmp8_7; int tmp18_17 = 1;tmp18_17;2.set(tmp18_17);
  }
  
  /* Error */
  public void poll()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 43	org/powerbot/bot/rt4/BankPin:ctx	Lorg/powerbot/script/ClientContext;
    //   4: checkcast 45	org/powerbot/script/rt4/ClientContext
    //   7: getfield 49	org/powerbot/script/rt4/ClientContext:widgets	Lorg/powerbot/script/rt4/Widgets;
    //   10: sipush 213
    //   13: iconst_1
    //   14: dup
    //   15: pop2
    //   16: invokevirtual 55	org/powerbot/script/rt4/Widgets:widget	(I)Lorg/powerbot/script/rt4/Widget;
    //   19: invokevirtual 61	org/powerbot/script/rt4/Widget:valid	()Z
    //   22: ifne +27 -> 49
    //   25: getstatic 65	org/powerbot/bot/rt4/BankPin:threshold	Ljava/util/NavigableSet;
    //   28: aload_0
    //   29: invokeinterface 71 2 0
    //   34: ifeq +13 -> 47
    //   37: getstatic 65	org/powerbot/bot/rt4/BankPin:threshold	Ljava/util/NavigableSet;
    //   40: aload_0
    //   41: invokeinterface 74 2 0
    //   46: pop
    //   47: return
    //   48: athrow
    //   49: getstatic 65	org/powerbot/bot/rt4/BankPin:threshold	Ljava/util/NavigableSet;
    //   52: aload_0
    //   53: invokeinterface 71 2 0
    //   58: ifne +13 -> 71
    //   61: getstatic 65	org/powerbot/bot/rt4/BankPin:threshold	Ljava/util/NavigableSet;
    //   64: aload_0
    //   65: invokeinterface 77 2 0
    //   70: pop
    //   71: aload_0
    //   72: invokespecial 81	org/powerbot/bot/rt4/BankPin:this	()Ljava/lang/String;
    //   75: dup
    //   76: astore_1
    //   77: ifnonnull +20 -> 97
    //   80: aload_0
    //   81: getfield 43	org/powerbot/bot/rt4/BankPin:ctx	Lorg/powerbot/script/ClientContext;
    //   84: checkcast 45	org/powerbot/script/rt4/ClientContext
    //   87: getfield 85	org/powerbot/script/rt4/ClientContext:controller	Lorg/powerbot/script/Script$Controller;
    //   90: invokeinterface 88 1 0
    //   95: return
    //   96: athrow
    //   97: aload_0
    //   98: dup
    //   99: getfield 26	org/powerbot/bot/rt4/BankPin:void	I
    //   102: istore_2
    //   103: getfield 43	org/powerbot/bot/rt4/BankPin:ctx	Lorg/powerbot/script/ClientContext;
    //   106: checkcast 45	org/powerbot/script/rt4/ClientContext
    //   109: getfield 49	org/powerbot/script/rt4/ClientContext:widgets	Lorg/powerbot/script/rt4/Widgets;
    //   112: sipush 213
    //   115: iconst_1
    //   116: dup
    //   117: pop2
    //   118: invokevirtual 55	org/powerbot/script/rt4/Widgets:widget	(I)Lorg/powerbot/script/rt4/Widget;
    //   121: dup
    //   122: astore_3
    //   123: invokevirtual 92	org/powerbot/script/rt4/Widget:components	()[Lorg/powerbot/script/rt4/Component;
    //   126: dup
    //   127: astore 4
    //   129: arraylength
    //   130: istore 5
    //   132: iconst_0
    //   133: iconst_1
    //   134: dup
    //   135: pop2
    //   136: dup
    //   137: istore 6
    //   139: iload 5
    //   141: if_icmpge +191 -> 332
    //   144: aload 4
    //   146: iload 6
    //   148: aaload
    //   149: dup
    //   150: astore 7
    //   152: invokevirtual 98	org/powerbot/script/rt4/Component:textColor	()I
    //   155: ifne +169 -> 324
    //   158: aload 7
    //   160: invokevirtual 101	org/powerbot/script/rt4/Component:width	()I
    //   163: bipush 64
    //   165: iconst_1
    //   166: dup
    //   167: pop2
    //   168: if_icmpne +156 -> 324
    //   171: aload 7
    //   173: invokevirtual 104	org/powerbot/script/rt4/Component:height	()I
    //   176: bipush 64
    //   178: iconst_1
    //   179: dup
    //   180: pop2
    //   181: if_icmpne +143 -> 324
    //   184: aload 7
    //   186: invokevirtual 107	org/powerbot/script/rt4/Component:componentCount	()I
    //   189: iconst_2
    //   190: iconst_1
    //   191: dup
    //   192: pop2
    //   193: if_icmpne +131 -> 324
    //   196: aload 7
    //   198: invokevirtual 110	org/powerbot/script/rt4/Component:visible	()Z
    //   201: ifne +6 -> 207
    //   204: goto +120 -> 324
    //   207: aload 7
    //   209: iconst_1
    //   210: dup
    //   211: dup
    //   212: pop2
    //   213: invokevirtual 114	org/powerbot/script/rt4/Component:component	(I)Lorg/powerbot/script/rt4/Component;
    //   216: dup
    //   217: astore 8
    //   219: invokevirtual 110	org/powerbot/script/rt4/Component:visible	()Z
    //   222: ifne +6 -> 228
    //   225: goto +99 -> 324
    //   228: aload 8
    //   230: invokevirtual 117	org/powerbot/script/rt4/Component:text	()Ljava/lang/String;
    //   233: astore 9
    //   235: new 119	java/lang/StringBuilder
    //   238: aload 9
    //   240: dup_x1
    //   241: dup
    //   242: pop2
    //   243: dup
    //   244: invokespecial 120	java/lang/StringBuilder:<init>	()V
    //   247: ldc 122
    //   249: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   252: aload_1
    //   253: aload_0
    //   254: getfield 26	org/powerbot/bot/rt4/BankPin:void	I
    //   257: iconst_4
    //   258: iconst_1
    //   259: dup
    //   260: pop2
    //   261: irem
    //   262: invokevirtual 132	java/lang/String:charAt	(I)C
    //   265: invokevirtual 135	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   268: invokevirtual 138	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   271: invokevirtual 141	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   274: ifeq +50 -> 324
    //   277: aload 7
    //   279: invokevirtual 144	org/powerbot/script/rt4/Component:click	()Z
    //   282: ifeq +42 -> 324
    //   285: aload_0
    //   286: dup
    //   287: getfield 26	org/powerbot/bot/rt4/BankPin:void	I
    //   290: iconst_1
    //   291: dup
    //   292: dup
    //   293: pop2
    //   294: iadd
    //   295: putfield 26	org/powerbot/bot/rt4/BankPin:void	I
    //   298: new 8	org/powerbot/bot/rt4/BankPin$1
    //   301: dup
    //   302: aload_0
    //   303: aload 8
    //   305: aload 9
    //   307: invokespecial 147	org/powerbot/bot/rt4/BankPin$1:<init>	(Lorg/powerbot/bot/rt4/BankPin;Lorg/powerbot/script/rt4/Component;Ljava/lang/String;)V
    //   310: bipush 100
    //   312: iconst_1
    //   313: dup
    //   314: pop2
    //   315: bipush 20
    //   317: iconst_1
    //   318: dup
    //   319: pop2
    //   320: invokestatic 153	org/powerbot/script/Condition:wait	(Ljava/util/concurrent/Callable;II)Z
    //   323: pop
    //   324: iinc 6 1
    //   327: iload 6
    //   329: goto -190 -> 139
    //   332: iload_2
    //   333: aload_0
    //   334: getfield 26	org/powerbot/bot/rt4/BankPin:void	I
    //   337: if_icmpne +40 -> 377
    //   340: aload_3
    //   341: iconst_0
    //   342: iconst_1
    //   343: dup
    //   344: pop2
    //   345: aload_0
    //   346: getfield 43	org/powerbot/bot/rt4/BankPin:ctx	Lorg/powerbot/script/ClientContext;
    //   349: checkcast 45	org/powerbot/script/rt4/ClientContext
    //   352: getfield 49	org/powerbot/script/rt4/ClientContext:widgets	Lorg/powerbot/script/rt4/Widgets;
    //   355: sipush 213
    //   358: iconst_1
    //   359: dup
    //   360: pop2
    //   361: invokevirtual 55	org/powerbot/script/rt4/Widgets:widget	(I)Lorg/powerbot/script/rt4/Widget;
    //   364: invokevirtual 154	org/powerbot/script/rt4/Widget:componentCount	()I
    //   367: invokestatic 160	org/powerbot/script/Random:nextInt	(II)I
    //   370: invokevirtual 161	org/powerbot/script/rt4/Widget:component	(I)Lorg/powerbot/script/rt4/Component;
    //   373: invokevirtual 164	org/powerbot/script/rt4/Component:hover	()Z
    //   376: pop
    //   377: return
    // Line number table:
    //   Java source line #21	-> byte code offset #0
    //   Java source line #22	-> byte code offset #25
    //   Java source line #23	-> byte code offset #37
    //   Java source line #25	-> byte code offset #47
    //   Java source line #27	-> byte code offset #49
    //   Java source line #28	-> byte code offset #61
    //   Java source line #31	-> byte code offset #71
    //   Java source line #32	-> byte code offset #77
    //   Java source line #33	-> byte code offset #80
    //   Java source line #34	-> byte code offset #95
    //   Java source line #37	-> byte code offset #97
    //   Java source line #38	-> byte code offset #103
    //   Java source line #40	-> byte code offset #123
    //   Java source line #41	-> byte code offset #152
    //   Java source line #42	-> byte code offset #204
    //   Java source line #44	-> byte code offset #207
    //   Java source line #45	-> byte code offset #219
    //   Java source line #46	-> byte code offset #225
    //   Java source line #49	-> byte code offset #228
    //   Java source line #50	-> byte code offset #235
    //   Java source line #51	-> byte code offset #277
    //   Java source line #52	-> byte code offset #285
    //   Java source line #53	-> byte code offset #298
    //   Java source line #40	-> byte code offset #324
    //   Java source line #61	-> byte code offset #332
    //   Java source line #62	-> byte code offset #340
    //   Java source line #64	-> byte code offset #377
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	378	0	a	BankPin
  }
  
  private String jdMethod_this()
  {
    Object localObject;
    if ((localObject = GameAccounts.getInstance().get(ctx).properties.getProperty(org.powerbot.script.rt4.HintArrow.jdMethod_this("\035t\026r\0375\020x\022t\004u\0055\004h\024i\037z\034~"), ""))) != null)
    {
      if ((localObject = ((GameAccounts.Account)localObject).getPIN()) != null) { int tmp46_45 = 1;tmp46_45; if (4 == tmp46_45) {
          return localObject;throw ((String)localObject).length();
        }
      } }
    return null;
  }
}
