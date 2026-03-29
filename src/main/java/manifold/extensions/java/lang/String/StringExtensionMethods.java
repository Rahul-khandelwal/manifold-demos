package manifold.extensions.java.lang.String;

import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.Intercept;
import manifold.ext.rt.api.This;

@Extension
public class StringExtensionMethods {
  public static boolean isNullOrBlank(@This String value) {
    return value == null || value.isBlank();
  }

  @Intercept
  public static boolean isEmpty(@This String value) {
    return value == null || value.isBlank();
  }

  public static void print(@This String value) {
    System.out.println("Printing value " + value + " via extensions");
  }
}
