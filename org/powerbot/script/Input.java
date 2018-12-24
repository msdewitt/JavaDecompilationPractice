package org.powerbot.script;

import java.awt.Dimension;
import java.awt.Point;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.powerbot.bot.MouseSpline;



public abstract class Input
{
  protected final AtomicBoolean blocking;
  protected final AtomicBoolean keyboard;
  private final MouseSpline spline;
  private final AtomicInteger speed;
  
  protected Input()
  {
    blocking = new AtomicBoolean(false);
    keyboard = new AtomicBoolean(false);
    spline = new MouseSpline();
    speed = new AtomicInteger(100);
  }
  








  public int speed(int arg0)
  {
    speed.set(Math.min(100, Math.max(10, arg0)));
    return speed.get();
  }
  







  public final boolean blocking()
  {
    return blocking.get();
  }
  





  public void blocking(boolean arg0)
  {
    blocking.set(arg0);
  }
  




  public final boolean keyboard()
  {
    return keyboard.get();
  }
  




  public void keyboard(boolean arg0)
  {
    keyboard.set(arg0);
  }
  







  public abstract void focus();
  






  public abstract void defocus();
  






  public abstract boolean send(String paramString);
  






  public final boolean sendln(String arg0)
  {
    return send(arg0 + "\n");
  }
  






  public abstract Point getLocation();
  






  public abstract Point getPressLocation();
  






  public abstract long getPressWhen();
  






  public abstract boolean press(int paramInt);
  






  public abstract boolean release(int paramInt);
  





  protected abstract boolean setLocation(Point paramPoint);
  





  public final boolean click(int arg0, int arg1, int arg2)
  {
    return click(new Point(arg0, arg1), arg2);
  }
  









  public final boolean click(int arg0, int arg1, boolean arg2)
  {
    return click(new Point(arg0, arg1), arg2);
  }
  







  public final boolean click(Point arg0, int arg1)
  {
    return (move(arg0)) && (click(arg1));
  }
  








  public final boolean click(Point arg0, boolean arg1)
  {
    return (move(arg0)) && (click(arg1));
  }
  






  public final boolean click(boolean arg0)
  {
    return click(arg0 ? 1 : 3);
  }
  





  public final boolean click(int arg0)
  {
    press(arg0);
    Condition.sleep(spline.getPressDuration());
    release(arg0);
    Condition.sleep(spline.getPressDuration());
    return true;
  }
  








  public final boolean drag(Point arg0, boolean arg1)
  {
    return drag(arg0, arg1 ? 1 : 3);
  }
  








  public final boolean drag(Point arg0, int arg1)
  {
    press(arg1);
    Condition.sleep(spline.getPressDuration());
    boolean bool = move(arg0);
    Condition.sleep(spline.getPressDuration());
    release(arg1);
    Condition.sleep(spline.getPressDuration());
    return bool;
  }
  






  public final boolean hop(Point arg0)
  {
    return setLocation(arg0);
  }
  







  public final boolean hop(int arg0, int arg1)
  {
    return hop(new Point(arg0, arg1));
  }
  









  public final boolean move(int arg0, int arg1)
  {
    return move(new Point(arg0, arg1));
  }
  







  public final boolean move(final Point arg0)
  {
    apply(new Targetable()
    







      new Filter
      {
        public Point nextPoint()
        {
          return arg0;
        }
        


        public boolean contains(Point arg0) { return arg0.equals(arg0); } }, new Filter()
      {

        public boolean accept(Point arg0)
        {

          return arg0.equals(arg0);
        }
      });
  }
  
  public final boolean apply(Targetable arg0, Filter<Point> arg1)
  {
    Point localPoint1 = new Point(-1, -1);
    
    for (int i = 0; i < 3; i++) {
      Point localPoint2 = getLocation();
      Vector3 localVector31 = new Vector3(x, y, 255);
      Point localPoint3 = arg0.nextPoint();
      if ((x != -1) && (y != -1))
      {

        localPoint1.move(x, y);
        Vector3 localVector32 = new Vector3(x, y, 0);
        Iterable localIterable = spline.getPath(localVector31, localVector32);
        for (Object localObject1 = localIterable.iterator(); ((Iterator)localObject1).hasNext();) { localObject2 = (Vector3)((Iterator)localObject1).next();
          if (Thread.interrupted()) {
            return false;
          }
          hop(x, y);
          Condition.sleep((int)(spline.getAbsoluteDelay(z) * (speed.get() / 100.0D) / 1330000.0D));
        }
        localObject1 = getLocation();Object localObject2 = localVector32.toPoint2D();
        if ((((Point)localObject1).equals(localObject2)) && (arg1.accept(localObject2)))
          return true;
      }
    }
    return false;
  }
  





  public final boolean scroll()
  {
    return scroll(true);
  }
  
  public abstract boolean scroll(boolean paramBoolean);
  
  public abstract Dimension getComponentSize();
  
  public static String jdMethod_this(Object s)
  {
    int tmp9_8 = 3;
    int tmp20_17 = (s = (String)s).length();
    int tmp24_23 = 1;
    tmp24_23;
    int j;
    int ? = tmp24_23;
    int k = tmp20_17;
    int tmp34_30 = (j = new char[tmp20_17] - 1);
    tmp34_30;
    int i = 1 << 3 ^ tmp9_8;
    tmp9_8;
    if (tmp34_30 >= 0)
    {
      int tmp44_43 = j;
      j--;
      ?[tmp44_43] = ((char)(s.charAt(tmp44_43) ^ i));
      int tmp65_62 = (j--);
      ?[tmp65_62] = ((char)(s.charAt(tmp65_62) ^ k));
    }
    return new String(?);
  }
}
