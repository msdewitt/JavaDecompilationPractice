package org.powerbot.script;

import java.util.concurrent.Callable;








public class Condition
{
  public static final double[] VARIANCE = { 0.85D, 1.5D };
  


  public Condition() {}
  


  public static boolean wait(Callable<Boolean> arg0)
  {
    return wait(arg0, 600, 10);
  }
  







  public static boolean wait(Callable<Boolean> arg0, int arg1)
  {
    return wait(arg0, arg1, Math.max(2, 6000 / arg1));
  }
  







  public static boolean wait(Callable<Boolean> arg0, int arg1, int arg2)
  {
    arg2 = Math.max(1, arg2 + Random.nextInt(-1, 2));
    
    for (int i = 0; i < arg2; i++) {
      try {
        double d = arg1 * Random.nextDouble(VARIANCE[0], VARIANCE[1]);
        Thread.sleep(Math.max(5, (int)d));
      } catch (InterruptedException localInterruptedException1) {
        return false;
      }
      boolean bool;
      try
      {
        bool = ((Boolean)arg0.call()).booleanValue();
      } catch (Exception localException) {
        return false;
      }
      if (bool) {
        return true;
      }
    }
    
    return false;
  }
  





  public static int sleep(int arg0)
  {
    if (arg0 <= 0) {
      Thread.yield();
      return 0;
    }
    long l = System.nanoTime();
    try {
      Thread.sleep((arg0 * Random.nextDouble(VARIANCE[0], VARIANCE[1])));
    }
    catch (InterruptedException localInterruptedException) {}
    return (int)((System.nanoTime() - l) / 1000000L);
  }
  


  public static void sleep()
  {
    sleep(Random.getDelay() * 10);
  }
  


  public static abstract class Check
    implements Callable<Boolean>, Filter<Void>
  {
    public Check() {}
    

    public Boolean call()
    {
      return Boolean.valueOf(poll());
    }
    



    public boolean accept(Void arg0)
    {
      return poll();
    }
    
    public abstract boolean poll();
  }
}
