package org.powerbot.bot.rt4;

import java.util.concurrent.atomic.AtomicInteger;
import org.powerbot.script.PollingScript;
import org.powerbot.script.rt4.BasicQuery;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Npc;

public class RandomEvents extends PollingScript<ClientContext>
{
  public RandomEvents()
  {
    int tmp10_9 = 1;tmp10_9;3.set(tmp10_9);
  }
  
  private boolean jdMethod_this() {
    if ((ctx).input.blocking()) && (!ctx).properties.getProperty(HashTable.jdMethod_this("y~e{drninql%{blj}gz"), "").equals(HashTable.jdMethod_this("m~z")))) {
      1; int tmp77_76 = 1;tmp77_76; int tmp79_77 = tmp77_76; int tmp82_81 = 1;tmp82_81;0[tmp82_81] = HashTable.jdMethod_this("[blfvxl");
      



      if (!((BasicQuery)tmp79_77.action(tmp79_77).select(new org.powerbot.script.Filter()
      {
        public boolean accept(Npc a) {
          return a.interacting().equals(jdMethod_thisjdField_void)).players.local());
        }
      }))
      



        .isEmpty()) { int tmp114_113 = 1; int tmp115_114 = tmp114_113;tmp115_114;return tmp115_114;throw tmp114_113; } } int tmp121_120 = 1;tmp121_120;return tmp121_120;
  }
  
  /* Error */
  public void poll()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 108	org/powerbot/bot/rt4/RandomEvents:this	()Z
    //   4: ifne +27 -> 31
    //   7: getstatic 112	org/powerbot/bot/rt4/RandomEvents:threshold	Ljava/util/NavigableSet;
    //   10: aload_0
    //   11: invokeinterface 117 2 0
    //   16: ifeq +13 -> 29
    //   19: getstatic 112	org/powerbot/bot/rt4/RandomEvents:threshold	Ljava/util/NavigableSet;
    //   22: aload_0
    //   23: invokeinterface 120 2 0
    //   28: pop
    //   29: return
    //   30: athrow
    //   31: getstatic 112	org/powerbot/bot/rt4/RandomEvents:threshold	Ljava/util/NavigableSet;
    //   34: aload_0
    //   35: invokeinterface 117 2 0
    //   40: ifne +13 -> 53
    //   43: getstatic 112	org/powerbot/bot/rt4/RandomEvents:threshold	Ljava/util/NavigableSet;
    //   46: aload_0
    //   47: invokeinterface 123 2 0
    //   52: pop
    //   53: aload_0
    //   54: getfield 32	org/powerbot/bot/rt4/RandomEvents:ctx	Lorg/powerbot/script/ClientContext;
    //   57: checkcast 34	org/powerbot/script/rt4/ClientContext
    //   60: getfield 127	org/powerbot/script/rt4/ClientContext:inventory	Lorg/powerbot/script/rt4/Inventory;
    //   63: invokevirtual 133	org/powerbot/script/rt4/Inventory:selectedItemIndex	()I
    //   66: iflt +20 -> 86
    //   69: aload_0
    //   70: getfield 32	org/powerbot/bot/rt4/RandomEvents:ctx	Lorg/powerbot/script/ClientContext;
    //   73: checkcast 34	org/powerbot/script/rt4/ClientContext
    //   76: getfield 127	org/powerbot/script/rt4/ClientContext:inventory	Lorg/powerbot/script/rt4/Inventory;
    //   79: invokevirtual 137	org/powerbot/script/rt4/Inventory:selectedItem	()Lorg/powerbot/script/rt4/Item;
    //   82: invokevirtual 142	org/powerbot/script/rt4/Item:click	()Z
    //   85: pop
    //   86: aload_0
    //   87: getfield 32	org/powerbot/bot/rt4/RandomEvents:ctx	Lorg/powerbot/script/ClientContext;
    //   90: checkcast 34	org/powerbot/script/rt4/ClientContext
    //   93: getfield 74	org/powerbot/script/rt4/ClientContext:npcs	Lorg/powerbot/script/rt4/Npcs;
    //   96: invokevirtual 145	org/powerbot/script/rt4/Npcs:poll	()Ljava/lang/Object;
    //   99: checkcast 147	org/powerbot/script/rt4/Npc
    //   102: astore_1
    //   103: aload_0
    //   104: getfield 32	org/powerbot/bot/rt4/RandomEvents:ctx	Lorg/powerbot/script/ClientContext;
    //   107: checkcast 34	org/powerbot/script/rt4/ClientContext
    //   110: getfield 38	org/powerbot/script/rt4/ClientContext:input	Lorg/powerbot/script/Input;
    //   113: aload_1
    //   114: invokevirtual 151	org/powerbot/script/rt4/Npc:nextPoint	()Ljava/awt/Point;
    //   117: invokevirtual 155	org/powerbot/script/Input:move	(Ljava/awt/Point;)Z
    //   120: ifeq +89 -> 209
    //   123: aload_0
    //   124: getfield 32	org/powerbot/bot/rt4/RandomEvents:ctx	Lorg/powerbot/script/ClientContext;
    //   127: checkcast 34	org/powerbot/script/rt4/ClientContext
    //   130: getfield 159	org/powerbot/script/rt4/ClientContext:menu	Lorg/powerbot/script/rt4/Menu;
    //   133: invokevirtual 165	org/powerbot/script/rt4/Menu:commands	()[Lorg/powerbot/script/MenuCommand;
    //   136: dup
    //   137: astore_2
    //   138: arraylength
    //   139: istore_3
    //   140: iconst_0
    //   141: iconst_1
    //   142: dup
    //   143: pop2
    //   144: dup
    //   145: istore 4
    //   147: iload_3
    //   148: if_icmpge +61 -> 209
    //   151: aload_2
    //   152: iload 4
    //   154: aaload
    //   155: getfield 171	org/powerbot/script/MenuCommand:option	Ljava/lang/String;
    //   158: ldc -83
    //   160: invokestatic 54	org/powerbot/bot/rt4/HashTable:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   163: invokevirtual 176	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   166: ifne +7 -> 173
    //   169: goto +32 -> 201
    //   172: athrow
    //   173: aload_0
    //   174: getfield 32	org/powerbot/bot/rt4/RandomEvents:ctx	Lorg/powerbot/script/ClientContext;
    //   177: checkcast 34	org/powerbot/script/rt4/ClientContext
    //   180: getfield 180	org/powerbot/script/rt4/ClientContext:widgets	Lorg/powerbot/script/rt4/Widgets;
    //   183: sipush 219
    //   186: iconst_1
    //   187: dup
    //   188: pop2
    //   189: bipush 30
    //   191: iconst_1
    //   192: dup
    //   193: pop2
    //   194: invokevirtual 186	org/powerbot/script/rt4/Widgets:component	(II)Lorg/powerbot/script/rt4/Component;
    //   197: invokevirtual 189	org/powerbot/script/rt4/Component:click	()Z
    //   200: pop
    //   201: iinc 4 1
    //   204: iload 4
    //   206: goto -59 -> 147
    //   209: aload_1
    //   210: iconst_0
    //   211: iconst_1
    //   212: dup
    //   213: pop2
    //   214: ldc 90
    //   216: invokestatic 54	org/powerbot/bot/rt4/HashTable:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   219: invokevirtual 193	org/powerbot/script/rt4/Npc:interact	(ZLjava/lang/String;)Z
    //   222: ifeq +27 -> 249
    //   225: new 8	org/powerbot/bot/rt4/RandomEvents$2
    //   228: dup
    //   229: aload_0
    //   230: aload_1
    //   231: invokespecial 196	org/powerbot/bot/rt4/RandomEvents$2:<init>	(Lorg/powerbot/bot/rt4/RandomEvents;Lorg/powerbot/script/rt4/Npc;)V
    //   234: sipush 300
    //   237: iconst_1
    //   238: dup
    //   239: pop2
    //   240: bipush 12
    //   242: iconst_1
    //   243: dup
    //   244: pop2
    //   245: invokestatic 202	org/powerbot/script/Condition:wait	(Ljava/util/concurrent/Callable;II)Z
    //   248: pop
    //   249: return
    // Line number table:
    //   Java source line #28	-> byte code offset #0
    //   Java source line #29	-> byte code offset #7
    //   Java source line #30	-> byte code offset #19
    //   Java source line #32	-> byte code offset #29
    //   Java source line #34	-> byte code offset #31
    //   Java source line #35	-> byte code offset #43
    //   Java source line #38	-> byte code offset #53
    //   Java source line #39	-> byte code offset #69
    //   Java source line #42	-> byte code offset #86
    //   Java source line #43	-> byte code offset #103
    //   Java source line #44	-> byte code offset #123
    //   Java source line #45	-> byte code offset #155
    //   Java source line #46	-> byte code offset #169
    //   Java source line #48	-> byte code offset #173
    //   Java source line #44	-> byte code offset #201
    //   Java source line #51	-> byte code offset #209
    //   Java source line #52	-> byte code offset #225
    //   Java source line #59	-> byte code offset #249
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	250	0	a	RandomEvents
  }
}
