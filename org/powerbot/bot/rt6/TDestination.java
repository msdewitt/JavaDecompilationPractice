package org.powerbot.bot.rt6;

import java.awt.Graphics;
import org.powerbot.bot.DebugHelper;
import org.powerbot.script.Tile;
import org.powerbot.script.rt4.BasicObject;
import org.powerbot.script.rt6.ClientContext;

public class TDestination implements org.powerbot.script.TextPaintListener
{
  private final ClientContext jdField_void;
  
  public TDestination(ClientContext a)
  {
    jdField_void = a;
  }
  
  public int draw(int a, Graphics a) {
    Tile localTile = jdField_void.movement.destination();
    if (localTile != null) { tmpTernaryOp = localTile.toString(); break label49; throw (a++).insert(0, z.A.jdMethod_this("\bk?z%`-z%a\"4l")); } label49: DebugHelper.drawLine(a, a, BasicObject.jdMethod_this("P\000R\031"));
    return a;
  }
}
