package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector;

public class DynamicBoundaryObject extends RenderableEntity {
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public DynamicBoundaryObject(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public AnimationBridge getBridge() {
    return new AnimationBridge(reflector, reflector.access(this, void));
  }
}
