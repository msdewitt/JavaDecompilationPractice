package org.powerbot.bot;

import java.util.EventListener;
import java.util.EventObject;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public abstract class EventDispatcher extends java.util.AbstractCollection<EventListener> implements Runnable, java.io.Closeable
{
  private final AtomicReference<Thread> jdField_if;
  private final CopyOnWriteArrayList<EventListener> jdField_null;
  protected final java.util.Map<EventListener, Long> jdField_byte;
  private final java.util.concurrent.BlockingQueue<EventObject> jdField_new;
  protected final java.util.Map<Class<? extends EventListener>, Integer> jdField_void;
  
  protected EventDispatcher()
  {
    a;a.<init>(null);jdField_if = a;
    a;a.<init>();jdField_null = a;
    a;a.<init>();jdField_byte = a;
    a;a.<init>();jdField_new = a;
    a;a.<init>();jdField_void = a;
  }
  
  /* Error */
  private long jdMethod_this(EventListener a)
  {
    // Byte code:
    //   0: lconst_0
    //   1: lstore_2
    //   2: aload_0
    //   3: getfield 62	org/powerbot/bot/EventDispatcher:void	Ljava/util/Map;
    //   6: invokeinterface 70 1 0
    //   11: invokeinterface 76 1 0
    //   16: astore 4
    //   18: aload 4
    //   20: invokeinterface 82 1 0
    //   25: ifeq +52 -> 77
    //   28: aload 4
    //   30: invokeinterface 86 1 0
    //   35: checkcast 14	java/util/Map$Entry
    //   38: dup
    //   39: astore 5
    //   41: invokeinterface 89 1 0
    //   46: checkcast 91	java/lang/Class
    //   49: aload_1
    //   50: invokevirtual 95	java/lang/Class:isInstance	(Ljava/lang/Object;)Z
    //   53: ifeq -35 -> 18
    //   56: lload_2
    //   57: aload 5
    //   59: invokeinterface 98 1 0
    //   64: checkcast 100	java/lang/Integer
    //   67: invokevirtual 104	java/lang/Integer:intValue	()I
    //   70: i2l
    //   71: lor
    //   72: lstore_2
    //   73: goto -55 -> 18
    //   76: athrow
    //   77: lload_2
    //   78: lreturn
    // Line number table:
    //   Java source line #27	-> byte code offset #0
    //   Java source line #29	-> byte code offset #2
    //   Java source line #30	-> byte code offset #41
    //   Java source line #31	-> byte code offset #56
    //   Java source line #33	-> byte code offset #73
    //   Java source line #35	-> byte code offset #77
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	a	EventDispatcher
    //   0	79	1	a	EventListener
  }
  
  public final void dispatch(EventObject a)
  {
    jdField_new.offer(a);
  }
  
  public final void consume(EventObject a) {
    a.jdMethod_this(a, a.jdMethod_this(a));
  }
  
  protected abstract void jdMethod_this(EventObject paramEventObject, int paramInt);
  
  protected abstract int jdMethod_this(EventObject paramEventObject);
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 42	org/powerbot/bot/EventDispatcher:if	Ljava/util/concurrent/atomic/AtomicReference;
    //   4: aconst_null
    //   5: invokestatic 133	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   8: invokevirtual 137	java/util/concurrent/atomic/AtomicReference:compareAndSet	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   11: ifne +5 -> 16
    //   14: return
    //   15: athrow
    //   16: invokestatic 140	java/lang/Thread:interrupted	()Z
    //   19: ifne +38 -> 57
    //   22: aload_0
    //   23: getfield 57	org/powerbot/bot/EventDispatcher:new	Ljava/util/concurrent/BlockingQueue;
    //   26: invokeinterface 143 1 0
    //   31: checkcast 145	java/util/EventObject
    //   34: astore_1
    //   35: aload_0
    //   36: goto +10 -> 46
    //   39: athrow
    //   40: astore_2
    //   41: aload_0
    //   42: goto +16 -> 58
    //   45: athrow
    //   46: aload_1
    //   47: invokevirtual 147	org/powerbot/bot/EventDispatcher:consume	(Ljava/util/EventObject;)V
    //   50: goto -34 -> 16
    //   53: astore_2
    //   54: goto -38 -> 16
    //   57: aload_0
    //   58: getfield 42	org/powerbot/bot/EventDispatcher:if	Ljava/util/concurrent/atomic/AtomicReference;
    //   61: aconst_null
    //   62: invokevirtual 150	java/util/concurrent/atomic/AtomicReference:set	(Ljava/lang/Object;)V
    //   65: return
    // Line number table:
    //   Java source line #52	-> byte code offset #0
    //   Java source line #53	-> byte code offset #14
    //   Java source line #56	-> byte code offset #16
    //   Java source line #60	-> byte code offset #22
    //   Java source line #63	-> byte code offset #36
    //   Java source line #61	-> byte code offset #40
    //   Java source line #62	-> byte code offset #42
    //   Java source line #66	-> byte code offset #45
    //   Java source line #68	-> byte code offset #50
    //   Java source line #67	-> byte code offset #53
    //   Java source line #69	-> byte code offset #54
    //   Java source line #71	-> byte code offset #57
    //   Java source line #72	-> byte code offset #65
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	a	EventDispatcher
    // Exception table:
    //   from	to	target	type
    //   22	35	40	java/lang/InterruptedException
    //   46	50	53	java/lang/Throwable
  }
  
  public final void close()
  {
    Thread localThread;
    if ((localThread = (Thread)jdField_if.get()) != null) {
      localThread.interrupt();
    }
  }
  
  public final Iterator<EventListener> iterator()
  {
    final Iterator localIterator = jdField_null.iterator();
    new Iterator() { private volatile EventListener jdField_byte = null;
      

      public boolean hasNext()
      {
        return localIterator.hasNext();
      }
      
      public EventListener next()
      {
        jdField_byte = ((EventListener)localIterator.next());
        return jdField_byte;
      }
      
      public void remove()
      {
        if (jdField_byte == null) {
          throw new IllegalStateException();
        }
        
        jdField_byte = null;jdField_void.remove(jdField_byte);
      }
    };
  }
  
  public final int size()
  {
    return jdField_null.size();
  }
  
  public final boolean add(EventListener a)
  {
    if (jdField_null.addIfAbsent(a)) {
      EventListener tmp18_17 = a;jdField_byte.put(tmp18_17, Long.valueOf(a.jdMethod_this(tmp18_17))); int 
        tmp32_31 = 1;tmp32_31;return tmp32_31;throw 1;
    }
    
    int tmp38_37 = 1;tmp38_37;return tmp38_37;
  }
  
  public final boolean remove(EventListener a) {
    if (jdField_null.remove(a)) {
      jdField_byte.remove(a); int 
        tmp24_23 = 1;tmp24_23;return tmp24_23;throw 1;
    }
    
    int tmp30_29 = 1;tmp30_29;return tmp30_29;
  }
  
  public final boolean contains(Class<? extends EventListener> a) {
    for (Iterator localIterator = jdField_null.iterator(); localIterator.hasNext();)
      if (((EventListener)localIterator.next()).getClass().isAssignableFrom(a)) {
        int tmp37_36 = 1; int tmp38_37 = tmp37_36;tmp38_37;return tmp38_37;
        
        throw tmp37_36; }
    int tmp48_47 = 1;tmp48_47;return tmp48_47;
  }
  
  public static String jdMethod_this(Object a)
  {
    int tmp12_11 = 1;
    int tmp24_21 = (a = (String)a).length();
    int tmp28_27 = 1;
    tmp28_27;
    int j;
    int ? = tmp28_27;
    int k = tmp24_21;
    int tmp38_34 = (j = new char[tmp24_21] - 1);
    tmp38_34;
    int i = 5 << 4 ^ tmp12_11 << tmp12_11;
    ((0x3 ^ 0x5) << 3 ^ 0x2);
    if (tmp38_34 >= 0)
    {
      int tmp48_47 = j;
      j--;
      ?[tmp48_47] = ((char)(a.charAt(tmp48_47) ^ i));
      int tmp69_66 = (j--);
      ?[tmp69_66] = ((char)(a.charAt(tmp69_66) ^ k));
    }
    return new String(?);
  }
}
