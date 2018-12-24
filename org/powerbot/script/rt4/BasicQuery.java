package org.powerbot.script.rt4;

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
import org.powerbot.script.Viewable;
import org.powerbot.script.Viewable.Query;

public abstract class BasicQuery<K extends Locatable,  extends Identifiable,  extends Nameable,  extends Viewable,  extends org.powerbot.script.Actionable> extends AbstractQuery<BasicQuery<K>, K, ClientContext> implements Locatable.Query<BasicQuery<K>>, Identifiable.Query<BasicQuery<K>>, org.powerbot.script.Nameable.Query<BasicQuery<K>>, Viewable.Query<BasicQuery<K>>, Actionable.Query<BasicQuery<K>>
{
  public BasicQuery(ClientContext arg0)
  {
    super(arg0);
  }
  



  protected BasicQuery<K> getThis()
  {
    return this;
  }
  



  public BasicQuery<K> at(Locatable arg0)
  {
    return (BasicQuery)select(new Locatable.Matcher(arg0.tile()));
  }
  



  public BasicQuery<K> within(double arg0)
  {
    return within(ctx).players.local().tile(), arg0);
  }
  



  public BasicQuery<K> within(Locatable arg0, double arg1)
  {
    return (BasicQuery)select(new org.powerbot.script.Locatable.WithinRange(arg0.tile(), arg1));
  }
  



  public BasicQuery<K> within(Area arg0)
  {
    return (BasicQuery)select(new org.powerbot.script.Locatable.WithinArea(arg0));
  }
  



  public BasicQuery<K> nearest()
  {
    return nearest(ctx).players.local().tile());
  }
  



  public BasicQuery<K> nearest(Locatable arg0)
  {
    return (BasicQuery)sort(new Locatable.NearestTo(arg0.tile()));
  }
  



  public BasicQuery<K> id(int... arg0)
  {
    return (BasicQuery)select(new Identifiable.Matcher(arg0));
  }
  



  public BasicQuery<K> id(int[]... arg0)
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
    
    return (BasicQuery)select(new Identifiable.Matcher((int[])???));
  }
  



  public BasicQuery<K> id(Identifiable... arg0)
  {
    return (BasicQuery)select(new Identifiable.Matcher(arg0));
  }
  



  public BasicQuery<K> name(String... arg0)
  {
    return (BasicQuery)select(new Nameable.Matcher(arg0));
  }
  



  public BasicQuery<K> name(Collection<String> arg0)
  {
    return (BasicQuery)select(new Nameable.Matcher(arg0));
  }
  



  public BasicQuery<K> name(String[]... arg0)
  {
    return (BasicQuery)select(new Nameable.Matcher(arg0));
  }
  



  public BasicQuery<K> name(Pattern... arg0)
  {
    return (BasicQuery)select(new Nameable.Matcher(arg0));
  }
  



  public BasicQuery<K> name(Nameable... arg0)
  {
    return (BasicQuery)select(new Nameable.Matcher(arg0));
  }
  



  public BasicQuery<K> action(String... arg0)
  {
    return (BasicQuery)select(new Actionable.Matcher(arg0));
  }
  



  public BasicQuery<K> action(Collection<String> arg0)
  {
    return (BasicQuery)select(new Actionable.Matcher(arg0));
  }
  



  public BasicQuery<K> action(Pattern... arg0)
  {
    return (BasicQuery)select(new Actionable.Matcher(arg0));
  }
  



  public BasicQuery<K> viewable()
  {
    (BasicQuery)select(new org.powerbot.script.Filter()
    {
      public boolean accept(K arg0) {
        return ((Viewable)arg0).inViewport();
      }
    });
  }
}
