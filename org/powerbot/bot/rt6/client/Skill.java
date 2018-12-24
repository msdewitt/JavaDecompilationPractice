package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector.FieldCache;

public class Skill extends org.powerbot.bot.ReflectProxy
{
  private static final Reflector.FieldCache jdField_byte = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_new = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_void = new Reflector.FieldCache();
  
  public Skill(org.powerbot.bot.Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public int getEffectiveLevel() {
    return reflector.accessInt(this, byte);
  }
  
  public int getLevel() {
    return reflector.accessInt(this, new);
  }
  
  public int getExperience() {
    return reflector.accessInt(this, void);
  }
}
