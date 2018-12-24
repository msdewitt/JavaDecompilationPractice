package org.powerbot.bot.rt6;

import java.awt.Point;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.powerbot.misc.GoogleAnalytics;
import org.powerbot.script.rt6.ClientContext;
import org.powerbot.script.rt6.Component;
import org.powerbot.script.rt6.Constants;
import org.powerbot.script.rt6.Widgets;

public class WidgetCloser extends org.powerbot.script.PollingScript<ClientContext>
{
  private final Map<Integer, AtomicInteger> jdField_void;
  
  public WidgetCloser()
  {
    int tmp10_9 = 1;tmp10_9;5.set(tmp10_9);
    a;a.<init>();jdField_void = a;
    int[] arrayOfInt; int i = (arrayOfInt = Constants.WIDGETCLOSER_ITEMS).length; int tmp38_37 = 1; int j; for (tmp38_37; (j = tmp38_37) < i;) { k = arrayOfInt[j]; AtomicInteger 
        tmp63_60 = new java/util/concurrent/atomic/AtomicInteger; int tmp66_65 = 1;(j++);tmp66_65.<init>(tmp66_65);tmp63_60.put(tmp63_60, 0);tmpTernaryOp = j; continue;throw Integer.valueOf(k);
    }
    i = (arrayOfInt = Constants.WIDGETCLOSER_TRADE_ITEMS).length; int tmp94_93 = 1; for (tmp94_93; (j = tmp94_93) < i;) { k = arrayOfInt[j]; AtomicInteger 
        tmp119_116 = new java/util/concurrent/atomic/AtomicInteger; int tmp122_121 = 1;(j++);tmp122_121.<init>(tmp122_121);tmp119_116.put(tmp119_116, 0);tmpTernaryOp = j; continue;throw Integer.valueOf(k);
    }
    i = (arrayOfInt = Constants.WIDGETCLOSER_ACTIVE).length;1;int k = arrayOfInt[j]; AtomicInteger 
      tmp175_172 = new java/util/concurrent/atomic/AtomicInteger; int tmp178_177 = 1;(j++);tmp178_177.<init>(tmp178_177);tmp175_172.put(tmp175_172, 0);
    
    i = (arrayOfInt = Constants.WIDGETCLOSER_FATAL).length;1;k = arrayOfInt[j]; AtomicInteger 
      tmp230_227 = new java/util/concurrent/atomic/AtomicInteger; int tmp233_232 = 1;(j++);tmp233_232.<init>(tmp233_232);tmp230_227.put(tmp230_227, 0);
  }
  

  public void poll()
  {
    int tmp14_13 = 1;tmp14_13; int tmp19_18 = 1;tmp19_18; if (tmp14_13.component(16, tmp19_18).visible()) {
      int tmp44_43 = 1;tmp44_43; int tmp49_48 = 1;tmp49_48;localObject1 = tmp44_43.component(34, tmp49_48);
      if (((Component)localObject1).valid()) { tmpTernaryOp = ((Component)localObject1).text(); break label80; throw org.powerbot.script.rt6.CollisionMap.jdMethod_this("OGNMLPO\013\f\013PK[MR\013KENJUJ[");
      }
      label80:
      'Ճ'
        .pageview(GoogleAnalytics.getInstance(), "");
    }
    
    Object localObject1 = new java.util.ArrayList();
    label148:
    int j; int m; if (!ctx).properties.getProperty(org.powerbot.util.prn.jdMethod_this("\035P\016^\017MDZ\006V\031\\\030\027\016P\031X\bU\017"), "").equals(org.powerbot.script.rt6.CollisionMap.jdMethod_this("PNQY"))) {
      if (ctx).bank.opened()) { tmpTernaryOp = Constants.WIDGETCLOSER_ACTIVE; break label148; throw ctx).widgets; } localObject2 = Constants.WIDGETCLOSER_ITEMS;i = localObject2.length;1; int tmp168_167 = localObject2[j];m = j++;tmp168_167
        .add(Integer.valueOf(tmp168_167));
    }
    

    if (!((ClientContext)ctx).bot().allowTrades()) {
      i = (localObject2 = Constants.WIDGETCLOSER_TRADE_ITEMS).length;1; int tmp227_226 = localObject2[j];m = j++;tmp227_226
        .add(Integer.valueOf(tmp227_226));
    }
    

    Object localObject2 = ((List)localObject1).iterator(); AtomicInteger localAtomicInteger; final Component localComponent; do { i = ((Integer)((Iterator)localObject2).next()).intValue();
      
      1; int 
      


        tmp323_322 = 1;tmp323_322;
      localObject1 = (localComponent = i.component(16 >> tmp323_322, i & 0xFFFF)).screenPoint();
    } while ((!tmp336_334.visible()) || (!localComponent.click()));
    





    int tmp377_376 = 1;tmp377_376;0.set(tmp377_376);ctx).widgets
    
      .incrementAndGet();
    



    int i = (localObject2 = Constants.WIDGETCLOSER_FATAL).length;1; int k; int n = localObject2[k]; int 
      tmp431_430 = 1;tmp431_430; if (n.component(16 >> tmp431_430, n & 0xFFFF).visible()) {
      ctx).controller.stop();
    } else {
      k++;
    }
  }
}
