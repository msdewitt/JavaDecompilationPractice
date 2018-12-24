package org.powerbot.bot.rt4.client;

import org.powerbot.bot.Reflector.FieldCache;

public class NpcConfig extends org.powerbot.bot.ReflectProxy
{
  private static final Reflector.FieldCache jdField_enum = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_else = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_if = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_null = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_byte = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_new = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_void = new Reflector.FieldCache();
  
  public NpcConfig(org.powerbot.bot.Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public int getId() {
    return reflector.accessInt(this, enum);
  }
  
  public int getLevel() {
    return reflector.accessInt(this, else);
  }
  
  public String getName() {
    return reflector.accessString(this, if);
  }
  
  public String[] getActions() {
    return (String[])reflector.access(this, null, [Ljava.lang.String.class);
  }
  
  public int[] getConfigs() {
    return reflector.accessInts(this, byte);
  }
  
  public int getVarpbitIndex() {
    return reflector.accessInt(this, new);
  }
  
  public int getVarbit() {
    return reflector.accessInt(this, void);
  }
}
