package org.powerbot.script.rt6;

import java.util.List;
import org.powerbot.bot.ScriptController;
import org.powerbot.bot.rt6.Antipattern;
import org.powerbot.bot.rt6.BankPin;
import org.powerbot.bot.rt6.Bot;
import org.powerbot.bot.rt6.Items;
import org.powerbot.bot.rt6.Killswitch;
import org.powerbot.bot.rt6.Login;
import org.powerbot.bot.rt6.Map;
import org.powerbot.bot.rt6.TicketDestroy;
import org.powerbot.bot.rt6.WidgetCloser;
import org.powerbot.bot.rt6.client.Client;




public class ClientContext
  extends org.powerbot.script.ClientContext<Client>
{
  public final CombatBar combatBar;
  public final Bank bank;
  public final Camera camera;
  public final Chat chat;
  public final DepositBox depositBox;
  public final Equipment equipment;
  public final Game game;
  public final GroundItems groundItems;
  public final HintArrows hintArrows;
  public final Hud hud;
  public final Backpack backpack;
  public final Lobby lobby;
  public final Menu menu;
  public final Movement movement;
  public final Npcs npcs;
  public final Objects objects;
  public final Players players;
  public final Powers powers;
  public final Projectiles projectiles;
  public final Varpbits varpbits;
  public final Skills skills;
  public final Summoning summoning;
  public final Widgets widgets;
  public final ProductionInterface productionInterface;
  final Items items;
  final Map map;
  
  private ClientContext(Bot arg0)
  {
    super(arg0);
    
    if ((controller instanceof ScriptController))
    {
      List localList = controller).daemons;
      localList.add(Login.class);
      localList.add(WidgetCloser.class);
      localList.add(Killswitch.class);
      localList.add(TicketDestroy.class);
      localList.add(BankPin.class);
      localList.add(Antipattern.class);
    }
    
    combatBar = new CombatBar(this);
    backpack = new Backpack(this);
    bank = new Bank(this);
    camera = new Camera(this);
    chat = new Chat(this);
    depositBox = new DepositBox(this);
    equipment = new Equipment(this);
    game = new Game(this);
    groundItems = new GroundItems(this);
    hintArrows = new HintArrows(this);
    hud = new Hud(this);
    lobby = new Lobby(this);
    menu = new Menu(this);
    movement = new Movement(this);
    npcs = new Npcs(this);
    objects = new Objects(this);
    players = new Players(this);
    powers = new Powers(this);
    projectiles = new Projectiles(this);
    varpbits = new Varpbits(this);
    skills = new Skills(this);
    summoning = new Summoning(this);
    widgets = new Widgets(this);
    productionInterface = new ProductionInterface(this);
    
    items = new Items(this);
    map = new Map(this);
  }
  




  public ClientContext(ClientContext arg0)
  {
    super(arg0);
    combatBar = combatBar;
    backpack = backpack;
    bank = bank;
    camera = camera;
    chat = chat;
    depositBox = depositBox;
    equipment = equipment;
    game = game;
    groundItems = groundItems;
    hintArrows = hintArrows;
    hud = hud;
    lobby = lobby;
    menu = menu;
    movement = movement;
    npcs = npcs;
    objects = objects;
    players = players;
    powers = powers;
    projectiles = projectiles;
    varpbits = varpbits;
    skills = skills;
    summoning = summoning;
    widgets = widgets;
    productionInterface = productionInterface;
    
    items = items;
    map = map;
  }
  





  public static ClientContext newContext(Bot arg0)
  {
    return new ClientContext(arg0);
  }
}
