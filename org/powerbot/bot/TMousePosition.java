package org.powerbot.bot;

import java.awt.Graphics;
import java.awt.Point;
import org.powerbot.bot.cache.Block;
import org.powerbot.script.ClientAccessor;
import org.powerbot.script.ClientContext;
import org.powerbot.script.Input;
import org.powerbot.script.TextPaintListener;

public class TMousePosition<C extends ClientContext> extends ClientAccessor<C> implements TextPaintListener
{
  public TMousePosition(C a)
  {
    a.<init>(a);
  }
  
  public int draw(int a, Graphics a) {
    Point localPoint = ctx.input.getLocation();
    DebugHelper.drawLine(a, new StringBuilder(), (int)localPoint.getX() + Block.jdMethod_this("\023") + (int)localPoint.getY());
    return a;
  }
}
