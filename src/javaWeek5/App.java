/*
 * Class named App is created below. 
 * The classes created and implemented in the Logger interface are 
 * instantiated below. 
 * 
 * In the example below, we have passed the String "JAVAPROGRAMMING".
 * Both log and error methods have been tested and verified. 
 * 
 */

package javaWeek5;

public class App {

  public static void main(String[] args) {
    
    AsteriskLogger asteriskLogger = new AsteriskLogger();
    SpacedLogger spacedLogger = new SpacedLogger();
    
    asteriskLogger.log("JAVAPROGRAMMING");
    asteriskLogger.error("JAVAPROGRAMMING");

    spacedLogger.log("JAVAPROGRAMMING");
    spacedLogger.error("JAVAPROGRAMMING");

  }

}
