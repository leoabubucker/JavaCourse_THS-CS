import java.util.Scanner;

public class BeginnerCourse {
  private static final Scanner CONSOLE = new Scanner(System.in);
  private static String userInput;

  public static void learnPrinting() {
    HelperFunctions.clearConsole();
    HelperFunctions.printAnimated(
        "Let's look at a fundamental aspect of all programming languages, printing to the console! Open 'printing.java' in the 'BeginnerCourse' folder to get started!'");

    HelperFunctions.printAnimated(
        "That may look overwhelming, but if you had to guess, what do you think running this program will do?");
    HelperFunctions.printAnimated("Type your guess below!\n");
    userInput = CONSOLE.nextLine();

    if (userInput.toLowerCase().contains("hello world")) {
      HelperFunctions.printAnimated("Correct! Running this program will print 'Hello World!' to the console.");
    } else {
      HelperFunctions.printAnimated("Not quite! Running this program will print 'Hello World!' to the console.");
    }
    HelperFunctions.printAnimated("Let's start by looking at the line 'System.out.println(Hello World!);'");

    HelperFunctions.printAnimated(
        "Let's break that line down:\n" + HelperFunctions.ANSI_RED + "'System'" + HelperFunctions.ANSI_RESET + "is the name of a class in the Java API that contains many useful methods (functions).\n" + HelperFunctions.ANSI_RED + "'out'" + HelperFunctions.ANSI_RESET +"is the name of an object in the System class that represents the console.\n'"+ HelperFunctions.ANSI_RED + "'println'" + HelperFunctions.ANSI_RESET + "is the name of a method in the System class that prints a string to the console and moves the cursor to the next line after it is finished.\n'Hello World!' is the String variable that is being printed.\nSo," + HelperFunctions.ANSI_RED + "'System.out.println('Hello World!');' " + HelperFunctions.ANSI_RESET + "would print 'Hello World!' to the console and move the cursor to the next line.");

    HelperFunctions.printAnimated(
        "Let's define some vocab that we used!\nAn" + HelperFunctions.ANSI_RED + " API " + HelperFunctions.ANSI_RESET + "is a set of classes and methods created by someone else that are available to use in a program. The Java API is the set of classes and methods that are available to use in Java programs, and was created by Oracle (the creators of Java).\nThe" + HelperFunctions.ANSI_RED + " console " + HelperFunctions.ANSI_RESET + "is on the right side of your screen and is where you are reading this text.\nAn" + HelperFunctions.ANSI_RED + " object " + HelperFunctions.ANSI_RESET + "is an instance of a class.\nA" + HelperFunctions.ANSI_RED + " class " + HelperFunctions.ANSI_RESET + "is a blueprint for an object.\nA" + HelperFunctions.ANSI_RED + " method " + HelperFunctions.ANSI_RESET + "is a function that is defined in a class.\nA" + HelperFunctions.ANSI_RED + " variable " + HelperFunctions.ANSI_RESET + "is a named location in memory that stores a value.\nA" + HelperFunctions.ANSI_RED + " String " + HelperFunctions.ANSI_RESET + "is a type of variable that stores a sequence of characters enclosed in double quotes (\"  \"). Don't worry if you didn't get all of that, we will go into more details soon!");
    HelperFunctions.printAnimated(
        "Another way to print to the console is to use the" + HelperFunctions.ANSI_RED + " 'print' " + HelperFunctions.ANSI_RESET + "method instead of" + HelperFunctions.ANSI_RED + " 'println'" + HelperFunctions.ANSI_RESET + ". This method will print the String to the console without moving the cursor to the next line.");
    HelperFunctions.printAnimated(
        "Let's try an example! Type the line of code that you would write to print \"I'm learning Java!\" to the console with a new line at the end:\n");
    HelperFunctions.waitForCorrectInput("System.out.println(\"I'm learning Java!\");", true);
    HelperFunctions.printAnimated("Well Done!");
    HelperFunctions.printAnimated(
        "Now that you know how to print to the console, let's move on to the next topic: variables! Don't worry, you will learn about what the rest of the Printing.java file means later.");
    HelperFunctions.updateProgress("activityProgress.txt", "learnVariables");
    learnVariables();
  }

