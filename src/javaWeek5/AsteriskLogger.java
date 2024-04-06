/*
 * AsteriskLogger class is created and implemented below.
 * The AsteriskLogger class has two methods, log and error. 
 * 
 * log method prints the given String between 3 asterisks on the 
 * either side of the string. 
 * 
 * error method prints the given String inside a box of asterisks
 * with the String preceded by the word "ERROR:"
 *  
 * Line feed had been added to some print statements to added more spaced between outputs. 
 * 
 */

package javaWeek5;

public class AsteriskLogger implements Logger{

  @Override
  public void log(String log) {
    System.out.println("***" + log + "***");
    System.out.println();
    
  }

  @Override
  public void error(String error) {
    for ( int i = 0; i < 13 + error.length(); i++) {
      System.out.print("*");
   }
    
    System.out.println("\n***Error: " + error +"***");
    
    for ( int i = 0; i < 13 + error.length(); i++) {
      System.out.print("*");
   }     System.out.println();
    
      }

}
