package org.powerbot.script;

public abstract interface Suspendable
{
  public abstract boolean isSuspended();
  
  public abstract void suspend();
  
  public abstract void resume();
}
