package org.powerbot.bot.rt4.client;

import org.powerbot.bot.Reflector.FieldCache;

public class Projectile extends org.powerbot.bot.ReflectProxy
{
  private static final Reflector.FieldCache jdField_true = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_case = new Reflector.FieldCache();
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
  
  public int getId() {
    return reflector.accessInt(this, else);
  }
  
  public Projectile(org.powerbot.bot.Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public int getTargetIndex() {
    return reflector.accessInt(this, case);
  }
  
  public int getStartX() {
    return reflector.accessInt(this, for);
  }
  
  public int getStartY() {
    return reflector.accessInt(this, long);
  }
  
  public int getPlane() {
    return reflector.accessInt(this, int);
  }
  
  public boolean isStarted() {
    return reflector.accessBool(this, super);
  }
  
  public int getSlope() {
    return reflector.accessInt(this, final);
  }
  
  public int getEndHeight() {
    return reflector.accessInt(this, enum);
  }
  
  public int getOrientation() {
    return reflector.accessInt(this, if);
  }
  
  public int getStartDistance() {
    return reflector.accessInt(this, null);
  }
  
  public int getCycleStart() {
    return reflector.accessInt(this, byte);
  }
  
  public double getX() {
    return reflector.accessDouble(this, new);
  }
  
  public double getY() {
    return reflector.accessDouble(this, void);
  }
}
