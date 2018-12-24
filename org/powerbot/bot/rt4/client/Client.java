package org.powerbot.bot.rt4.client;

import org.powerbot.bot.Reflector;
import org.powerbot.bot.Reflector.FieldCache;

public class Client extends org.powerbot.bot.ReflectProxy implements org.powerbot.script.Client
{
  private static final Reflector.FieldCache i = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_synchronized = new Reflector.FieldCache();
  private static final Reflector.FieldCache f = new Reflector.FieldCache();
  private static final Reflector.FieldCache H = new Reflector.FieldCache();
  private static final Reflector.FieldCache b = new Reflector.FieldCache();
  private static final Reflector.FieldCache d = new Reflector.FieldCache();
  private static final Reflector.FieldCache a = new Reflector.FieldCache();
  private static final Reflector.FieldCache A = new Reflector.FieldCache();
  private static final Reflector.FieldCache g = new Reflector.FieldCache();
  private static final Reflector.FieldCache h = new Reflector.FieldCache();
  private static final Reflector.FieldCache G = new Reflector.FieldCache();
  private static final Reflector.FieldCache C = new Reflector.FieldCache();
  private static final Reflector.FieldCache D = new Reflector.FieldCache();
  private static final Reflector.FieldCache F = new Reflector.FieldCache();
  private static final Reflector.FieldCache private = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_import = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_default = new Reflector.FieldCache();
  private static final Reflector.FieldCache volatile = new Reflector.FieldCache();
  private static final Reflector.FieldCache throws = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_implements = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_static = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_switch = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_throw = new Reflector.FieldCache();
  private static final Reflector.FieldCache strictfp = new Reflector.FieldCache();
  private static final Reflector.FieldCache native = new Reflector.FieldCache();
  private static final Reflector.FieldCache protected = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_instanceof = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_return = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_finally = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_package = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_assert = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_public = new Reflector.FieldCache();
  private static final Reflector.FieldCache transient = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_interface = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_extends = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_while = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_double = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_continue = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_abstract = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_boolean = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_this = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_class = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_float = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_do = new Reflector.FieldCache();
  private static final Reflector.FieldCache const = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_short = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_try = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_false = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_catch = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_goto = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_break = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_char = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_true = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_case = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_for = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_long = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_int = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_super = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_final = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_enum = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_else = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_if = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_null = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_byte = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_new = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_void = new Reflector.FieldCache();
  
