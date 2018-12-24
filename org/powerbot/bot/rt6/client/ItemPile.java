package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector.FieldCache;

public class ItemPile extends Entity {
  private static final Reflector.FieldCache jdField_null = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_byte = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_new = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_void = new Reflector.FieldCache();
  
  public ItemPile(org.powerbot.bot.Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public int getId_1() {
    return reflector.accessInt(this, null);
  }
  
  public int getId_2() {
    return reflector.accessInt(this, byte);
  }
  
  public int getId_3() {
    return reflector.accessInt(this, new);
  }
  
  public int getHeight() {
    return reflector.accessInt(this, void);
  }
}
