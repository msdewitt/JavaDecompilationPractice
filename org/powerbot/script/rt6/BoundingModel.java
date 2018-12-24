package org.powerbot.script.rt6;

import [I;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;
import java.util.Arrays;
import org.powerbot.script.Random;
import org.powerbot.script.Vector3;

abstract class BoundingModel extends ClientAccessor
{
  private final Vector3 start;
  private final Vector3 end;
  
  public BoundingModel(ClientContext arg0, Vector3 arg1, Vector3 arg2)
  {
    this(arg0, x, x, y, y, z, z);
  }
  
  public BoundingModel(ClientContext arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
    super(arg0);
    start = new Vector3(arg1 < arg2 ? arg1 : arg2, arg3 < arg4 ? arg3 : arg4, arg5 < arg6 ? arg5 : arg6);
    



    end = new Vector3(arg1 > arg2 ? arg1 : arg2, arg3 > arg4 ? arg3 : arg4, arg5 > arg6 ? arg5 : arg6);
  }
  


  public abstract int x();
  

  public int y()
  {
    return 0;
  }
  
  public abstract int z();
  
  public abstract int floor();
  
  Point centroid(int arg0) {
    int[][][] arrayOfInt = project();
    if ((arg0 < 0) || (arg0 >= arrayOfInt.length)) {
      return new Point(-1, -1);
    }
    int i = x();int j = z();int k = y() + ctx).game.tileHeight(i, j, floor());
    Point localPoint = ctx).game.worldToScreen(i + (arrayOfInt[arg0][0][0] + arrayOfInt[arg0][1][0] + arrayOfInt[arg0][2][0]) / 3, k + (arrayOfInt[arg0][0][1] + arrayOfInt[arg0][1][1] + arrayOfInt[arg0][2][1]) / 3, j + (arrayOfInt[arg0][0][2] + arrayOfInt[arg0][1][2] + arrayOfInt[arg0][2][2]) / 3);
    



    return ctx).game.inViewport(localPoint) ? localPoint : new Point(-1, -1);
  }
  
  public Point nextPoint() {
    int[][][] arrayOfInt = project();
    int i = arrayOfInt.length;
    int j = Random.nextInt(0, i);
    Point localPoint = firstInViewportCentroid(arrayOfInt, j, i);
    return (localPoint = firstInViewportCentroid(arrayOfInt, 0, j)) != null ? localPoint : localPoint != null ? localPoint : new Point(-1, -1);
  }
  
  public Point centerPoint()
  {
    int[][][] arrayOfInt = project();
    int i = arrayOfInt.length;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = x();int i2 = z();int i3 = y() + ctx).game.tileHeight(i1, i2, floor());
    while (n < i) {
      j += (arrayOfInt[n][0][0] + arrayOfInt[n][1][0] + arrayOfInt[n][2][0]) / 3;
      k += (arrayOfInt[n][0][1] + arrayOfInt[n][1][1] + arrayOfInt[n][2][1]) / 3;
      m += (arrayOfInt[n][0][2] + arrayOfInt[n][1][2] + arrayOfInt[n][2][2]) / 3;
      n++;
    }
    Point localPoint = ctx).game.worldToScreen(i1 + j / i, i3 + k / i, i2 + m / i);
    



    return ctx).game.inViewport(localPoint) ? localPoint : new Point(-1, -1);
  }
  
  public boolean contains(Point arg0) {
    int[][][] arrayOfInt1 = project();
    int i = x;int j = y;
    int k = x();int m = z();int n = y() + ctx).game.tileHeight(k, m, floor());
    label323:
    for (int[][] arrayOfInt : arrayOfInt1)
    {


      Point[] arrayOfPoint1 = { ctx).game.worldToScreen(k + arrayOfInt[0][0], n + arrayOfInt[0][1], m + arrayOfInt[0][2]), ctx).game.worldToScreen(k + arrayOfInt[1][0], n + arrayOfInt[1][1], m + arrayOfInt[1][2]), ctx).game.worldToScreen(k + arrayOfInt[2][0], n + arrayOfInt[2][1], m + arrayOfInt[2][2]) };
      
      for (Point localPoint : arrayOfPoint1) {
        if (!ctx).game.inViewport(localPoint)) {
          break label323;
        }
      }
      if (barycentric(i, j, 0x, 0y, 1x, 1y, 2x, 2y)) {
        return true;
      }
    }
    return false;
  }
  
  public boolean drawWireFrame(Graphics arg0) {
    int[][][] arrayOfInt1 = project();
    int i = x();int j = z();int k = y() + ctx).game.tileHeight(i, j, floor());
    label349:
    for (int[][] arrayOfInt : arrayOfInt1)
    {


      Point[] arrayOfPoint1 = { ctx).game.worldToScreen(i + arrayOfInt[0][0], k + arrayOfInt[0][1], j + arrayOfInt[0][2]), ctx).game.worldToScreen(i + arrayOfInt[1][0], k + arrayOfInt[1][1], j + arrayOfInt[1][2]), ctx).game.worldToScreen(i + arrayOfInt[2][0], k + arrayOfInt[2][1], j + arrayOfInt[2][2]) };
      
      for (Point localPoint : arrayOfPoint1) {
        if (!ctx).game.inViewport(localPoint)) {
          break label349;
        }
      }
      arg0.drawLine(0x, 0y, 1x, 1y);
      arg0.drawLine(1x, 1y, 2x, 2y);
      arg0.drawLine(2x, 2y, 0x, 0y);
    }
    return false;
  }
  
  public Polygon[] triangles() {
    int[][][] arrayOfInt1 = project();
    int i = x();int j = z();int k = y() + ctx).game.tileHeight(i, j, floor());
    Polygon[] arrayOfPolygon = new Polygon[arrayOfInt1.length];
    int m = 0;
    label340:
    for (int[][] arrayOfInt : arrayOfInt1)
    {


      Point[] arrayOfPoint1 = { ctx).game.worldToScreen(i + arrayOfInt[0][0], k + arrayOfInt[0][1], j + arrayOfInt[0][2]), ctx).game.worldToScreen(i + arrayOfInt[1][0], k + arrayOfInt[1][1], j + arrayOfInt[1][2]), ctx).game.worldToScreen(i + arrayOfInt[2][0], k + arrayOfInt[2][1], j + arrayOfInt[2][2]) };
      
      for (Point localPoint : arrayOfPoint1) {
        if (!ctx).game.inViewport(localPoint)) {
          break label340;
        }
      }
      arrayOfPolygon[(m++)] = new Polygon(new int[] { 0x, 1x, 2x }, new int[] { 0y, 1y, 2y }, 3);
    }
    



    return (Polygon[])Arrays.copyOf(arrayOfPolygon, m);
  }
  
  private int firstInViewportIndex(int[][][] arg0, int arg1, int arg2) {
    int i = x();int j = z();int k = y() + ctx).game.tileHeight(i, j, floor());
    int m = arg1;
    
    if (m < arg2) {
      int[][] arrayOfInt = arg0[(m++)];
      


      Point[] arrayOfPoint1 = {ctx).game.worldToScreen(i + arrayOfInt[0][0], k + arrayOfInt[0][1], j + arrayOfInt[0][2]), ctx).game.worldToScreen(i + arrayOfInt[1][0], k + arrayOfInt[1][1], j + arrayOfInt[1][2]), ctx).game.worldToScreen(i + arrayOfInt[2][0], k + arrayOfInt[2][1], j + arrayOfInt[2][2]) };
      
      Point[] arrayOfPoint2 = arrayOfPoint1;int n = arrayOfPoint2.length; for (int i1 = 0;; i1++) { if (i1 >= n) break label246; Point localPoint = arrayOfPoint2[i1];
        if (!ctx).game.inViewport(localPoint))
          break;
      }
      label246:
      return m - 1;
    }
    return -1;
  }
  
  private Point firstInViewportCentroid(int[][][] arg0, int arg1, int arg2) {
    int i = firstInViewportIndex(arg0, arg1, arg2);
    return i != -1 ? centroid(i) : null;
  }
  
  private boolean barycentric(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
    int i = arg6 - arg2;
    int j = arg7 - arg3;
    int k = arg4 - arg2;
    int m = arg5 - arg3;
    int n = arg0 - arg2;
    int i1 = arg1 - arg3;
    int i2 = i * i + j * j;
    int i3 = i * k + j * m;
    int i4 = i * n + j * i1;
    int i5 = k * k + m * m;
    int i6 = k * n + m * i1;
    float f1 = 1.0F / (i2 * i5 - i3 * i3);
    float f2 = (i5 * i4 - i3 * i6) * f1;
    float f3 = (i2 * i6 - i3 * i4) * f1;
    return (f2 >= 0.0F) && (f3 >= 0.0F) && (f2 + f3 < 1.0F);
  }
  
  private int[][][] project() {
    Vector3[] arrayOfVector3 = { new Vector3(start.x, start.y, start.z), new Vector3(start.x, start.y, end.z), new Vector3(end.x, start.y, end.z), new Vector3(end.x, start.y, start.z), new Vector3(start.x, end.y, start.z), new Vector3(start.x, end.y, end.z), new Vector3(end.x, end.y, end.z), new Vector3(end.x, end.y, start.z) };
    








    int[][] arrayOfInt1 = { { 0, 1, 2, 3 }, { 4, 5, 6, 7 }, { 1, 5, 6, 2 }, { 3, 7, 4, 0 }, { 0, 4, 5, 1 }, { 2, 6, 7, 3 } };
    






    int[][] arrayOfInt2 = { { 0, 1, 3 }, { 2, 3, 1 } };
    


    int i = 0;
    int[][][] arrayOfInt = new int[arrayOfInt1.length * arrayOfInt2.length][3][3];
    for ([I local[I1 : arrayOfInt1) {
      for ([I local[I2 : arrayOfInt2) {
        Vector3 localVector31 = arrayOfVector3[local[I1[local[I2[0]]];Vector3 localVector32 = arrayOfVector3[local[I1[local[I2[1]]];Vector3 localVector33 = arrayOfVector3[local[I1[local[I2[2]]];
        arrayOfInt[i][0] = localVector31.toMatrix();
        arrayOfInt[i][1] = localVector32.toMatrix();
        arrayOfInt[(i++)][2] = localVector33.toMatrix();
      }
    }
    return (int[][][])Arrays.copyOf(arrayOfInt, i);
  }
}
