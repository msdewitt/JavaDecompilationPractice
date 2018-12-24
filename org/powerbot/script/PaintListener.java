package org.powerbot.script;

import java.awt.Graphics;
import java.util.EventListener;

public abstract interface PaintListener
  extends EventListener
{
  public abstract void repaint(Graphics paramGraphics);
}
