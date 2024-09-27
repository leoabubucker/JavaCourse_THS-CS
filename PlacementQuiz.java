import java.util.Scanner;
public class PlacementQuiz{
  
  private static final Scanner CONSOLE = new Scanner(System.in);
  
  private static final String[] questions = {
      "Question 1: What is the keyword used to print something to the console?",
    "Question 2: What is the data type for whole numbers in Java?", 
    "Question 3: What is the result of 9 % 4?",
    "Question 4: What is the result of 5 * 3 ?",
    "Question 5: What is the result of 'hello' + 'world'?",
    "Question 6: What is the use of 'this' keyword in Java?",
    "Question 7: Which of the following holds data and methods that operate on the data?",
    "Question 8: What is the result of 5 > 3?",
    "Question 9: What are the type of loops in Java?",
    "Question 10: What is the result of printing arr[3] if arr is initialized as: 'int[] arr = new int[5]'?",
    "Question 11: Which method returns the length of the string?",
    "Question 12: Which of the following is a non-access modifier in Java?",
    "Question 13: Can we overload the main method in Java?",
    "Question 14: Which operator is used to check reference or address of a variable in Java?",
    "Question 15: What is the result of (10 * 2)/5 + 5 - 1?"
  };
  
  private static final String[] choices = {
    "A. display B. system.out.println C. print D. console.log",
    "A. int B. double C. string D. boolean",
    "A. 2 B. 3 C. 4 D. 1",
    "A. 8 B. 10 C. 15 D. 17",
    "A. hello world B. hello+world C. helloworld D. Error",
    "A. to refer to the current object B. to create a new instance C. to access static variables D. to initialize an object",
    "A. Object B. Class C. Method D. Variable",
    "A. True B. False C. 5 D. 3",
    "A. for loop, if loop B. for loop, while loop, do-while loop C. for loop, condition loop, iterate loop D. for loop, continue loop, exit loop",
    "A. 4 B. 3 C. 0 D. Error",
    "A. length() B. size() C. length D. getSize()",
    "A. public B. private C. final D. static",
    "A. Yes B. No",
    "A. & B. * C. % D. !",
    "A. 4 B. 5 C. 8 D. 7"
  };
  
  private static final String[] answers = {
    "B", "A", "D", "C", "C", "A", "B", "A", "B", "C", "A", "C", "A", "A", "C"
  };
  
  private static int correctAnswers = 0;
  
  public static void placeUser(){
    HelperFunctions.clearConsole();
    HelperFunctions.printAnimated("Welcome to the placement quiz! This short quiz consists of a total of 15 questions (5 easy, 5 intermediate, and 5 advanced) and will help place you in a path!");
    for(int i = 0; i < questions.length; i++){
      HelperFunctions.printAnimated(questions[i]);
      HelperFunctions.printAnimated(choices[i] + "\n");
      String userSelection = CONSOLE.nextLine();
      if(HelperFunctions.validateUserInput(userSelection, answers[i], false, true)){
        correctAnswers += 1;
        HelperFunctions.printAnimated("Correct!");
      }
      else if(userSelection.equalsIgnoreCase("a") || userSelection.equalsIgnoreCase("b") ||     
userSelection.equalsIgnoreCase("c") ||     
userSelection.equalsIgnoreCase("d")){
        HelperFunctions.printAnimated("Incorrect!");
      }
      else{
        HelperFunctions.printAnimated("Invalid Input! Please make sure your input is 'a', 'b', 'c', or 'd'.");
        i -= 1;
      }
    }
    HelperFunctions.printAnimated("You got " + correctAnswers + " out of " + (questions.length) + " questions correct! (" + HelperFunctions.truncateDecimal(Double.valueOf(correctAnswers), 2)/(questions.length)*100 + "%)" );
    if(correctAnswers == questions.length){
      HelperFunctions.printAnimated("Congratulations! You got a perfect score! Loading the advanced course now...");
      HelperFunctions.sleep(1, "sec");
      HelperFunctions.updateProgress("courseProgress.txt", "advanced");
      HelperFunctions.updateProgress("activityProgress.txt", "advancedIntro");
      //AdvancedCourse.launchAdvancedCourse();
    }
    else if(correctAnswers >= (questions.length/4.0) * 3.0){
      HelperFunctions.printAnimated("Congratulations! You have been placed in the intermediate course! Loading the course now...");
      HelperFunctions.sleep(1, "sec");
      HelperFunctions.updateProgress("courseProgress.txt", "intermediate");
      HelperFunctions.updateProgress("activityProgress.txt", "intermediateIntro");
      IntermediateCourse.launchIntermediateCourse();
    }
    else{
      HelperFunctions.printAnimated("Welcome to programming! You have been placed in the beginner course. Loading the course now...");
      HelperFunctions.sleep(1, "sec");
      HelperFunctions.updateProgress("courseProgress.txt", "beginner");
      HelperFunctions.updateProgress("activityProgress.txt", "beginnerIntro");
      BeginnerCourse.launchBeginnerCourse();
    }
  }
}