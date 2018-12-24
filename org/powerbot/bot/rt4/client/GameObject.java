package org.powerbot.bot.rt4.client;

import org.powerbot.bot.Reflector.FieldCache;

public class GameObject extends org.powerbot.bot.ReflectProxy
{
  private static final Reflector.FieldCache jdField_final = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_enum = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_else = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_if = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_null = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_byte = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_new = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_void = new Reflector.FieldCache();
  
  public GameObject(org.powerbot.bot.Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public long getUid() {
    return reflector.accessLong(this, final);
  }
  
  public int getMeta() {
    return reflector.accessInt(this, enum);
  }
  
  public int getX() {
    return reflector.accessInt(this, else);
  }
  
  public int getZ() {
    return reflector.accessInt(this, if);
  }
  
  public int getX1() {
    return reflector.accessInt(this, null);
  }
  
  public int getY1() {
    return reflector.accessInt(this, byte);
  }
  
  public int getX2() {
    return reflector.accessInt(this, new);
  }
  
  public int getY2() {
    return reflector.accessInt(this, void);
  }
}
