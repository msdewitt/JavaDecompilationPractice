package org.powerbot.bot.rt6;

import java.awt.Graphics;
import org.powerbot.bot.DebugHelper;
import org.powerbot.script.rt6.ClientAccessor;
import org.powerbot.script.rt6.ClientContext;
import z.coM8;

public class TMenu extends ClientAccessor implements org.powerbot.script.TextPaintListener
{
  public TMenu(ClientContext a)
  {
    a.<init>(a);
  }
  
  public int draw(int a, Graphics a) {
    DebugHelper.drawLine(a, a, coM8.jdMethod_this("m[NK"));
    String[] arrayOfString;
    int i = (arrayOfString = ctx).menu.items()).length; int tmp33_32 = 1; int j; for (tmp33_32; (j = tmp33_32) < i;) { String str = arrayOfString[j];
      DebugHelper.drawLine(new StringBuilder(), (a++).insert(0, coM8.jdMethod_this("\000\023\036\036")), j++);tmpTernaryOp = j; continue;throw a;
    }
    return a;
  }
}
