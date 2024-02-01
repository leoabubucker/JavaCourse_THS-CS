/*----------------------------------------------------*/
/*                                                    */
/*        Intro to Java - THS Comp Sci Olympiad       */
/*                                                    */
/*    Press the big green "Run" button!               */
/*    Created by Leo Abubucker - Club Co-Founder      */
/*                                                    */
/*----------------------------------------------------*/
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class JavaIntro {
  private static final Scanner CONSOLE = new Scanner(System.in);
 
  public static void main(String[] args) {
   
    HelperFunctions.clearConsole();
    HelperFunctions.printAnimated(
        "Hello and welcome to the Intro Java Crash Course, for "
            + "THS Computer Science Olympiad Club created by Leo "
            + "Abubucker!");
    HelperFunctions.sleep(500, "msec");
      HelperFunctions.printAnimated(
        "\nThis crash course will teach you the basics of Java, and "
            + "prepare you to compete in programming competitions.");
    HelperFunctions.sleep(500, "msec");
    
      HelperFunctions.printAnimated(
        "\nWe will primarily prepare you to compete at the UMD "
            + "High School Programming Competition: "
            + "\nhttps://www.cs.umd.edu/Outreach/hsContest23/index.html");                                 
      HelperFunctions.printAnimated("Type 'ok' to continue to where you left off:\n");    
    String userInput = CONSOLE.nextLine();
    while (!userInput.equalsIgnoreCase("ok")) {
      HelperFunctions.printAnimated("Don't give up already! Please enter 'ok' to begin:\n");
      userInput = CONSOLE.nextLine();
    }
    HelperFunctions.loadProgress();    
  }
}
