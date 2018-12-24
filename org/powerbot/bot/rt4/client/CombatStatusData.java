package org.powerbot.bot.rt4.client;

import org.powerbot.bot.Reflector;

public class CombatStatusData extends org.powerbot.bot.ReflectProxy
{
  private static final org.powerbot.bot.Reflector.FieldCache jdField_new = new org.powerbot.bot.Reflector.FieldCache();
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public CombatStatusData(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public int getHealthRatio() {
    return reflector.accessInt(this, new);
  }
  
  public int getCycleEnd() {
    return reflector.accessInt(this, void);
  }
}
