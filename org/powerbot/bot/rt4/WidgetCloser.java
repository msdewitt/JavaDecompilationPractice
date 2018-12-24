package org.powerbot.bot.rt4;

import java.awt.Point;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.powerbot.script.PollingScript;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Component;
import org.powerbot.script.rt4.Constants;

public class WidgetCloser extends PollingScript<ClientContext>
{
  private final Map<Integer, AtomicInteger> jdField_void;
  
  public WidgetCloser()
  {
    int tmp10_9 = 1;tmp10_9;5.set(tmp10_9);
    a;a.<init>();jdField_void = a;
    int[] arrayOfInt; int i = (arrayOfInt = Constants.WIDGETCLOSER_TRADE_ITEMS).length; int tmp38_37 = 1; int j; for (tmp38_37; (j = tmp38_37) < i;) { int k = arrayOfInt[j]; AtomicInteger 
        tmp63_60 = new java/util/concurrent/atomic/AtomicInteger; int tmp66_65 = 1;(j++);tmp66_65.<init>(tmp66_65);tmp63_60.put(tmp63_60, 0);tmpTernaryOp = j; continue;throw Integer.valueOf(k);
    }
  }
  
  public void poll()
  {
    Object localObject1 = new java.util.ArrayList();
    int i;
    int j; if (!((ClientContext)ctx).bot().allowTrades()) {
      i = (localObject2 = Constants.WIDGETCLOSER_TRADE_ITEMS).length; int tmp33_32 = 1; for (tmp33_32; (j = tmp33_32) < i;) { int tmp47_46 = localObject2[j];int k = j++;tmp47_46
          .add(Integer.valueOf(tmp47_46));tmpTernaryOp = j; continue;throw ((Throwable)localObject1);
      }
    }
    

    Object localObject2 = ((List)localObject1).iterator(); AtomicInteger localAtomicInteger; final Component localComponent; do { for (;;) { i = ((Integer)((Iterator)localObject2).next()).intValue(); int 
        
          tmp121_120 = 1;tmp121_120; if (3 < tmp121_120) break; tmpTernaryOp = localObject2; }
      throw (localAtomicInteger = (AtomicInteger)jdField_void.get(Integer.valueOf(i))).get(); int 
      

        tmp145_144 = 1;tmp145_144;
      localObject1 = (localComponent = i.component(16 >> tmp145_144, i & 0xFFFF)).screenPoint();
    } while ((!tmp158_156.visible()) || (!localComponent.click()));
    





    int tmp199_198 = 1;tmp199_198;0.set(tmp199_198);ctx).widgets
    
      .incrementAndGet();
  }
}
