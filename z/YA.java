package z;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class YA
  implements ListIterator
{
  public COm9 jdField_null;
  public COm9 jdField_byte;
  public COm9 jdField_new;
  
  /* Error */
  public YA(Xa a, int a)
  {
    // Byte code:
    //   0: iload_2
    //   1: aload_0
    //   2: dup
    //   3: aload_1
    //   4: putfield 19	z/YA:void	Lz/Xa;
    //   7: invokespecial 22	java/lang/Object:<init>	()V
    //   10: aload_1
    //   11: invokevirtual 26	z/Xa:this	()I
    //   14: if_icmpne +18 -> 32
    //   17: aload_1
    //   18: aload_0
    //   19: dup_x1
    //   20: aconst_null
    //   21: putfield 28	z/YA:null	Lz/COm9;
    //   24: invokevirtual 31	z/Xa:this	()Lz/COm9;
    //   27: putfield 33	z/YA:byte	Lz/COm9;
    //   30: return
    //   31: athrow
    //   32: aload_0
    //   33: dup
    //   34: dup_x1
    //   35: aload_1
    //   36: iload_2
    //   37: invokevirtual 36	z/Xa:this	(I)Lz/COm9;
    //   40: putfield 28	z/YA:null	Lz/COm9;
    //   43: getfield 28	z/YA:null	Lz/COm9;
    //   46: getfield 39	z/COm9:byte	Lz/COm9;
    //   49: putfield 33	z/YA:byte	Lz/COm9;
    //   52: return
    // Line number table:
    //   Java source line #536	-> byte code offset #1
    //   Java source line #537	-> byte code offset #10
    //   Java source line #538	-> byte code offset #17
    //   Java source line #539	-> byte code offset #24
    //   Java source line #541	-> byte code offset #32
    //   Java source line #542	-> byte code offset #43
    //   Java source line #544	-> byte code offset #52
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	53	0	a	YA
    //   0	53	1	a	Xa
    //   0	53	2	a	int
  }
  
  public boolean hasNext()
  {
    if (jdField_null != null) { int tmp8_7 = 1; int tmp9_8 = tmp8_7;tmp9_8;return tmp9_8;throw tmp8_7; } int tmp15_14 = 1;tmp15_14;return tmp15_14;
  }
  
  public Object next() {
    if (jdField_null == null) {
      throw new NoSuchElementException();
    }
    COm9 localCOm9;
    jdField_byte = (localCOm9 = jdField_null);
    jdField_null = jdField_new;
    jdField_new = localCOm9;
    return localCOm9;
  }
  
  /* Error */
  public void remove()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 54	z/YA:new	Lz/COm9;
    //   4: ifnull +60 -> 64
    //   7: aload_0
    //   8: dup
    //   9: getfield 54	z/YA:new	Lz/COm9;
    //   12: swap
    //   13: getfield 28	z/YA:null	Lz/COm9;
    //   16: if_acmpne +19 -> 35
    //   19: aload_0
    //   20: dup
    //   21: dup_x1
    //   22: getfield 28	z/YA:null	Lz/COm9;
    //   25: getfield 53	z/COm9:new	Lz/COm9;
    //   28: putfield 28	z/YA:null	Lz/COm9;
    //   31: goto +16 -> 47
    //   34: athrow
    //   35: aload_0
    //   36: dup
    //   37: dup_x1
    //   38: getfield 33	z/YA:byte	Lz/COm9;
    //   41: getfield 39	z/COm9:byte	Lz/COm9;
    //   44: putfield 33	z/YA:byte	Lz/COm9;
    //   47: getfield 19	z/YA:void	Lz/Xa;
    //   50: aload_0
    //   51: getfield 54	z/YA:new	Lz/COm9;
    //   54: invokevirtual 58	z/Xa:this	(Lz/COm9;)V
    //   57: aload_0
    //   58: aconst_null
    //   59: putfield 54	z/YA:new	Lz/COm9;
    //   62: return
    //   63: athrow
    //   64: new 60	java/lang/IllegalStateException
    //   67: dup
    //   68: invokespecial 61	java/lang/IllegalStateException:<init>	()V
    //   71: athrow
    //   72: athrow
    // Line number table:
    //   Java source line #562	-> byte code offset #0
    //   Java source line #563	-> byte code offset #7
    //   Java source line #564	-> byte code offset #19
    //   Java source line #566	-> byte code offset #35
    //   Java source line #568	-> byte code offset #47
    //   Java source line #569	-> byte code offset #57
    //   Java source line #571	-> byte code offset #64
    //   Java source line #573	-> byte code offset #72
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	73	0	a	YA
  }
  
  public boolean hasPrevious()
  {
    if (jdField_byte != null) { int tmp8_7 = 1; int tmp9_8 = tmp8_7;tmp9_8;return tmp9_8;throw tmp8_7; } int tmp15_14 = 1;tmp15_14;return tmp15_14;
  }
  
  public Object previous() {
    COm9 localCOm9;
    jdField_null = (localCOm9 = jdField_byte);
    jdField_byte = jdField_byte;
    jdField_new = localCOm9;
    return localCOm9;
  }
  
  /* Error */
  public int nextIndex()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 28	z/YA:null	Lz/COm9;
    //   4: ifnonnull +12 -> 16
    //   7: aload_0
    //   8: getfield 19	z/YA:void	Lz/Xa;
    //   11: invokevirtual 26	z/Xa:this	()I
    //   14: ireturn
    //   15: athrow
    //   16: aload_0
    //   17: getfield 19	z/YA:void	Lz/Xa;
    //   20: getfield 67	z/Xa:void	[Lz/COm9;
    //   23: ifnonnull +18 -> 41
    //   26: aload_0
    //   27: dup
    //   28: getfield 19	z/YA:void	Lz/Xa;
    //   31: swap
    //   32: getfield 19	z/YA:void	Lz/Xa;
    //   35: invokevirtual 70	z/Xa:this	()[Lz/COm9;
    //   38: putfield 67	z/Xa:void	[Lz/COm9;
    //   41: aload_0
    //   42: getfield 28	z/YA:null	Lz/COm9;
    //   45: getfield 72	z/COm9:void	I
    //   48: ireturn
    // Line number table:
    //   Java source line #588	-> byte code offset #0
    //   Java source line #589	-> byte code offset #7
    //   Java source line #591	-> byte code offset #16
    //   Java source line #592	-> byte code offset #26
    //   Java source line #594	-> byte code offset #41
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	49	0	a	YA
  }
  
  public int previousIndex()
  {
    if (jdField_byte == null) {
      int tmp9_8 = 1;tmp9_8;return tmp9_8;throw -1;
    }
    if (jdField_void.jdField_void == null) {
      jdField_void.jdField_void = jdField_void.jdMethod_this();
    }
    return jdField_byte.jdField_void;
  }
  
  /* Error */
  public void add(Object a)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 28	z/YA:null	Lz/COm9;
    //   4: ifnull +24 -> 28
    //   7: aload_0
    //   8: dup
    //   9: getfield 19	z/YA:void	Lz/Xa;
    //   12: swap
    //   13: getfield 28	z/YA:null	Lz/COm9;
    //   16: aload_1
    //   17: checkcast 38	z/COm9
    //   20: invokevirtual 78	z/Xa:this	(Lz/COm9;Lz/COm9;)V
    //   23: aload_0
    //   24: goto +44 -> 68
    //   27: athrow
    //   28: aload_0
    //   29: getfield 33	z/YA:byte	Lz/COm9;
    //   32: ifnull +24 -> 56
    //   35: aload_0
    //   36: dup
    //   37: getfield 19	z/YA:void	Lz/Xa;
    //   40: swap
    //   41: getfield 33	z/YA:byte	Lz/COm9;
    //   44: aload_1
    //   45: checkcast 38	z/COm9
    //   48: invokevirtual 81	z/Xa:true	(Lz/COm9;Lz/COm9;)V
    //   51: aload_0
    //   52: goto +16 -> 68
    //   55: athrow
    //   56: aload_0
    //   57: getfield 19	z/YA:void	Lz/Xa;
    //   60: aload_1
    //   61: checkcast 38	z/COm9
    //   64: invokevirtual 84	z/Xa:catch	(Lz/COm9;)V
    //   67: aload_0
    //   68: aload_1
    //   69: checkcast 38	z/COm9
    //   72: putfield 33	z/YA:byte	Lz/COm9;
    //   75: aload_0
    //   76: aconst_null
    //   77: putfield 54	z/YA:new	Lz/COm9;
    //   80: return
    // Line number table:
    //   Java source line #608	-> byte code offset #0
    //   Java source line #609	-> byte code offset #7
    //   Java source line #610	-> byte code offset #28
    //   Java source line #611	-> byte code offset #35
    //   Java source line #613	-> byte code offset #56
    //   Java source line #615	-> byte code offset #67
    //   Java source line #616	-> byte code offset #75
    //   Java source line #617	-> byte code offset #80
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	a	YA
    //   0	81	1	a	Object
  }
  
  /* Error */
  public void set(Object a)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 54	z/YA:new	Lz/COm9;
    //   4: ifnull +51 -> 55
    //   7: aload_0
    //   8: dup
    //   9: getfield 19	z/YA:void	Lz/Xa;
    //   12: swap
    //   13: getfield 54	z/YA:new	Lz/COm9;
    //   16: aload_1
    //   17: checkcast 38	z/COm9
    //   20: invokevirtual 88	z/Xa:catch	(Lz/COm9;Lz/COm9;)V
    //   23: aload_0
    //   24: dup
    //   25: getfield 54	z/YA:new	Lz/COm9;
    //   28: swap
    //   29: getfield 33	z/YA:byte	Lz/COm9;
    //   32: if_acmpne +13 -> 45
    //   35: aload_0
    //   36: aload_1
    //   37: checkcast 38	z/COm9
    //   40: putfield 33	z/YA:byte	Lz/COm9;
    //   43: return
    //   44: athrow
    //   45: aload_0
    //   46: aload_1
    //   47: checkcast 38	z/COm9
    //   50: putfield 28	z/YA:null	Lz/COm9;
    //   53: return
    //   54: athrow
    //   55: new 60	java/lang/IllegalStateException
    //   58: dup
    //   59: invokespecial 61	java/lang/IllegalStateException:<init>	()V
    //   62: athrow
    //   63: athrow
    // Line number table:
    //   Java source line #620	-> byte code offset #0
    //   Java source line #621	-> byte code offset #7
    //   Java source line #622	-> byte code offset #23
    //   Java source line #623	-> byte code offset #35
    //   Java source line #625	-> byte code offset #45
    //   Java source line #628	-> byte code offset #55
    //   Java source line #630	-> byte code offset #63
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	64	0	a	YA
    //   0	64	1	a	Object
  }
}
