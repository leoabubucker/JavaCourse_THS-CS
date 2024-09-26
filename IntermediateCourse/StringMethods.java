import java.util.Arrays;

public class StringMethods{

  public static void main(String[] args)
  {
    //String methods examples: equals, equalsIgnoreCase, length, toUpperCase, toLowerCase, charAt, indexOf, isEmpty, trim, replace, split, substring

    
    String str1 = "hello";
    String str2 = "world";
    
    // equals
    System.out.println(str1.equals(str2));  // false
    
    // equalsIgnoreCase
    System.out.println(str1.equalsIgnoreCase("HELLO"));  // true
    
    // length
    System.out.println(str1.length());  // 5
    
    // toUpperCase
    System.out.println(str1.toUpperCase());  // HELLO
    
    // toLowerCase
    System.out.println(str2.toLowerCase());  // world
    
    // charAt
    System.out.println(str1.charAt(0));  // h
    
    // indexOf
    System.out.println(str2.indexOf('r'));  // 2
    
    // isEmpty
    System.out.println(str1.isEmpty());  // false
    
    // trim
    String str3 = "  spaces  ";
    System.out.println(str3.trim());  // spaces
    
    // replace
    String str4 = "Welcome to Java";
    System.out.println(str4.replace('o', '0'));  // Welc0me t0 Java
    
    //substring
    String str = "Hello, World!";
    String substr = str.substring(7, 12);
    System.out.println(substr); // World

    //split 
    String str5 = "apple, banana, orange";
    String[] fruits = str5.split(",");
    System.out.println(Arrays.toString(fruits)); //apple banana orange

  }
}