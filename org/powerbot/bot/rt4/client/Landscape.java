package org.powerbot.bot.rt4.client;

import org.powerbot.bot.Reflector;

public class Landscape extends org.powerbot.bot.ReflectProxy
{
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public Landscape(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  /* Error */
  public Tile[][][] getTiles()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 27	org/powerbot/bot/rt4/client/Landscape:reflector	Lorg/powerbot/bot/Reflector;
    //   4: aload_0
    //   5: getstatic 29	org/powerbot/bot/rt4/client/Landscape:void	Lorg/powerbot/bot/Reflector$FieldCache;
    //   8: ldc 31
    //   10: invokevirtual 35	org/powerbot/bot/Reflector:access	(Lorg/powerbot/bot/ReflectProxy;Lorg/powerbot/bot/Reflector$FieldCache;Ljava/lang/Class;)Ljava/lang/Object;
    //   13: checkcast 31	[[[Ljava/lang/Object;
    //   16: dup
    //   17: astore_1
    //   18: ifnonnull +9 -> 27
    //   21: aconst_null
    //   22: checkcast 37	[[[Lorg/powerbot/bot/rt4/client/Tile;
    //   25: areturn
    //   26: athrow
    //   27: aload_1
    //   28: arraylength
    //   29: anewarray 39	[[Lorg/powerbot/bot/rt4/client/Tile;
    //   32: iconst_1
    //   33: dup
    //   34: pop2
    //   35: astore_2
    //   36: iconst_0
    //   37: iconst_1
    //   38: dup
    //   39: pop2
    //   40: dup
    //   41: istore_3
    //   42: aload_1
    //   43: arraylength
    //   44: if_icmpge +149 -> 193
    //   47: aload_1
    //   48: iload_3
    //   49: aaload
    //   50: dup
    //   51: astore 4
    //   53: ifnonnull +14 -> 67
    //   56: aload_2
    //   57: iload_3
    //   58: aconst_null
    //   59: checkcast 39	[[Lorg/powerbot/bot/rt4/client/Tile;
    //   62: aastore
    //   63: goto +123 -> 186
    //   66: athrow
    //   67: aload 4
    //   69: arraylength
    //   70: anewarray 41	[Lorg/powerbot/bot/rt4/client/Tile;
    //   73: iconst_1
    //   74: dup
    //   75: pop2
    //   76: astore 5
    //   78: iconst_0
    //   79: aload_2
    //   80: iload_3
    //   81: aload 5
    //   83: aastore
    //   84: iconst_1
    //   85: dup
    //   86: pop2
    //   87: dup
    //   88: istore 6
    //   90: aload 4
    //   92: arraylength
    //   93: if_icmpge +93 -> 186
    //   96: aload 4
    //   98: iload 6
    //   100: aaload
    //   101: dup
    //   102: astore 7
    //   104: ifnonnull +11 -> 115
    //   107: aload 5
    //   109: iload_3
    //   110: aconst_null
    //   111: aastore
    //   112: goto +66 -> 178
    //   115: aload 7
    //   117: arraylength
    //   118: anewarray 43	org/powerbot/bot/rt4/client/Tile
    //   121: iconst_1
    //   122: dup
    //   123: pop2
    //   124: astore 8
    //   126: iconst_0
    //   127: aload 5
    //   129: iload 6
    //   131: aload 8
    //   133: aastore
    //   134: iconst_1
    //   135: dup
    //   136: pop2
    //   137: dup
    //   138: istore 9
    //   140: aload 7
    //   142: arraylength
    //   143: if_icmpge +35 -> 178
    //   146: aload 8
    //   148: new 43	org/powerbot/bot/rt4/client/Tile
    //   151: iload 9
    //   153: dup_x1
    //   154: dup
    //   155: pop2
    //   156: dup
    //   157: aload_0
    //   158: getfield 27	org/powerbot/bot/rt4/client/Landscape:reflector	Lorg/powerbot/bot/Reflector;
    //   161: aload 7
    //   163: iload 9
    //   165: aaload
    //   166: invokespecial 44	org/powerbot/bot/rt4/client/Tile:<init>	(Lorg/powerbot/bot/Reflector;Ljava/lang/Object;)V
    //   169: iinc 9 1
    //   172: aastore
    //   173: iload 9
    //   175: goto -35 -> 140
    //   178: iinc 6 1
    //   181: iload 6
    //   183: goto -93 -> 90
    //   186: iinc 3 1
    //   189: iload_3
    //   190: goto -148 -> 42
    //   193: aload_2
    //   194: areturn
    // Line number table:
    //   Java source line #14	-> byte code offset #0
    //   Java source line #15	-> byte code offset #18
    //   Java source line #16	-> byte code offset #21
    //   Java source line #18	-> byte code offset #27
    //   Java source line #19	-> byte code offset #36
    //   Java source line #20	-> byte code offset #47
    //   Java source line #21	-> byte code offset #53
    //   Java source line #22	-> byte code offset #56
    //   Java source line #23	-> byte code offset #63
    //   Java source line #25	-> byte code offset #67
    //   Java source line #26	-> byte code offset #79
    //   Java source line #27	-> byte code offset #84
    //   Java source line #28	-> byte code offset #96
    //   Java source line #29	-> byte code offset #104
    //   Java source line #30	-> byte code offset #107
    //   Java source line #31	-> byte code offset #112
    //   Java source line #33	-> byte code offset #115
    //   Java source line #34	-> byte code offset #127
    //   Java source line #35	-> byte code offset #134
    //   Java source line #36	-> byte code offset #146
    //   Java source line #35	-> byte code offset #173
    //   Java source line #27	-> byte code offset #178
    //   Java source line #19	-> byte code offset #186
    //   Java source line #40	-> byte code offset #193
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	195	0	this	Landscape
  }
}
