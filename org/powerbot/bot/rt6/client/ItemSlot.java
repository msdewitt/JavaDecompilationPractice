package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector;

public class ItemSlot extends Node {
  private static final org.powerbot.bot.Reflector.FieldCache jdField_new = new org.powerbot.bot.Reflector.FieldCache();
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public ItemSlot(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public int[] getIds() {
    return reflector.accessInts(this, new);
  }
  
  public int[] getStackSizes() {
    return reflector.accessInts(this, void);
  }
}
