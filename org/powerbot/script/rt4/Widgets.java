package org.powerbot.script.rt4;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.powerbot.bot.rt4.client.Client;
import org.powerbot.script.Condition;
import org.powerbot.script.Condition.Check;
import org.powerbot.script.Input;
import org.powerbot.script.Random;

public class Widgets
  extends IdQuery<Widget>
{
  private Widget[] sparseCache;
  
  public Widgets(ClientContext arg0)
  {
    super(arg0);
    sparseCache = new Widget[0];
  }
  
  public synchronized Widget widget(int arg0) {
    if (arg0 < 0) {
      return new Widget((ClientContext)ctx, 0);
    }
    if ((arg0 < sparseCache.length) && (sparseCache[arg0] != null)) {
      return sparseCache[arg0];
    }
    Widget localWidget = new Widget((ClientContext)ctx, arg0);
    int i = sparseCache.length;
    if (arg0 >= i) {
      sparseCache = ((Widget[])Arrays.copyOf(sparseCache, arg0 + 1));
      for (int j = i; j < arg0 + 1; j++) {
        sparseCache[j] = new Widget((ClientContext)ctx, j);
      }
    }
    return sparseCache[arg0] =  = localWidget;
  }
  






  public Component component(int arg0, int arg1)
  {
    return widget(arg0).component(arg1);
  }
  
  public Component component(int arg0, int arg1, int arg2) {
    return component(arg0, arg1).component(arg2);
  }
  



  protected List<Widget> get()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    org.powerbot.bot.rt4.client.Widget[][] arrayOfWidget = localClient != null ? localClient.getWidgets() : (org.powerbot.bot.rt4.client.Widget[][])null;
    int i = arrayOfWidget != null ? arrayOfWidget.length : 0;
    if (i <= 0) {
      return new ArrayList(0);
    }
    widget(i - 1);
    return new ArrayList(Arrays.asList(Arrays.copyOf(sparseCache, i)));
  }
  


  /**
   * @deprecated
   */
  public Widget[] array()
  {
    List localList = get();
    return (Widget[])localList.toArray(new Widget[localList.size()]);
  }
  





  /**
   * @deprecated
   */
  public boolean scroll(Component arg0, Component arg1, Component arg2)
  {
    return scroll(arg1, arg0, arg2, true);
  }
  








  public boolean scroll(final Component arg0, Component arg1, Component arg2, boolean arg3)
  {
    if ((arg0 == null) || (!arg0.valid())) {
      return false;
    }
    int i;
    if ((arg2 == null) || (!arg2.valid()) || (((i = arg2.componentCount()) != 6) && (i != 7))) {
      return false;
    }
    
    if ((arg1 == null) || (!arg1.valid())) {
      return false;
    }
    
    if (arg1.scrollHeight() == 0) {
      return true;
    }
    
    final Point localPoint1 = arg1.screenPoint();
    final int j = arg1.height();
    if ((x < 0) || (y < 0) || (j < 1)) {
      return false;
    }
    Point localPoint2 = arg0.screenPoint();
    final int k = arg0.height();
    if ((y >= y) && (y <= y + j - k)) {
      return true;
    }
    Component localComponent1 = arg2.component(0);
    Component localComponent2 = arg2.component(1);
    int m = localComponent1.height();
    
    int n = (int)(m / arg1.scrollHeight() * (arg0.relativeY() + Random.nextInt(-j / 2, j / 2 - k)));
    if (n < 0) {
      n = 0;
    } else if (n >= m) {
      n = m - 1;
    }
    Point localPoint3 = localComponent1.screenPoint();
    localPoint3.translate(Random.nextInt(0, localComponent1.width()), n);
    if (!arg3) {
      if (!ctx).input.click(localPoint3, true)) {
        return false;
      }
      Condition.sleep();
    }
    

    int i1 = screenPointy;
    long l1 = System.nanoTime();
    long l2 = System.nanoTime();
    int i2 = 0;
    Point localPoint4; while (((screenPointy < y) || (y > y + j - k)) && 
      (System.nanoTime() - l1 < TimeUnit.SECONDS.toNanos(20L)))
    {

      if ((arg3) && ((arg1.contains(ctx).input.getLocation())) || (arg1.hover()))) {
        if (ctx).input.scroll(y > y)) {
          i2++; if (i2 >= Random.nextInt(9, 13)) {
            Condition.sleep(Random.getDelay() * Random.nextInt(3, 9));
            i2 = 0;
          }
          Condition.sleep(Random.getDelay() / Random.nextInt(1, 3));
          if (System.nanoTime() - l2 > TimeUnit.SECONDS.toNanos(2L)) {
            int i3 = screenPointy;
            if (i1 == i3) {
              return scroll(arg0, arg1, arg2, false);
            }
            l2 = System.nanoTime();
            i1 = i3;
          }
          
        }
      }
      else
      {
        Component localComponent3 = arg2.component(y < y ? 4 : 5);
        if (localComponent3 != null)
        {

          if (localComponent3.hover()) {
            ctx).input.press(1);
            if (!Condition.wait(new Condition.Check()
            {
              public boolean poll() {
                Point localPoint = arg0.screenPoint();
                return (y >= localPoint1y) && (y <= localPoint1y + j - k);
              }
            }, 500, 10))
            {





              i2++;
            }
            ctx).input.release(1);
          }
          if (i2 >= 3)
            return false;
        }
      }
    }
    return (y >= y) && (y <= j + y + j - k);
  }
  





  public boolean close(Widget arg0)
  {
    return close(arg0.components(), false);
  }
  







  public boolean close(Widget arg0, boolean arg1)
  {
    return close(arg0.components(), arg1);
  }
  





  public boolean close(Component[] arg0)
  {
    return close(findCloseButton(arg0), false);
  }
  







  public boolean close(Component[] arg0, boolean arg1)
  {
    return close(findCloseButton(arg0), arg1);
  }
  





  public boolean close(Component arg0)
  {
    return close(arg0, false);
  }
  







  public boolean close(final Component arg0, boolean arg1)
  {
    if ((arg0 == null) || (!arg0.valid())) {
      return true;
    }
    (arg1 ? ctx).input.send("{VK_ESCAPE}") : arg0.click()) && (Condition.wait(new Condition.Check()
    {

      public boolean poll() { return !arg0.valid(); } }, 50, 16));
  }
  

  private Component findCloseButton(Component[] arg0)
  {
    for (Component localComponent1 : arg0) {
      if (localComponent1.componentCount() == 0) {
        int k = localComponent1.textureId();
        for (int i1 : Constants.CLOSE_BUTTON_TEXTURES) {
          if (k == i1) {
            return localComponent1;
          }
        }
      } else {
        Component localComponent2 = findCloseButton(localComponent1.components());
        if (localComponent2 != null) {
          return localComponent2;
        }
      }
    }
    return null;
  }
  
  public Widget nil()
  {
    return new Widget((ClientContext)ctx, 0);
  }
}
