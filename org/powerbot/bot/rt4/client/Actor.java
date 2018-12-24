package org.powerbot.bot.rt4.client;

import org.powerbot.bot.Reflector.FieldCache;

public class Actor extends org.powerbot.bot.ReflectProxy
{
  private static final Reflector.FieldCache jdField_super = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_final = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_enum = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_else = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_if = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_null = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_byte = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_new = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_void = new Reflector.FieldCache();
  
  public Actor(org.powerbot.bot.Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public int getX() {
    return reflector.accessInt(this, super);
  }
  
  public int getZ() {
    return reflector.accessInt(this, final);
  }
  
  public int getHeight() {
    return reflector.accessInt(this, enum);
  }
  
  public int getAnimation() {
    return reflector.accessInt(this, else);
  }
  
  public int getSpeed() {
    return reflector.accessInt(this, if);
  }
  
  public String getOverheadMessage() {
    return reflector.accessString(this, null);
  }
  
  public int getOrientation() {
    return reflector.accessInt(this, byte);
  }
  
  public int getInteractingIndex() {
    return reflector.accessInt(this, new);
  }
  
  public LinkedList getCombatStatusList() {
    return new LinkedList(reflector, reflector.access(this, void));
  }
}
