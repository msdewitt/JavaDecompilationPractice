package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector;

public class CombatStatusData extends LinkedListNode {
  private static final org.powerbot.bot.Reflector.FieldCache jdField_new = new org.powerbot.bot.Reflector.FieldCache();
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public CombatStatusData(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public int getCycleEnd() {
    return reflector.accessInt(this, new);
  }
  
  public int getHealthRatio() {
    return reflector.accessInt(this, void);
  }
}
