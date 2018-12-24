package org.powerbot.bot.rt6;

import java.awt.Graphics;
import org.powerbot.bot.DebugHelper;
import org.powerbot.script.TextPaintListener;
import org.powerbot.script.rt6.ClientContext;
import org.powerbot.script.rt6.Game;

public class TClientState
  implements TextPaintListener
{
  private final ClientContext jdField_void;
  
  public TClientState(ClientContext a)
  {
    jdField_void = a;
  }
  
  public int draw(int a, Graphics a) {
    DebugHelper.drawLine(a, new StringBuilder(), jdField_void.game.clientState());
    return a;
  }
}
