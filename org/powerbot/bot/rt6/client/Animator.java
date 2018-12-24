package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector;

public class Animator extends org.powerbot.bot.ReflectProxy
{
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public Animator(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public Sequence getSequence() {
    return new Sequence(reflector, reflector.access(this, void));
  }
}
