package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector;

public class HardReference extends org.powerbot.bot.ReflectProxy
{
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public HardReference(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public Object get() {
    return reflector.access(this, void);
  }
}
