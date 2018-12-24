package org.powerbot.script.rt4;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.powerbot.bot.AbstractBot;
import org.powerbot.bot.EventDispatcher;
import org.powerbot.bot.rt4.client.Client;
import org.powerbot.bot.rt4.client.Entry;
import org.powerbot.bot.rt4.client.EntryList;
import org.powerbot.bot.rt4.client.MessageEntry;
import org.powerbot.script.Condition;
import org.powerbot.script.Input;
import org.powerbot.script.MessageEvent;
import org.powerbot.script.PaintListener;



public class Chat
  extends TextQuery<ChatOption>
{
  private final AtomicBoolean registered = new AtomicBoolean(false);
  
  public Chat(ClientContext arg0) {
    super(arg0);
  }
  



  protected List<ChatOption> get()
  {
    ArrayList localArrayList = new ArrayList(5);
    Component localComponent1 = ctx).widgets.component(219, 1);
    for (int i = 0; i < 5; i++) {
      Component localComponent2 = localComponent1.component(Constants.CHAT_OPTIONS[i]);
      if ((localComponent2.valid()) && (localComponent2.textureId() == -1))
      {

        localArrayList.add(new ChatOption((ClientContext)ctx, i, localComponent2)); }
    }
    return localArrayList;
  }
  
  public void register() {
    if (!registered.compareAndSet(false, true)) {
      return;
    }
    final EventDispatcher localEventDispatcher = ctx).bot()).dispatcher;
    localEventDispatcher.add(new PaintListener() {
      private final AtomicReference<Entry> previous = new AtomicReference(null);
      
      public void repaint(Graphics arg0)
      {
        Client localClient = (Client)((ClientContext)ctx).client();
        if (localClient == null) {
          return;
        }
        EntryList localEntryList = localClient.getLoggerEntries();
        Entry localEntry1 = localEntryList.getSentinel();
        Entry localEntry2 = localEntry1.getNext();
        Entry localEntry3 = localEntry2;
        while ((!localEntry1.equals(localEntry2)) && (!localEntry2.isNull()) && (!localEntry2.equals(previous.get()))) {
          MessageEntry localMessageEntry = new MessageEntry(reflector, localEntry2);
          localEventDispatcher.dispatch(new MessageEvent(localMessageEntry));
          localEntry2 = localEntry2.getNext();
        }
        previous.set(localEntry3);
      }
    });
  }
  
  public boolean chatting() {
    if (ctx).widgets.component(219, 0).valid()) {
      return true;
    }
    for (int[] arrayOfInt1 : Constants.CHAT_CONTINUES) {
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
  public List<Component> chatOptions() {
    ArrayList localArrayList = new ArrayList();
    Component localComponent = ctx).widgets.component(219, 0);
    for (int i = 1; i < localComponent.componentCount() - 2; i++) {
      localArrayList.add(localComponent.components()[i]);
    }
    return localArrayList;
  }
  
  public boolean continueChat(String... arg0) {
    return continueChat(false, arg0);
  }
  
  public boolean continueChat(boolean arg0, String... arg1) {
    if (!chatting()) {
      return false;
    }
    if (canContinue()) {
      return clickContinue(arg0);
    }
    if (arg1 != null) {
      ChatOption localChatOption = (ChatOption)((TextQuery)ctx).chat.select()).text(arg1).peek();
      if (localChatOption.valid()) {
        return localChatOption.select(arg0);
      }
    }
    return false;
  }
  
  private Component getContinue() {
    for (int[] arrayOfInt1 : Constants.CHAT_CONTINUES) {
      Component localComponent = ctx).widgets.component(arrayOfInt1[0], arrayOfInt1[1]);
      if (localComponent.valid())
      {

        return localComponent; }
    }
    return null;
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
  
  public boolean pendingInput()
  {
    return inputBox().visible();
  }
  
  public boolean sendInput(int arg0) {
    return sendInput(Integer.toString(arg0));
  }
  
  public boolean sendInput(String arg0) {
    Component localComponent = inputBox();
    if (!pendingInput()) {
      return false;
    }
    
    String str = localComponent.text().replace("*", "");
    if (str.equalsIgnoreCase(arg0)) {
      return ctx).input.sendln("");
    }
    
    for (int i = 0; i <= str.length(); i++) {
      ctx).input.send("{VK_BACK_SPACE down}");
      Condition.sleep(60);
      ctx).input.send("{VK_BACK_SPACE up}");
      Condition.sleep(60);
    }
    
    ctx).input.send(arg0);
    str = localComponent.text().replace("*", "");
    return (str.equalsIgnoreCase(arg0)) && (localComponent.visible()) && (ctx).input.sendln(""));
  }
  
  private Component inputBox() {
    return ctx).widgets.component(162, 44);
  }
  




  public ChatOption nil()
  {
    return new ChatOption((ClientContext)ctx, -1, null);
  }
}
