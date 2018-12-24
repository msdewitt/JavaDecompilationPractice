package org.powerbot.script.rt6;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.powerbot.bot.AbstractBot;
import org.powerbot.bot.EventDispatcher;
import org.powerbot.bot.rt6.client.Client;
import org.powerbot.bot.rt6.client.MessageEntry;
import org.powerbot.bot.rt6.client.NodeSub;
import org.powerbot.bot.rt6.client.NodeSubQueue;
import org.powerbot.script.Input;
import org.powerbot.script.MessageEvent;
import org.powerbot.script.PaintListener;

public class Chat
  extends TextQuery<ChatOption>
{
  private final AtomicBoolean registered;
  
  public Chat(ClientContext arg0)
  {
    super(arg0);
    registered = new AtomicBoolean(false);
  }
  



  public List<ChatOption> get()
  {
    ArrayList localArrayList = new ArrayList(5);
    for (int i = 0; i < 5; i++) {
      Component localComponent = ctx).widgets.component(1188, Constants.CHAT_OPTIONS[i]);
      if (localComponent.valid())
      {

        localArrayList.add(new ChatOption((ClientContext)ctx, i, localComponent)); }
    }
    return localArrayList;
  }
  



  public ChatOption nil()
  {
    return new ChatOption((ClientContext)ctx, -1, null);
  }
  
  public boolean chatting() {
    if (ctx).widgets.component(1188, 0).valid()) {
      return true;
    }
    for (int[] arrayOfInt1 : Constants.CHAT_CONTINUE) {
      if (ctx).widgets.component(arrayOfInt1[0], 0).valid()) {
        return true;
      }
    }
    return false;
  }
  




  public boolean canContinue()
  {
    return getContinue() != null;
  }
  
  @Deprecated
  public boolean queryContinue() {
    return canContinue();
  }
  




  public boolean clickContinue()
  {
    return clickContinue(false);
  }
  





  public boolean clickContinue(boolean arg0)
  {
    Component localComponent = getContinue();
    return (localComponent != null) && (((arg0) && (ctx).input.send(" "))) || (localComponent.click()));
  }
  
  private Component getContinue() {
    for (int[] arrayOfInt1 : Constants.CHAT_CONTINUE) {
      Component localComponent = ctx).widgets.component(arrayOfInt1[0], arrayOfInt1[1]);
      if (localComponent.valid())
      {

        return localComponent; }
    }
    return null;
  }
  
  public void register() {
    if (!registered.compareAndSet(false, true)) {
      return;
    }
    final EventDispatcher localEventDispatcher = ctx).bot()).dispatcher;
    localEventDispatcher.add(new PaintListener() {
      private final AtomicReference<NodeSub> previous = new AtomicReference(null);
      
      public void repaint(Graphics arg0)
      {
        Client localClient = (Client)((ClientContext)ctx).client();
        if (localClient == null) {
          return;
        }
        
        NodeSubQueue localNodeSubQueue = localClient.getLoggerEntries();
        NodeSub localNodeSub = localNodeSubQueue.getSentinel();
        Object localObject1 = localNodeSub.getNextSub();
        Object localObject2; if ((previous.get() != null) && (!((NodeSub)previous.get()).isNull())) {
          localObject2 = ((NodeSub)previous.get()).getNextSub();
          localObject1 = ((NodeSub)localObject2).isNull() ? localObject1 : localObject2;
        }
        while (!localNodeSub.equals(localObject1)) {
          localObject2 = new MessageEntry(reflector, localObject1);
          localEventDispatcher.dispatch(new MessageEvent((MessageEntry)localObject2));
          previous.set(localObject1);
          localObject1 = ((NodeSub)localObject1).getNextSub();
        }
      }
    });
  }
}
