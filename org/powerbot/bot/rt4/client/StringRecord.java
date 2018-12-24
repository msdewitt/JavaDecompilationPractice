package org.powerbot.bot.rt4.client;

import org.powerbot.bot.Reflector;

public class StringRecord extends org.powerbot.bot.ReflectProxy
{
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public StringRecord(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public String getValue() {
    return reflector.accessString(this, void);
  }
}
