package org.powerbot.bot.rt6.client;

import java.awt.Rectangle;
import org.powerbot.bot.Reflector;
import org.powerbot.bot.Reflector.FieldCache;
import org.powerbot.script.ClientContext;

public class Client extends org.powerbot.bot.ReflectProxy implements org.powerbot.script.Client
{
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
  
  public TransformMatrix getViewMatrix() {
    return new TransformMatrix(reflector, reflector.access(this, D));
  }
  
  public Matrix4f getProjMatrix() {
    return new Matrix4f(reflector, reflector.access(this, F));
  }
  
  public int getCycle() {
    return reflector.accessInt(this, private);
  }
  
  public int getFloor() {
    return reflector.accessInt(this, import);
  }
  
  public int getDestinationX() {
    return reflector.accessInt(this, default);
  }
  
  public int getDestinationY() {
    return reflector.accessInt(this, volatile);
  }
  
  public int getCameraX() {
    return reflector.accessInt(this, throws);
  }
  
  public int getSubMenuY() {
    return reflector.accessInt(this, implements);
  }
  
  public int getMinimapSettings() {
    return reflector.accessInt(this, static);
  }
  
  public int getPlayerCount() {
    return reflector.accessInt(this, switch);
  }
  
  public boolean isMenuCollapsed() {
    return reflector.accessBool(this, throw);
  }
  
  public int getMenuY() {
    return reflector.accessInt(this, strictfp);
  }
  
  public int getCameraZ() {
    return reflector.accessInt(this, native);
  }
  
  public int getCameraYaw() {
    return reflector.accessInt(this, protected);
  }
  
  public boolean isMenuOpen() {
    return reflector.accessBool(this, instanceof);
  }
  
  public float getMinimapAngle() {
    return reflector.accessFloat(this, return);
  }
  
  public int getClientState() {
    return reflector.accessInt(this, finally);
  }
  
  public World getWorld() {
    return new World(reflector, reflector.access(this, package));
  }
  
  public NodeSubQueue getCollapsedMenuItems() {
    return new NodeSubQueue(reflector, reflector.access(this, assert));
  }
  
  public int getMinimapScale() {
    return reflector.accessInt(this, public);
  }
  
