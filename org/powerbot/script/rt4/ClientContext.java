package org.powerbot.script.rt4;

import java.util.List;
import org.powerbot.bot.ScriptController;
import org.powerbot.bot.rt4.BankPin;
import org.powerbot.bot.rt4.Bot;
import org.powerbot.bot.rt4.Killswitch;
import org.powerbot.bot.rt4.Login;
import org.powerbot.bot.rt4.RandomEvents;
import org.powerbot.bot.rt4.WidgetCloser;
import org.powerbot.bot.rt4.client.Client;




public class ClientContext
  extends org.powerbot.script.ClientContext<Client>
{
  public final Bank bank;
  public final Camera camera;
  public final Chat chat;
  public final Combat combat;
  public final DepositBox depositBox;
  public final Equipment equipment;
  public final Game game;
  public final GroundItems groundItems;
  public final Inventory inventory;
  public final Magic magic;
  public final Menu menu;
  public final Movement movement;
  public final Npcs npcs;
  public final Objects objects;
  public final Players players;
  public final Prayer prayer;
  public final Skills skills;
  public final Varpbits varpbits;
  public final Widgets widgets;
  public final Worlds worlds;
  public final Projectiles projectiles;
  
  private ClientContext(Bot arg0)
  {
    super(arg0);
    
    if ((controller instanceof ScriptController))
    {

      List localList = controller).daemons;
      localList.add(Login.class);
      localList.add(WidgetCloser.class);
      localList.add(Killswitch.class);
      localList.add(BankPin.class);
      localList.add(RandomEvents.class);
    }
    
    bank = new Bank(this);
    camera = new Camera(this);
    chat = new Chat(this);
    combat = new Combat(this);
    depositBox = new DepositBox(this);
    equipment = new Equipment(this);
    game = new Game(this);
    groundItems = new GroundItems(this);
    inventory = new Inventory(this);
    magic = new Magic(this);
    menu = new Menu(this);
    movement = new Movement(this);
    npcs = new Npcs(this);
    objects = new Objects(this);
    players = new Players(this);
    prayer = new Prayer(this);
    skills = new Skills(this);
    varpbits = new Varpbits(this);
    widgets = new Widgets(this);
    worlds = new Worlds(this);
    projectiles = new Projectiles(this);
  }
  




  public ClientContext(ClientContext arg0)
  {
    super(arg0);
    
    bank = bank;
    camera = camera;
    chat = chat;
    combat = combat;
    depositBox = depositBox;
    equipment = equipment;
    game = game;
    groundItems = groundItems;
    inventory = inventory;
    magic = magic;
    menu = menu;
    movement = movement;
    npcs = npcs;
    objects = objects;
    players = players;
    prayer = prayer;
    skills = skills;
    varpbits = varpbits;
    widgets = widgets;
    worlds = worlds;
    projectiles = projectiles;
  }
  





  public static ClientContext newContext(Bot arg0)
  {
    return new ClientContext(arg0);
  }
}
