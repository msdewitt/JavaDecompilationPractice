package org.powerbot.script.rt4;

import java.util.Arrays;
import java.util.Iterator;
import org.powerbot.bot.rt4.client.Client;
import org.powerbot.script.Identifiable;
import org.powerbot.script.Validatable;








public class Widget
  extends ClientAccessor
  implements Identifiable, Validatable, Iterable<Component>
{
  private final int index;
  private Component[] sparseCache;
  
  Widget(ClientContext arg0, int arg1)
  {
    super(arg0);
    index = arg1;
    sparseCache = new Component[0];
  }
  



  public int id()
  {
    return index;
  }
  






  public synchronized Component component(int arg0)
  {
    if (arg0 < 0) {
      return new Component((ClientContext)ctx, this, -1);
    }
    if ((arg0 < sparseCache.length) && (sparseCache[arg0] != null)) {
      return sparseCache[arg0];
    }
    Component localComponent = new Component((ClientContext)ctx, this, arg0);
    int i = sparseCache.length;
    if (arg0 >= i) {
      sparseCache = ((Component[])Arrays.copyOf(sparseCache, arg0 + 1));
      for (int j = i; j < arg0 + 1; j++) {
        sparseCache[j] = new Component((ClientContext)ctx, this, j);
      }
    }
    return sparseCache[arg0] =  = localComponent;
  }
  
  public int componentCount() {
    Client localClient = (Client)((ClientContext)ctx).client();
    org.powerbot.bot.rt4.client.Widget[][] arrayOfWidget = localClient != null ? localClient.getWidgets() : (org.powerbot.bot.rt4.client.Widget[][])null;
    if ((arrayOfWidget != null) && (index < arrayOfWidget.length)) {
      org.powerbot.bot.rt4.client.Widget[] arrayOfWidget1 = arrayOfWidget[index];
      return arrayOfWidget1 != null ? arrayOfWidget1.length : 0;
    }
    return 0;
  }
  




  public Component[] components()
  {
    int i = componentCount();
    if (i <= 0) {
      return new Component[0];
    }
    component(i - 1);
    return (Component[])Arrays.copyOf(sparseCache, i);
  }
  



  public boolean valid()
  {
    if (index < 1) {
      return false;
    }
    Client localClient = (Client)((ClientContext)ctx).client();
    org.powerbot.bot.rt4.client.Widget[][] arrayOfWidget = localClient != null ? localClient.getWidgets() : (org.powerbot.bot.rt4.client.Widget[][])null;
    return (arrayOfWidget != null) && (index > -1) && (index < arrayOfWidget.length) && (arrayOfWidget[index] != null) && (arrayOfWidget[index].length > 0);
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
