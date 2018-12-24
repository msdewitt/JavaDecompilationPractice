package org.powerbot.script.rt6;

import org.powerbot.script.AbstractQuery;
import org.powerbot.script.Area;
import org.powerbot.script.Locatable;
import org.powerbot.script.Locatable.Matcher;
import org.powerbot.script.Locatable.NearestTo;
import org.powerbot.script.Locatable.Query;
import org.powerbot.script.Locatable.WithinArea;
import org.powerbot.script.Locatable.WithinRange;

public abstract class HintArrowQuery<K extends Locatable> extends AbstractQuery<HintArrowQuery<K>, K, ClientContext> implements Locatable.Query<HintArrowQuery<K>>
{
  public HintArrowQuery(ClientContext arg0)
  {
    super(arg0);
  }
  



  protected HintArrowQuery<K> getThis()
  {
    return this;
  }
  



  public HintArrowQuery<K> at(Locatable arg0)
  {
    return (HintArrowQuery)select(new Locatable.Matcher(arg0));
  }
  



  public HintArrowQuery<K> within(double arg0)
  {
    return within(ctx).players.local(), arg0);
  }
  



  public HintArrowQuery<K> within(Locatable arg0, double arg1)
  {
    return (HintArrowQuery)select(new Locatable.WithinRange(arg0, arg1));
  }
  



  public HintArrowQuery<K> within(Area arg0)
  {
    return (HintArrowQuery)select(new Locatable.WithinArea(arg0));
  }
  



  public HintArrowQuery<K> nearest()
  {
    return nearest(ctx).players.local());
  }
  



  public HintArrowQuery<K> nearest(Locatable arg0)
  {
    return (HintArrowQuery)sort(new Locatable.NearestTo(arg0));
  }
}
