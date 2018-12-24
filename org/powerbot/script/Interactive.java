package org.powerbot.script;

import java.awt.Point;
import java.awt.Polygon;

public abstract interface Interactive
  extends Targetable, Validatable, Viewable, Drawable
{
  public abstract Point centerPoint();
  
  public abstract boolean hover();
  
  public abstract boolean click();
  
  public abstract boolean click(boolean paramBoolean);
  
  public abstract boolean click(int paramInt);
  
  public abstract boolean click(String paramString);
  
  public abstract boolean click(String paramString1, String paramString2);
  
  public abstract boolean click(Filter<? super MenuCommand> paramFilter);
  
  public abstract boolean interact(String paramString);
  
  public abstract boolean interact(String paramString1, String paramString2);
  
  public abstract boolean interact(boolean paramBoolean, String paramString);
  
  public abstract boolean interact(boolean paramBoolean, String paramString1, String paramString2);
  
  public abstract boolean interact(Filter<? super MenuCommand> paramFilter);
  
  public abstract boolean interact(boolean paramBoolean, Filter<? super MenuCommand> paramFilter);
  
  public abstract boolean click(Crosshair paramCrosshair);
  
  public abstract boolean click(String paramString, Crosshair paramCrosshair);
  
  public abstract boolean click(String paramString1, String paramString2, Crosshair paramCrosshair);
  
  public abstract boolean click(Filter<? super MenuCommand> paramFilter, Crosshair paramCrosshair);
  
  public abstract void bounds(int[] paramArrayOfInt);
  
  public abstract Polygon[] triangles();
}
