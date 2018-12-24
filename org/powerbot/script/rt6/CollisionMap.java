package org.powerbot.script.rt6;




public final class CollisionMap
{
  private final CollisionFlag[][] clipping;
  

  private final int xOff;
  

  private final int yOff;
  

  private final int width;
  

  private final int height;
  


  public CollisionMap(int arg0, int arg1)
  {
    xOff = -1;
    yOff = -1;
    width = (arg0 + 6);
    height = (arg1 + 6);
    clipping = new CollisionFlag[width][height];
    clear();
  }
  
  public int width() {
    return width;
  }
  
  public int height() {
    return height;
  }
  
  public void clear() {
    for (int i = 0; i < width; i++) {
      for (int j = 0; j < height; j++) {
        if ((i <= 1) || (j <= 1) || (i >= width - 6) || (j >= height - 6)) {
          clipping[i][j] = CollisionFlag.PADDING;
        } else {
          clipping[i][j] = CollisionFlag.createNewMarkable();
        }
      }
    }
  }
  
  public CollisionFlag flagAt(int arg0, int arg1) {
    return clipping[localX(arg0)][localY(arg1)];
  }
  
  public void markDecoration(int arg0, int arg1) {
    _mark(localX(arg0), localY(arg1), CollisionFlag.DECORATION_BLOCK);
  }
  
  public void markInteractive(int arg0, int arg1) {
    _mark(localX(arg0), localY(arg1), CollisionFlag.OBJECT_BLOCK);
  }
  
  public void markDeadBlock(int arg0, int arg1) {
    _mark(localX(arg0), localY(arg1), CollisionFlag.DEAD_BLOCK);
  }
  
  public void markWall(int arg0, int arg1, int arg2, int arg3) {
    arg0 = localX(arg0);
    arg1 = localY(arg1);
    arg3 %= 4;
    switch (arg2) {
    case 0: 
      switch (arg3) {
      case 0: 
        _mark(arg0, arg1, CollisionFlag.WEST);
        _mark(arg0 - 1, arg1, CollisionFlag.EAST);
        break;
      case 1: 
        _mark(arg0, arg1, CollisionFlag.NORTH);
        _mark(arg0, arg1 + 1, CollisionFlag.SOUTH);
        break;
      case 2: 
        _mark(arg0, arg1, CollisionFlag.EAST);
        _mark(arg0 + 1, arg1, CollisionFlag.WEST);
        break;
      case 3: 
        _mark(arg0, arg1, CollisionFlag.SOUTH);
        _mark(arg0, arg1 - 1, CollisionFlag.NORTH);
      }
      
      break;
    case 2: 
      switch (arg3) {
      case 0: 
        _mark(arg0, arg1, CollisionFlag.NORTH.mark(CollisionFlag.WEST));
        _mark(arg0 - 1, arg1, CollisionFlag.EAST);
        _mark(arg0, 1 + arg1, CollisionFlag.SOUTH);
        break;
      case 1: 
        _mark(arg0, arg1, CollisionFlag.NORTH.mark(CollisionFlag.EAST));
        _mark(arg0, 1 + arg1, CollisionFlag.SOUTH);
        _mark(arg0 + 1, arg1, CollisionFlag.WEST);
        break;
      case 2: 
        _mark(arg0, arg1, CollisionFlag.SOUTH.mark(CollisionFlag.EAST));
        _mark(arg0 + 1, arg1, CollisionFlag.WEST);
        _mark(arg0, arg1 - 1, CollisionFlag.NORTH);
        break;
      case 3: 
        _mark(arg0, arg1, CollisionFlag.SOUTH.mark(CollisionFlag.WEST));
        _mark(arg0, arg1 - 1, CollisionFlag.NORTH);
        _mark(arg0 - 1, arg1, CollisionFlag.EAST);
      }
      
      break;
    case 1: 
    case 3: 
      switch (arg3) {
      case 0: 
        _mark(arg0, arg1, CollisionFlag.NORTHWEST);
        _mark(arg0 - 1, arg1 + 1, CollisionFlag.SOUTHEAST);
        break;
      case 1: 
        _mark(arg0, arg1, CollisionFlag.NORTHEAST);
        _mark(arg0 + 1, 1 + arg1, CollisionFlag.SOUTHWEST);
        break;
      case 2: 
        _mark(arg0, arg1, CollisionFlag.SOUTHEAST);
        _mark(arg0 + 1, arg1 - 1, CollisionFlag.NORTHWEST);
        break;
      case 3: 
        _mark(arg0, arg1, CollisionFlag.SOUTHWEST);
        _mark(arg0 - 1, arg1 - 1, CollisionFlag.NORTHEAST);
      }
      break;
    }
  }
  
  private void _mark(int arg0, int arg1, CollisionFlag arg2)
  {
    clipping[arg0][arg1].mark(arg2);
  }
  
  private int localX(int arg0) {
    return arg0 - xOff;
  }
  
  private int localY(int arg0) {
    return arg0 - yOff;
  }
  
  public static String jdMethod_this(Object s)
  {
    int tmp28_25 = (s = (String)s).length();
    int tmp32_31 = 1;
    tmp32_31;
    int j;
    int ? = tmp32_31;
    int k = tmp28_25;
    int tmp42_38 = (j = new char[tmp28_25] - 1);
    tmp42_38;
    int i = 4 << 3 ^ 0x4;
    ((0x2 ^ 0x5) << 3 ^ 0x4);
    if (tmp42_38 >= 0)
    {
      int tmp52_51 = j;
      j--;
      ?[tmp52_51] = ((char)(s.charAt(tmp52_51) ^ i));
      int tmp73_70 = (j--);
      ?[tmp73_70] = ((char)(s.charAt(tmp73_70) ^ k));
    }
    return new String(?);
  }
}
