package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector.FieldCache;

public class ItemConfig extends org.powerbot.bot.ReflectProxy
{
  private static final Reflector.FieldCache jdField_if = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_null = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_byte = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_new = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_void = new Reflector.FieldCache();
  
  public ItemConfig(org.powerbot.bot.Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public String[] getActions() {
    return (String[])reflector.access(this, if, [Ljava.lang.String.class);
  }
  
  public int getId() {
    return reflector.accessInt(this, null);
  }
  
  public String getName() {
    return reflector.accessString(this, byte);
  }
  
  public boolean isMembersObject() {
    return reflector.accessBool(this, new);
  }
  
  public String[] getGroundActions() {
    return (String[])reflector.access(this, void, [Ljava.lang.String.class);
  }
}
