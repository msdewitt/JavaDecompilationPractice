package org.powerbot.bot;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import org.powerbot.script.ClientContext;

public class ScriptEventDispatcher<C extends org.powerbot.script.Client, E extends java.util.EventListener> extends java.util.AbstractCollection<E>
{
  private final ClientContext<C> jdField_new;
  private final java.util.Collection<E> jdField_void;
  
  public ScriptEventDispatcher(ClientContext<C> a)
  {
    jdField_new = a;
    a;a.<init>();jdField_void = a;
  }
  
  public boolean add(E a)
  {
    if ((jdField_new.bot()).dispatcher.add(a)) && (jdField_void.add(a))) { int tmp34_33 = 1; int tmp35_34 = tmp34_33;tmp35_34;return tmp35_34;throw tmp34_33; } int tmp41_40 = 1;tmp41_40;return tmp41_40;
  }
  
  public Iterator<E> iterator()
  {
    return new ListIterator(jdField_new, jdField_void.iterator());
  }
  
  public int size()
  {
    return jdField_void.size();
  }
  
  private final class ListIterator<C1 extends C, E1 extends E> implements Iterator<E1> {
    private final ClientContext<C1> jdField_null;
    private final Iterator<E1> jdField_byte;
    private final AtomicReference<E1> jdField_new;
    
    ListIterator(Iterator<E1> a) {
      jdField_null = a;
      jdField_byte = a;
      a;a.<init>(null);jdField_new = a;
    }
    
    public boolean hasNext()
    {
      return jdField_byte.hasNext();
    }
    
    public E1 next()
    {
      jdField_new.set(jdField_byte.next());
      return (java.util.EventListener)jdField_new.get();
    }
    
    public void remove()
    {
      if (jdField_new.get() == null) {
        throw new IllegalStateException();
      }
      
      jdField_byte.remove();jdField_null.bot()).dispatcher.remove((java.util.EventListener)jdField_new.getAndSet(null));
    }
  }
}
