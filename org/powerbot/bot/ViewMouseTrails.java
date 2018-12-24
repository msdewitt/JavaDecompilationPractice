package org.powerbot.bot;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import org.powerbot.script.ClientAccessor;
import org.powerbot.script.ClientContext;
import org.powerbot.script.Input;
import org.powerbot.script.PaintListener;

public class ViewMouseTrails<C extends ClientContext>
  extends ClientAccessor<C> implements PaintListener
{
  private static final Deque<Point> jdField_void = new LinkedList();
  
  public ViewMouseTrails(C a) {
    a.<init>(a);
  }
  
  public void repaint(Graphics a)
  {
    Point localPoint1 = ctx.input.getLocation(); int 
      tmp17_16 = 1;tmp17_16; if (-1 != tmp17_16) { int tmp28_27 = 1;tmp28_27; if (-1 != tmp28_27) {}
    } else { return;throw y;
    }
    
    void.offerFirst(localPoint1); int 
      tmp55_54 = 1;tmp55_54; if (3 < tmp55_54) {
      return;throw void.size();
    }
    
    a = (Graphics2D)a; int 
    
      tmp69_68 = 1;tmp69_68;int i = tmp69_68;
    Iterator localIterator;
    Object localObject = (Point)(localIterator = void.iterator()).next();
    

    Point localPoint2 = (Point)localIterator.next(); Graphics 
      tmp133_132 = a;tmp133_132; Graphics tmp135_133 = tmp133_132; int tmp137_136 = 1;tmp137_136; int tmp143_142 = 1;tmp143_142; int tmp150_149 = 1;tmp150_149; int tmp156_155 = 1;tmp156_155;tmp143_142.<init>('ÿ', tmp150_149, 200, tmp156_155 - (int)(i / 10.0D * 200.0D));'ÿ'.setColor('ÿ'); Point 
      tmp186_184 = localPoint2;tmp135_133.drawLine(137136x, y, 186184x, 186184y);
    localObject = tmp135_133;
    

    if (i == 10.0D) {
      void.pollLast();
    }
  }
}
