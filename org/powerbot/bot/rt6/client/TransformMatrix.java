package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector.FieldCache;

public class TransformMatrix extends org.powerbot.bot.ReflectProxy
{
  private static final Reflector.FieldCache jdField_for = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_long = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_int = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_super = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_final = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_enum = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_else = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_if = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_null = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_byte = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_new = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_void = new Reflector.FieldCache();
  
  public TransformMatrix(org.powerbot.bot.Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public float m00() {
    return reflector.accessFloat(this, for);
  }
  
  public float m01() {
    return reflector.accessFloat(this, long);
  }
  
  public float m02() {
    return reflector.accessFloat(this, int);
  }
  
  public float m03() {
    return reflector.accessFloat(this, super);
  }
  
  public float m10() {
    return reflector.accessFloat(this, final);
  }
  
  public float m11() {
    return reflector.accessFloat(this, enum);
  }
  
  public float m12() {
    return reflector.accessFloat(this, else);
  }
  
  public float m13() {
    return reflector.accessFloat(this, if);
  }
  
  public float m20() {
    return reflector.accessFloat(this, null);
  }
  
  public float m21() {
    return reflector.accessFloat(this, byte);
  }
  
  public float m22() {
    return reflector.accessFloat(this, new);
  }
  
  public float m23() {
    return reflector.accessFloat(this, void);
  }
}
