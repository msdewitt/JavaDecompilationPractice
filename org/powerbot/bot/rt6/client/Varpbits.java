package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector;

public class Varpbits extends org.powerbot.bot.ReflectProxy
{
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public Varpbits(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public int[] get() {
    return reflector.accessInts(this, void);
  }
}
