package org.powerbot.bot.rt4;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Iterator;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Npc;
import org.powerbot.script.rt6.CacheVarbitConfig;
import z.Qb;

public class DrawMobs extends org.powerbot.script.rt4.ClientAccessor implements org.powerbot.script.PaintListener
{
  public DrawMobs(ClientContext a)
  {
    a.<init>(a);
  }
  
  public void repaint(Graphics a)
  {
    int tmp16_15 = 1;tmp16_15; if (30 != tmp16_15) {
      return;throw ctx).game.clientState();
    }
    FontMetrics localFontMetrics = a.getFontMetrics();
    Iterator localIterator = ((org.powerbot.script.rt4.BasicQuery)ctx).npcs.select()).iterator();
    Point localPoint; String str2; int i; do { Npc localNpc; for (;;) { localPoint = (localNpc = (Npc)localIterator.next()).centerPoint(); int 
          tmp80_79 = 1;tmp80_79; if (-1 != tmp80_79) { int tmp92_91 = 1;tmp92_91; if (-1 != tmp92_91) break; tmpTernaryOp = localIterator; } }
      throw y;
      
      a.setColor(Color.red);
      1; int tmp129_128 = 1; int tmp130_129 = tmp129_128;tmp130_129; int tmp135_134 = 1;tmp135_134; int tmp139_138 = 1;tmp139_138;(tmp129_128 - tmp130_129).fillRect(2, tmp135_134, 2, tmp139_138);
      String str1 = CacheVarbitConfig.jdMethod_this("w\032") + localNpc.combatLevel() + Qb.jdMethod_this("\005V") + localNpc.health() + CacheVarbitConfig.jdMethod_this("o~\022z\022") + localNpc.id();((int)localPoint.getY())
        .setColor(localNpc.inMotion() ? Color.GREEN : localNpc.inCombat() ? Color.RED : Color.WHITE); String 
        tmp259_257 = str1; int tmp265_264 = 1;tmp265_264; int tmp280_279 = 1;tmp280_279;x.drawString(localFontMetrics.stringWidth(tmp259_257) - 2 / tmp265_264, y, localFontMetrics.getHeight() - 2 / tmp280_279);
      str2 = tmp259_257.overheadMessage(); int 
        tmp294_293 = 1;tmp294_293;i = tmp294_293; int 
        tmp303_302 = 1;tmp303_302; if (-1 != tmp303_302) {
        str1 = "";
        str1 = Qb.jdMethod_this("%"); int 
          tmp345_344 = 1;tmp345_344; if (-1 != tmp345_344) {
          str1 = CacheVarbitConfig.jdMethod_this("sm\022") + localNpc.animation() + Qb.jdMethod_this("\005q\005^q7\005 \024-Y-");
        }
        int tmp396_395 = 1;tmp396_395;str1 = 0.substring(tmp396_395, str1.lastIndexOf(CacheVarbitConfig.jdMethod_this("\022+\022")));
        str1 = Qb.jdMethod_this("$"); int 
        
          tmp455_454 = 1;tmp455_454; int tmp470_469 = 1;tmp470_469; int tmp475_474 = 1;tmp475_474;(localFontMetrics.stringWidth(str1) - 2 / tmp455_454).drawString(y, localFontMetrics.getHeight(), 3 * tmp470_469 - 2 / tmp475_474); int 
          tmp483_482 = 1;tmp483_482;i = tmp483_482;
      }
    } while (str2 == null);
    a.setColor(Color.ORANGE);
    1; int tmp535_534 = 1;tmp535_534; int tmp542_541 = 1;(i != 0 ? tmp535_534 : tmp542_541); int tmp547_546 = 1;tmp547_546;y.drawString(localFontMetrics.getHeight(), 5, 3 * tmp542_541 - 2 / tmp547_546);
  }
}
