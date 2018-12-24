package org.powerbot.script.rt6;

import java.util.Arrays;
import java.util.Iterator;
import org.powerbot.bot.rt6.client.Client;
import org.powerbot.bot.rt6.client.ComponentContainer;
import org.powerbot.script.Identifiable;
import org.powerbot.script.Validatable;








public class Widget
  extends ClientAccessor
  implements Identifiable, Validatable, Iterable<Component>
{
  private final int index;
  private final Object LOCK;
  private Component[] cache;
  
  public Widget(ClientContext arg0, int arg1)
  {
    super(arg0);
    index = arg1;
    LOCK = new Object();
    cache = new Component[0];
  }
  



  public int id()
  {
    return index;
  }
  




  public int componentCount()
  {
    Object[] arrayOfObject = getInternalComponents();
    return arrayOfObject != null ? arrayOfObject.length : 0;
  }
  




  public Component[] components()
  {
    synchronized (LOCK) {
      Object[] arrayOfObject = getInternalComponents();
      if (arrayOfObject == null) {
        return cache;
      }
      if (cache.length < arrayOfObject.length) {
        int i = cache.length;
        cache = ((Component[])Arrays.copyOf(cache, arrayOfObject.length));
        for (int j = i; j < arrayOfObject.length; j++) {
          cache[j] = new Component((ClientContext)ctx, this, j);
        }
      }
      return (Component[])cache.clone();
    }
  }
  






  public Component component(int arg0)
  {
    synchronized (LOCK) {
      if (arg0 < cache.length) {
        return cache[arg0];
      }
      Object[] arrayOfObject = getInternalComponents();
      int i = Math.max(arrayOfObject != null ? arrayOfObject.length : 0, arg0 + 1);
      if (cache.length < i) {
        int j = cache.length;
        cache = ((Component[])Arrays.copyOf(cache, i));
        for (int k = j; k < i; k++) {
          cache[k] = new Component((ClientContext)ctx, this, k);
        }
      }
      return cache[arg0];
    }
  }
  



  public boolean valid()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    if ((localClient == null) || (index < 0)) {
      return false;
    }
    
    Object[] arrayOfObject = localClient.getWidgets();
    return (arrayOfObject.length > 0) && (index < arrayOfObject.length) && (arrayOfObject[index] != null) && (new ComponentContainer(reflector, arrayOfObject[index]).getComponents().length > 0);
  }
  
  Object[] getInternalComponents() {
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return null;
    }
    Object[] arrayOfObject = localClient.getWidgets();
    ComponentContainer localComponentContainer;
    if ((arrayOfObject != null) && (index >= 0) && (index < arrayOfObject.length) && (!(localComponentContainer = new ComponentContainer(reflector, arrayOfObject[index])).isNull())) {
      return localComponentContainer.getComponents();
    }
    return null;
  }
  
  public Iterator<Component> iterator()
  {
    final int i = componentCount();
    new Iterator() {
      private int nextId = 0;
      
      public boolean hasNext()
      {
        return nextId < i;
      }
      
      public Component next()
      {
        return component(nextId++);
      }
      
      public void remove()
      {
        throw new UnsupportedOperationException();
      }
    };
  }
  
  public String toString()
  {
    return getClass().getSimpleName() + "[" + index + "]";
  }
  
  public int hashCode()
  {
    return index;
  }
  
  public boolean equals(Object arg0)
  {
    if ((arg0 == null) || (!(arg0 instanceof Widget))) {
      return false;
    }
    Widget localWidget = (Widget)arg0;
    return index == index;
  }
}
