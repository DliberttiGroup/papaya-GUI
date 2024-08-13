package utils.textLib;

/*
* @param txt : String any
*
* prins a debug message into the console
*/
public class debug {
  final static String red = "\033[31m[ERROR]";
  final static String green = "\033[32m[INFO]";
  final static String yellow = "\033[33m[WARN]";
  final static String blue = "\033[34m[MSG]";
  final static String nc = "\033[0m";

  public static void error(String text) {
    System.out.println(red + " " + text + nc);
  }

  public static void info(String text) {
    System.out.println(green + " " + text + nc);
  }

  public static void warn(String text) {
    System.out.println(yellow + " " + text + nc);
  }

  public static void msg(String text) {
    System.out.println(blue + " " + text + nc);
  }
}
