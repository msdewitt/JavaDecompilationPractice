package org.powerbot.script.rt4;

import java.util.Collection;
import java.util.regex.Pattern;
import org.powerbot.script.AbstractQuery;
import org.powerbot.script.Area;
import org.powerbot.script.Filter;
import org.powerbot.script.Locatable;
import org.powerbot.script.Locatable.NearestTo;
import org.powerbot.script.Locatable.Query;
import org.powerbot.script.Locatable.WithinArea;
import org.powerbot.script.Nameable;
import org.powerbot.script.Nameable.Matcher;
import org.powerbot.script.Nameable.Query;
import org.powerbot.script.Viewable;

public abstract class PlayerQuery<K extends Locatable,  extends Nameable,  extends Viewable> extends AbstractQuery<PlayerQuery<K>, K, ClientContext> implements Locatable.Query<PlayerQuery<K>>, Nameable.Query<PlayerQuery<K>>, org.powerbot.script.Viewable.Query<PlayerQuery<K>>
{
  protected PlayerQuery(ClientContext arg0)
  {
    super(arg0);
  }
  



  protected PlayerQuery<K> getThis()
  {
    return this;
  }
  



  public PlayerQuery<K> at(Locatable arg0)
  {
    return (PlayerQuery)select(new org.powerbot.script.Locatable.Matcher(arg0));
  }
  



  public PlayerQuery<K> within(double arg0)
  {
    return within(ctx).players.local(), arg0);
  }
  



  public PlayerQuery<K> within(Locatable arg0, double arg1)
  {
    return (PlayerQuery)select(new org.powerbot.script.Locatable.WithinRange(arg0, arg1));
  }
  



  public PlayerQuery<K> within(Area arg0)
  {
    return (PlayerQuery)select(new Locatable.WithinArea(arg0));
  }
  



  public PlayerQuery<K> nearest()
  {
    return nearest(ctx).players.local());
  }
  



  public PlayerQuery<K> nearest(Locatable arg0)
  {
    return (PlayerQuery)sort(new Locatable.NearestTo(arg0));
  }
  



  public PlayerQuery<K> name(String... arg0)
  {
    return (PlayerQuery)select(new Nameable.Matcher(arg0));
  }
  



  public PlayerQuery<K> name(Collection<String> arg0)
  {
    return (PlayerQuery)select(new Nameable.Matcher(arg0));
  }
  



  public PlayerQuery<K> name(String[]... arg0)
  {
    return (PlayerQuery)select(new Nameable.Matcher(arg0));
  }
  



  public PlayerQuery<K> name(Pattern... arg0)
  {
    return (PlayerQuery)select(new Nameable.Matcher(arg0));
  }
  



  public PlayerQuery<K> name(Nameable... arg0)
  {
    return (PlayerQuery)select(new Nameable.Matcher(arg0));
  }
  



  public PlayerQuery<K> viewable()
  {
    (PlayerQuery)select(new Filter()
    {
      public boolean accept(K arg0) {
        return ((Viewable)arg0).inViewport();
      }
    });
  }
}
