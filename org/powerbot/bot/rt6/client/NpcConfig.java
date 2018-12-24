package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector.FieldCache;

public class NpcConfig extends org.powerbot.bot.ReflectProxy
{
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
    return reflector.accessInt(this, else);
  }
  
  public String[] getActions() {
    return (String[])reflector.access(this, if, [Ljava.lang.String.class);
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
  
  public short[] getOverheadArray2() {
    return (short[])reflector.access(this, void, [S.class);
  }
}
