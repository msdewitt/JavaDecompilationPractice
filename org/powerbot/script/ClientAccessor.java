package org.powerbot.script;







public abstract class ClientAccessor<T extends ClientContext>
{
  public final T ctx;
  






  public ClientAccessor(T arg0)
  {
    ctx = arg0;
  }
}
