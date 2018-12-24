package z;

import java.util.ArrayList;
import java.util.List;





























































public class ca
  extends aux
{
  public String jdField_new;
  public List<Object> jdField_void;
  
  public ca(String a)
  {
    a.<init>(327680, a);
    if (a.getClass() != ca.class) {
      throw new IllegalStateException();
    }
  }
  








  public ca(int a, String a)
  {
    a.<init>(a);
    jdField_new = a;
  }
  





  public ca(List<Object> a)
  {
    a.<init>(327680);
    jdField_void = a;
  }
  




  public void jdMethod_this(String a, Object a)
  {
    if (jdField_void == null) {
      a; if (jdField_new != null) { int tmp24_23 = 1;;; break label34; throw 2; } else { 1; } label34: tmp31_30.<init>(tmp32_30); jdField_void = a;
    }
    if (jdField_new != null)
      jdField_void.add(a);
    ArrayList localArrayList;
    String str; int i; int j; int k; if ((a instanceof byte[])) {
      a = (byte[])a;
      localArrayList = new ArrayList(a.length);
      i = (str = a).length; int tmp92_91 = 1; for (tmp92_91; (j = tmp92_91) < i;) { byte tmp108_107 = str[j];k = j++;tmp108_107
          .add(Byte.valueOf(tmp108_107));tmpTernaryOp = j; continue;throw localArrayList;
      }
      
      jdField_void.add(localArrayList);
      return; } if ((a instanceof boolean[])) {
      a = (boolean[])a;
      localArrayList = new ArrayList(a.length);
      i = (str = a).length;1; byte tmp189_188 = str[j];k = j++;tmp189_188
        .add(Boolean.valueOf(tmp189_188));
      
      jdField_void.add(localArrayList);
      return; } if ((a instanceof short[])) {
      a = (short[])a;
      localArrayList = new ArrayList(a.length);
      i = (str = a).length;1; short tmp269_268 = str[j];k = j++;tmp269_268
        .add(Short.valueOf(tmp269_268));
      
      jdField_void.add(localArrayList);
      return; } if ((a instanceof char[])) {
      a = (char[])a;
      localArrayList = new ArrayList(a.length);
      i = (str = a).length;1; char tmp349_348 = str[j];k = j++;tmp349_348
        .add(Character.valueOf(tmp349_348));
      
      jdField_void.add(localArrayList);
      return; } if ((a instanceof int[])) {
      a = (int[])a;
      localArrayList = new ArrayList(a.length);
      i = (str = a).length;1; int tmp429_428 = str[j];k = j++;tmp429_428
        .add(Integer.valueOf(tmp429_428));
      
      jdField_void.add(localArrayList);
      return; } if ((a instanceof long[])) {
      a = (long[])a;
      localArrayList = new ArrayList(a.length);
      i = (str = a).length;1; long tmp509_508 = str[j];long l = j++;tmp509_508
        .add(Long.valueOf(tmp509_508));
      
      jdField_void.add(localArrayList);
      return; } if ((a instanceof float[])) {
      a = (float[])a;
      localArrayList = new ArrayList(a.length);
      i = (str = a).length;1; float tmp589_588 = str[j];float f = j++;tmp589_588
        .add(Float.valueOf(tmp589_588));
      
      jdField_void.add(localArrayList);
      return; } if ((a instanceof double[])) {
      a = (double[])a;
      localArrayList = new ArrayList(a.length);
      i = (str = a).length;1; double tmp669_668 = str[j];double d = j++;tmp669_668
        .add(Double.valueOf(tmp669_668));
      
      jdField_void.add(localArrayList);
      return; }
    jdField_void.add(a);
  }
  


  public void jdMethod_this(String a, String a, String a)
  {
    if (jdField_void == null) {
      a; if (jdField_new != null) { int tmp24_23 = 1;;; break label34; throw 2; } else { 1; } label34: tmp31_30.<init>(tmp32_30); jdField_void = a;
    }
    if (jdField_new != null) {
      jdField_void.add(a);
    }
    1; int tmp70_69 = 1;tmp70_69; int tmp75_74 = 1;tmp75_74;0[tmp75_74] = a; int tmp79_70 = tmp70_69; int tmp81_80 = 1; int tmp82_81 = tmp81_80;tmp82_81;tmp81_80[tmp82_81] = a;tmp79_70.add(tmp79_70);
  }
  

  public aux jdMethod_this(String a, String a)
  {
    if (jdField_void == null) {
      a; if (jdField_new != null) { int tmp24_23 = 1;;; break label34; throw 2; } else { 1; } label34: tmp31_30.<init>(tmp32_30); jdField_void = a;
    }
    if (jdField_new != null) {
      jdField_void.add(a);
    }
    a = new ca(a); String 
      tmp72_71 = a;jdField_void.add(tmp72_71);
    return tmp72_71;
  }
  
  public aux jdMethod_this(String a)
  {
    if (jdField_void == null) {
      a; if (jdField_new != null) { int tmp24_23 = 1;;; break label34; throw 2; } else { 1; } label34: tmp31_30.<init>(tmp32_30); jdField_void = a;
    }
    if (jdField_new != null) {
      jdField_void.add(a);
    }
    a = new ArrayList();
    jdField_void.add(a);
    return new ca(a);
  }
  








  public void jdMethod_this() {}
  








  public void jdMethod_this(int a) {}
  







  public void jdMethod_this(aux a)
  {
    if (a != null) { int i;
      if (jdField_void != null) {
        int tmp13_12 = 1;
        






















































































































































































































































        for (tmp13_12; (i = tmp13_12) < jdField_void.size();) {
          String str = (String)jdField_void.get(i); int 
            tmp49_48 = 1; int tmp50_49 = tmp49_48;tmp50_49;Object localObject = i.get(tmp49_48 + tmp50_49);
          i += 2;jdMethod_this(a, str, localObject);tmpTernaryOp = i; continue;throw jdField_void;
        }
      }
      
      a.jdMethod_this();
    }
  }
  










  public static void jdMethod_this(aux a, String a, Object a)
  {
    if (a != null) { Object localObject;
      if ((a instanceof String[])) {
        localObject = (String[])a; int 
          tmp24_23 = 1;tmp24_23; int tmp29_28 = 1; int tmp30_29 = tmp29_28;tmp30_29;((aux)localObject).jdMethod_this(0[tmp24_23], (String)localObject, tmp29_28[tmp30_29]);
        return;throw a; } if ((a instanceof ca)) {
        localObject = (ca)a; Object 
          tmp53_52 = localObject;tmp53_52.jdMethod_this(a.jdMethod_this(a, 5352jdField_new));
        return;throw a; } if ((a instanceof List))
      {
        if ((localObject = a.jdMethod_this(a)) != null) {
          List localList = (List)a;
          1;
          int i; jdMethod_this((aux)localObject, null, localList.get(i++));
          
          ((aux)localObject).jdMethod_this();
        }
      } else {
        a.jdMethod_this(a, a);
      }
    }
  }
}
