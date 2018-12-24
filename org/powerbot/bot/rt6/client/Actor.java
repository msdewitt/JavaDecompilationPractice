package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector.FieldCache;

public class Actor extends RenderableEntity {
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
  
  public int getInteracting() {
    return reflector.accessInt(this, super);
  }
  
  public int getSpeed() {
    return reflector.accessInt(this, final);
  }
  
  public int[] getAnimationQueue() {
    return reflector.accessInts(this, enum);
  }
  
  public Animator getAnimation() {
    return new Animator(reflector, reflector.access(this, else));
  }
  
  public int getHeight() {
    return reflector.accessInt(this, if);
  }
  
  public LinkedList getCombatStatusList() {
    return new LinkedList(reflector, reflector.access(this, null));
  }
  
  public int getOrientation() {
    return reflector.accessInt(this, byte);
  }
  
  public OverheadMessage getMessage() {
    return new OverheadMessage(reflector, reflector.access(this, new));
  }
  
  public Animator getPassiveAnimation() {
    return new Animator(reflector, reflector.access(this, void));
  }
}
