package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector;

public class WalkableObject extends RenderableEntity {
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public WalkableObject(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public short getHeight() {
    return reflector.accessShort(this, void);
  }
}
