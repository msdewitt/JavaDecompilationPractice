package org.powerbot.script.rt6;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.powerbot.bot.rt6.client.Client;
import org.powerbot.script.Condition;
import org.powerbot.script.Condition.Check;
import org.powerbot.script.Input;
import org.powerbot.script.Random;





public class Widgets
  extends IdQuery<Widget>
{
  public Widget[] sparseCache;
  
  public Widgets(ClientContext arg0)
  {
    super(arg0);
    sparseCache = new Widget[0];
  }
  



  protected List<Widget> get()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return new ArrayList(0);
    }
    Object[] arrayOfObject = localClient.getWidgets();
    if ((arrayOfObject == null) || (arrayOfObject.length == 0)) {
      return new ArrayList(0);
    }
    ArrayList localArrayList = new ArrayList(arrayOfObject.length);
    for (int i = 0; i < arrayOfObject.length; i++) {
      localArrayList.add(new Widget((ClientContext)ctx, i));
    }
    return localArrayList;
  }
  





  public synchronized Widget widget(int arg0)
  {
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
  







  public boolean scroll(Component arg0, Component arg1, boolean arg2)
  {
    if ((arg0 == null) || (!arg0.valid())) {
      return false;
    }
    int i;
    if ((arg1 == null) || (!arg1.valid()) || (((i = arg1.childrenCount()) != 6) && (i != 7))) {
      return false;
    }
    Component localComponent = arg0;
    
    int k = 0;
    int j; while ((localComponent.scrollHeightMax() == 0) && ((j = localComponent.parentId()) != -1)) {
      localComponent = ctx).widgets.component(j >> 16, j & 0xFFFF);
      k++; if (k > 20) {
        break;
      }
    }
    return (localComponent.scrollHeightMax() != 0) && (scroll(arg0, localComponent, arg1, arg2));
  }
  
  public boolean scroll(final Component arg0, Component arg1, Component arg2, boolean arg3) {
    if ((arg0 == null) || (!arg0.valid())) {
      return false;
    }
    int i;
    if ((arg2 == null) || (!arg2.valid()) || (((i = arg2.childrenCount()) != 6) && (i != 7))) {
      return false;
    }
    if ((arg1 == null) || (!arg1.valid()) || (arg1.scrollHeight() == 0)) {
      return false;
    }
    final Point localPoint1 = arg1.screenPoint();
    final int j = arg1.scrollHeight();
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
    int m = localComponent1.scrollHeight();
    
    int n = (int)(m / arg1.scrollHeightMax() * (relativePointy + Random.nextInt(-j / 2, j / 2 - k)));
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

      if (arg3) {
        if (ctx).input.scroll(y > y)) {
          i2++; if (i2 >= Random.nextInt(5, 9)) {
            Condition.sleep();
            i2 = 0;
          }
          Condition.sleep(Random.getDelay());
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
    int[] arrayOfInt1 = Constants.CLOSE_BUTTON_TEXTURES[0];
    for (Component localComponent1 : arg0) {
      if (localComponent1.childrenCount() == 0) {
        int k = localComponent1.textureId();
        for (int i1 : arrayOfInt1) {
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
    return new Widget((ClientContext)ctx, -1);
  }
}
