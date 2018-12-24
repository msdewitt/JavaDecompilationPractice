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




public class TextPaintEvent
  extends AbstractEvent
{
  public static final int TEXT_PAINT_EVENT = 128;
  private static final long serialVersionUID = 7174559879186449999L;
  public Graphics graphics;
  public int index = 0;
  
  public TextPaintEvent() {
    super(128);
  }
  



  public void call(EventListener arg0)
  {
    if (graphics == null) {
      try {
        ((PaintListener)arg0).repaint(null);
      }
      catch (NullPointerException localNullPointerException) {}
      return;
    }
    localNullPointerException = (Graphics2D)graphics;
    
    Color localColor1 = localNullPointerException.getBackground();
    Shape localShape = localNullPointerException.getClip();
    Color localColor2 = localNullPointerException.getColor();
    Composite localComposite = localNullPointerException.getComposite();
    Font localFont = localNullPointerException.getFont();
    Paint localPaint = localNullPointerException.getPaint();
    RenderingHints localRenderingHints = localNullPointerException.getRenderingHints();
    Stroke localStroke = localNullPointerException.getStroke();
    AffineTransform localAffineTransform = localNullPointerException.getTransform();
    
    index = ((TextPaintListener)arg0).draw(index, graphics);
    
    localNullPointerException.setBackground(localColor1);
    localNullPointerException.setClip(localShape);
    localNullPointerException.setColor(localColor2);
    localNullPointerException.setComposite(localComposite);
    localNullPointerException.setFont(localFont);
    localNullPointerException.setPaint(localPaint);
    localNullPointerException.setRenderingHints(localRenderingHints);
    localNullPointerException.setStroke(localStroke);
    localNullPointerException.setTransform(localAffineTransform);
  }
}
