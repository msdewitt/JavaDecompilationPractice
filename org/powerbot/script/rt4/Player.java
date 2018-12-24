package org.powerbot.script.rt4;

import java.awt.Color;
import org.powerbot.bot.rt4.client.Client;
import org.powerbot.bot.rt4.client.PlayerComposite;



public class Player
  extends Actor
{
  public static final Color TARGET_COLOR = new Color(255, 0, 0, 15);
  private final org.powerbot.bot.rt4.client.Player player;
  
  Player(ClientContext arg0, org.powerbot.bot.rt4.client.Player arg1) {
    super(arg0);
    player = arg1;
  }
  
  protected org.powerbot.bot.rt4.client.Actor getActor()
  {
    return player;
  }
  
  public String name()
  {
    String str = player != null ? player.getName() : "";
    return str != null ? str : "";
  }
  
  public int combatLevel()
  {
    return player != null ? player.getCombatLevel() : -1;
  }
  
  public int team() {
    return player != null ? player.getTeam() : -1;
  }
  
  public int[] appearance() {
    Object localObject = player != null ? player.getComposite() : null;
    int[] arrayOfInt = localObject != null ? localObject.getAppearance() : new int[0];
    if (arrayOfInt == null) {
      arrayOfInt = new int[0];
    }
    arrayOfInt = (int[])arrayOfInt.clone();
    for (int i = 0; i < arrayOfInt.length; i++) {
      arrayOfInt[i] = (arrayOfInt[i] < 512 ? -1 : arrayOfInt[i] - 512);
    }
    return arrayOfInt;
  }
  
  public boolean valid()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    if ((localClient == null) || (player == null)) {
      return false;
    }
    org.powerbot.bot.rt4.client.Player[] arrayOfPlayer1 = localClient.getPlayers();
    for (org.powerbot.bot.rt4.client.Player localPlayer : arrayOfPlayer1) {
      if (player.equals(localPlayer)) {
        return true;
      }
    }
    return false;
  }
  
  public String toString()
  {
    return String.format("%s[name=%s/level=%d/team=%d]", new Object[] {Player.class
      .getName(), name(), Integer.valueOf(combatLevel()), Integer.valueOf(team()) });
  }
}
