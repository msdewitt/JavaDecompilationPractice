package org.powerbot.script.rt6;








public class GeItem
  extends org.powerbot.script.GeItem
{
  public GeItem(int arg0)
  {
    super("rs", arg0);
  }
  






  @Deprecated
  public static int price(int arg0)
  {
    GeItem localGeItem = new GeItem(arg0);
    return id == 0 ? -1 : price;
  }
  



  public org.powerbot.script.GeItem nil()
  {
    return new GeItem(0);
  }
}