  public static void learnVariables() {
    HelperFunctions.clearConsole();
    HelperFunctions.printAnimated("Another key concept in programming is variables. Variables are used to store values in memory. Think of a program where we need to remember a user's name; we can use a variable. What about if we also need to store a user's age; We can use another variable.");

    HelperFunctions.printAnimated("In Java, variables must be defined based on what type of value they will store. For example, we would want a variable type that can store letters to store a user's name!");

    HelperFunctions.printAnimated("Here are the most common variables you need to know about:\n" + HelperFunctions.ANSI_RED + "String: " + HelperFunctions.ANSI_RESET + "A variable that stores a sequence of characters enclosed in double quotes (\"  \"). You will use a String to store a user's name.\n" + HelperFunctions.ANSI_RED + "int: " + HelperFunctions.ANSI_RESET + "A variable that stores a whole number. You will use an int to store any whole number (no decimals) from -2147483648 to 2147483647 (Java limits the range of ints to this range).\n" + HelperFunctions.ANSI_RED + "double: " + HelperFunctions.ANSI_RESET + "A variable that stores a decimal number. You will use a double when you need to store a number with a decimal point from 4.94065645841246544e-324 to 1.79769313486231570e+308.\n" + HelperFunctions.ANSI_RED + "boolean: " + HelperFunctions.ANSI_RESET + "A variable that stores a true or false value. You will use a boolean when you need to store either 'true' or 'false'. Use this for something that only has two possible values!\nThere are some other variable types as well, but we will focus on these for now.");
    
    HelperFunctions.printAnimated("As you already know, the type of variable must be defined before the variable name. For example:\n" + HelperFunctions.ANSI_RED + "int age = 16;" + HelperFunctions.ANSI_RESET + "\nWe have now created a variable called 'age' that can only store whole numbers and currently stores the value 16. If we need to access the value of that variable we can simply do so by typing" + HelperFunctions.ANSI_RED + " 'age' " + HelperFunctions.ANSI_RESET + "without quotes. For example:\n" + HelperFunctions.ANSI_RED + "System.out.println(age);" + HelperFunctions.ANSI_RESET + "\nThis will print the value 16 to the console. Another important detail regarding variables is that the '=' sign is used to assign a value to a variable. Unlike math it does not mean" + HelperFunctions.ANSI_BLUE + " 'equals' " + HelperFunctions.ANSI_RESET + "but rather" + HelperFunctions.ANSI_BLUE + " 'assign' " + HelperFunctions.ANSI_RESET + ". So, in the example above, we are assigning the value 16 to 'age' rather than setting 'age' equal to 16. This is called " + HelperFunctions.ANSI_BLUE + " 'initalizing' " + HelperFunctions.ANSI_RESET + "a variable. This is somewhat of a confusing concept so it's fine if you don't understand it completely.\n");
    
    HelperFunctions.printAnimated("Open" + HelperFunctions.ANSI_RED + " 'Variables.java' " + HelperFunctions.ANSI_RESET + "in the" + HelperFunctions.ANSI_RED + " 'BeginnerCourse' " + HelperFunctions.ANSI_RESET + "folder to look at examples of these variables!\nType 'ok' when you're ready for a short quiz:\n");
  
  HelperFunctions.waitForCorrectInput("ok", "Trust me it's short! Type 'ok' when you're ready:\n", false);  

  int quizScore = variablesQuiz();
  if(quizScore >= 4){
    HelperFunctions.printAnimated("Congratulations!\nLet's move on to the next topic: Variable Manipulation.");
    HelperFunctions.updateProgress("activityProgress.txt", "learnVariableManipulation");
    learnVariableManipulation();
  }
  else{
    HelperFunctions.printAnimated("You can do better! Let's review this topic.");
    learnVariables();    
  }
  
}

