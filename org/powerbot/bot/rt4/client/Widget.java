package org.powerbot.bot.rt4.client;

import org.powerbot.bot.Reflector.FieldCache;

public class Widget extends org.powerbot.bot.ReflectProxy
{
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
  
  public int getX() {
    return reflector.accessInt(this, while);
  }
  
  public int getY() {
    return reflector.accessInt(this, double);
  }
  
  public int getWidth() {
    return reflector.accessInt(this, continue);
  }
  
  public int getHeight() {
    return reflector.accessInt(this, abstract);
  }
  
  public int getBorderThickness() {
    return reflector.accessInt(this, boolean);
  }
  
  public int getType() {
    return reflector.accessInt(this, this);
  }
  
  public int getId() {
    return reflector.accessInt(this, class);
  }
  
  public int getParentId() {
    return reflector.accessInt(this, float);
  }
  
  public Widget[] getChildren() {
    Object[] arrayOfObject;
    if ((arrayOfObject = (Object[])reflector.access(this, do, [Ljava.lang.Object.class)) != null) { int tmp27_26 = 1;;; break label34; throw new Widget[arrayOfObject.length]; } label34: Widget[] arrayOfWidget = null;
    int i; if (arrayOfObject != null) {
      int tmp41_40 = 1;
      













































































      for (tmp41_40; (i = tmp41_40) < arrayOfObject.length;) {
        int tmp55_54 = i; int tmp56_55 = tmp55_54;tmp56_55; int tmp58_56 = tmp56_55;tmp58_56.<init>(reflector, arrayOfObject[i]);new org/powerbot/bot/rt4/client/Widget[tmp58_56] = (i++);tmpTernaryOp = i; continue;throw tmp55_54;
      }
    }
    return arrayOfWidget;
  }
  
  public int getContentType() {
    return reflector.accessInt(this, const);
  }
  
  public int getModelId() {
    return reflector.accessInt(this, short);
  }
  
  public int getModelType() {
    return reflector.accessInt(this, try);
  }
  
  public int getModelZoom() {
    return reflector.accessInt(this, false);
  }
  
  public String[] getActions() {
    return (String[])reflector.access(this, catch, [Ljava.lang.String.class);
  }
  
  public int getAngleX() {
    return reflector.accessInt(this, goto);
  }
  
  public int getAngleY() {
    return reflector.accessInt(this, break);
  }
  
  public int getAngleZ() {
    return reflector.accessInt(this, char);
  }
  
  public String getText() {
    return reflector.accessString(this, true);
  }
  
  public int getTextColor() {
    return reflector.accessInt(this, case);
  }
  
  public int getScrollX() {
    return reflector.accessInt(this, for);
  }
  
  public int getScrollY() {
    return reflector.accessInt(this, long);
  }
  
  public int getScrollWidth() {
    return reflector.accessInt(this, int);
  }
  
  public int getScrollHeight() {
    return reflector.accessInt(this, super);
  }
  
  public int getBoundsIndex() {
    return reflector.accessInt(this, final);
  }
  
  public int getTextureId() {
    return reflector.accessInt(this, enum);
  }
  
  public int[] getItemIds() {
    return reflector.accessInts(this, else);
  }
  
  public int[] getItemStackSizes() {
    return reflector.accessInts(this, if);
  }
  
  public boolean isHidden() {
    return reflector.accessBool(this, null);
  }
  
  public String getTooltip() {
    return reflector.accessString(this, byte);
  }
  
  public int getItemId() {
    return reflector.accessInt(this, new);
  }
  
  public int getItemStackSize() {
    return reflector.accessInt(this, void);
  }
}
