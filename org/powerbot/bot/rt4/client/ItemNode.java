package org.powerbot.bot.rt4.client;

import org.powerbot.bot.Reflector;

public class ItemNode extends Node {
  private static final org.powerbot.bot.Reflector.FieldCache jdField_new = new org.powerbot.bot.Reflector.FieldCache();
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public ItemNode(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public int getItemId() {
    return reflector.accessInt(this, new);
  }
  
  public int getStackSize() {
    return reflector.accessInt(this, void);
  }
}
