package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector;

public class MenuItemNode extends NodeSub {
  private static final org.powerbot.bot.Reflector.FieldCache jdField_new = new org.powerbot.bot.Reflector.FieldCache();
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public MenuItemNode(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public String getAction() {
    return reflector.accessString(this, new);
  }
  
  public String getOption() {
    return reflector.accessString(this, void);
  }
}
