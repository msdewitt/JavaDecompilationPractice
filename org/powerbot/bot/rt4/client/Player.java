package org.powerbot.bot.rt4.client;

import org.powerbot.bot.Reflector.FieldCache;

public class Player extends Actor {
  private static final Reflector.FieldCache jdField_null = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_byte = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_new = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_void = new Reflector.FieldCache();
  
  public Player(org.powerbot.bot.Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public int getCombatLevel() {
    return reflector.accessInt(this, null);
  }
  
  public String getName() {
    return new StringRecord(reflector, reflector.access(this, byte)).getValue();
  }
  
  public int getTeam() {
    return reflector.accessInt(this, new);
  }
  
  public PlayerComposite getComposite() {
    return new PlayerComposite(reflector, reflector.access(this, void));
  }
}
