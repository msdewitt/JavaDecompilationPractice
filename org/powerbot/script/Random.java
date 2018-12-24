package org.powerbot.script;

import java.security.SecureRandom;





public class Random
{
  private static final double[] pd;
  private static final ThreadLocal<java.util.Random> random = new ThreadLocal()
  {
    protected java.util.Random initialValue() {
      Object localObject;
      try {
        localObject = SecureRandom.getInstance("SHA1PRNG", "SUN");
      } catch (Exception localException) {
        localObject = new java.util.Random();
      }
      ((java.util.Random)localObject).setSeed(((java.util.Random)localObject).nextLong());
      return localObject;
    }
  };
  
  static {
    pd = new double[2];
    double[] arrayOfDouble1 = { 3.0D, 45.0D + ((java.util.Random)random.get()).nextInt(11), 12.0D + ((java.util.Random)random.get()).nextGaussian() };
    double[] arrayOfDouble2 = { Runtime.getRuntime().availableProcessors(), Runtime.getRuntime().maxMemory() >> 30 };
    pd[0] = (4.0D * Math.log(Math.sin((3.141592653589793D / arrayOfDouble2[0] * 3.141592653589793D + 1.0D) / 4.0D)) / 3.141592653589793D + 6.283185307179586D * (3.141592653589793D / arrayOfDouble2[0]) / 3.0D - 4.0D * Math.log(Math.sin(0.25D)) / 3.141592653589793D);
    pd[0] = (arrayOfDouble1[0] * Math.exp(Math.pow(pd[0], 0.75D)) + arrayOfDouble1[1]);
    pd[1] = (arrayOfDouble1[2] * Math.exp(1.0D / Math.cosh(arrayOfDouble2[1])));
  }
  




  public static int getDelay()
  {
    return (int)((-1.0D + 2.0D * nextDouble()) * pd[1] + pd[0]);
  }
  





  public static int hicks(int arg0)
  {
    return 105 * (int)(Math.log(arg0 * 2) / 0.6931471805599453D);
  }
  




  public static boolean nextBoolean()
  {
    return ((java.util.Random)random.get()).nextBoolean();
  }
  






  public static int nextInt(int arg0, int arg1)
  {
    int i = arg0 < arg1 ? arg0 : arg1;int j = arg1 > arg0 ? arg1 : arg0;
    return i + (j == i ? 0 : ((java.util.Random)random.get()).nextInt(j - i));
  }
  






  public static double nextDouble(double arg0, double arg1)
  {
    double d1 = arg0 < arg1 ? arg0 : arg1;double d2 = arg1 > arg0 ? arg1 : arg0;
    return d1 + ((java.util.Random)random.get()).nextDouble() * (d2 - d1);
  }
  




  public static double nextDouble()
  {
    return ((java.util.Random)random.get()).nextDouble();
  }
  





  public static double nextGaussian()
  {
    return ((java.util.Random)random.get()).nextGaussian();
  }
  







  public static int nextGaussian(int arg0, int arg1, double arg2)
  {
    return nextGaussian(arg0, arg1, (arg1 - arg0) / 2, arg2);
  }
  








  public static int nextGaussian(int arg0, int arg1, int arg2, double arg3)
  {
    return arg0 + Math.abs((int)(nextGaussian() * arg3 + arg2) % (arg1 - arg0));
  }
  
  public Random() {}
}