  private static int variablesQuiz(){
    HelperFunctions.clearConsole();
    String [] questions = {
      "Question 1: What type of variable would you use to store a user's name?", "Question 2: What variable stores a whole number?", "Question 3: What variable stores a decimal number?", "Question 4: What variable stores a true or false value?"};

    String [] answerList = {
      "A. String B. int C. double D. boolean", "A. String B. int C. double D. boolean", "A. String B. int C. double D. boolean", "A. String B. int C. double D. boolean"};

    String [] correctAnswers = {"A", "B", "C", "D"};
    int score = 0; 
    
    for (var i = 0; i < questions.length; i++)
      {
        HelperFunctions.printAnimated(questions[i]);
        HelperFunctions.printAnimated(answerList[i] + "\n");
        String userInput = CONSOLE.nextLine();
        if(HelperFunctions.validateUserInput(userInput, correctAnswers[i], false, true))
        {
          HelperFunctions.printAnimated("Correct!");
          score++;
        }
        else {
          HelperFunctions.printAnimated("Incorrect!");
        }
      
      }
    HelperFunctions.printAnimated("Question 5: Initialize a variable called 'age' that can only store whole numbers and stores the value 15:\nType your response below:\n");
    String userInput = CONSOLE.nextLine();
    if(HelperFunctions.validateUserInput(userInput, "int age = 15;", true, true)){
      HelperFunctions.printAnimated("Correct!");
      score++;
    }
    else{
      HelperFunctions.printAnimated("Incorrect!");
    }
    
    HelperFunctions.printAnimated("Your score is " + score + "/" + 5 + " (" + score*20 + "%)");
    return score;
  }
  
  public static void learnVariableManipulation() {
    HelperFunctions.clearConsole();
    HelperFunctions.printAnimated(
        "Now that you know how to create and use variables to store values, let's move on to the next topic: Variable Manipulation\n ");

    HelperFunctions.printAnimated(
        "Variable Manipulation is all about the different ways we can change the values being stored by a variable. Changing values is the other main use of variables other than storing values.\nIf we have a variable that is used to keep track of the player score we will need to constantly be changing the value of the variable. First, define an int called 'playerScore' and assign it a value of 0:\n ");

    HelperFunctions.waitForCorrectInput("int playerScore = 0;", true);

    HelperFunctions.printAnimated(
        "There are a couple of ways to change the values of a variable. We can assign a new value to a variable by using the '=' sign again. For example:\n" + HelperFunctions.ANSI_RED + "playerScore = 10;"+ HelperFunctions.ANSI_RESET +"\nThis now assigns the value of 10 to 'playerScore'. But this is not useful in this example as we only want to add or subtract to the existing player score and do not want to assign a new value to the variable. Instead, we can use the '+' and '-' signs to add or subtract. For example:\n" + HelperFunctions.ANSI_RED + "playerScore = playerScore + 1;"+ HelperFunctions.ANSI_RESET +"\nThis will add 1 to the value of 'playerScore'\n" + HelperFunctions.ANSI_RED + "playerScore = playerScore - 1;"+ HelperFunctions.ANSI_RESET +"\nThis will subtract 1 from the value of 'playerScore'.\nThere are much easier ways to do this same thing. Instead of writing\n" + HelperFunctions.ANSI_RED + "playerScore = playerScore + 1;"+ HelperFunctions.ANSI_RESET +"\nwe can write:\n" + HelperFunctions.ANSI_RED + "playerScore += 1;"+ HelperFunctions.ANSI_RESET +"\nSimilarly, we can write:\n" + HelperFunctions.ANSI_RED + "playerScore -= 1;"+ HelperFunctions.ANSI_RESET +"\ninstead of:\n" + HelperFunctions.ANSI_RED + "playerScore = playerScore - 1;"+ HelperFunctions.ANSI_RESET +"\nThere is another way to write this since we are only adding or subtracting 1 from the variables value. We can write:\n" + HelperFunctions.ANSI_RED + "playerScore++;"+ HelperFunctions.ANSI_RESET +"\nto add 1 to the value of 'playerScore' and:\n" + HelperFunctions.ANSI_RED + "playerScore--;"+ HelperFunctions.ANSI_RESET +"\nto subtract 1 from the value of 'playerScore'. Remember that the '++' and '--' signs are only used when adding or subtracting 1 from the value of a variable. If we want to add or subtract a different number we can write:\n" + HelperFunctions.ANSI_RED + "playerScore += 2;\nplayerScore -= 2;\n"+ HelperFunctions.ANSI_RESET +"Go back and make sure you understand how to use these signs!\nType 'ok' when you're ready to continue\n");

    HelperFunctions.waitForCorrectInput("ok", "Type 'ok when you're read to continue!\n", false);

    HelperFunctions.printAnimated(
        "We can also multiply or divide the value of a variable. For example:\n" + HelperFunctions.ANSI_RED + "playerScore *= 2;"+ HelperFunctions.ANSI_RESET +"\n will multiply the value of 'playerScore' by 2 and:\n" + HelperFunctions.ANSI_RED + "playerScore /= 2;"+ HelperFunctions.ANSI_RESET +"\n will divide the value of 'playerScore' by 2.\n");

    HelperFunctions.printAnimated("Similary, we can add strings together. For example:\n" + HelperFunctions.ANSI_RED + "String name = \"Bob\";\nname += \" Smith\";\n" + HelperFunctions.ANSI_RESET + "This will add 'Smith' to the string 'name' and 'name' will contain the string 'Bob Smith'.\nType 'ok' when you're ready for a quiz\n");

    HelperFunctions.waitForCorrectInput("ok", "Type 'ok' to continue to the quiz!\n", false);
    
    int score = variableManipulationQuiz();
    if(score >= 4){
      HelperFunctions.updateProgress("activityProgress.txt", "intermediateIntro");
      HelperFunctions.printAnimated("Congratulations!\n Before we move onto the next course, complete the" + HelperFunctions.ANSI_RED + "'BankAccountActivity'" + HelperFunctions.ANSI_RESET + "in the" + HelperFunctions.ANSI_RED + "'Beginner Challenge'" + HelperFunctions.ANSI_RESET + " folder. Your progress has been saved! Type 'ok' when you're ready to continue to the next course!\n"); 
      HelperFunctions.waitForCorrectInput("ok", "Type 'ok' to continue to the next course!\n", false);
      IntermediateCourse.launchIntermediateCourse();
    }
    else{
      HelperFunctions.printAnimated("You can do better! Let's review this topic.");
      learnVariableManipulation();    
    }
  }

