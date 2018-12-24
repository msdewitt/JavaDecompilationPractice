package org.powerbot.bot.rt6;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import org.powerbot.bot.Reflector;
import org.powerbot.bot.rt6.client.NodeDeque;
import org.powerbot.bot.rt6.client.NodeSubQueue;

public class NodeQueue
{
  public NodeQueue() {}
  
  public static <E extends org.powerbot.bot.ReflectProxy> List<E> get(NodeDeque a, Class<E> a)
  {
    ArrayList localArrayList = new ArrayList();
    Constructor localConstructor;
    try
    {
      1; int tmp17_16 = 1;tmp17_16; int tmp22_21 = 1;tmp22_21;0[tmp22_21] = Reflector.class; int tmp27_17 = tmp17_16; int tmp29_28 = 1; int tmp30_29 = tmp29_28;tmp30_29;tmp29_28[tmp30_29] = Object.class;localConstructor = tmp27_17.getDeclaredConstructor(tmp27_17);
    } catch (NoSuchMethodException localNoSuchMethodException) {
      return localArrayList; }
    throw a;
    
    throw tmp19_17; org.powerbot.bot.rt6.client.Node localNode; if ((new Class[tmp11_10] == null) || ((localNoSuchMethodException = localNode = a.getSentinel()) == null)) {
      return localArrayList;
    }
    

    try
    {
      1; int tmp108_107 = 1;tmp108_107; int tmp110_108 = tmp108_107; int tmp113_112 = 1;tmp113_112;0[tmp113_112] = reflector; int tmp120_110 = tmp110_108; int tmp122_121 = 1; int tmp123_122 = tmp122_121;tmp123_122;tmp122_121[tmp123_122] = localNode;tmp110_108.add(tmp120_110.newInstance(tmp120_110));tmpTernaryOp = localNode;
    }
    catch (InstantiationException|InvocationTargetException|IllegalAccessException localInstantiationException) {}
    

    return localArrayList;
  }
  
  public static <E extends org.powerbot.bot.rt6.client.NodeSub> List<E> get(NodeSubQueue a, Class<E> a) {
    ArrayList localArrayList = new ArrayList();
    Constructor localConstructor;
    try
    {
      1; int tmp17_16 = 1;tmp17_16; int tmp22_21 = 1;tmp22_21;0[tmp22_21] = Reflector.class; int tmp27_17 = tmp17_16; int tmp29_28 = 1; int tmp30_29 = tmp29_28;tmp30_29;tmp29_28[tmp30_29] = Object.class;localConstructor = tmp27_17.getDeclaredConstructor(tmp27_17);
    } catch (NoSuchMethodException localNoSuchMethodException) {
      return localArrayList; }
    throw a;
    
    throw tmp19_17; org.powerbot.bot.rt6.client.NodeSub localNodeSub; if ((new Class[tmp11_10] == null) || ((localNoSuchMethodException = localNodeSub = a.getSentinel()) == null)) {
      return localArrayList;
    }
    

    try
    {
      1; int tmp108_107 = 1;tmp108_107; int tmp110_108 = tmp108_107; int tmp113_112 = 1;tmp113_112;0[tmp113_112] = reflector; int tmp120_110 = tmp110_108; int tmp122_121 = 1; int tmp123_122 = tmp122_121;tmp123_122;tmp122_121[tmp123_122] = localNodeSub;tmp110_108.add(tmp120_110.newInstance(tmp120_110));tmpTernaryOp = localNodeSub;
    }
    catch (InstantiationException|InvocationTargetException|IllegalAccessException localInstantiationException) {}
    

    return localArrayList;
  }
  
  public static String jdMethod_this(Object a)
  {
    int tmp7_6 = 3;
    int tmp20_17 = (a = (String)a).length();
    int tmp24_23 = 1;
    tmp24_23;
    int j;
    int ? = tmp24_23;
    int k = tmp20_17;
    (j = new char[tmp20_17] - 1);
    int i = tmp7_6 << tmp7_6 ^ 0x4;
    if ((2 << 3 ^ 0x1) >= 0)
    {
      int tmp43_42 = j;
      j--;
      ?[tmp43_42] = ((char)(a.charAt(tmp43_42) ^ i));
      int tmp64_61 = (j--);
      ?[tmp64_61] = ((char)(a.charAt(tmp64_61) ^ k));
    }
    return new String(?);
  }
}
