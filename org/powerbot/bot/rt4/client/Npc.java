package org.powerbot.bot.rt4.client;

import org.powerbot.bot.Reflector;

public class Npc extends Actor {
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public Npc(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public NpcConfig getConfig() {
    return new NpcConfig(reflector, reflector.access(this, void));
  }
}
