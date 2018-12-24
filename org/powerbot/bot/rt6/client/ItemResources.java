package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector;

public class ItemResources extends Resources {
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public ItemResources(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public Cache getModelCache() {
    return new Cache(reflector, reflector.access(this, void));
  }
}
