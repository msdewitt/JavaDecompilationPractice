package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector;

public class Sequence extends org.powerbot.bot.ReflectProxy
{
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public Sequence(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public int getId() {
    return reflector.accessInt(this, void);
  }
}
