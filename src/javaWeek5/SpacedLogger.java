/*
 * SpacedLogger class is created and implemented below.
 * The SpacedLogger class has two methods, log and error. 
 * 
 * log method prints the given String with spaces between each letter of the String.
 * 
 * error method prints the given String  with spaces between each letter of the String
 * but with the "ERROR:" preceding the spaced out input.
 * 
 * Line feed had been added to some print statements to added more space between outputs.
 * 
 */

package javaWeek5;

public class SpacedLogger implements Logger {

  @Override
  public void log(String log) {
    String newLog = "" ;
    for (int i = 0; i < log.length(); i++) {
       newLog = newLog + (log.charAt(i)) + " ";
          } System.out.println("\n" + newLog.stripTrailing());
    
  }

  @Override
  public void error(String error) {
    String newError = "ERROR:";
    for (int i = 0; i < error.length(); i++) {
        newError = newError +" " + error.charAt(i);
           } System.out.println("\n" + newError);
    
  }

}
