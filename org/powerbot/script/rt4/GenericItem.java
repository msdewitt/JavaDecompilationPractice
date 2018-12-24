package org.powerbot.script.rt4;

import org.powerbot.script.Identifiable;
import org.powerbot.script.Nameable;

abstract class GenericItem
  extends Interactive implements Identifiable, Nameable
{
  public GenericItem(ClientContext arg0)
  {
    super(arg0);
  }
  
  public String name()
  {
    return loadidname;
  }
  




  public boolean members()
  {
    return loadidmembers;
  }
  




  public boolean stackable()
  {
    return loadidstackable;
  }
  




  public boolean noted()
  {
    return loadidnoted;
  }
  




  public boolean tradeable()
  {
    return loadidtradeable;
  }
  




  public boolean cosmetic()
  {
    return loadidcosmetic;
  }
  





  public int value()
  {
    return loadidvalue;
  }
  




  public int modelId()
  {
    return loadidmodelId;
  }
  




  public String[] groundActions()
  {
    return loadidgroundActions;
  }
  




  public String[] inventoryActions()
  {
    return loadidactions;
  }
}
