package org.powerbot.script;















public abstract interface Identifiable
{
  public abstract int id();
  













  public static class Matcher
    implements Filter<Identifiable>
  {
    private final int[] ids;
    













    public Matcher(int... arg0)
    {
      ids = arg0;
    }
    
    public Matcher(Identifiable... arg0) {
      ids = new int[arg0.length];
      for (int i = 0; i < arg0.length; i++) {
        ids[i] = arg0[i].id();
      }
    }
    
    public boolean accept(Identifiable arg0)
    {
      int i = arg0 != null ? arg0.id() : -1;
      if (i == -1) {
        return false;
      }
      for (int m : ids) {
        if (m == i) {
          return true;
        }
      }
      return false;
    }
  }
  
  public static abstract interface Query<T>
  {
    public abstract T id(int... paramVarArgs);
    
    public abstract T id(int[]... paramVarArgs);
    
    public abstract T id(Identifiable... paramVarArgs);
  }
}
