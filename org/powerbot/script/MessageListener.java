package org.powerbot.script;

import java.util.EventListener;

public abstract interface MessageListener
  extends EventListener
{
  public abstract void messaged(MessageEvent paramMessageEvent);
}
