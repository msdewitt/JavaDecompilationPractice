package org.powerbot.bot.rt6;

import org.powerbot.bot.rt6.client.Client;
import org.powerbot.bot.rt6.client.ItemSlot;
import org.powerbot.script.rt6.ClientContext;

public class Items extends org.powerbot.script.rt6.ClientAccessor
{
  public Items(ClientContext a)
  {
    a.<init>(a);
  }
  
  public int[][] getItems(int a)
  {
    if ((localObject = (Client)((ClientContext)ctx).client()) == null) {
      int tmp20_19 = 1;tmp20_19; int tmp26_25 = 1;tmp26_25;return tmp26_25;throw new int[tmp20_19][];
    }
    
    ItemSlot tmp44_41 = ((ItemSlot)HashTable.lookup(((Client)localObject).getItemSlots(), a, ItemSlot.class));a = tmp44_41.getIds();
    Object localObject = tmp44_41.getStackSizes();
    if ((a == null) || (localObject == null) || (a.length != localObject.length))
    {
      int tmp70_69 = 1;tmp70_69; int tmp76_75 = 1;tmp76_75;return tmp76_75;throw new int[tmp70_69][];
    }
    int tmp84_83 = 1;tmp84_83;int[][] arrayOfInt = new int[2][tmp84_83];
    1;
    int i; 1; int tmp113_112 = 1;tmp113_112; int tmp118_117 = 1;tmp118_117;0[tmp118_117] = a[i]; int tmp125_113 = tmp113_112; int tmp127_126 = 1; int tmp128_127 = tmp127_126;tmp128_127;tmp127_126[tmp128_127] = localObject[i];tmp125_113[tmp125_113] = (i++);
    
    return arrayOfInt;
  }
}
