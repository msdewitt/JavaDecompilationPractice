package org.powerbot.bot.rt6;

import java.awt.Graphics;
import org.powerbot.bot.DebugHelper;
import org.powerbot.script.TextPaintListener;
import org.powerbot.script.rt6.ClientAccessor;
import org.powerbot.script.rt6.ClientContext;
import org.powerbot.script.rt6.Game;

public class TPlane
  extends ClientAccessor
  implements TextPaintListener
{
  public TPlane(ClientContext a)
  {
    a.<init>(a);
  }
  
  public int draw(int a, Graphics a) {
    DebugHelper.drawLine(a, new StringBuilder(), ctx).game.floor());
    return a;
  }
}
