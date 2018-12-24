package org.powerbot.script;

import java.util.function.Predicate;














public abstract interface Filter<T>
  extends Predicate<T>
{
  public abstract boolean accept(T paramT);
  
  public boolean test(T arg0)
  {
    return accept(arg0);
  }
}
