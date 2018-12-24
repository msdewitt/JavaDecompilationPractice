package org.powerbot.script;

import java.awt.Color;
import java.awt.Composite;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.util.EventListener;
import org.powerbot.bot.AbstractEvent;



public class PaintEvent
  extends AbstractEvent
{
  public static final int PAINT_EVENT = 64;
  private static final long serialVersionUID = 4772234942045737667L;
  public Graphics graphics;
  
  public PaintEvent()
  {
    super(64);
  }
  



  public void call(EventListener arg0)
  {
    if (graphics == null) {
      try {
        ((PaintListener)arg0).repaint(null);
      }
      catch (Exception localException) {}
      return;
    }
    localException = (Graphics2D)graphics;
    
    Color localColor1 = localException.getBackground();
    Shape localShape = localException.getClip();
    Color localColor2 = localException.getColor();
    Composite localComposite = localException.getComposite();
    Font localFont = localException.getFont();
    Paint localPaint = localException.getPaint();
    RenderingHints localRenderingHints = localException.getRenderingHints();
    Stroke localStroke = localException.getStroke();
    AffineTransform localAffineTransform = localException.getTransform();
    try
    {
      ((PaintListener)arg0).repaint(graphics);
    } catch (Exception localException1) {
      localException1.printStackTrace();
    }
    
    localException.setBackground(localColor1);
    localException.setClip(localShape);
    localException.setColor(localColor2);
    localException.setComposite(localComposite);
    localException.setFont(localFont);
    localException.setPaint(localPaint);
    localException.setRenderingHints(localRenderingHints);
    localException.setStroke(localStroke);
    localException.setTransform(localAffineTransform);
  }
}
