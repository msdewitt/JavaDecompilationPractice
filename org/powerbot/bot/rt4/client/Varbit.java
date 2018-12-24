package org.powerbot.bot.rt4.client;

import org.powerbot.bot.Reflector.FieldCache;

public class Varbit extends Node {
  private static final Reflector.FieldCache jdField_byte = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_new = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_void = new Reflector.FieldCache();
  
  public Varbit(org.powerbot.bot.Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public int getIndex() {
    return reflector.accessInt(this, byte);
  }
  
  public int getStartBit() {
    return reflector.accessInt(this, new);
  }
  
  public int getEndBit() {
    return reflector.accessInt(this, void);
  }
}
