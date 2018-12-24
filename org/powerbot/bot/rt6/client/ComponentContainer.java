package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector;

public class ComponentContainer extends org.powerbot.bot.ReflectProxy
{
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public ComponentContainer(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  /* Error */
  public Object[] getComponents()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 27	org/powerbot/bot/rt6/client/ComponentContainer:reflector	Lorg/powerbot/bot/Reflector;
    //   4: aload_0
    //   5: getstatic 29	org/powerbot/bot/rt6/client/ComponentContainer:void	Lorg/powerbot/bot/Reflector$FieldCache;
    //   8: ldc 31
    //   10: invokevirtual 35	org/powerbot/bot/Reflector:access	(Lorg/powerbot/bot/ReflectProxy;Lorg/powerbot/bot/Reflector$FieldCache;Ljava/lang/Class;)Ljava/lang/Object;
    //   13: checkcast 31	[Ljava/lang/Object;
    //   16: dup
    //   17: astore_1
    //   18: ifnull +6 -> 24
    //   21: aload_1
    //   22: areturn
    //   23: athrow
    //   24: iconst_0
    //   25: iconst_1
    //   26: dup
    //   27: pop2
    //   28: anewarray 37	org/powerbot/bot/rt6/client/Widget
    //   31: iconst_1
    //   32: dup
    //   33: pop2
    //   34: areturn
    // Line number table:
    //   Java source line #14	-> byte code offset #0
    //   Java source line #15	-> byte code offset #18
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	35	0	this	ComponentContainer
  }
}
