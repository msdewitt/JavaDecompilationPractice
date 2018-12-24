package z;

import java.util.AbstractMap;
import java.util.BitSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class U
  extends AbstractMap<mA, mA>
{
  public final U jdField_if;
  public final BitSet jdField_null;
  public final Map<mA, mA> jdField_byte;
  public final mA jdField_new;
  
  /* Error */
  public U(LPt6 a, U a, BitSet a)
  {
    // Byte code:
    //   0: aload_2
    //   1: aload_3
    //   2: aload_0
    //   3: dup_x1
    //   4: aload_2
    //   5: aload_0
    //   6: dup
    //   7: aload_1
    //   8: putfield 28	z/U:void	Lz/LPt6;
    //   11: invokespecial 31	java/util/AbstractMap:<init>	()V
    //   14: new 33	java/util/HashMap
    //   17: aload_0
    //   18: dup_x1
    //   19: dup
    //   20: pop2
    //   21: dup
    //   22: invokespecial 34	java/util/HashMap:<init>	()V
    //   25: putfield 36	z/U:byte	Ljava/util/Map;
    //   28: putfield 38	z/U:if	Lz/U;
    //   31: putfield 40	z/U:null	Ljava/util/BitSet;
    //   34: dup
    //   35: astore 4
    //   37: ifnull +55 -> 92
    //   40: aload 4
    //   42: getfield 40	z/U:null	Ljava/util/BitSet;
    //   45: aload_3
    //   46: if_acmpne +34 -> 80
    //   49: new 42	java/lang/RuntimeException
    //   52: dup
    //   53: new 44	java/lang/StringBuilder
    //   56: dup
    //   57: invokespecial 45	java/lang/StringBuilder:<init>	()V
    //   60: iconst_0
    //   61: ldc 47
    //   63: invokestatic 53	z/COm8:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   66: invokevirtual 57	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   69: aload_3
    //   70: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   73: invokevirtual 65	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   76: invokespecial 68	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   79: athrow
    //   80: aload 4
    //   82: getfield 38	z/U:if	Lz/U;
    //   85: dup
    //   86: astore 4
    //   88: goto -51 -> 37
    //   91: athrow
    //   92: aload_2
    //   93: ifnull +21 -> 114
    //   96: new 70	z/mA
    //   99: aload_0
    //   100: dup_x1
    //   101: dup
    //   102: pop2
    //   103: dup
    //   104: invokespecial 71	z/mA:<init>	()V
    //   107: putfield 73	z/U:new	Lz/mA;
    //   110: goto +9 -> 119
    //   113: athrow
    //   114: aload_0
    //   115: aconst_null
    //   116: putfield 73	z/U:new	Lz/mA;
    //   119: aconst_null
    //   120: astore 4
    //   122: iconst_0
    //   123: iconst_1
    //   124: dup
    //   125: pop2
    //   126: istore_2
    //   127: aload_1
    //   128: getfield 77	z/LPt6:TB	Lz/Xa;
    //   131: invokevirtual 82	z/Xa:this	()I
    //   134: istore_3
    //   135: iload_2
    //   136: iload_3
    //   137: if_icmpge +82 -> 219
    //   140: aload_1
    //   141: getfield 77	z/LPt6:TB	Lz/Xa;
    //   144: iload_2
    //   145: invokevirtual 85	z/Xa:this	(I)Lz/COm9;
    //   148: dup
    //   149: astore 5
    //   151: invokevirtual 88	z/COm9:this	()I
    //   154: bipush 8
    //   156: iconst_1
    //   157: dup
    //   158: pop2
    //   159: if_icmpne +41 -> 200
    //   162: aload 5
    //   164: checkcast 70	z/mA
    //   167: astore 5
    //   169: aload 4
    //   171: ifnonnull +12 -> 183
    //   174: new 70	z/mA
    //   177: dup
    //   178: invokespecial 71	z/mA:<init>	()V
    //   181: astore 4
    //   183: aload_0
    //   184: getfield 36	z/U:byte	Ljava/util/Map;
    //   187: aload 5
    //   189: aload 4
    //   191: invokeinterface 92 3 0
    //   196: pop
    //   197: goto +15 -> 212
    //   200: aload_0
    //   201: iload_2
    //   202: invokevirtual 95	z/U:this	(I)Lz/U;
    //   205: aload_0
    //   206: if_acmpne +6 -> 212
    //   209: aconst_null
    //   210: astore 4
    //   212: iinc 2 1
    //   215: iload_2
    //   216: goto -80 -> 136
    //   219: return
    // Line number table:
    //   Java source line #618	-> byte code offset #1
    //   Java source line #611	-> byte code offset #14
    //   Java source line #619	-> byte code offset #28
    //   Java source line #620	-> byte code offset #31
    //   Java source line #621	-> byte code offset #35
    //   Java source line #622	-> byte code offset #40
    //   Java source line #623	-> byte code offset #49
    //   Java source line #621	-> byte code offset #80
    //   Java source line #629	-> byte code offset #92
    //   Java source line #630	-> byte code offset #96
    //   Java source line #632	-> byte code offset #114
    //   Java source line #641	-> byte code offset #119
    //   Java source line #642	-> byte code offset #122
    //   Java source line #643	-> byte code offset #140
    //   Java source line #645	-> byte code offset #151
    //   Java source line #646	-> byte code offset #162
    //   Java source line #648	-> byte code offset #169
    //   Java source line #651	-> byte code offset #174
    //   Java source line #657	-> byte code offset #183
    //   Java source line #658	-> byte code offset #197
    //   Java source line #662	-> byte code offset #209
    //   Java source line #642	-> byte code offset #212
    //   Java source line #665	-> byte code offset #219
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	220	0	a	U
    //   0	220	1	a	LPt6
    //   0	220	2	a	U
    //   0	220	3	a	BitSet
  }
  
  /* Error */
  public U jdMethod_this(int a)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 40	z/U:null	Ljava/util/BitSet;
    //   4: iload_1
    //   5: invokevirtual 104	java/util/BitSet:get	(I)Z
    //   8: ifne +6 -> 14
    //   11: aconst_null
    //   12: areturn
    //   13: athrow
    //   14: aload_0
    //   15: getfield 28	z/U:void	Lz/LPt6;
    //   18: getfield 106	z/LPt6:void	Ljava/util/BitSet;
    //   21: iload_1
    //   22: invokevirtual 104	java/util/BitSet:get	(I)Z
    //   25: ifne +6 -> 31
    //   28: aload_0
    //   29: areturn
    //   30: athrow
    //   31: aload_0
    //   32: dup
    //   33: astore_2
    //   34: getfield 38	z/U:if	Lz/U;
    //   37: dup
    //   38: astore_3
    //   39: ifnull +25 -> 64
    //   42: aload_3
    //   43: getfield 40	z/U:null	Ljava/util/BitSet;
    //   46: iload_1
    //   47: invokevirtual 104	java/util/BitSet:get	(I)Z
    //   50: ifeq +5 -> 55
    //   53: aload_3
    //   54: astore_2
    //   55: aload_3
    //   56: getfield 38	z/U:if	Lz/U;
    //   59: dup
    //   60: astore_3
    //   61: goto -22 -> 39
    //   64: aload_2
    //   65: areturn
    // Line number table:
    //   Java source line #691	-> byte code offset #0
    //   Java source line #692	-> byte code offset #11
    //   Java source line #694	-> byte code offset #14
    //   Java source line #695	-> byte code offset #28
    //   Java source line #697	-> byte code offset #31
    //   Java source line #698	-> byte code offset #34
    //   Java source line #699	-> byte code offset #42
    //   Java source line #700	-> byte code offset #53
    //   Java source line #698	-> byte code offset #55
    //   Java source line #703	-> byte code offset #64
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	a	U
    //   0	66	1	a	int
  }
  
  public mA jdMethod_true(mA a)
  {
    return (mA)jdMethod_thisjdField_void.TB.jdMethod_this(a)).jdField_byte.get(a);
  }
  











  public mA jdMethod_this(mA a)
  {
    return (mA)jdField_byte.get(a);
  }
  


  public Set<Map.Entry<mA, mA>> entrySet()
  {
    return null;
  }
  
  public mA jdMethod_this(Object a)
  {
    return a.jdMethod_true((mA)a);
  }
}
