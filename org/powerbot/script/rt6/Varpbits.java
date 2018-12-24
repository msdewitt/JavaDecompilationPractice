package org.powerbot.script.rt6;

import org.powerbot.bot.rt6.client.Client;
import org.powerbot.bot.rt6.client.PlayerFacade;



public class Varpbits
  extends ClientAccessor
{
  public Varpbits(ClientContext arg0)
  {
    super(arg0);
  }
  




  public int[] array()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return null;
    }
    int[] arrayOfInt = localClient.getPlayerFacade().getVarpbits().get();
    return arrayOfInt != null ? (int[])arrayOfInt.clone() : new int[0];
  }
  





  public int varpbit(int arg0)
  {
    int[] arrayOfInt = array();
    return (arg0 > -1) && (arg0 < arrayOfInt.length) ? arrayOfInt[arg0] : -1;
  }
  






  public int varpbit(int arg0, int arg1)
  {
    return varpbit(arg0, 0, arg1);
  }
  







  public int varpbit(int arg0, int arg1, int arg2)
  {
    return varpbit(arg0) >>> arg1 & arg2;
  }
}
