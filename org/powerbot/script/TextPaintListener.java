package org.powerbot.script;

import java.awt.Graphics;
import java.util.EventListener;

public abstract interface TextPaintListener
  extends EventListener
{
  public abstract int draw(int paramInt, Graphics paramGraphics);
}
