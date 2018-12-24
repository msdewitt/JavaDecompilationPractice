package org.powerbot.script;

import java.util.Collection;
import java.util.EventListener;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;
import org.powerbot.bot.AbstractBot;
import org.powerbot.bot.InputSimulator;
import org.powerbot.bot.ScriptController;
import org.powerbot.bot.ScriptEventDispatcher;







public abstract class ClientContext<C extends Client>
{
  public static final RuntimePermission INTERNAL_API_ACCESS = new RuntimePermission("checkInternalApiAccess");
  


  public final Script.Controller controller;
  


  public final Properties properties;
  


  public final Collection<EventListener> dispatcher;
  

  public final Input input;
  

  private final AtomicReference<Bot<? extends ClientContext<C>>> bot;
  

  private final AtomicReference<C> client;
  


  protected ClientContext(Bot<? extends ClientContext<C>> arg0)
  {
    bot = new AtomicReference(arg0);
    client = new AtomicReference(null);
    
    ScriptController localScriptController = new ScriptController(this);
    controller = localScriptController;
    properties = new Properties();
    dispatcher = new ScriptEventDispatcher(this);
    input = new InputSimulator((AbstractBot)arg0);
    
    properties.put("trades.allowed", "0");
    properties.put("sdn.host", "sdn.powerbot.org");
  }
  




  protected ClientContext(ClientContext<C> arg0)
  {
    bot = bot;
    client = client;
    controller = controller;
    properties = properties;
    dispatcher = dispatcher;
    input = input;
  }
  




  public final String rtv()
  {
    Class localClass = getClass();
    if (org.powerbot.script.rt6.ClientContext.class.isAssignableFrom(localClass)) {
      return "6";
    }
    if (org.powerbot.script.rt4.ClientContext.class.isAssignableFrom(localClass)) {
      return "4";
    }
    return "";
  }
  




  public final Bot<? extends ClientContext<C>> bot()
  {
    return (Bot)bot.get();
  }
  




  public final C client()
  {
    return (Client)client.get();
  }
  





  public final C client(C arg0)
  {
    return (Client)client.getAndSet(arg0);
  }
  





  @Deprecated
  public final Script.Controller controller()
  {
    return controller;
  }
  




  /**
   * @deprecated
   */
  public final <T extends AbstractScript<? extends ClientContext<C>>> T script()
  {
    return controller.script();
  }
  






  @Deprecated
  public final String property(String arg0)
  {
    return property(arg0, "");
  }
  







  @Deprecated
  public final String property(String arg0, String arg1)
  {
    return properties.getProperty(arg0, arg1);
  }
}
