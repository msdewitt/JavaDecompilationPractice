package org.powerbot.bot.rt4.client;

import org.powerbot.bot.Reflector;

public class PlayerComposite extends org.powerbot.bot.ReflectProxy
{
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public PlayerComposite(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public int[] getAppearance() {
    return reflector.accessInts(this, void);
  }
}
