package org.powerbot.bot.rt4;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Point;
import org.powerbot.script.Vector3;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.HintArrow;
import org.powerbot.script.rt4.Player;

public class DrawPlayers extends org.powerbot.script.rt4.ClientAccessor implements org.powerbot.script.PaintListener
{
  public DrawPlayers(ClientContext a)
  {
    a.<init>(a);
  }
  
  public void repaint(Graphics a)
  {
    int tmp16_15 = 1;tmp16_15; if (30 != tmp16_15) {
      return;throw ctx).game.clientState();
    }
    FontMetrics localFontMetrics = a.getFontMetrics();
    java.util.Iterator localIterator = ((org.powerbot.script.rt4.PlayerQuery)ctx).players.select()).iterator();
    Point localPoint; String str2; int i; do { Player localPlayer; for (;;) { localPoint = (localPlayer = (Player)localIterator.next()).centerPoint(); int 
          tmp80_79 = 1;tmp80_79; if (-1 != tmp80_79) { int tmp92_91 = 1;tmp92_91; if (-1 != tmp92_91) break; tmpTernaryOp = localIterator; } }
      throw y;
      
      a.setColor(Color.RED);
      1; int tmp129_128 = 1; int tmp130_129 = tmp129_128;tmp130_129; int tmp135_134 = 1;tmp135_134; int tmp139_138 = 1;tmp139_138;(tmp129_128 - tmp130_129).fillRect(2, tmp135_134, 2, tmp139_138);
      String str1 = Vector3.jdMethod_this("-^") + localPlayer.combatLevel() + HintArrow.jdMethod_this("Q@") + localPlayer.health() + Vector3.jdMethod_this("P_");((int)localPoint.getY())
        .setColor(localPlayer.inMotion() ? Color.GREEN : localPlayer.inCombat() ? Color.RED : Color.WHITE); String 
        tmp251_249 = str1; int tmp257_256 = 1;tmp257_256; int tmp272_271 = 1;tmp272_271;x.drawString(localFontMetrics.stringWidth(tmp251_249) - 2 / tmp257_256, y, localFontMetrics.getHeight() - 2 / tmp272_271);
      str2 = tmp251_249.overheadMessage(); int 
        tmp286_285 = 1;tmp286_285;i = tmp286_285; int 
        tmp295_294 = 1;tmp295_294; if (-1 != tmp295_294) {
        str1 = "";
        str1 = HintArrow.jdMethod_this("3"); int 
          tmp337_336 = 1;tmp337_336; if (-1 != tmp337_336) {
          str1 = Vector3.jdMethod_this("77V") + localPlayer.animation() + HintArrow.jdMethod_this("QgQH%!Q6@;\r;");
        }
        
        int tmp388_387 = 1;tmp388_387;str1 = 0.substring(tmp388_387, str1.lastIndexOf(Vector3.jdMethod_this("VqV")));
        str1 = HintArrow.jdMethod_this("2"); int 
        
          tmp447_446 = 1;tmp447_446; int tmp462_461 = 1;tmp462_461; int tmp467_466 = 1;tmp467_466;(localFontMetrics.stringWidth(str1) - 2 / tmp447_446).drawString(y, localFontMetrics.getHeight(), 3 * tmp462_461 - 2 / tmp467_466); int 
          tmp475_474 = 1;tmp475_474;i = tmp475_474;
      }
    } while (str2 == null);
    a.setColor(Color.ORANGE);
    1; int tmp527_526 = 1;tmp527_526; int tmp534_533 = 1;(i != 0 ? tmp527_526 : tmp534_533); int tmp539_538 = 1;tmp539_538;y.drawString(localFontMetrics.getHeight(), 5, 3 * tmp534_533 - 2 / tmp539_538);
  }
}
