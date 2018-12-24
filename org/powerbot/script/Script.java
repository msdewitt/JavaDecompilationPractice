package org.powerbot.script;

import java.lang.annotation.Annotation;

public abstract interface Script extends java.util.EventListener
{
  public abstract java.util.List<Runnable> getExecQueue(State paramState);
  
  @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
  @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
  public static @interface Manifest
  {
    String name();
    
    String description();
    
    String properties() default "";
  }
  
  public static abstract interface Controller extends Suspendable, Stoppable
  {
    public abstract boolean offer(Runnable paramRunnable);
    
    public abstract AbstractScript script();
  }
  
  public static enum State {
    START,  SUSPEND,  RESUME,  STOP;
    
    private State() {}
  }
}
