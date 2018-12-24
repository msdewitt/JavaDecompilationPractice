package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector.FieldCache;

public class Quaternion extends org.powerbot.bot.ReflectProxy
{
  private static final Reflector.FieldCache jdField_null = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_byte = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_new = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_void = new Reflector.FieldCache();
  
  public Quaternion(org.powerbot.bot.Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public float x() {
    return reflector.accessFloat(this, null);
  }
  
  public float y() {
    return reflector.accessFloat(this, byte);
  }
  
  public float z() {
    return reflector.accessFloat(this, new);
  }
  
  public float w() {
    return reflector.accessFloat(this, void);
  }
}
