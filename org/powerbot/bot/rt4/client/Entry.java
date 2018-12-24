package org.powerbot.bot.rt4.client;

import org.powerbot.bot.Reflector;

public class Entry extends Node {
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public Entry(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public Entry getNext() {
    return new Entry(reflector, reflector.access(this, void));
  }
}
