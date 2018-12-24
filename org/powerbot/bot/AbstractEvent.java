package org.powerbot.bot;

import java.util.EventObject;

public abstract class AbstractEvent extends EventObject
{
  public final int eventId;
  
  public AbstractEvent(int a) {
    a.<init>();new EventObject(a);
    eventId = a;
  }
  
  public abstract void call(java.util.EventListener paramEventListener);
  
  public static String jdMethod_this(Object a)
  {
    int tmp9_8 = 2;
    int tmp28_25 = (a = (String)a).length();
    int tmp32_31 = 1;
    tmp32_31;
    int j;
    int ? = tmp32_31;
    int k = tmp28_25;
    int tmp42_38 = (j = new char[tmp28_25] - 1);
    tmp42_38;
    int i = (0x2 ^ 0x5) << 4;
    (5 << 4 ^ tmp9_8 << tmp9_8 ^ 0x3);
    if (tmp42_38 >= 0)
    {
      int tmp52_51 = j;
      j--;
      ?[tmp52_51] = ((char)(a.charAt(tmp52_51) ^ i));
      int tmp73_70 = (j--);
      ?[tmp73_70] = ((char)(a.charAt(tmp73_70) ^ k));
    }
    return new String(?);
  }
}
