package org.powerbot.script.rt6;

import java.util.ArrayList;
import java.util.List;
import org.powerbot.bot.rt6.client.Client;




public class HintArrows
  extends HintArrowQuery<HintArrow>
{
  public HintArrows(ClientContext arg0)
  {
    super(arg0);
  }
  



  protected List<HintArrow> get()
  {
    ArrayList localArrayList = new ArrayList();
    
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return localArrayList;
    }
    
    org.powerbot.bot.rt6.client.HintArrow[] arrayOfHintArrow1 = localClient.getHintArrows();
    for (org.powerbot.bot.rt6.client.HintArrow localHintArrow : arrayOfHintArrow1 != null ? arrayOfHintArrow1 : new org.powerbot.bot.rt6.client.HintArrow[0]) {
      if (localHintArrow.isNull()) {
        localArrayList.add(new HintArrow((ClientContext)ctx, localHintArrow));
      }
    }
    return localArrayList;
  }
  



  public HintArrow nil()
  {
    return new HintArrow((ClientContext)ctx, new org.powerbot.bot.rt6.client.HintArrow(ctx).client()).reflector, null));
  }
}
