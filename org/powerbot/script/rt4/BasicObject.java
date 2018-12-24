package org.powerbot.script.rt4;

import java.lang.reflect.Method;
import org.powerbot.bot.ReflectProxy;






public class BasicObject
{
  protected final ReflectProxy object;
  
  public BasicObject(ReflectProxy arg0)
  {
    object = arg0;
  }
  
  boolean isComplex() {
    Class localClass = object.getClass();
    try {
      return localClass.getDeclaredMethod("getX", new Class[0]) != null;
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}
    return false;
  }
  
  public int getUid() {
    Class localClass = object.getClass();
    try {
      Method localMethod = localClass.getMethod("getUid", new Class[0]);
      Object localObject = localMethod.invoke(object, new Object[0]);
      if ((localObject instanceof Integer)) {
        return ((Integer)localObject).intValue();
      }
      long l = ((Long)localObject).longValue();
      int i = (int)l & 0x7F;int j = (int)(l >> 7 & 0x7F);int k = (int)(l >> 17);
      return k << 14 | j << 7 | i;
    }
    catch (Exception localException1) {}
    return -1;
  }
  
  public int getMeta() {
    Class localClass = object.getClass();
    try {
      Method localMethod = localClass.getMethod("getMeta", new Class[0]);
      return ((Integer)localMethod.invoke(object, new Object[0])).intValue();
    }
    catch (Exception localException1) {}
    return -1;
  }
  
  public int getX() {
    Class localClass = object.getClass();
    try {
      Method localMethod = localClass.getMethod("getX", new Class[0]);
      return ((Integer)localMethod.invoke(object, new Object[0])).intValue();
    }
    catch (Exception localException1) {}
    return -1;
  }
  
  public int getZ() {
    Class localClass = object.getClass();
    try {
      Method localMethod = localClass.getMethod("getZ", new Class[0]);
      return ((Integer)localMethod.invoke(object, new Object[0])).intValue();
    }
    catch (Exception localException1) {}
    return -1;
  }
  
  public int getX1() {
    Class localClass = object.getClass();
    try {
      Method localMethod = localClass.getMethod("getX1", new Class[0]);
      return ((Integer)localMethod.invoke(object, new Object[0])).intValue();
    }
    catch (Exception localException1) {}
    return -1;
  }
  
  public int getY1() {
    Class localClass = object.getClass();
    try {
      Method localMethod = localClass.getMethod("getY1", new Class[0]);
      return ((Integer)localMethod.invoke(object, new Object[0])).intValue();
    }
    catch (Exception localException1) {}
    return -1;
  }
  
  public int getX2() {
    Class localClass = object.getClass();
    try {
      Method localMethod = localClass.getMethod("getX2", new Class[0]);
      return ((Integer)localMethod.invoke(object, new Object[0])).intValue();
    }
    catch (Exception localException1) {}
    return -1;
  }
  
  public int getY2() {
    Class localClass = object.getClass();
    try {
      Method localMethod = localClass.getMethod("getY2", new Class[0]);
      return ((Integer)localMethod.invoke(object, new Object[0])).intValue();
    }
    catch (Exception localException1) {}
    return -1;
  }
  
  public int hashCode()
  {
    return object.hashCode();
  }
  
  public boolean equals(Object arg0)
  {
    return ((arg0 instanceof BasicObject)) && (object.equals(object));
  }
  
  public static String jdMethod_this(Object s)
  {
    int tmp32_29 = (s = (String)s).length();
    int tmp36_35 = 1;
    tmp36_35;
    int j;
    int ? = tmp36_35;
    int k = tmp32_29;
    (j = new char[tmp32_29] - 1);
    int i = (0x2 ^ 0x5) << 3 ^ 0x3 ^ 0x5;
    if (((0x3 ^ 0x5) << 4 ^ 0x3) >= 0)
    {
      int tmp55_54 = j;
      j--;
      ?[tmp55_54] = ((char)(s.charAt(tmp55_54) ^ i));
      int tmp76_73 = (j--);
      ?[tmp76_73] = ((char)(s.charAt(tmp76_73) ^ k));
    }
    return new String(?);
  }
}
