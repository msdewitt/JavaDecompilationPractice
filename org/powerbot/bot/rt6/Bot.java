package org.powerbot.bot.rt6;

import java.util.TimerTask;
import org.powerbot.bot.AbstractBot;
import org.powerbot.bot.cache.CacheWorker;
import org.powerbot.gui.BotChrome;
import org.powerbot.script.rt6.ClientContext;








public final class Bot
  extends AbstractBot<ClientContext>
{
  static
  {
    int tmp6_5 = 1;tmp6_5;0.<init>(tmp6_5); } public static final CacheWorker CACHE_WORKER = new org/powerbot/bot/cache/CacheWorker;
  
  /* Error */
  protected void jdMethod_this(org.powerbot.bot.ReflectorSpec a)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 39	org/powerbot/bot/rt6/Bot:chrome	Lorg/powerbot/gui/BotChrome;
    //   4: getfield 45	org/powerbot/gui/BotChrome:target	Ljava/util/concurrent/atomic/AtomicReference;
    //   7: invokevirtual 51	java/util/concurrent/atomic/AtomicReference:get	()Ljava/lang/Object;
    //   10: checkcast 53	java/awt/Component
    //   13: invokevirtual 59	java/lang/Object:getClass	()Ljava/lang/Class;
    //   16: astore_2
    //   17: new 61	java/util/LinkedList
    //   20: dup
    //   21: invokespecial 62	java/util/LinkedList:<init>	()V
    //   24: astore_3
    //   25: aload_2
    //   26: invokevirtual 68	java/lang/Class:getDeclaredFields	()[Ljava/lang/reflect/Field;
    //   29: dup
    //   30: astore_2
    //   31: arraylength
    //   32: istore 4
    //   34: iconst_0
    //   35: iconst_1
    //   36: dup
    //   37: pop2
    //   38: dup
    //   39: istore 5
    //   41: iload 4
    //   43: if_icmpge +45 -> 88
    //   46: aload_2
    //   47: iload 5
    //   49: aaload
    //   50: dup
    //   51: astore 6
    //   53: invokevirtual 73	java/lang/reflect/Field:getType	()Ljava/lang/Class;
    //   56: invokevirtual 77	java/lang/Class:getName	()Ljava/lang/String;
    //   59: ldc 55
    //   61: invokevirtual 77	java/lang/Class:getName	()Ljava/lang/String;
    //   64: invokevirtual 83	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   67: ifeq +12 -> 79
    //   70: aload_3
    //   71: aload 6
    //   73: invokeinterface 88 2 0
    //   78: pop
    //   79: iinc 5 1
    //   82: iload 5
    //   84: goto -43 -> 41
    //   87: athrow
    //   88: aload_3
    //   89: invokeinterface 92 1 0
    //   94: iconst_1
    //   95: dup
    //   96: dup
    //   97: pop2
    //   98: if_icmpeq +16 -> 114
    //   101: getstatic 98	java/lang/System:out	Ljava/io/PrintStream;
    //   104: ldc 100
    //   106: invokestatic 105	org/powerbot/script/Input:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   109: invokevirtual 111	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   112: return
    //   113: athrow
    //   114: aload_3
    //   115: invokeinterface 114 1 0
    //   120: checkcast 70	java/lang/reflect/Field
    //   123: astore_2
    //   124: aconst_null
    //   125: aload_2
    //   126: iconst_1
    //   127: dup
    //   128: dup
    //   129: pop2
    //   130: invokevirtual 118	java/lang/reflect/Field:setAccessible	(Z)V
    //   133: astore 4
    //   135: iconst_0
    //   136: iconst_1
    //   137: dup
    //   138: pop2
    //   139: istore 5
    //   141: aload 4
    //   143: ifnonnull +75 -> 218
    //   146: iload 5
    //   148: bipush 10
    //   150: iconst_1
    //   151: dup
    //   152: pop2
    //   153: if_icmpge +65 -> 218
    //   156: aload_2
    //   157: dup
    //   158: invokevirtual 121	java/lang/reflect/Field:getModifiers	()I
    //   161: bipush 8
    //   163: iconst_1
    //   164: dup
    //   165: pop2
    //   166: iand
    //   167: bipush 8
    //   169: iconst_1
    //   170: dup
    //   171: pop2
    //   172: if_icmpne +7 -> 179
    //   175: aconst_null
    //   176: goto +13 -> 189
    //   179: aload_0
    //   180: getfield 39	org/powerbot/bot/rt6/Bot:chrome	Lorg/powerbot/gui/BotChrome;
    //   183: getfield 45	org/powerbot/gui/BotChrome:target	Ljava/util/concurrent/atomic/AtomicReference;
    //   186: invokevirtual 51	java/util/concurrent/atomic/AtomicReference:get	()Ljava/lang/Object;
    //   189: invokevirtual 124	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   192: astore 4
    //   194: goto +5 -> 199
    //   197: astore 6
    //   199: ldc2_w 125
    //   202: invokestatic 132	java/lang/Thread:sleep	(J)V
    //   205: goto +5 -> 210
    //   208: astore 6
    //   210: iinc 5 1
    //   213: aload 4
    //   215: goto -72 -> 143
    //   218: aload 4
    //   220: ifnonnull +15 -> 235
    //   223: getstatic 98	java/lang/System:out	Ljava/io/PrintStream;
    //   226: ldc -122
    //   228: invokestatic 137	org/powerbot/util/IOUtils:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   231: invokevirtual 111	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   234: return
    //   235: new 139	org/powerbot/bot/Reflector
    //   238: dup
    //   239: aload 4
    //   241: invokevirtual 59	java/lang/Object:getClass	()Ljava/lang/Class;
    //   244: invokevirtual 143	java/lang/Class:getClassLoader	()Ljava/lang/ClassLoader;
    //   247: aload_1
    //   248: invokespecial 146	org/powerbot/bot/Reflector:<init>	(Ljava/lang/ClassLoader;Lorg/powerbot/bot/ReflectorSpec;)V
    //   251: astore 5
    //   253: aload_0
    //   254: getfield 150	org/powerbot/bot/rt6/Bot:ctx	Lorg/powerbot/script/ClientContext;
    //   257: checkcast 27	org/powerbot/script/rt6/ClientContext
    //   260: new 152	org/powerbot/bot/rt6/client/Client
    //   263: dup
    //   264: aload 5
    //   266: aconst_null
    //   267: invokespecial 155	org/powerbot/bot/rt6/client/Client:<init>	(Lorg/powerbot/bot/Reflector;Ljava/lang/Object;)V
    //   270: invokevirtual 159	org/powerbot/script/rt6/ClientContext:client	(Lorg/powerbot/script/Client;)Lorg/powerbot/script/Client;
    //   273: pop
    //   274: aload_0
    //   275: getfield 150	org/powerbot/bot/rt6/Bot:ctx	Lorg/powerbot/script/ClientContext;
    //   278: checkcast 27	org/powerbot/script/rt6/ClientContext
    //   281: getfield 163	org/powerbot/script/rt6/ClientContext:chat	Lorg/powerbot/script/rt6/Chat;
    //   284: invokevirtual 168	org/powerbot/script/rt6/Chat:register	()V
    //   287: aload_0
    //   288: getfield 172	org/powerbot/bot/rt6/Bot:new	Ljava/util/Timer;
    //   291: new 8	org/powerbot/bot/rt6/Bot$1
    //   294: dup
    //   295: aload_0
    //   296: invokespecial 175	org/powerbot/bot/rt6/Bot$1:<init>	(Lorg/powerbot/bot/rt6/Bot;)V
    //   299: ldc2_w 176
    //   302: ldc2_w 178
    //   305: invokevirtual 185	java/util/Timer:scheduleAtFixedRate	(Ljava/util/TimerTask;JJ)V
    //   308: return
    // Line number table:
    //   Java source line #34	-> byte code offset #0
    //   Java source line #35	-> byte code offset #17
    //   Java source line #36	-> byte code offset #25
    //   Java source line #37	-> byte code offset #53
    //   Java source line #38	-> byte code offset #70
    //   Java source line #36	-> byte code offset #79
    //   Java source line #41	-> byte code offset #88
    //   Java source line #42	-> byte code offset #101
    //   Java source line #43	-> byte code offset #112
    //   Java source line #45	-> byte code offset #114
    //   Java source line #46	-> byte code offset #125
    //   Java source line #47	-> byte code offset #133
    //   Java source line #48	-> byte code offset #135
    //   Java source line #50	-> byte code offset #156
    //   Java source line #52	-> byte code offset #194
    //   Java source line #51	-> byte code offset #197
    //   Java source line #54	-> byte code offset #199
    //   Java source line #56	-> byte code offset #205
    //   Java source line #55	-> byte code offset #208
    //   Java source line #48	-> byte code offset #210
    //   Java source line #58	-> byte code offset #218
    //   Java source line #59	-> byte code offset #223
    //   Java source line #60	-> byte code offset #234
    //   Java source line #62	-> byte code offset #235
    //   Java source line #63	-> byte code offset #253
    //   Java source line #64	-> byte code offset #274
    //   Java source line #66	-> byte code offset #287
    //   Java source line #94	-> byte code offset #308
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	309	0	a	Bot
    //   0	309	1	a	org.powerbot.bot.ReflectorSpec
    //   16	141	2	localObject1	Object
    //   24	91	3	localLinkedList	java.util.LinkedList
    //   32	12	4	i	int
    //   133	107	4	localObject2	Object
    //   39	172	5	j	int
    //   251	14	5	localReflector	org.powerbot.bot.Reflector
    //   51	21	6	localObject3	Object
    //   197	1	6	localIllegalAccessException	IllegalAccessException
    //   197	1	6	localIllegalAccessException1	IllegalAccessException
    //   208	1	6	localInterruptedException	InterruptedException
    //   208	1	6	localInterruptedException1	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   156	194	197	java/lang/IllegalAccessException
    //   199	205	208	java/lang/InterruptedException
  }
  
  protected ClientContext jdMethod_this()
  {
    return ClientContext.newContext(a);
  }
  
  public Bot(BotChrome a) {}
}
