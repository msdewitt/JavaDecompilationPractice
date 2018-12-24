package org.powerbot.bot.rt6;

import java.util.NavigableSet;
import org.powerbot.misc.GameAccounts.Account;
import org.powerbot.script.rt6.ClientContext;

public class BankPin extends org.powerbot.script.PollingScript<ClientContext>
{
  public BankPin()
  {
    int tmp10_9 = 1;tmp10_9;2.set(tmp10_9);
  }
  
  public void poll()
  {
    int tmp13_12 = 1;tmp13_12; int tmp17_16 = 1;tmp17_16; if (!tmp13_12.component(0, tmp17_16).visible()) {
      if (threshold.contains(a)) {
        threshold.remove(a);
      }
      return;throw 13;
    }
    if (!threshold.contains(a)) {
      threshold.add(a);
    }
    
    String str;
    if ((str = a.jdMethod_this()) == null) {
      ctx).controller.stop();
      return;throw ctx).widgets;
    }
    
    int tmp114_113 = 1;tmp114_113;int j = '£'.varpbit(tmp114_113);
    int i;
    try {
      i = Integer.valueOf(String.valueOf(str.charAt(j))).intValue();tmpTernaryOp = i;
    } catch (NumberFormatException localNumberFormatException) {
      1;
    }
    if ((i = tmp142_141) < 0) {
      return;
    }
    int tmp163_162 = 1;tmp163_162; int tmp169_168 = 1;tmp169_168; if (tmp163_162.component(i, 8 + tmp169_168).interact(org.powerbot.misc.NUl.jdMethod_this("B\003}\003r\022"))) {
      int tmp188_187 = 1;tmp188_187;localNumberFormatException = tmp188_187; int tmp195_194 = 1;tmp195_194; if (24 < tmp195_194) { 1; NumberFormatException 
          tmp229_226 = (localNumberFormatException++);tmp229_226;org.powerbot.script.Condition.sleep(tmp229_226);
      }
    }
  }
  
  private String jdMethod_this() {
    Object localObject;
    if ((localObject = org.powerbot.misc.GameAccounts.getInstance().get(ctx).properties.getProperty(z.com9.jdMethod_this("XbSdZ#UnWbAc@#A~QZlYh"), ""))) != null)
    {
      if ((localObject = ((GameAccounts.Account)localObject).getPIN()) != null) { int tmp46_45 = 1;tmp46_45; if (4 == tmp46_45) {
          return localObject;throw ((String)localObject).length();
        }
      } }
    return null;
  }
}
