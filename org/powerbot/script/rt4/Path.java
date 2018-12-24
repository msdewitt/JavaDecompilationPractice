package org.powerbot.script.rt4;

import java.util.EnumSet;
import org.powerbot.script.Tile;
import org.powerbot.script.Validatable;

public abstract class Path
  extends ClientAccessor
  implements Validatable
{
  public static final int WALL_NORTHWEST = 1;
  public static final int WALL_NORTH = 2;
  public static final int WALL_NORTHEAST = 4;
  public static final int WALL_EAST = 8;
  public static final int WALL_SOUTHEAST = 16;
  public static final int WALL_SOUTH = 32;
  public static final int WALL_SOUTHWEST = 64;
  public static final int WALL_WEST = 128;
  public static final int OBJECT_TILE = 256;
  public static final int DECORATION_BLOCK = 262144;
  public static final int OBJECT_BLOCK = 2097152;
  
  Path(ClientContext arg0)
  {
    super(arg0);
  }
  








  public abstract boolean traverse(EnumSet<TraversalOption> paramEnumSet);
  







  public boolean traverse()
  {
    return traverse(EnumSet.of(TraversalOption.HANDLE_RUN, TraversalOption.SPACE_ACTIONS));
  }
  





  public abstract Tile next();
  




  public abstract Tile start();
  




  public abstract Tile end();
  




  public static enum TraversalOption
  {
    HANDLE_RUN,  SPACE_ACTIONS;
    
    private TraversalOption() {}
  }
}
