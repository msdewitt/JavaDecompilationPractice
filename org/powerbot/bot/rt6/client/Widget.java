package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector.FieldCache;

public class Widget extends org.powerbot.bot.ReflectProxy
{
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
  
  public Widget(org.powerbot.bot.Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public String getTooltip() {
    return reflector.accessString(this, return);
  }
  
  public int getComponentId() {
    return reflector.accessInt(this, finally);
  }
  
  public int getZRotation() {
    return reflector.accessInt(this, package);
  }
  
  public int getWidth() {
    return reflector.accessInt(this, assert);
  }
  
  public int getXRotation() {
    return reflector.accessInt(this, public);
  }
  
  public int getModelType() {
    return reflector.accessInt(this, transient);
  }
  
  public int getTextureId() {
    return reflector.accessInt(this, interface);
  }
  
  public Object[] getComponents() {
    Object[] arrayOfObject;
    if ((arrayOfObject = (Object[])reflector.access(this, extends, [Ljava.lang.Object.class)) == null) {
      int tmp23_22 = 1;tmp23_22; int tmp29_28 = 1;tmp29_28;return tmp29_28;throw new Object[tmp23_22];
    }
    return arrayOfObject;
  }
  
  public Widget[] getComponentsW() {
    Object[] arrayOfObject;
    if ((arrayOfObject = (Object[])reflector.access(this, extends, [Ljava.lang.Object.class)) != null) { int tmp27_26 = 1;;; break label43; throw new Widget[arrayOfObject.length]; } else { 1;1; } label43: int ? = tmp41_40;
    int i; if (arrayOfObject != null) {
      int tmp50_49 = 1;
      

























































































      for (tmp50_49; (i = tmp50_49) < arrayOfObject.length;) {
        int tmp64_63 = i; int tmp65_64 = tmp64_63;tmp65_64; int tmp67_65 = tmp65_64;tmp67_65.<init>(reflector, arrayOfObject[i]);new org/powerbot/bot/rt6/client/Widget[tmp67_65] = (i++);tmpTernaryOp = i; continue;throw tmp64_63;
      }
    }
    return ?;
  }
  
  public String getComponentName() {
    return reflector.accessString(this, while);
  }
  
  public int getX() {
    return reflector.accessInt(this, double);
  }
  
  public int getHorizontalScrollbarPosition() {
    return reflector.accessInt(this, continue);
  }
  
  public int getSpecialType() {
    return reflector.accessInt(this, abstract);
  }
  
  public int getY() {
    return reflector.accessInt(this, boolean);
  }
  
  public int getParentId() {
    return reflector.accessInt(this, this);
  }
  
  public String getText() {
    return reflector.accessString(this, class);
  }
  
  public int getVerticalScrollbarThumbSize() {
    return reflector.accessInt(this, float);
  }
  
  public int getComponentStackSize() {
    return reflector.accessInt(this, do);
  }
  
  public int getVerticalScrollbarPosition() {
    return reflector.accessInt(this, const);
  }
  
  public String[] getActions() {
    return (String[])reflector.access(this, short, [Ljava.lang.String.class);
  }
  
  public int getVerticalScrollbarSize() {
    return reflector.accessInt(this, try);
  }
  
  public int getComponentIndex() {
    return reflector.accessInt(this, false);
  }
  
  public int getType() {
    return reflector.accessInt(this, catch);
  }
  
  public int getModelId() {
    return reflector.accessInt(this, goto);
  }
  
  public int getModelZoom() {
    return reflector.accessInt(this, break);
  }
  
  public String getSelectedActionName() {
    return reflector.accessString(this, char);
  }
  
  public int getHorizontalScrollbarSize() {
    return reflector.accessInt(this, true);
  }
  
  public int getHorizontalScrollbarThumbSize() {
    return reflector.accessInt(this, case);
  }
  
  public boolean isVerticallyFlipped() {
    return reflector.accessBool(this, for);
  }
  
  public int getTextColor() {
    return reflector.accessInt(this, long);
  }
  
  public int getYRotation() {
    return reflector.accessInt(this, int);
  }
  
  public int getBoundsArrayIndex() {
    return reflector.accessInt(this, super);
  }
  
  public int getShadowColor() {
    return reflector.accessInt(this, final);
  }
  
  public boolean isHorizontallyFlipped() {
    return reflector.accessBool(this, enum);
  }
  
  public boolean isHidden() {
    return reflector.accessBool(this, else);
  }
  
  public boolean isInventoryInterface() {
    return reflector.accessBool(this, if);
  }
  
  public int getHeight() {
    return reflector.accessInt(this, null);
  }
  
  public int getId() {
    return reflector.accessInt(this, byte);
  }
  
  public boolean isVisible() {
    return reflector.accessBool(this, new);
  }
  
  public int getBorderThinkness() {
    return reflector.accessInt(this, void);
  }
}
