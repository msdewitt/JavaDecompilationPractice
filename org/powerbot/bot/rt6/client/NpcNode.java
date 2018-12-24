package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector;

public class NpcNode extends Node {
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public NpcNode(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public Npc getNpc() {
    return new Npc(reflector, reflector.access(this, void));
  }
}
