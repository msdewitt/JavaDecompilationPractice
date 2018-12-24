package org.powerbot.bot.rt6;

import java.awt.Graphics;
import org.powerbot.bot.DebugHelper;
import org.powerbot.bot.rt4.HashTable;
import org.powerbot.script.Tile;
import org.powerbot.script.rt6.ClientAccessor;
import org.powerbot.script.rt6.ClientContext;
import org.powerbot.script.rt6.Player;
import org.powerbot.script.rt6.Players;

public class TLocation extends ClientAccessor implements org.powerbot.script.TextPaintListener
{
  public TLocation(ClientContext a)
  {
    a.<init>(a);
  }
  
  public int draw(int a, Graphics a) {
    Object localObject;
    if ((localObject = ctx).players.local()) != null) {
      localObject = ((Player)localObject).tile();
      if (localObject != null) { tmpTernaryOp = ((Tile)localObject).toString(); break label58; throw (a++).insert(0, HashTable.jdMethod_this("[pxvvdq1?")); } label58: DebugHelper.drawLine(a, a, "");
    }
    return a;
  }
}
