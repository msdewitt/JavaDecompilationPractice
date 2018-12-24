package org.powerbot.script.rt6;

import java.util.EnumSet;
import org.powerbot.script.Tile;


public abstract class Path
  extends ClientAccessor
{
  public Path(ClientContext arg0)
  {
    super(arg0);
  }
  
  public abstract boolean traverse(EnumSet<TraversalOption> paramEnumSet);
  
  public boolean traverse() {
    return traverse(EnumSet.of(TraversalOption.HANDLE_RUN, TraversalOption.SPACE_ACTIONS));
  }
  
  public abstract boolean valid();
  
  public abstract Tile next();
  
  public abstract Tile start();
  
  public abstract Tile end();
  
  public static enum TraversalOption {
    HANDLE_RUN,  SPACE_ACTIONS;
    
    private TraversalOption() {}
  }
}
