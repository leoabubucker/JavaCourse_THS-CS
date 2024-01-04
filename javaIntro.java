
/*----------------------------------------------------*/
/*                                                    */
/*        Intro to Java - THS Comp Sci Olympiad       */           /*                                                    */
/*    Press the big green "Run" button!               */
/*    Created by Leo Abubucker - Club Co-Founder      */
/*                                                    */
/*----------------------------------------------------*/
import java.util.Scanner;

public class javaIntro {
  public static Scanner CONSOLE = new Scanner(System.in);

  public static void intro() {
    System.out.println(
      "\nHello and welcome to the Intro Java Crash Course, for "
      + "THS Computer Science Olympiad Club created by Leo " 
      + "Abubucker!");
    System.out.println(
      "\nThis crash course will teach you the basics of Java, and "
      + "prepare you to compete in programming competitions.");
    System.out.println(
      "\nWe will primarily prepare you to compete at the UMD " 
      + "High School Programming Competition: "
      +"\nhttps://www.cs.umd.edu/Outreach/hsContest23/index.html");
    courseSelection();
  }

  public static void courseSelection() {
    System.out.println(
      "\nPlease type one of the following kewords based on your " 
      + "interests:\n1. 'beginner'\n2. 'intermediate'\n3. "
      + "'advanced'");
    
    String userSelection = CONSOLE.nextLine();
    if(userSelection.equalsIgnoreCase("beginner")){
      beginnerCourse();
    }
    else if(userSelection.equalsIgnoreCase("intermediate")){
        intermediateCourse();
      }
    else if(userSelection.equalsIgnoreCase("advanced")){
        advancedCourse();
      }
    else{
        System.out.println(
          "\nSorry, that is not a valid selection. Please "    
          + "try again.");
        courseSelection();
  }
    }
  public static void beginnerCourse() {
  }
  public static void intermediateCourse() {
  }
  public static void advancedCourse() {
  }
  public static void main(String[] args) {
    intro();
  }
}