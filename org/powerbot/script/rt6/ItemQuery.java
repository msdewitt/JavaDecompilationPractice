package org.powerbot.script.rt6;

import java.util.Collection;
import java.util.regex.Pattern;
import org.powerbot.script.AbstractQuery;
import org.powerbot.script.Actionable.Matcher;
import org.powerbot.script.Actionable.Query;
import org.powerbot.script.Filter;
import org.powerbot.script.Identifiable;
import org.powerbot.script.Identifiable.Matcher;
import org.powerbot.script.Nameable;
import org.powerbot.script.Nameable.Matcher;
import org.powerbot.script.Nameable.Query;
import org.powerbot.script.Stackable;
import org.powerbot.script.Stackable.Query;
import org.powerbot.script.Viewable;

public abstract class ItemQuery<K extends Identifiable,  extends Nameable,  extends Stackable,  extends org.powerbot.script.Actionable,  extends Viewable> extends AbstractQuery<ItemQuery<K>, K, ClientContext> implements org.powerbot.script.Identifiable.Query<ItemQuery<K>>, Nameable.Query<ItemQuery<K>>, Stackable.Query<ItemQuery<K>>, Actionable.Query<ItemQuery<K>>, org.powerbot.script.Viewable.Query<ItemQuery<K>>
{
  public ItemQuery(ClientContext arg0)
  {
    super(arg0);
  }
  



  protected ItemQuery<K> getThis()
  {
    return this;
  }
  



  public ItemQuery<K> id(int... arg0)
  {
    return (ItemQuery)select(new Identifiable.Matcher(arg0));
  }
  



  public ItemQuery<K> id(int[]... arg0)
  {
    int i = 0;
    
    for (Object localObject2 : arg0) {
      i += localObject2.length;
    }
    
    ??? = new int[i];
    ??? = 0;
    
    for (int[] arrayOfInt1 : arg0) {
      for (int i3 : arrayOfInt1) {
        ???[(???++)] = i3;
      }
    }
    
    return (ItemQuery)select(new Identifiable.Matcher((int[])???));
  }
  



  public ItemQuery<K> id(Identifiable... arg0)
  {
    return (ItemQuery)select(new Identifiable.Matcher(arg0));
  }
  



  public ItemQuery<K> name(String... arg0)
  {
    return (ItemQuery)select(new Nameable.Matcher(arg0));
  }
  



  public ItemQuery<K> name(Collection<String> arg0)
  {
    return (ItemQuery)select(new Nameable.Matcher(arg0));
  }
  



  public ItemQuery<K> name(String[]... arg0)
  {
    return (ItemQuery)select(new Nameable.Matcher(arg0));
  }
  



  public ItemQuery<K> name(Pattern... arg0)
  {
    return (ItemQuery)select(new Nameable.Matcher(arg0));
  }
  



  public ItemQuery<K> name(Nameable... arg0)
  {
    return (ItemQuery)select(new Nameable.Matcher(arg0));
  }
  



  public ItemQuery<K> action(String... arg0)
  {
    return (ItemQuery)select(new Actionable.Matcher(arg0));
  }
  



  public ItemQuery<K> action(Collection<String> arg0)
  {
    return (ItemQuery)select(new Actionable.Matcher(arg0));
  }
  



  public ItemQuery<K> action(Pattern... arg0)
  {
    return (ItemQuery)select(new Actionable.Matcher(arg0));
  }
  



  public ItemQuery<K> viewable()
  {
    (ItemQuery)select(new Filter()
    {
      public boolean accept(K arg0) {
        return ((Viewable)arg0).inViewport();
      }
    });
  }
  



  public int count()
  {
    return size();
  }
  



  public int count(boolean arg0)
  {
    if (!arg0) {
      return count();
    }
    int i = 0;
    for (Stackable localStackable : this) {
      i += localStackable.stackSize();
    }
    return i;
  }
}
