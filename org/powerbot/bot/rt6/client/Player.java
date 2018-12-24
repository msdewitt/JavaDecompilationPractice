package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector.FieldCache;

public class Player extends Actor {
  private static final Reflector.FieldCache jdField_else = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_if = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_null = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_byte = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_new = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_void = new Reflector.FieldCache();
  
  public Player(org.powerbot.bot.Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public int getTeam() {
    return reflector.accessInt(this, else);
  }
  
  public PlayerComposite getComposite() {
    return new PlayerComposite(reflector, reflector.access(this, if));
  }
  
  public String getName() {
    return reflector.accessString(this, null);
  }
  
  public int getCombatLevel() {
    return reflector.accessInt(this, byte);
  }
  
  public int[] getOverheadArray1() {
    return reflector.accessInts(this, new);
  }
  
  public int[] getOverheadArray2() {
    return reflector.accessInts(this, void);
  }
}
