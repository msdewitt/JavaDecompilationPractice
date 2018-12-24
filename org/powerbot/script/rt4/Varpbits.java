package org.powerbot.script.rt4;

import org.powerbot.bot.rt4.client.Client;




public class Varpbits
  extends ClientAccessor
{
  public Varpbits(ClientContext arg0)
  {
    super(arg0);
  }
  




  public int[] array()
  {
    int[] arrayOfInt1 = new int[0];
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return arrayOfInt1;
    }
    int[] arrayOfInt2 = localClient.getVarpbits();
    return arrayOfInt2 != null ? (int[])arrayOfInt2.clone() : arrayOfInt1;
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
