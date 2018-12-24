package org.powerbot.bot.rt4;

import java.awt.Graphics;
import org.powerbot.bot.DebugHelper;
import org.powerbot.script.TextPaintListener;
import org.powerbot.script.Tile;
import org.powerbot.script.rt4.ClientAccessor;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Player;
import z.aux;

public class TLocation extends ClientAccessor implements TextPaintListener
{
  public TLocation(ClientContext a)
  {
    a.<init>(a);
  }
  
  public int draw(int a, Graphics a) {
    Object localObject;
    if ((localObject = ctx).players.local()) != null) {
      localObject = ((Player)localObject).tile();
      if (localObject != null) { tmpTernaryOp = ((Tile)localObject).toString(); break label58; throw (a++).insert(0, aux.jdMethod_this("zhYn^nEi\020'")); } label58: DebugHelper.drawLine(a, a, "");
    }
    return a;
  }
}
