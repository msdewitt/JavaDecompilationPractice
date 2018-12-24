package org.powerbot.script.rt6;

import org.powerbot.script.Input;
import org.powerbot.script.Textable;
import org.powerbot.script.Validatable;

public class ChatOption extends ClientAccessor implements Textable, Validatable
{
  private final int index;
  private final Component option;
  
  public ChatOption(ClientContext arg0, int arg1, Component arg2)
  {
    super(arg0);
    index = arg1;
    option = arg2;
  }
  
  public int getIndex() {
    return index;
  }
  
  public String text()
  {
    if (option == null) {
      return "";
    }
    return option.text();
  }
  
  public boolean select() {
    return select(false);
  }
  
  public boolean select(boolean arg0) {
    return (valid()) && (((arg0) && (ctx).input.send(Integer.toString(index + 1)))) || (option.click()));
  }
  
  public boolean valid()
  {
    return (index >= 0) && (index < 5) && (option != null) && (option.valid());
  }
}
