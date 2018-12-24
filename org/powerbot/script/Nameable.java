package org.powerbot.script;

import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
























































public abstract interface Nameable
{
  public abstract String name();
  
  public static class Matcher
    implements Filter<Nameable>
  {
    private final String[] str;
    private final Pattern[] regex;
    
    public Matcher(String[]... arg0)
    {
      int i = 0;
      for (Object localObject2 : arg0) {
        i += localObject2.length;
      }
      ??? = new String[i];
      ??? = 0;
      for (String[] arrayOfString1 : arg0) {
        for (String str1 : arrayOfString1) {
          ???[(???++)] = str1;
        }
      }
      str = ((String[])???);
      regex = null;
    }
    
    public Matcher(String... arg0) {
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
    
    public Matcher(Nameable... arg0) {
      regex = null;
      str = new String[arg0.length];
      for (int i = 0; i < arg0.length; i++) {
        str[i] = arg0[i].name();
      }
    }
    
    public Matcher(Pattern... arg0) {
      regex = arg0;
      str = null;
    }
    
    public boolean accept(Nameable arg0)
    {
      String str1 = arg0.name();
      if ((str1 == null) || ((regex == null) && (str == null)))
        return false;
      Object localObject2;
      if (regex != null) {
        for (localObject2 : regex) {
          if ((localObject2 != null) && (localObject2.matcher(str1).matches())) {
            return true;
          }
        }
      } else {
        for (localObject2 : str) {
          if ((localObject2 != null) && (localObject2.equalsIgnoreCase(str1))) {
            return true;
          }
        }
      }
      return false;
    }
  }
  
  public static abstract interface Query<T>
  {
    public abstract T name(String... paramVarArgs);
    
    public abstract T name(Collection<String> paramCollection);
    
    public abstract T name(String[]... paramVarArgs);
    
    public abstract T name(Pattern... paramVarArgs);
    
    public abstract T name(Nameable... paramVarArgs);
  }
}
