package org.powerbot.script;

import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;







































public abstract interface Actionable
  extends Interactive
{
  public abstract String[] actions();
  
  public static class Matcher
    implements Filter<Actionable>
  {
    private final String[] str;
    private final Pattern[] regex;
    
    public Matcher(String... arg0)
    {
      str = arg0;
      regex = null;
    }
    
    public Matcher(Collection<String> arg0) {
      regex = null;
      str = new String[arg0.size()];
      int i = 0;
      for (String str1 : arg0) {
        str[(i++)] = str1;
      }
    }
    
    public Matcher(Pattern... arg0) {
      regex = arg0;
      str = null;
    }
    
    public boolean accept(Actionable arg0)
    {
      String[] arrayOfString1 = arg0.actions();
      if (arrayOfString1 == null) {
        return false;
      }
      if ((regex == null) && (str == null))
        return false;
      String str1;
      String str2; if (regex != null) {
        for (str1 : arrayOfString1) {
          if (str1 != null)
          {

            for (str2 : regex) {
              if (str2.matcher(str1).matches())
                return true;
            }
          }
        }
      } else {
        for (str1 : arrayOfString1) {
          if (str1 != null)
          {

            for (str2 : str) {
              if (str1.equalsIgnoreCase(str2))
                return true;
            }
          }
        }
      }
      return false;
    }
  }
  
  public static abstract interface Query<T>
  {
    public abstract T action(String... paramVarArgs);
    
    public abstract T action(Collection<String> paramCollection);
    
    public abstract T action(Pattern... paramVarArgs);
  }
}
