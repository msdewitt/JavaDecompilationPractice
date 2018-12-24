package org.powerbot.script;









public abstract interface Textable
{
  public abstract String text();
  








  public static class Matcher
    implements Filter<Textable>
  {
    private final String[] texts;
    








    public Matcher(String... arg0)
    {
      texts = new String[arg0.length];
      for (int i = 0; i < arg0.length; i++) {
        texts[i] = arg0[i].toUpperCase();
      }
    }
    
    public boolean accept(Textable arg0)
    {
      String str1 = arg0.text();
      if (str1 == null) {
        return false;
      }
      str1 = str1.toUpperCase();
      for (String str2 : texts) {
        if ((str2 != null) && (str1.contains(str2))) {
          return true;
        }
      }
      return false;
    }
  }
  
  public static abstract interface Query<T>
  {
    public abstract T text(String... paramVarArgs);
  }
}
