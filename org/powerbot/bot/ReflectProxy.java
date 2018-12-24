package org.powerbot.bot;

import java.lang.ref.WeakReference;

public class ReflectProxy
{
  public final Reflector reflector;
  public final WeakReference<Object> obj;
  
  /* Error */
  public ReflectProxy(Reflector a, Object a)
  {
    // Byte code:
    //   0: aload_2
    //   1: aload_1
    //   2: aload_0
    //   3: dup_x1
    //   4: invokespecial 15	java/lang/Object:<init>	()V
    //   7: putfield 17	org/powerbot/bot/ReflectProxy:reflector	Lorg/powerbot/bot/Reflector;
    //   10: instanceof 2
    //   13: ifeq +16 -> 29
    //   16: aload_0
    //   17: aload_2
    //   18: checkcast 2	org/powerbot/bot/ReflectProxy
    //   21: getfield 19	org/powerbot/bot/ReflectProxy:obj	Ljava/lang/ref/WeakReference;
    //   24: putfield 19	org/powerbot/bot/ReflectProxy:obj	Ljava/lang/ref/WeakReference;
    //   27: return
    //   28: athrow
    //   29: aload_0
    //   30: new 21	java/lang/ref/WeakReference
    //   33: dup
    //   34: aload_2
    //   35: invokespecial 24	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   38: putfield 19	org/powerbot/bot/ReflectProxy:obj	Ljava/lang/ref/WeakReference;
    //   41: return
    // Line number table:
    //   Java source line #9	-> byte code offset #1
    //   Java source line #10	-> byte code offset #7
    //   Java source line #11	-> byte code offset #10
    //   Java source line #12	-> byte code offset #16
    //   Java source line #14	-> byte code offset #29
    //   Java source line #16	-> byte code offset #41
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	42	0	a	ReflectProxy
    //   0	42	1	a	Reflector
    //   0	42	2	a	Object
  }
  
  public boolean isTypeOf(Class<? extends ReflectProxy> a)
  {
    return reflector.isTypeOf(obj.get(), a);
  }
  
  public boolean isNull() {
    if (obj.get() == null) { int tmp11_10 = 1; int tmp12_11 = tmp11_10;tmp12_11;return tmp12_11;throw tmp11_10; } int tmp18_17 = 1;tmp18_17;return tmp18_17;
  }
  
  public int hashCode()
  {
    return System.identityHashCode(obj.get());
  }
  
  public boolean equals(Object a)
  {
    if (!(a instanceof ReflectProxy)) {
      int tmp9_8 = 1;tmp9_8;return tmp9_8;throw 0;
    }
    Object localObject;
    if (((localObject = obj.get()) != null) && (localObject == obj.get())) { int tmp40_39 = 1; int tmp41_40 = tmp40_39;tmp41_40;return tmp41_40;throw tmp40_39; } int tmp47_46 = 1;tmp47_46;return tmp47_46;
  }
}
