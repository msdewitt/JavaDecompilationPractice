package org.powerbot.script;

import java.util.Comparator;
import java.util.List;
import java.util.NavigableSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.powerbot.script.rt4.BasicQuery;
import org.powerbot.script.rt6.MobileIdNameQuery;








public abstract class PollingScript<C extends ClientContext>
  extends AbstractScript<C>
{
  protected static final NavigableSet<PollingScript> threshold = new ConcurrentSkipListSet(new Comparator()
  {
    public int compare(PollingScript arg0, PollingScript arg1) {
      return priority.get() - priority.get();
    }
  });
  




  public final AtomicInteger priority;
  





  public PollingScript()
  {
    priority = new AtomicInteger(0);
    getExecQueue(Script.State.START).add(new Runnable()
    {
      public void run() {
        try {
          start();
        } catch (Throwable localThrowable) {
          ctx.controller.stop();
          Thread.UncaughtExceptionHandler localUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
          if (localUncaughtExceptionHandler != null) {
            localUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), localThrowable);
          } else {
            localThrowable.printStackTrace();
          }
        }
      }
    });
    getExecQueue(Script.State.STOP).add(new Runnable()
    {
      public void run() {
        stop();
      }
    });
    getExecQueue(Script.State.SUSPEND).add(new Runnable()
    {
      public void run() {
        suspend();
      }
    });
    getExecQueue(Script.State.RESUME).add(new Runnable()
    {
      public void run() {
        resume();
      }
      
    });
    getExecQueue(Script.State.START).add(new Runnable()
    {
      public void run() {
        if ((PollingScript.threshold.isEmpty()) || (thresholdfirstpriority.get() <= priority.get())) {
          try {
            poll();
          } catch (Throwable localThrowable) {
            ctx.controller.stop();
            Thread.UncaughtExceptionHandler localUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (localUncaughtExceptionHandler != null) {
              localUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), localThrowable);
            } else {
              localThrowable.printStackTrace();
            }
          }
        }
        try
        {
          Thread.sleep(10L);
        } catch (InterruptedException localInterruptedException) {
          Thread.yield();
        }
        
        if ((!Thread.interrupted()) && (!ctx.controller.isStopping())) {
          ctx.controller.offer(this);
        }
      }
    });
  }
  




  public abstract void poll();
  




  public void start() {}
  




  public void stop() {}
  




  public void suspend() {}
  




  public void resume() {}
  



  public boolean canBreak()
  {
    if ((ctx instanceof org.powerbot.script.rt4.ClientContext)) {
      localObject1 = (org.powerbot.script.rt4.ClientContext)ctx;
      localObject2 = players.local();
      





      (((BasicQuery)((BasicQuery)npcs.select()).within(5.0D).select(new Filter()
      {
        public boolean accept(org.powerbot.script.rt4.Npc arg0) {
          return (arg0.interacting().equals(val$p)) && (arg0.inCombat());
        }
      })).isEmpty()) && (!((org.powerbot.script.rt4.Player)localObject2).inCombat());
    }
    Object localObject1 = (org.powerbot.script.rt6.ClientContext)ctx;
    Object localObject2 = players.local();
    




    (((MobileIdNameQuery)((MobileIdNameQuery)npcs.select()).within(5.0D).select(new Filter()
    {
      public boolean accept(org.powerbot.script.rt6.Npc arg0) {
        return (arg0.interacting().equals(val$p)) && (arg0.inCombat());
      }
    })).isEmpty()) && (!((org.powerbot.script.rt6.Player)localObject2).inCombat());
  }
}
