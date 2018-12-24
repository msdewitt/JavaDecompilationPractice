package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector;

public class OverheadMessage extends org.powerbot.bot.ReflectProxy
{
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public OverheadMessage(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public String getText() {
    return reflector.accessString(this, void);
  }
}
