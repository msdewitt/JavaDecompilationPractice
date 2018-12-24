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
import org.powerbot.script.Locatable.WithinRange;
import org.powerbot.script.Nameable;
import org.powerbot.script.Nameable.Matcher;
import org.powerbot.script.Viewable;
import org.powerbot.script.Viewable.Query;

public abstract class MobileIdNameQuery<K extends Locatable,  extends Identifiable,  extends Nameable,  extends Viewable,  extends org.powerbot.script.Actionable> extends AbstractQuery<MobileIdNameQuery<K>, K, ClientContext> implements Locatable.Query<MobileIdNameQuery<K>>, Identifiable.Query<MobileIdNameQuery<K>>, org.powerbot.script.Nameable.Query<MobileIdNameQuery<K>>, Viewable.Query<MobileIdNameQuery<K>>, Actionable.Query<MobileIdNameQuery<K>>
{
  public MobileIdNameQuery(ClientContext arg0)
  {
    super(arg0);
  }
  



  protected MobileIdNameQuery<K> getThis()
  {
    return this;
  }
  



  public MobileIdNameQuery<K> at(Locatable arg0)
  {
    return (MobileIdNameQuery)select(new Locatable.Matcher(arg0.tile()));
  }
  



  public MobileIdNameQuery<K> within(double arg0)
  {
    return within(ctx).players.local().tile(), arg0);
  }
  



  public MobileIdNameQuery<K> within(Locatable arg0, double arg1)
  {
    return (MobileIdNameQuery)select(new Locatable.WithinRange(arg0.tile(), arg1));
  }
  



  public MobileIdNameQuery<K> within(Area arg0)
  {
    return (MobileIdNameQuery)select(new org.powerbot.script.Locatable.WithinArea(arg0));
  }
  



  public MobileIdNameQuery<K> nearest()
  {
    return nearest(ctx).players.local().tile());
  }
  



  public MobileIdNameQuery<K> nearest(Locatable arg0)
  {
    return (MobileIdNameQuery)sort(new Locatable.NearestTo(arg0.tile()));
  }
  



  public MobileIdNameQuery<K> id(int... arg0)
  {
    return (MobileIdNameQuery)select(new Identifiable.Matcher(arg0));
  }
  



  public MobileIdNameQuery<K> id(int[]... arg0)
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
    
    return (MobileIdNameQuery)select(new Identifiable.Matcher((int[])???));
  }
  



  public MobileIdNameQuery<K> id(Identifiable... arg0)
  {
    return (MobileIdNameQuery)select(new Identifiable.Matcher(arg0));
  }
  



  public MobileIdNameQuery<K> name(String... arg0)
  {
    return (MobileIdNameQuery)select(new Nameable.Matcher(arg0));
  }
  



  public MobileIdNameQuery<K> name(Collection<String> arg0)
  {
    return (MobileIdNameQuery)select(new Nameable.Matcher(arg0));
  }
  



  public MobileIdNameQuery<K> name(String[]... arg0)
  {
    return (MobileIdNameQuery)select(new Nameable.Matcher(arg0));
  }
  



  public MobileIdNameQuery<K> name(Pattern... arg0)
  {
    return (MobileIdNameQuery)select(new Nameable.Matcher(arg0));
  }
  



  public MobileIdNameQuery<K> name(Nameable... arg0)
  {
    return (MobileIdNameQuery)select(new Nameable.Matcher(arg0));
  }
  



  public MobileIdNameQuery<K> action(String... arg0)
  {
    return (MobileIdNameQuery)select(new Actionable.Matcher(arg0));
  }
  



  public MobileIdNameQuery<K> action(Collection<String> arg0)
  {
    return (MobileIdNameQuery)select(new Actionable.Matcher(arg0));
  }
  



  public MobileIdNameQuery<K> action(Pattern... arg0)
  {
    return (MobileIdNameQuery)select(new Actionable.Matcher(arg0));
  }
  



  public MobileIdNameQuery<K> viewable()
  {
    (MobileIdNameQuery)select(new org.powerbot.script.Filter()
    {
      public boolean accept(K arg0) {
        return ((Viewable)arg0).inViewport();
      }
    });
  }
}
