package org.powerbot.bot.rt4;

import java.awt.Graphics;
import org.powerbot.bot.DebugHelper;
import org.powerbot.script.TextPaintListener;
import org.powerbot.script.Tile;
import org.powerbot.script.rt4.ClientAccessor;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt6.CollisionMap;

public class TDestination extends ClientAccessor implements TextPaintListener
{
  public TDestination(ClientContext a)
  {
    a.<init>(a);
  }
  
  public int draw(int a, Graphics a) {
    Tile localTile = ctx).movement.destination();
    if (localTile != null) { tmpTernaryOp = localTile.toString(); break label52; throw (a++).insert(0, org.powerbot.misc.NUl.jdMethod_this("\"t\025e\017\007e\017~\b+F")); } label52: DebugHelper.drawLine(a, a, CollisionMap.jdMethod_this("JIHP"));
    return a;
  }
}
