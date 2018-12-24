package org.powerbot.script;


public class MenuCommand
{
  public final String action;
  public final String option;
  
  public MenuCommand(String arg0, String arg1)
  {
    action = (arg0 != null ? StringUtils.stripHtml(arg0) : "");
    option = (arg1 != null ? StringUtils.stripHtml(arg1) : "");
  }
  
  public int hashCode()
  {
    int i = 17;
    i = i * 31 + action.hashCode();
    i = i * 31 + option.hashCode();
    return i;
  }
  
  public boolean equals(Object arg0)
  {
    return ((arg0 instanceof MenuCommand)) && (action.equals(action)) && (option.equals(option));
  }
  
  public String toString()
  {
    return String.format("%s %s", new Object[] { action, option }).trim();
  }
}
