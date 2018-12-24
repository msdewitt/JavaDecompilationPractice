package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector.FieldCache;

public class RenderableEntity extends Entity {
  private static final Reflector.FieldCache jdField_null = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_byte = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_new = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_void = new Reflector.FieldCache();
  
  public RenderableEntity(org.powerbot.bot.Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public short getX1() {
    return reflector.accessShort(this, null);
  }
  
  public short getX2() {
    return reflector.accessShort(this, byte);
  }
  
  public short getY1() {
    return reflector.accessShort(this, new);
  }
  
  public short getY2() {
    return reflector.accessShort(this, void);
  }
}
