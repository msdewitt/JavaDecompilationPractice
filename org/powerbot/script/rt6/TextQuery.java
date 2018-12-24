package org.powerbot.script.rt6;

import org.powerbot.script.AbstractQuery;
import org.powerbot.script.Textable;
import org.powerbot.script.Textable.Matcher;
import org.powerbot.script.Textable.Query;


public abstract class TextQuery<K extends Textable>
  extends AbstractQuery<TextQuery<K>, K, ClientContext>
  implements Textable.Query<TextQuery<K>>
{
  public TextQuery(ClientContext arg0)
  {
    super(arg0);
  }
  
  protected TextQuery<K> getThis()
  {
    return this;
  }
  
  public TextQuery<K> text(String... arg0)
  {
    return (TextQuery)select(new Textable.Matcher(arg0));
  }
}
