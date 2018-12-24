package org.powerbot.script.rt6;

import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.powerbot.bot.rt6.client.AnimationBridge;
import org.powerbot.bot.rt6.client.Animator;
import org.powerbot.bot.rt6.client.RenderableEntity;


public class BasicObject
{
  protected final RenderableEntity object;
  private final int floor;
  
  public BasicObject(RenderableEntity arg0, int arg1)
  {
    object = arg0;
    floor = arg1;
  }
  
  private boolean isDynamic() {
    Class localClass = object.getClass();
    try {
      return localClass.getDeclaredMethod("getBridge", new Class[0]) != null;
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}
    return false;
  }
  
  private AnimationBridge d() {
    Class localClass = object.getClass();
    try {
      Method localMethod = localClass.getMethod("getBridge", new Class[0]);
      return (AnimationBridge)localMethod.invoke(object, new Object[0]);
    }
    catch (NoSuchMethodException localNoSuchMethodException1) {}catch (InvocationTargetException localInvocationTargetException1) {}catch (IllegalAccessException localIllegalAccessException1) {}
    

    return null;
  }
  
  public int getId() {
    if (isDynamic()) {
      localObject = d();
      int i = ((AnimationBridge)localObject).getVariableId();
      if (i != -1) {
        return i;
      }
      return ((AnimationBridge)localObject).getId();
    }
    Object localObject = object.getClass();
    try {
      Method localMethod = ((Class)localObject).getMethod("getId", new Class[0]);
      return ((Integer)localMethod.invoke(object, new Object[0])).intValue();
    }
    catch (Exception localException1) {}
    return -1;
  }
  
  public int getMainId() {
    if (isDynamic()) {
      localObject = d();
      return ((AnimationBridge)localObject).getId();
    }
    Object localObject = object.getClass();
    try {
      Method localMethod = ((Class)localObject).getMethod("getId", new Class[0]);
      return ((Integer)localMethod.invoke(object, new Object[0])).intValue();
    }
    catch (Exception localException1) {}
    return -1;
  }
  
  public Animator getAnimator() {
    if (isDynamic()) {
      return d().getAnimator();
    }
    return new Animator(object.reflector, null);
  }
  
  public int getOrientation() {
    if (isDynamic()) {
      return d().getOrientation();
    }
    Class localClass = object.getClass();
    try {
      Method localMethod = localClass.getMethod("getOrientation", new Class[0]);
      return ((Byte)localMethod.invoke(object, new Object[0])).byteValue();
    }
    catch (Exception localException1) {}
    return -1;
  }
  
  public int getType() {
    if (isDynamic()) {
      return d().getType();
    }
    Class localClass = object.getClass();
    try {
      Method localMethod = localClass.getMethod("getType", new Class[0]);
      return ((Integer)localMethod.invoke(object, new Object[0])).intValue();
    }
    catch (Exception localException1) {}
    return -1;
  }
  
  public int getFloor() {
    return floor;
  }
  
  public Object getObject() {
    return object.obj.get();
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
    int tmp20_19 = 2;
    int tmp34_31 = (s = (String)s).length();
    int tmp38_37 = 1;
    tmp38_37;
    int j;
    int ? = tmp38_37;
    int k = tmp34_31;
    (j = new char[tmp34_31] - 1);
    int i = (0x3 ^ 0x5) << 4 ^ tmp20_19 << tmp20_19 ^ 0x3;
    if (((0x2 ^ 0x5) << 4 ^ 0x1) >= 0)
    {
      int tmp57_56 = j;
      j--;
      ?[tmp57_56] = ((char)(s.charAt(tmp57_56) ^ i));
      int tmp78_75 = (j--);
      ?[tmp78_75] = ((char)(s.charAt(tmp78_75) ^ k));
    }
    return new String(?);
  }
}