  public Player[] getPlayers() {
    Object[] arrayOfObject;
    if ((arrayOfObject = (Object[])reflector.access(this, transient, [Ljava.lang.Object.class)) != null) { int tmp27_26 = 1;;; break label43; throw new Player[arrayOfObject.length]; } else { 1;1; } label43: int ? = tmp41_40;
    int i; if (arrayOfObject != null) {
      int tmp50_49 = 1;
      























































































































































      for (tmp50_49; (i = tmp50_49) < arrayOfObject.length;) {
        int tmp64_63 = i; int tmp65_64 = tmp64_63;tmp65_64; int tmp67_65 = tmp65_64;tmp67_65.<init>(reflector, arrayOfObject[i]);new org/powerbot/bot/rt6/client/Player[tmp67_65] = (i++);tmpTernaryOp = i; continue;throw tmp64_63;
      }
    }
    return ?;
  }
  
  public int[] getPlayerIndices() {
    return reflector.accessInts(this, interface);
  }
  
  public PlayerFacade getPlayerFacade() {
    return new PlayerFacade(reflector, reflector.access(this, extends));
  }
  
  public int getMenuWidth() {
    return reflector.accessInt(this, while);
  }
  
  public int getSubMenuWidth() {
    return reflector.accessInt(this, double);
  }
  
  public Player getPlayer() {
    return new Player(reflector, reflector.access(this, continue));
  }
  
  public Rectangle[] getWidgetBoundsArray() {
    return (Rectangle[])reflector.access(this, abstract, [Ljava.awt.Rectangle.class);
  }
  
  public NodeDeque getMenuItems() {
    return new NodeDeque(reflector, reflector.access(this, boolean));
  }
  
  public HashTable getItemTable() {
    return new HashTable(reflector, reflector.access(this, float));
  }
  
  public HashTable getWidgetTable() {
    return new HashTable(reflector, reflector.access(this, do));
  }
  
  public int getNpcCount() {
    return reflector.accessInt(this, const);
  }
  
  public int getMenuX() {
    return reflector.accessInt(this, short);
  }
  
  public int getWidgetIndex() {
    return reflector.accessInt(this, try);
  }
  
  public String getSelectedItemName() {
    return reflector.accessString(this, false);
  }
  
  public HashTable getNpcTable() {
    return new HashTable(reflector, reflector.access(this, catch));
  }
  
  public int getSubMenuX() {
    return reflector.accessInt(this, goto);
  }
  
  public int getMenuHeight() {
    return reflector.accessInt(this, break);
  }
  
  public int getCameraY() {
    return reflector.accessInt(this, char);
  }
  
  public int getCameraPitch() {
    return reflector.accessInt(this, true);
  }
  
  public boolean isSpellSelected() {
    return reflector.accessBool(this, case);
  }
  
  public int[] getNpcIndices() {
    return reflector.accessInts(this, for);
  }
  
  public Bundler getItemBundler() {
    return new Bundler(reflector, reflector.access(this, long));
  }
  
  public Bundler getNpcBundler() {
    return new Bundler(reflector, reflector.access(this, int));
  }
  
  public int getMinimapOffset() {
    return reflector.accessInt(this, super);
  }
  
  /* Error */
  public Object[] getWidgets()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 83	org/powerbot/bot/rt6/client/Client:reflector	Lorg/powerbot/bot/Reflector;
    //   4: aload_0
    //   5: getstatic 293	org/powerbot/bot/rt6/client/Client:final	Lorg/powerbot/bot/Reflector$FieldCache;
    //   8: ldc -76
    //   10: invokevirtual 183	org/powerbot/bot/Reflector:access	(Lorg/powerbot/bot/ReflectProxy;Lorg/powerbot/bot/Reflector$FieldCache;Ljava/lang/Class;)Ljava/lang/Object;
    //   13: checkcast 180	[Ljava/lang/Object;
    //   16: dup
    //   17: astore_1
    //   18: ifnull +6 -> 24
    //   21: aload_1
    //   22: areturn
    //   23: athrow
    //   24: iconst_0
    //   25: iconst_1
    //   26: dup
    //   27: pop2
    //   28: anewarray 295	java/lang/Object
    //   31: iconst_1
    //   32: dup
    //   33: pop2
    //   34: areturn
    // Line number table:
    //   Java source line #253	-> byte code offset #0
    //   Java source line #254	-> byte code offset #18
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	35	0	this	Client
  }
  
  public int getCrossHairType()
  {
    return reflector.accessInt(this, enum);
  }
  
  public HintArrow[] getHintArrows() {
    Object[] arrayOfObject;
    if ((arrayOfObject = (Object[])reflector.access(this, else, [Ljava.lang.Object.class)) != null) { int tmp27_26 = 1;;; break label43; throw new HintArrow[arrayOfObject.length]; } else { 1;1; } label43: int ? = tmp41_40;
    int i; if (arrayOfObject != null) {
      int tmp50_49 = 1;
      







































































































































































































































































      for (tmp50_49; (i = tmp50_49) < arrayOfObject.length;) {
        int tmp64_63 = i; int tmp65_64 = tmp64_63;tmp65_64; int tmp67_65 = tmp65_64;tmp67_65.<init>(reflector, arrayOfObject[i]);new org/powerbot/bot/rt6/client/HintArrow[tmp67_65] = (i++);tmpTernaryOp = i; continue;throw tmp64_63;
      }
    }
    return ?;
  }
  
  public NodeDeque getProjectileDeque() {
    return new NodeDeque(reflector, reflector.access(this, if));
  }
  
  public String getUsername() {
    System.getSecurityManager().checkPermission(ClientContext.INTERNAL_API_ACCESS);
    return reflector.accessString(this, null);
  }
  
  public String getPassword() {
    System.getSecurityManager().checkPermission(ClientContext.INTERNAL_API_ACCESS);
    return reflector.accessString(this, byte);
  }
  
  public HashTable getItemSlots() {
    return new HashTable(reflector, reflector.access(this, new));
  }
  
  public NodeSubQueue getLoggerEntries() {
    return new NodeSubQueue(reflector, reflector.access(this, void));
  }
}
