package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector;

public class MenuGroupNode extends NodeSub {
  private static final org.powerbot.bot.Reflector.FieldCache jdField_new = new org.powerbot.bot.Reflector.FieldCache();
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public MenuGroupNode(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public NodeSubQueue getItems() {
    return new NodeSubQueue(reflector, reflector.access(this, new));
  }
  
  public int getSize() {
    return reflector.accessInt(this, void);
  }
}
