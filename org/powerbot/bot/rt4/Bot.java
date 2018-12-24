package org.powerbot.bot.rt4;

import org.powerbot.bot.Reflector;
import org.powerbot.bot.ReflectorSpec;
import org.powerbot.bot.cache.CacheWorker;
import org.powerbot.gui.BotChrome;
import org.powerbot.script.rt4.ClientContext;

public class Bot extends org.powerbot.bot.AbstractBot<ClientContext>
{
  static
  {
    int tmp5_4 = 1; int tmp6_5 = tmp5_4;tmp6_5;tmp5_4.<init>(tmp6_5); } public static final CacheWorker CACHE_WORKER = new org/powerbot/bot/cache/CacheWorker;
  




  protected ClientContext jdMethod_this()
  {
    return ClientContext.newContext(a);
  }
  
  protected void jdMethod_this(ReflectorSpec a)
  {
    a = new Reflector(((java.awt.Component)chrome.target.get()).getClass().getClassLoader(), a);
    ((ClientContext)ctx).client(new org.powerbot.bot.rt4.client.Client(a, null));
    ctx).menu.register();
    ctx).chat.register();
  }
  
  public Bot(BotChrome a) {}
}
