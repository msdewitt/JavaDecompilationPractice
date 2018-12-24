package org.powerbot.bot.rt4.client;

import org.powerbot.bot.Reflector;

public class Cache extends org.powerbot.bot.ReflectProxy
{
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public Cache(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public HashTable getTable() {
    return new HashTable(reflector, reflector.access(this, void));
  }
}
