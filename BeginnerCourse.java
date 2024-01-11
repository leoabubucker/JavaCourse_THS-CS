import java.util.Scanner;

public class BeginnerCourse {
  private static final Scanner CONSOLE = new Scanner(System.in);
  private static String userInput;

  public static void learnPrinting() {
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
        "Let's break that line down:\n'System' is the name of a class in the Java API that contains many useful methods (functions).\n'out' is the name of an object in the System class that represents the console.\n'println' is the name of a method in the System class that prints a string to the console and moves the cursor to the next line after it is finished.\n'Hello World!' is the String variable that is being printed.\nSo, System.out.println('Hello World!'); would print 'Hello World!' to the console and move the cursor to the next line.");

    HelperFunctions.printAnimated(
        "Let's define some vocab that we used!\nAn API is a set of classes and methods created by someone else that are available to use in a program. The Java API is the set of classes and methods that are available to use in Java programs, and was created by Oracle (the creators of Java).\nThe console is on the right side of your screen and is where you are reading this text.\nAn object is an instance of a class.\nA class is a blueprint for an object.\nA method is a function that is defined in a class.\nA variable is a named location in memory that stores a value.\nA String is a type of variable that stores a sequence of characters enclosed in double quotes (\"  \"). Don't worry if you didn't get all of that, we will go into more details soon!");
    HelperFunctions.printAnimated(
        "Another way to print to the console is to use the 'print' method instead of 'println'. This method will print the String to the console without moving the cursor to the next line.");
    HelperFunctions.printAnimated(
        "Let's try an example! Type the line of code that you would write to print \"I'm learning Java!\" to the console with a new line at the end:\n");
    HelperFunctions.waitForCorrectInput("System.out.println(\"I'm learning Java!\");", true);
    HelperFunctions.printAnimated("Well Done!");
    HelperFunctions.printAnimated("Now that you know how to print to the console, let's move on to the next topic: variables! Don't worry, you will learn about what the rest of the Printing.java file means later.");
    learnVariables();
  }
  
  public static void learnVariables() {
    HelperFunctions.printAnimated("Another key concept in programming is variables. Variables are used to store values in memory. Think of a program where we need to remember a user's name; we can use a variable. What about if we also need to store a user's age; We can use another variable.");

    HelperFunctions.printAnimated("In Java, variables must be defined based on what type of value they will store. For example, we would want a variable type that can store letters to store a user's name!");

    HelperFunctions.printAnimated("Here are the most common variables you need to know about:\nString: A variable that stores a sequence of characters enclosed in double quotes (\"  \"). You will use a String to store a user's name.\nint: A variable that stores a whole number. You will use an int to store any whole number (no decimals) from -2147483648 to 2147483647 (Java limits the range of ints to this range).\ndouble: A variable that stores a decimal number. You will use a double when you need to store a number with a decimal point from 4.94065645841246544e-324 to 1.79769313486231570e+308.\nboolean: A variable that stores a true or false value. You will use a boolean when you need to store either 'true' or 'false'. Use this for something that only has two possible values!\nThere are some other variable types as well, but we will focus on these for now.");

    HelperFunctions.printAnimated("Open 'Variables.java' in the 'BeginnerCourse' folder to look at examples of these variables!\nType 'ok' when you're ready for a short quiz:\n");
  
  HelperFunctions.waitForCorrectInput("ok", "Trust me it's short! Type 'ok' when you're ready:\n", false);
    
//added by Daksh note: idk what the quiz is gonna cover and im assuming it covers how to initialize variables
  HelperFunctions.printAnimated("As you already know, the type of variable must be defined before the variable name. For example:\n int age = 16;/n We have now created a variable called 'age' that can only store whole numbers and currently stores the value 16/n. If we need to acces the value of that varibale we can simply do so by typing 'age' without quotes. For example:\n System.out.println(age);/n This will print the value of 16 to the console. Another important detail regarding variables is that the '=' sign is used to assign a value to a variable. Unlike math it does not mean 'equals' but rather 'assign'\n. So, in the example above, we are assigning the value 16 to 'age' rather than setting 'age' equal to 16. This is called 'initializing' a variable. This is somewhat of a confusing concept so its fine if you dont' understand it completly\n.");
  }
public static void learnVariableManipulation(){
  HelperFunctions.printAnimated("Now that you know how to create and use variables to store values, to move on to the next topic: Variable Manipulation\n ");

  HelperFunctions.printAnimated("Variable Manipulation is all about the different ways we can change the values being strored by a variable. Changing values is the other main use of variables other than storing values.\n If we have a variable that is used to keep track of the player score we will need to constantly be chaning the value of the variable. First define an int called 'playerScore' and assign it a value of 0:\n ");

  HelperFunctions.waitForCorrectInput("int playerScore = 0;", true);

  HelperFunctions.printAnimated("There are a couple of ways to change the values of a variable. We can assign a new value to variable by using the '=' sign again. For example:\n playerScore = 10;\n This now assign the value of 10 to 'playerScore'. But this is not useful in this example as we only want to add or subtract to the existing player score and do not want to assign a new value to the variable. Instead we can use the '+' and '-' signs to add or subtract. For example:\n playerScore = playerScore + 1;\n This will add 1 to the value of 'playerScore'\n playerScore = playerScore - 1;\n This will subtract 1 from the value of 'playerScore'.\n There are much easier ways to do this same thing. Instead of writing \n playerScore = playerScore + 1;\n we can write:\n playerScore += 1;\n Similarly, we can write:\n playerScore -= 1;\n instead of:/n playerScore = playerScore - 1;\n There is another way to write this since we are only adding or subtracting 1 from the variables value. We can write:/n playerScore++;/n to add 1 to the value of 'playerScore' and:/n playerScore--;/n to subtract 1 from the value of 'playerScore'. Remember that the '++' and '--' signs are only used when adding or subtracting 1 from the value of a variable. If we want to add or subtract a different number we can write:\n playerScore += 2;\n playerScore -= 2\n Go back and make sure you understand how to use these signs!/n Type 'ok' when you're ready to continue");

  HelperFunctions.waitForCorrectInput("ok", "Type 'ok when you're read to continue!",false);

  HelperFunctions.printAnimated("We can also multiply or divide the value of a variable. For example:\n playerScore *= 2;\n will multiply the value of 'playerScore' by 2 and:/n playerScore /= 2;\n will divide the value of 'playerScore' by 2");

  }
  public static void launchBeginnerCourse() {
    HelperFunctions.clearConsole();
    HelperFunctions.printAnimated(
        "Welcome to the beginner course! This course will teach you the basics of Java, such as printing to console, variable types, and variable manipulation!");
    learnPrinting();
  }
}