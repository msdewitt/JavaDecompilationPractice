package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector;

public class LinkedList extends org.powerbot.bot.ReflectProxy
{
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public LinkedList(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public LinkedListNode getSentinel() {
    return new LinkedListNode(reflector, reflector.access(this, void));
  }
}
