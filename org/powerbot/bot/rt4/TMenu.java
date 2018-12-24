package org.powerbot.bot.rt4;

import java.awt.Graphics;
import org.powerbot.bot.DebugHelper;
import org.powerbot.script.TextPaintListener;
import org.powerbot.script.rt4.ClientAccessor;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Menu;

public class TMenu extends ClientAccessor implements TextPaintListener
{
  public TMenu(ClientContext a)
  {
    a.<init>(a);
  }
  
  public int draw(int a, Graphics a) {
    DebugHelper.drawLine(a, a, org.powerbot.misc.NUl.jdMethod_this("\\\003\023"));
    String[] arrayOfString;
    int i = (arrayOfString = ctx).menu.items()).length; int tmp33_32 = 1; int j; for (tmp33_32; (j = tmp33_32) < i;) { String str = arrayOfString[j];
      DebugHelper.drawLine(new StringBuilder(), (a++).insert(0, NodeQueue.jdMethod_this("nopb")), j++);tmpTernaryOp = j; continue;throw a;
    }
    return a;
  }
}
