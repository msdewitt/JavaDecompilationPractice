package org.powerbot.script;

import java.util.EventListener;
import org.powerbot.bot.AbstractEvent;


public class MessageEvent
  extends AbstractEvent
{
  public static final int MESSAGE_EVENT = 32;
  private static final long serialVersionUID = 4178447203851407187L;
  private final int id;
  private final String source;
  private final String message;
  
  public MessageEvent(org.powerbot.bot.rt6.client.MessageEntry arg0)
  {
    this(arg0.getType(), arg0.getSender(), arg0.getMessage());
  }
  
  public MessageEvent(org.powerbot.bot.rt4.client.MessageEntry arg0) {
    this(arg0.getType(), arg0.getSender(), arg0.getMessage());
  }
  
  public MessageEvent(int arg0, String arg1, String arg2) {
    super(32);
    id = arg0;
    source = arg1;
    message = arg2;
  }
  



  public void call(EventListener arg0)
  {
    ((MessageListener)arg0).messaged(this);
  }
  


  public int type()
  {
    return id;
  }
  



  public String source()
  {
    return source;
  }
  


  public String text()
  {
    return message;
  }
  
  public String toString()
  {
    return String.format("(%d) [%s]: %s%n", new Object[] { Integer.valueOf(id), source, message });
  }
}
