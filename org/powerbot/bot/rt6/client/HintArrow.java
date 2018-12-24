package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector.FieldCache;

public class HintArrow extends org.powerbot.bot.ReflectProxy
{
  private static final Reflector.FieldCache jdField_if = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_null = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_byte = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_new = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_void = new Reflector.FieldCache();
  
  public HintArrow(org.powerbot.bot.Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public int getTargetId() {
    return reflector.accessInt(this, if);
  }
  
  public int getFloor() {
    return reflector.accessInt(this, null);
  }
  
  public int getX() {
    return reflector.accessInt(this, byte);
  }
  
  public int getY() {
    return reflector.accessInt(this, new);
  }
  
  public int getType() {
    return reflector.accessInt(this, void);
  }
}
