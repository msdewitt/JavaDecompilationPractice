package org.powerbot.bot;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Line2D.Float;
import org.powerbot.script.ClientAccessor;
import org.powerbot.script.ClientContext;
import org.powerbot.script.Input;

public class ViewMouse<C extends ClientContext> extends ClientAccessor<C> implements org.powerbot.script.PaintListener
{
  public ViewMouse(C a)
  {
    a.<init>(a);
  }
  
  public void repaint(Graphics a)
  {
    a = (Graphics2D)a;
    Point localPoint = ctx.input.getLocation();
    

    a.setColor(Color.CYAN); Graphics 
      tmp30_28 = a;tmp30_28; Graphics tmp32_30 = tmp30_28;tmp32_30.<init>(1.5F);new java/awt/BasicStroke.setStroke(tmp32_30); Graphics 
      tmp45_44 = a;tmp45_44; int tmp55_54 = 1;tmp55_54; int tmp66_65 = 1;tmp66_65; int tmp77_76 = 1;tmp77_76; int tmp88_87 = 1;tmp88_87;(6 - tmp66_65).<init>(x, 6 + tmp77_76, y, 6 + tmp88_87);(6 - tmp55_54).draw(y); Graphics 
      tmp102_101 = a;tmp102_101; int tmp112_111 = 1;tmp112_111; int tmp123_122 = 1;tmp123_122; int tmp134_133 = 1;tmp134_133; int tmp145_144 = 1;tmp145_144;(6 - tmp123_122).<init>(x, 6 - tmp134_133, y, 6 + tmp145_144);(6 + tmp112_111).draw(y);
    
    if (System.currentTimeMillis() - ctx.input.getPressWhen() < 1000L) {
      localPoint = ctx.input.getPressLocation();
      a.setColor(Color.RED);
      1; int tmp214_213 = 1;tmp214_213; int tmp224_223 = 1;tmp224_223; int tmp234_233 = 1;tmp234_233;(6 - tmp214_213).drawLine(x, 6 + tmp224_223, y, 6 + tmp234_233);
      1; int tmp256_255 = 1;tmp256_255; int tmp266_265 = 1;tmp266_265; int tmp276_275 = 1;tmp276_275;(6 - tmp256_255).drawLine(x, 6 - tmp266_265, y, 6 + tmp276_275);
    }
  }
}
