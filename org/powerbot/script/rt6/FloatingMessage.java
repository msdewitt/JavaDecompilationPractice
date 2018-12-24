package org.powerbot.script.rt6;

import org.powerbot.script.Validatable;


public class FloatingMessage
  implements Validatable
{
  @Deprecated
  public static final int TEXTURE_INFO = 8515;
  @Deprecated
  public static final int TEXTURE_WARNING = 8524;
  private final String text;
  private final int texture;
  
  public FloatingMessage(String arg0, int arg1)
  {
    text = arg0;
    texture = arg1;
  }
  
  public String text() {
    return text;
  }
  
  public int texture() {
    return texture;
  }
  
  public boolean valid()
  {
    return (!text.isEmpty()) && (texture != -1);
  }
}
