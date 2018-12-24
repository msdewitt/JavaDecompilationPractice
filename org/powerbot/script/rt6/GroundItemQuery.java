package org.powerbot.script.rt6;

import java.util.Collection;
import java.util.regex.Pattern;
import org.powerbot.script.AbstractQuery;
import org.powerbot.script.Actionable.Matcher;
import org.powerbot.script.Actionable.Query;
import org.powerbot.script.Area;
import org.powerbot.script.Identifiable;
import org.powerbot.script.Identifiable.Matcher;
import org.powerbot.script.Identifiable.Query;
import org.powerbot.script.Locatable;
import org.powerbot.script.Locatable.Matcher;
import org.powerbot.script.Locatable.NearestTo;
import org.powerbot.script.Locatable.Query;
import org.powerbot.script.Nameable;
import org.powerbot.script.Nameable.Matcher;
import org.powerbot.script.Stackable;
import org.powerbot.script.Stackable.Query;
import org.powerbot.script.Viewable;

public abstract class GroundItemQuery<K extends Locatable,  extends Identifiable,  extends Nameable,  extends Stackable,  extends Viewable,  extends org.powerbot.script.Actionable> extends AbstractQuery<GroundItemQuery<K>, K, ClientContext> implements Locatable.Query<GroundItemQuery<K>>, Identifiable.Query<GroundItemQuery<K>>, org.powerbot.script.Nameable.Query<GroundItemQuery<K>>, Stackable.Query<GroundItemQuery<K>>, org.powerbot.script.Viewable.Query<GroundItemQuery<K>>, Actionable.Query<GroundItemQuery<K>>
{
  public GroundItemQuery(ClientContext arg0)
  {
    super(arg0);
  }
  



  protected GroundItemQuery<K> getThis()
  {
    return this;
  }
  



  public GroundItemQuery<K> at(Locatable arg0)
  {
    return (GroundItemQuery)select(new Locatable.Matcher(arg0.tile()));
  }
  



  public GroundItemQuery<K> within(double arg0)
  {
    return within(ctx).players.local().tile(), arg0);
  }
  



  public GroundItemQuery<K> within(Locatable arg0, double arg1)
  {
    return (GroundItemQuery)select(new org.powerbot.script.Locatable.WithinRange(arg0.tile(), arg1));
  }
  



  public GroundItemQuery<K> within(Area arg0)
  {
    return (GroundItemQuery)select(new org.powerbot.script.Locatable.WithinArea(arg0));
  }
  




  public GroundItemQuery<K> nearest()
  {
    return nearest(ctx).players.local().tile());
  }
  



  public GroundItemQuery<K> nearest(Locatable arg0)
  {
    return (GroundItemQuery)sort(new Locatable.NearestTo(arg0.tile()));
  }
  



  public GroundItemQuery<K> id(int... arg0)
  {
    return (GroundItemQuery)select(new Identifiable.Matcher(arg0));
  }
  



  public GroundItemQuery<K> id(int[]... arg0)
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
    
    return (GroundItemQuery)select(new Identifiable.Matcher((int[])???));
  }
  



  public GroundItemQuery<K> id(Identifiable... arg0)
  {
    return (GroundItemQuery)select(new Identifiable.Matcher(arg0));
  }
  



  public GroundItemQuery<K> name(String... arg0)
  {
    return (GroundItemQuery)select(new Nameable.Matcher(arg0));
  }
  



  public GroundItemQuery<K> name(Collection<String> arg0)
  {
    return (GroundItemQuery)select(new Nameable.Matcher(arg0));
  }
  



  public GroundItemQuery<K> name(String[]... arg0)
  {
    return (GroundItemQuery)select(new Nameable.Matcher(arg0));
  }
  



  public GroundItemQuery<K> name(Pattern... arg0)
  {
    return (GroundItemQuery)select(new Nameable.Matcher(arg0));
  }
  



  public GroundItemQuery<K> name(Nameable... arg0)
  {
    return (GroundItemQuery)select(new Nameable.Matcher(arg0));
  }
  



  public GroundItemQuery<K> action(String... arg0)
  {
    return (GroundItemQuery)select(new Actionable.Matcher(arg0));
  }
  



  public GroundItemQuery<K> action(Collection<String> arg0)
  {
    return (GroundItemQuery)select(new Actionable.Matcher(arg0));
  }
  



  public GroundItemQuery<K> action(Pattern... arg0)
  {
    return (GroundItemQuery)select(new Actionable.Matcher(arg0));
  }
  



  public GroundItemQuery<K> viewable()
  {
    (GroundItemQuery)select(new org.powerbot.script.Filter()
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
