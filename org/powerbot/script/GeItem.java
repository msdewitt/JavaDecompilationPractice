package org.powerbot.script;

import java.io.IOException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.powerbot.util.HttpUtils;
import org.powerbot.util.IOUtils;




























public abstract class GeItem
  implements Comparable<GeItem>, Nillable<GeItem>
{
  public final String db;
  public final String name;
  public final String description;
  public final int id;
  public final int price;
  public final boolean members;
  
  protected GeItem(String arg0, int arg1)
  {
    db = arg0;
    String str1 = "http://services.runescape.com/m=itemdb_" + arg0 + "/api/catalogue/detail.json?item=" + arg1;
    String str2 = "";
    try {
      str2 = IOUtils.readString(HttpUtils.openStream(new URL(str1)));
    }
    catch (IOException localIOException) {}
    
    name = getValue(str2, "name");
    description = getValue(str2, "description");
    localIOException = getValue(str2, "id");
    id = (localIOException.isEmpty() ? 0 : Integer.parseInt(localIOException));
    localIOException = getValue(str2, "price");
    price = (localIOException.isEmpty() ? 0 : formatPrice(localIOException));
    localIOException = getValue(str2, "members");
    members = localIOException.equalsIgnoreCase("true");
  }
  




  protected GeItem(int arg0)
  {
    this("", arg0);
  }
  
  private static String getValue(String arg0, String arg1) {
    Pattern localPattern = Pattern.compile("\"\\Q" + arg1 + "\\E\"\\s*:\\s*([\\+\\-]*\\d+(?:\\.\\d*)?|true|false|null|\\[[^\\]]*\\]|\"[^\\\"]*\")", 34);
    Matcher localMatcher = localPattern.matcher(arg0);
    if (!localMatcher.find()) {
      return "";
    }
    String str = localMatcher.group(1);
    if ((str.length() > 1) && (str.charAt(0) == '"') && (str.charAt(str.length() - 1) == str.charAt(0))) {
      str = str.substring(1, str.length() - 1);
    }
    return str.replace("\\/", "/");
  }
  
  private static int formatPrice(String arg0) {
    arg0 = arg0.replace(",", "").replace(" ", "").trim();
    double d = 1.0D;
    if (arg0.length() > 1) {
      int i = arg0.charAt(arg0.length() - 1);
      switch (i) {
      case 66: 
      case 98: 
        d = 1.0E9D;
        break;
      case 77: 
      case 109: 
        d = 1000000.0D;
        break;
      case 75: 
      case 107: 
        d = 1000.0D;
      }
      
      if (d != 1.0D) {
        arg0 = arg0.substring(0, arg0.length() - 1);
      }
    }
    return (int)(Double.parseDouble(arg0) * d);
  }
  



  public String toString()
  {
    return id == 0 ? "" : String.format("%s (%s): %s; %s", new Object[] { name, Integer.valueOf(id), Integer.valueOf(price), description });
  }
  



  public int compareTo(GeItem arg0)
  {
    int i = db.compareTo(db);
    return i == 0 ? id - id : i;
  }
  



  public boolean equals(Object arg0)
  {
    return ((arg0 instanceof GeItem)) && (id == id);
  }
}
