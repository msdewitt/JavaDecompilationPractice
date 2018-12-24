package org.powerbot.bot.rt4.client;

import org.powerbot.bot.Reflector;

public class CombatStatus extends org.powerbot.bot.ReflectProxy
{
  private static final org.powerbot.bot.Reflector.FieldCache jdField_new = new org.powerbot.bot.Reflector.FieldCache();
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public CombatStatus(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public LinkedList getList() {
    return new LinkedList(reflector, reflector.access(this, new));
  }
  
  public BarComponent getBarComponent() {
    return new BarComponent(reflector, reflector.access(this, void));
  }
}
