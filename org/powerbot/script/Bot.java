package org.powerbot.script;

import java.util.logging.Logger;






public abstract class Bot<C extends ClientContext<? extends Client>>
{
  public final C ctx;
  protected final Logger log = Logger.getLogger("Bot");
  
  public Bot() {
    ctx = newContext();
  }
  
  protected abstract C newContext();
  
  public abstract boolean allowTrades();
}
