package org.powerbot.script.rt6;

import java.awt.Color;
import org.powerbot.bot.rt6.client.Client;
import org.powerbot.bot.rt6.client.PlayerComposite;


public class Player
  extends Actor
{
  public static final Color TARGET_COLOR = new Color(255, 0, 0, 15);
  private final org.powerbot.bot.rt6.client.Player player;
  
  public Player(ClientContext arg0, org.powerbot.bot.rt6.client.Player arg1) {
    super(arg0);
    player = arg1;
  }
  
  protected org.powerbot.bot.rt6.client.Player getAccessor()
  {
    return player;
  }
  
  public String name()
  {
    String str = player.getName();
    return str != null ? str : "";
  }
  
  public int combatLevel()
  {
    return player.getCombatLevel();
  }
  
  public int team() {
    return player.getTeam();
  }
  
  public int prayerIcon() {
    int[] arrayOfInt1 = getOverheadArray1();int[] arrayOfInt2 = getOverheadArray2();
    int i = arrayOfInt1.length;
    if (i != arrayOfInt2.length) {
      return -1;
    }
    
    for (int j = 0; j < i; j++) {
      if (arrayOfInt1[j] == 440) {
        return arrayOfInt2[j];
      }
    }
    return -1;
  }
  
  public int skullIcon() {
    return -1;
  }
  
  private int[] getOverheadArray1() {
    int[] arrayOfInt = player.getOverheadArray1();
    return arrayOfInt != null ? arrayOfInt : new int[0];
  }
  
  private int[] getOverheadArray2() {
    int[] arrayOfInt = player.getOverheadArray2();
    return arrayOfInt != null ? arrayOfInt : new int[0];
  }
  
  public int npcId() {
    return player.getComposite().getNpcId();
  }
  
  public int[] appearance() {
    int[] arrayOfInt1 = player.getComposite().getAppearance();
    if (arrayOfInt1 == null) {
      return new int[0];
    }
    
    int[] arrayOfInt2 = (int[])arrayOfInt1.clone();
    for (int i = 0; i < arrayOfInt2.length; i++) {
      if ((arrayOfInt2[i] & 0x40000000) > 0) {
        arrayOfInt2[i] &= 0x3FFFFFFF;
      } else {
        arrayOfInt2[i] = -1;
      }
    }
    return arrayOfInt2;
  }
  
  public boolean valid()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    org.powerbot.bot.rt6.client.Player localPlayer1 = getAccessor();
    if ((localClient == null) || (localPlayer1.isNull())) {
      return false;
    }
    org.powerbot.bot.rt6.client.Player[] arrayOfPlayer1 = localClient.getPlayers();
    for (org.powerbot.bot.rt6.client.Player localPlayer2 : arrayOfPlayer1) {
      if (localPlayer1.equals(localPlayer2)) {
        return true;
      }
    }
    return false;
  }
  
  public String toString()
  {
    return Player.class.getSimpleName() + "[name=" + name() + ",level=" + combatLevel() + "]";
  }
}
