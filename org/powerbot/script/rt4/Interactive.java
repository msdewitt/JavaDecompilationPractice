package org.powerbot.script.rt4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
import org.powerbot.script.Condition;
import org.powerbot.script.Condition.Check;
import org.powerbot.script.Crosshair;
import org.powerbot.script.Filter;
import org.powerbot.script.Input;
import org.powerbot.script.MenuCommand;

public abstract class Interactive extends ClientAccessor implements org.powerbot.script.Interactive
{
  protected AtomicReference<BoundingModel> boundingModel;
  
  public Interactive(ClientContext arg0)
  {
    super(arg0);
    boundingModel = new AtomicReference(null);
  }
  
  @Deprecated
  public static Filter<Interactive> areInViewport() {
    new Filter()
    {
      public boolean accept(Interactive arg0) {
        return arg0.inViewport();
      }
    };
  }
  
  public static Filter<Interactive> doSetBounds(int[] arg0) {
    new Filter()
    {
      public boolean accept(Interactive arg0) {
        arg0.bounds(val$arr);
        return true;
      }
    };
  }
  



  public boolean inViewport()
  {
    return ctx).game.inViewport(nextPoint());
  }
  




  public abstract Point centerPoint();
  



  public final boolean hover()
  {
    (valid()) && (ctx).input.apply(this, new Filter()
    {
      public boolean accept(Point arg0) {
        return true;
      }
    }));
  }
  



  public final boolean click()
  {
    (valid()) && (ctx).input.apply(this, new Filter()
    {
      public boolean accept(Point arg0) {
        return ctx).input.click(true);
      }
    }));
  }
  



  public final boolean click(final boolean arg0)
  {
    (valid()) && (ctx).input.apply(this, new Filter()
    {
      public boolean accept(Point arg0) {
        return ctx).input.click(arg0);
      }
    }));
  }
  



  public final boolean click(final int arg0)
  {
    (valid()) && (ctx).input.apply(this, new Filter()
    {
      public boolean accept(Point arg0) {
        return ctx).input.click(arg0);
      }
    }));
  }
  



  public boolean click(String arg0)
  {
    return click(Menu.filter(arg0));
  }
  



  public boolean click(String arg0, String arg1)
  {
    return click(Menu.filter(arg0, arg1));
  }
  



  public final boolean click(final Filter<? super MenuCommand> arg0)
  {
    (valid()) && (ctx).input.apply(this, new Filter()
    {
      public boolean accept(Point arg0) {
        if (Condition.wait(new Condition.Check()
        {
          public boolean poll() {
            return ctx).menu.indexOf(val$f) == 0;
          }
        }, 5, 10)) {} return 
        



          ctx).input.click(true);
      }
    }));
  }
  



  public boolean interact(String arg0)
  {
    return interact(true, arg0);
  }
  



  public boolean interact(String arg0, String arg1)
  {
    return interact(true, arg0, arg1);
  }
  


  public final boolean interact(Filter<? super MenuCommand> arg0)
  {
    return interact(true, arg0);
  }
  



  public boolean interact(boolean arg0, String arg1)
  {
    return interact(arg0, Menu.filter(arg1));
  }
  



  public boolean interact(boolean arg0, String arg1, String arg2)
  {
    return interact(arg0, Menu.filter(arg1, arg2));
  }
  



  public final boolean interact(boolean arg0, final Filter<? super MenuCommand> arg1)
  {
    if (!valid()) {
      return false;
    }
    Filter local8 = new Filter()
    {
      public boolean accept(Point arg0) {
        Condition.wait(new Condition.Check()
        {

          public boolean poll() { return ctx).menu.indexOf(val$f) != -1; } }, 15, 10);

      }
      

    };
    Rectangle localRectangle1 = new Rectangle(-1, -1, -1, -1);
    for (int i = 0; i < 3; i++) {
      final Rectangle localRectangle2 = localRectangle1;
      if (ctx).input.apply(this, arg0 ? local8 : new Filter()
      {
        public boolean accept(Point arg0) {
          ((!localRectangle2.contains(arg0)) || (!ctx).menu.opened())) && (ctx).input.click(false) && (Condition.wait(new Condition.Check()
          {

            public boolean poll() { return (ctx).menu.opened()) && (!ctx).menu.bounds().equals(val$c)); } }, 20, 10));
        }
      }))
      {












        if (ctx).menu.click(arg1)) {
          return true;
        }
        localRectangle1 = ctx).menu.bounds();
        if ((arg0) || (localRectangle1.contains(nextPoint())))
          ctx).menu.close();
      }
    }
    ctx).menu.close();
    return false;
  }
  



  public boolean click(final Crosshair arg0)
  {
    (click()) && (Condition.wait(new Condition.Check()
    {

      public boolean poll() { return ctx).game.crosshair() == arg0; } }, 10, 5));
  }
  





  public boolean click(String arg0, final Crosshair arg1)
  {
    (click(arg0)) && (Condition.wait(new Condition.Check()
    {

      public boolean poll() { return ctx).game.crosshair() == arg1; } }, 10, 5));
  }
  





  public boolean click(String arg0, String arg1, final Crosshair arg2)
  {
    (click(arg0, arg1)) && (Condition.wait(new Condition.Check()
    {

      public boolean poll() { return ctx).game.crosshair() == arg2; } }, 10, 5));
  }
  





  public boolean click(Filter<? super MenuCommand> arg0, final Crosshair arg1)
  {
    (click(arg0)) && (Condition.wait(new Condition.Check()
    {

      public boolean poll() { return ctx).game.crosshair() == arg1; } }, 10, 5));
  }
  






  public final void bounds(int[] arg0)
  {
    if ((arg0 == null) || (arg0.length != 6)) {
      throw new IllegalArgumentException("length is not 6 (x1, x2, y1, y2, z1, z2)");
    }
    bounds(arg0[0], arg0[1], arg0[2], arg0[3], arg0[4], arg0[5]);
  }
  





  public abstract void bounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
  





  public boolean valid()
  {
    return true;
  }
  
  public void draw(Graphics arg0)
  {
    draw(arg0, -1);
  }
  
  public void draw(Graphics arg0, int arg1)
  {
    Field localField;
    try {
      localField = getClass().getDeclaredField("TARGET_COLOR");
    } catch (NoSuchFieldException localNoSuchFieldException) {
      shade(arg0, arg1);
      return;
    }
    localField.setAccessible(true);
    try
    {
      localNoSuchFieldException = (Color)localField.get(null);
    } catch (IllegalAccessException localIllegalAccessException) {
      return;
    }
    
    localIllegalAccessException = arg1 == -1 ? 15 : arg1;
    int i = localNoSuchFieldException.getRGB();
    if ((i >> 24 & 0xFF) != localIllegalAccessException) {
      localNoSuchFieldException = new Color(i >> 16 & 0xFF, i >> 8 & 0xFF, i & 0xFF, localIllegalAccessException);
    }
    arg0.setColor(localNoSuchFieldException);
    BoundingModel localBoundingModel = (BoundingModel)boundingModel.get();
    if (localBoundingModel != null)
      localBoundingModel.drawWireFrame(arg0);
  }
  
  private void shade(Graphics arg0, int arg1) {
    Field localField1;
    Field localField2;
    try {
      localField1 = getClass().getDeclaredField("TARGET_STROKE_COLOR");
      localField2 = getClass().getDeclaredField("TARGET_FILL_COLOR");
    } catch (NoSuchFieldException localNoSuchFieldException) {
      return;
    }
    localField1.setAccessible(true);
    localField2.setAccessible(true);
    Color localColor;
    try {
      localNoSuchFieldException = (Color)localField1.get(null);
      localColor = (Color)localField2.get(null);
    } catch (IllegalAccessException localIllegalAccessException) {
      return;
    }
    try
    {
      localIllegalAccessException = getClass().getDeclaredMethod("boundingRect", new Class[0]);
    } catch (NoSuchMethodException localNoSuchMethodException) {
      return;
    }
    localIllegalAccessException.setAccessible(true);
    try
    {
      if ((localNoSuchMethodException = (Rectangle)localIllegalAccessException.invoke(this, new Object[0])) == null) {
        throw new InvocationTargetException(new RuntimeException("Rectangle was null."));
      }
      if ((x == -1) || (y == -1) || (width == -1) || (height == -1)) {
        return;
      }
    } catch (IllegalAccessException localIllegalAccessException1) {
      return;
    } catch (InvocationTargetException localInvocationTargetException) {
      return;
    }
    
    localInvocationTargetException = arg1 == -1 ? 15 : arg1;
    int i = localColor.getRGB();
    if ((i >> 24 & 0xFF) != localInvocationTargetException) {
      localColor = new Color(i >> 16 & 0xFF, i >> 8 & 0xFF, i & 0xFF, localInvocationTargetException);
    }
    
    arg0.setColor(localColor);
    arg0.fillRect(x, y, width, height);
    arg0.setColor(localNoSuchFieldException);
    arg0.drawRect(x, y, width, height);
  }
  
  public Polygon[] triangles() {
    BoundingModel localBoundingModel = (BoundingModel)boundingModel.get();
    if (localBoundingModel != null) {
      return localBoundingModel.triangles();
    }
    return new Polygon[0];
  }
}
