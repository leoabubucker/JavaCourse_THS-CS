import java.util.concurrent.TimeUnit;
import java.util.Scanner;
public class HelperFunctions{
  
  public static void printAnimated(String initStr){
    System.out.println("\n");
    for(int i = 0; i < initStr.length(); i++){
      System.out.print(initStr.charAt(i));
      try{
        TimeUnit.MILLISECONDS.sleep(25);
      }
      catch(InterruptedException e){
        e.printStackTrace();
      }
    }
  }
  public static void clearConsole(){
    System.out.print("\033[H\033[2J");  
    System.out.flush();
  }
  public static void sleep(int time, String unit){
    try {
      if(unit.equals("sec")){
        TimeUnit.SECONDS.sleep(time);
      }
      else if(unit.equals("msec")){
        TimeUnit.MILLISECONDS.sleep(time);
      }
      else if(unit.equals("nano")){
        TimeUnit.NANOSECONDS.sleep(time);
      }
      else if(unit.equals("micro")){
        TimeUnit.MICROSECONDS.sleep(time);
      }
    } 
    catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
  public static void waitForCorrectInput(String correctInput){
    final Scanner CONSOLE = new Scanner(System.in);
    String userInput = CONSOLE.nextLine();
      while (!userInput.equalsIgnoreCase(correctInput)) {
        HelperFunctions.printAnimated("Not Quite! Try Again:\n");
        userInput = CONSOLE.nextLine();
      }
    CONSOLE.close();
  }
  public static void waitForCorrectInput(String correctInput, String incorrectMsg){
    final Scanner CONSOLE = new Scanner(System.in);
    String userInput = CONSOLE.nextLine();
      while (!userInput.equalsIgnoreCase(correctInput)) {
        HelperFunctions.printAnimated(incorrectMsg + "\n");
        userInput = CONSOLE.nextLine();
      }
    CONSOLE.close();
  }
  public static void waitForCorrectInput(String correctInput, boolean caseSpecific){
    final Scanner CONSOLE = new Scanner(System.in);
    String userInput = CONSOLE.nextLine();
    if(caseSpecific){
      while (!userInput.equals(correctInput)) {
        HelperFunctions.printAnimated("Not Quite! Try Again:\n");
        userInput = CONSOLE.nextLine();
      }
    }
    else{
      while (!userInput.equalsIgnoreCase(correctInput)) {
        HelperFunctions.printAnimated("Not Quite! Try Again:\n");
        userInput = CONSOLE.nextLine();
      }
    }
    CONSOLE.close();
  }
  public static void waitForCorrectInput(String correctInput, String incorrectMsg, boolean caseSpecific){
    final Scanner CONSOLE = new Scanner(System.in);
    String userInput = CONSOLE.nextLine();
    if(caseSpecific){
      while (!userInput.equals(correctInput)) {
        HelperFunctions.printAnimated(incorrectMsg + "\n");
        userInput = CONSOLE.nextLine();
      }
    }
    else{
      while (!userInput.equalsIgnoreCase(correctInput)) {
        HelperFunctions.printAnimated(incorrectMsg + "\n");
        userInput = CONSOLE.nextLine();
      }
    }
    CONSOLE.close();
  }

  public static double truncateDecimal(double num, int places){
    double multiplier = Math.pow(10, places);
    int tempNum = (int) (num*multiplier);
    return (double) tempNum/multiplier;
  }
}