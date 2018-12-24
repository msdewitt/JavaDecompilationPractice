package org.powerbot.bot.rt4.client;

import org.powerbot.bot.Reflector.FieldCache;

public class ItemPile extends org.powerbot.bot.ReflectProxy
{
  private static final Reflector.FieldCache jdField_null = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_byte = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_new = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_void = new Reflector.FieldCache();
  
  public ItemPile(org.powerbot.bot.Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public ItemNode getItem1() {
    return new ItemNode(reflector, reflector.access(this, null));
  }
  
  public ItemNode getItem2() {
    return new ItemNode(reflector, reflector.access(this, byte));
  }
  
  public ItemNode getItem3() {
    return new ItemNode(reflector, reflector.access(this, new));
  }
  
  public int getY() {
    return reflector.accessInt(this, void);
  }
}
