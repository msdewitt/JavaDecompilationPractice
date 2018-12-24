package org.powerbot.bot.rt4;

import java.awt.Graphics;
import org.powerbot.bot.DebugHelper;
import org.powerbot.script.TextPaintListener;
import org.powerbot.script.rt4.ClientAccessor;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Game;

public class TClientState extends ClientAccessor implements TextPaintListener
{
  public TClientState(ClientContext a)
  {
    a.<init>(a);
  }
  
  public int draw(int a, Graphics a) {
    DebugHelper.drawLine(a, new StringBuilder(), ctx).game.clientState());
    return a;
  }
}
