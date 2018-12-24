package org.powerbot.bot.rt4.client;

import org.powerbot.bot.Reflector.FieldCache;

public class ItemConfig extends Node {
  private static final Reflector.FieldCache jdField_null = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_byte = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_new = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_void = new Reflector.FieldCache();
  
  public ItemConfig(org.powerbot.bot.Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public String getName() {
    return reflector.accessString(this, null);
  }
  
  public boolean isMembers() {
    return reflector.accessBool(this, byte);
  }
  
  public String[] getActions1() {
    return (String[])reflector.access(this, new, [Ljava.lang.String.class);
  }
  
  public String[] getActions2() {
    return (String[])reflector.access(this, void, [Ljava.lang.String.class);
  }
}
