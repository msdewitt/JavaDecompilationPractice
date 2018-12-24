package org.powerbot.script.rt6;

import org.powerbot.script.AbstractQuery;
import org.powerbot.script.Identifiable;
import org.powerbot.script.Identifiable.Matcher;
import org.powerbot.script.Identifiable.Query;

public abstract class IdQuery<K extends Identifiable>
  extends AbstractQuery<IdQuery<K>, K, ClientContext>
  implements Identifiable.Query<IdQuery<K>>
{
  public IdQuery(ClientContext arg0)
  {
    super(arg0);
  }
  



  protected IdQuery<K> getThis()
  {
    return this;
  }
  



  public IdQuery<K> id(int... arg0)
  {
    return (IdQuery)select(new Identifiable.Matcher(arg0));
  }
  



  public IdQuery<K> id(int[]... arg0)
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
    
    return (IdQuery)select(new Identifiable.Matcher((int[])???));
  }
  



  public IdQuery<K> id(Identifiable... arg0)
  {
    return (IdQuery)select(new Identifiable.Matcher(arg0));
  }
}
