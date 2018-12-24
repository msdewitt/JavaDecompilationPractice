package org.powerbot.bot.rt4.client;

import org.powerbot.bot.Reflector.FieldCache;

public class MessageEntry extends Entry {
  private static final Reflector.FieldCache jdField_byte = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_new = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_void = new Reflector.FieldCache();
  
  public MessageEntry(org.powerbot.bot.Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public String getSender() {
    return reflector.accessString(this, byte);
  }
  
  public String getMessage() {
    return reflector.accessString(this, new);
  }
  
  public int getType() {
    return reflector.accessInt(this, void);
  }
}