  public Client(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public NodeDeque getProjectiles() {
    return new NodeDeque(reflector, reflector.access(this, void));
  }
  
  public boolean isMembers() {
    return reflector.accessBool(this, new);
  }
  
  public int getCameraX() {
    return reflector.accessInt(this, i);
  }
  
  public int getCameraY() {
    return reflector.accessInt(this, synchronized);
  }
  
  public int getCameraZ() {
    return reflector.accessInt(this, f);
  }
  
  public int getCameraYaw() {
    return reflector.accessInt(this, H);
  }
  
  public int getCameraPitch() {
    return reflector.accessInt(this, b);
  }
  
  public int getMinimapAngle() {
    return reflector.accessInt(this, d);
  }
  
  public Player getPlayer() {
    return new Player(reflector, reflector.access(this, a));
  }
  
  public Player[] getPlayers() {
    Object[] arrayOfObject;
    if ((arrayOfObject = (Object[])reflector.access(this, A, [Ljava.lang.Object.class)) != null) { int tmp27_26 = 1;;; break label34; throw new Player[arrayOfObject.length]; } label34: Player[] arrayOfPlayer = null;
    int j; if (arrayOfObject != null) {
      int tmp41_40 = 1;
      





















































































































      for (tmp41_40; (j = tmp41_40) < arrayOfObject.length;) {
        int tmp55_54 = j; int tmp56_55 = tmp55_54;tmp56_55; int tmp58_56 = tmp56_55;tmp58_56.<init>(reflector, arrayOfObject[j]);new org/powerbot/bot/rt4/client/Player[tmp58_56] = (j++);tmpTernaryOp = j; continue;throw tmp55_54;
      }
    }
    return arrayOfPlayer;
  }
  
  public int[] getPlayerIndices() {
    return reflector.accessInts(this, g);
  }
  
  public Npc[] getNpcs() {
    Object[] arrayOfObject;
    if ((arrayOfObject = (Object[])reflector.access(this, h, [Ljava.lang.Object.class)) != null) { int tmp27_26 = 1;;; break label34; throw new Npc[arrayOfObject.length]; } label34: Npc[] arrayOfNpc = null;
    int j; if (arrayOfObject != null) {
      int tmp41_40 = 1;
      




































































































































      for (tmp41_40; (j = tmp41_40) < arrayOfObject.length;) {
        int tmp55_54 = j; int tmp56_55 = tmp55_54;tmp56_55; int tmp58_56 = tmp56_55;tmp58_56.<init>(reflector, arrayOfObject[j]);new org/powerbot/bot/rt4/client/Npc[tmp58_56] = (j++);tmpTernaryOp = j; continue;throw tmp55_54;
      }
    }
    return arrayOfNpc;
  }
  
  public int[] getNpcIndices() {
    return reflector.accessInts(this, G);
  }
  
  public int getOffsetX() {
    return reflector.accessInt(this, C);
  }
  
  public int getOffsetY() {
    return reflector.accessInt(this, D);
  }
  
  public int getFloor() {
    return reflector.accessInt(this, F);
  }
  
  public Landscape getLandscape() {
    return new Landscape(reflector, reflector.access(this, private));
  }
  
  public byte[][][] getLandscapeMeta() {
    return (byte[][][])reflector.access(this, import, [[[B.class);
  }
  
  public int[][][] getTileHeights() {
    return (int[][][])reflector.access(this, default, [[[I.class);
  }
  
  public boolean isMenuOpen() {
    return reflector.accessBool(this, volatile);
  }
  
  public int getMenuX() {
    return reflector.accessInt(this, throws);
  }
  
  public int getMenuY() {
    return reflector.accessInt(this, implements);
  }
  
  public int getMenuWidth() {
    return reflector.accessInt(this, static);
  }
  
  public int getMenuHeight() {
    return reflector.accessInt(this, switch);
  }
  
  public int getMenuCount() {
    return reflector.accessInt(this, throw);
  }
  
  public String[] getMenuActions() {
    return (String[])reflector.access(this, strictfp, [Ljava.lang.String.class);
  }
  
  public String[] getMenuOptions() {
    return (String[])reflector.access(this, native, [Ljava.lang.String.class);
  }
  
  public int[] getWidgetBoundsX() {
    return reflector.accessInts(this, protected);
  }
  
  public int[] getWidgetBoundsY() {
    return reflector.accessInts(this, instanceof);
  }
  
  public int[] getWidgetBoundsWidth() {
    return reflector.accessInts(this, return);
  }
  
  public int[] getWidgetBoundsHeight() {
    return reflector.accessInts(this, finally);
  }
  
  public int getDestinationX() {
    return reflector.accessInt(this, package);
  }
  
  public int getDestinationY() {
    return reflector.accessInt(this, assert);
  }
  
  /* Error */
  public Widget[][] getWidgets()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 95	org/powerbot/bot/rt4/client/Client:reflector	Lorg/powerbot/bot/Reflector;
    //   4: aload_0
    //   5: getstatic 250	org/powerbot/bot/rt4/client/Client:public	Lorg/powerbot/bot/Reflector$FieldCache;
    //   8: ldc -4
    //   10: invokevirtual 149	org/powerbot/bot/Reflector:access	(Lorg/powerbot/bot/ReflectProxy;Lorg/powerbot/bot/Reflector$FieldCache;Ljava/lang/Class;)Ljava/lang/Object;
    //   13: checkcast 252	[[Ljava/lang/Object;
    //   16: dup
    //   17: astore_1
    //   18: ifnonnull +9 -> 27
    //   21: aconst_null
    //   22: checkcast 254	[[Lorg/powerbot/bot/rt4/client/Widget;
    //   25: areturn
    //   26: athrow
    //   27: aload_1
    //   28: arraylength
    //   29: anewarray 256	[Lorg/powerbot/bot/rt4/client/Widget;
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
    //   44: if_icmpge +88 -> 132
    //   47: aload_1
    //   48: iload_3
    //   49: aaload
    //   50: dup
    //   51: astore 4
    //   53: ifnonnull +11 -> 64
    //   56: aload_2
    //   57: iload_3
    //   58: aconst_null
    //   59: aastore
    //   60: goto +65 -> 125
    //   63: athrow
    //   64: aload 4
    //   66: arraylength
    //   67: anewarray 258	org/powerbot/bot/rt4/client/Widget
    //   70: iconst_1
    //   71: dup
    //   72: pop2
    //   73: astore 5
    //   75: iconst_0
    //   76: aload_2
    //   77: iload_3
    //   78: aload 5
    //   80: aastore
    //   81: iconst_1
    //   82: dup
    //   83: pop2
    //   84: dup
    //   85: istore 6
    //   87: aload 4
    //   89: arraylength
    //   90: if_icmpge +35 -> 125
    //   93: aload 5
    //   95: new 258	org/powerbot/bot/rt4/client/Widget
    //   98: iload 6
    //   100: dup_x1
    //   101: dup
    //   102: pop2
    //   103: dup
    //   104: aload_0
    //   105: getfield 95	org/powerbot/bot/rt4/client/Client:reflector	Lorg/powerbot/bot/Reflector;
    //   108: aload 4
    //   110: iload 6
    //   112: aaload
    //   113: invokespecial 259	org/powerbot/bot/rt4/client/Widget:<init>	(Lorg/powerbot/bot/Reflector;Ljava/lang/Object;)V
    //   116: iinc 6 1
    //   119: aastore
    //   120: iload 6
    //   122: goto -35 -> 87
    //   125: iinc 3 1
    //   128: iload_3
    //   129: goto -87 -> 42
    //   132: aload_2
    //   133: areturn
    // Line number table:
    //   Java source line #226	-> byte code offset #0
    //   Java source line #227	-> byte code offset #18
    //   Java source line #228	-> byte code offset #21
    //   Java source line #230	-> byte code offset #27
    //   Java source line #231	-> byte code offset #36
    //   Java source line #232	-> byte code offset #47
    //   Java source line #233	-> byte code offset #53
    //   Java source line #234	-> byte code offset #56
    //   Java source line #235	-> byte code offset #60
    //   Java source line #237	-> byte code offset #64
    //   Java source line #238	-> byte code offset #76
    //   Java source line #239	-> byte code offset #81
    //   Java source line #240	-> byte code offset #93
    //   Java source line #239	-> byte code offset #120
    //   Java source line #231	-> byte code offset #125
    //   Java source line #243	-> byte code offset #132
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	134	0	this	Client
  }
  
  public HashTable getWidgetTable()
  {
    return new HashTable(reflector, reflector.access(this, transient));
  }
  
  /* Error */
  public NodeDeque[][][] getGroundItems()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 95	org/powerbot/bot/rt4/client/Client:reflector	Lorg/powerbot/bot/Reflector;
    //   4: aload_0
    //   5: getstatic 270	org/powerbot/bot/rt4/client/Client:interface	Lorg/powerbot/bot/Reflector$FieldCache;
    //   8: ldc_w 272
    //   11: invokevirtual 149	org/powerbot/bot/Reflector:access	(Lorg/powerbot/bot/ReflectProxy;Lorg/powerbot/bot/Reflector$FieldCache;Ljava/lang/Class;)Ljava/lang/Object;
    //   14: checkcast 272	[[[Ljava/lang/Object;
    //   17: dup
    //   18: astore_1
    //   19: ifnonnull +9 -> 28
    //   22: aconst_null
    //   23: checkcast 274	[[[Lorg/powerbot/bot/rt4/client/NodeDeque;
    //   26: areturn
    //   27: athrow
    //   28: aload_1
    //   29: arraylength
    //   30: anewarray 276	[[Lorg/powerbot/bot/rt4/client/NodeDeque;
    //   33: iconst_1
    //   34: dup
    //   35: pop2
    //   36: astore_2
    //   37: iconst_0
    //   38: iconst_1
    //   39: dup
    //   40: pop2
    //   41: dup
    //   42: istore_3
    //   43: aload_1
    //   44: arraylength
    //   45: if_icmpge +149 -> 194
    //   48: aload_1
    //   49: iload_3
    //   50: aaload
    //   51: dup
    //   52: astore 4
    //   54: ifnonnull +14 -> 68
    //   57: aload_2
    //   58: iload_3
    //   59: aconst_null
    //   60: checkcast 276	[[Lorg/powerbot/bot/rt4/client/NodeDeque;
    //   63: aastore
    //   64: goto +123 -> 187
    //   67: athrow
    //   68: aload 4
    //   70: arraylength
    //   71: anewarray 278	[Lorg/powerbot/bot/rt4/client/NodeDeque;
    //   74: iconst_1
    //   75: dup
    //   76: pop2
    //   77: astore 5
    //   79: iconst_0
    //   80: aload_2
    //   81: iload_3
    //   82: aload 5
    //   84: aastore
    //   85: iconst_1
    //   86: dup
    //   87: pop2
    //   88: dup
    //   89: istore 6
    //   91: aload 4
    //   93: arraylength
    //   94: if_icmpge +93 -> 187
    //   97: aload 4
    //   99: iload 6
    //   101: aaload
    //   102: dup
    //   103: astore 7
    //   105: ifnonnull +11 -> 116
    //   108: aload 5
    //   110: iload_3
    //   111: aconst_null
    //   112: aastore
    //   113: goto +66 -> 179
    //   116: aload 7
    //   118: arraylength
    //   119: anewarray 92	org/powerbot/bot/rt4/client/NodeDeque
    //   122: iconst_1
    //   123: dup
    //   124: pop2
    //   125: astore 8
    //   127: iconst_0
    //   128: aload 5
    //   130: iload 6
    //   132: aload 8
    //   134: aastore
    //   135: iconst_1
    //   136: dup
    //   137: pop2
    //   138: dup
    //   139: istore 9
    //   141: aload 7
    //   143: arraylength
    //   144: if_icmpge +35 -> 179
    //   147: aload 8
    //   149: new 92	org/powerbot/bot/rt4/client/NodeDeque
    //   152: iload 9
    //   154: dup_x1
    //   155: dup
    //   156: pop2
    //   157: dup
    //   158: aload_0
    //   159: getfield 95	org/powerbot/bot/rt4/client/Client:reflector	Lorg/powerbot/bot/Reflector;
    //   162: aload 7
    //   164: iload 9
    //   166: aaload
    //   167: invokespecial 102	org/powerbot/bot/rt4/client/NodeDeque:<init>	(Lorg/powerbot/bot/Reflector;Ljava/lang/Object;)V
    //   170: iinc 9 1
    //   173: aastore
    //   174: iload 9
    //   176: goto -35 -> 141
    //   179: iinc 6 1
    //   182: iload 6
    //   184: goto -93 -> 91
    //   187: iinc 3 1
    //   190: iload_3
    //   191: goto -148 -> 43
    //   194: aload_2
    //   195: areturn
    // Line number table:
    //   Java source line #251	-> byte code offset #0
    //   Java source line #252	-> byte code offset #19
    //   Java source line #253	-> byte code offset #22
    //   Java source line #255	-> byte code offset #28
    //   Java source line #256	-> byte code offset #37
    //   Java source line #257	-> byte code offset #48
    //   Java source line #258	-> byte code offset #54
    //   Java source line #259	-> byte code offset #57
    //   Java source line #260	-> byte code offset #64
    //   Java source line #262	-> byte code offset #68
    //   Java source line #263	-> byte code offset #80
    //   Java source line #264	-> byte code offset #85
    //   Java source line #265	-> byte code offset #97
    //   Java source line #266	-> byte code offset #105
    //   Java source line #267	-> byte code offset #108
    //   Java source line #268	-> byte code offset #113
    //   Java source line #270	-> byte code offset #116
    //   Java source line #271	-> byte code offset #128
    //   Java source line #272	-> byte code offset #135
    //   Java source line #273	-> byte code offset #147
    //   Java source line #272	-> byte code offset #174
    //   Java source line #264	-> byte code offset #179
    //   Java source line #256	-> byte code offset #187
    //   Java source line #277	-> byte code offset #194
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	196	0	this	Client
  }
  
  public CollisionMap[] getCollisionMaps()
  {
    Object[] arrayOfObject;
    if ((arrayOfObject = (Object[])reflector.access(this, extends, [Ljava.lang.Object.class)) != null) { int tmp27_26 = 1;;; break label34; throw new CollisionMap[arrayOfObject.length]; } label34: CollisionMap[] arrayOfCollisionMap = null;
    int j; if (arrayOfObject != null) {
      int tmp41_40 = 1;
      


























































































































































































































































































      for (tmp41_40; (j = tmp41_40) < arrayOfObject.length;) {
        int tmp55_54 = j; int tmp56_55 = tmp55_54;tmp56_55; int tmp58_56 = tmp56_55;tmp58_56.<init>(reflector, arrayOfObject[j]);new org/powerbot/bot/rt4/client/CollisionMap[tmp58_56] = (j++);tmpTernaryOp = j; continue;throw tmp55_54;
      }
    }
    return arrayOfCollisionMap;
  }
  
  public int[] getVarpbits() {
    return reflector.accessInts(this, while);
  }
  
  public int getClientState() {
    return reflector.accessInt(this, double);
  }
  
  public int getCrosshairIndex() {
    return reflector.accessInt(this, continue);
  }
  
  public Cache getVarbitCache() {
    return new Cache(reflector, reflector.access(this, abstract));
  }
  
  public Cache getNpcConfigCache() {
    return new Cache(reflector, reflector.access(this, boolean));
  }
  
  public Cache getObjectConfigCache() {
    return new Cache(reflector, reflector.access(this, this));
  }
  
  public Cache getItemConfigCache() {
    return new Cache(reflector, reflector.access(this, class));
  }
  
  public int[] getSkillLevels1() {
    return reflector.accessInts(this, float);
  }
  
  public int[] getSkillLevels2() {
    return reflector.accessInts(this, do);
  }
  
  public int[] getSkillExps() {
    return reflector.accessInts(this, const);
  }
  
  public int getCycle() {
    return reflector.accessInt(this, short);
  }
  
  public int getHintArrowNpcUid() {
    return reflector.accessInt(this, try);
  }
  
  public int getHintArrowPlayerUid() {
    return reflector.accessInt(this, false);
  }
  
  public int getHintArrowType() {
    return reflector.accessInt(this, catch);
  }
  
  public int getHintArrowX() {
    return reflector.accessInt(this, goto);
  }
  
  public int getHintArrowY() {
    return reflector.accessInt(this, break);
  }
  
  public int getSelectionType() {
    return reflector.accessInt(this, char);
  }
  
  public int getSelectionIndex() {
    return reflector.accessInt(this, true);
  }
  
  public String getUsername() {
    System.getSecurityManager().checkPermission(org.powerbot.script.ClientContext.INTERNAL_API_ACCESS);
    return reflector.accessString(this, case);
  }
  
  public String getPassword() {
    System.getSecurityManager().checkPermission(org.powerbot.script.ClientContext.INTERNAL_API_ACCESS);
    return reflector.accessString(this, for);
  }
  
  public int getPlayerIndex() {
    return reflector.accessInt(this, long);
  }
  
  public int getRunPercentage() {
    return reflector.accessInt(this, int);
  }
  
  public EntryList getLoggerEntries() {
    return new EntryList(reflector, reflector.access(this, super));
  }
  
  public int getLoginState() {
    return reflector.accessInt(this, final);
  }
  
  public int getLoginField() {
    return reflector.accessInt(this, enum);
  }
  
  public boolean isWorldSelectionUp() {
    return reflector.accessBool(this, else);
  }
  
  public int getTileSize() {
    return reflector.accessInt(this, if);
  }
  
  public int getNpcCount() {
    return reflector.accessInt(this, null);
  }
  
  public int getPlayerCount() {
    return reflector.accessInt(this, byte);
  }
}
