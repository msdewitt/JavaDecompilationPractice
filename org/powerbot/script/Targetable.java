package org.powerbot.script;

import java.awt.Point;

public abstract interface Targetable
{
  public abstract Point nextPoint();
  
  public abstract boolean contains(Point paramPoint);
}
