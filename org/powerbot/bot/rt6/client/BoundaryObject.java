package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector.FieldCache;

public class BoundaryObject extends RenderableEntity {
  private static final Reflector.FieldCache jdField_byte = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_new = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_void = new Reflector.FieldCache();
  
  public BoundaryObject(org.powerbot.bot.Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public byte getOrientation() {
    return reflector.accessByte(this, byte);
  }
  
  public int getId() {
    return reflector.accessInt(this, new);
  }
  
  public int getType() {
    return reflector.accessByte(this, void);
  }
}