  public static int variableManipulationQuiz(){
   
    HelperFunctions.clearConsole();
    String [] questions = {"1. Which of the following adds 1 to a variable?", "2. What does the following code do?\nint age = 25;\nage -= 10;", "3. What is the value of x after the code finishes executing?\nint x = 5;\nx *= 3;",  "4. What is the value of y after the code finishes executing?\nint y = 10;\ny /= 2;"};

    String [] answerList = {"A. x++ B. x-- C. x += 10 D. x *= 1", "A. Adds 10 to age B. Multiplies age by 10 C. Subtracts 10 from age D. Divides age by 10", "A. 5 B. 25 C. 35 D. 15", "A. 102 B. 5 C. 20 D. 8"};

    String [] correctAnswers = {"A", "C", "D", "B"};
    int score = 0;
    
    for(var i=0; i < questions.length; i++)
      {
        HelperFunctions.printAnimated(questions[i]);
        HelperFunctions.printAnimated(answerList[i] + "\n");
        String userInput = CONSOLE.nextLine();
        if(HelperFunctions.validateUserInput(userInput, correctAnswers[i], false, true)){
          HelperFunctions.printAnimated("Correct!");
          score++;
        }
        else{
          HelperFunctions.printAnimated("Incorrect!");
        }
      }
      HelperFunctions.printAnimated("Your score is " + score + "/" + questions.length + " (" + score/4.0 * 100.0 + "%)");
    return score; 
    
  }
  

  public static void launchBeginnerCourse() {
    HelperFunctions.clearConsole();
    HelperFunctions.printAnimated(
        "Welcome to the beginner course! This course will teach you the basics of Java, such as printing to console, variable types, and variable manipulation!");
    HelperFunctions.updateProgress("activityProgress.txt", "learnPrinting");
    learnPrinting();
  }

}