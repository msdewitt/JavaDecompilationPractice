package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector;

public class Node extends org.powerbot.bot.ReflectProxy
{
  private static final org.powerbot.bot.Reflector.FieldCache jdField_new = new org.powerbot.bot.Reflector.FieldCache();
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public Node(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public Node getNext() {
    return new Node(reflector, reflector.access(this, new));
  }
  
  public long getId() {
    return reflector.accessLong(this, void);
  }
}
