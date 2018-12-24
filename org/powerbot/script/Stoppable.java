package org.powerbot.script;

public abstract interface Stoppable
{
  public abstract boolean isStopping();
  
  public abstract void stop();
}
