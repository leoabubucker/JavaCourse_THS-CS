import java.util.Scanner;

public class IntermediateCourse {
  private static final Scanner CONSOLE = new Scanner(System.in);
  private static String userInput;

  public static void learnOperators(){
    
   HelperFunctions.printAnimated("There are many different types of operators available to be used in Java. They are classified based on the functionality they provide. You will learn about the following operators: arithmetic, assignment, relational, and logical.\n");

    HelperFunctions.printAnimated( HelperFunctions.ANSI_RED + "Arithmetic operators:\n'+':" + HelperFunctions.ANSI_GREEN + " adds 2 values together"+ HelperFunctions.ANSI_BLUE + " ex: x+y" + HelperFunctions.ANSI_RED + "\n'-':" + HelperFunctions.ANSI_GREEN + " subtracts 2 values"+ HelperFunctions.ANSI_BLUE + " ex: x-y" + HelperFunctions.ANSI_RED + "\n'*':" + HelperFunctions.ANSI_GREEN + " multiplies 2 values "+ HelperFunctions.ANSI_BLUE + " ex: x*y" + HelperFunctions.ANSI_RED + "\n'/':" + HelperFunctions.ANSI_GREEN + " divides 2 values"+ HelperFunctions.ANSI_BLUE + " ex: x/y" + HelperFunctions.ANSI_RED + "\n'%':" + HelperFunctions.ANSI_GREEN + " (modulus operator) returns the remainder of 2 values"+ HelperFunctions.ANSI_BLUE + " ex: x%y" + HelperFunctions.ANSI_RED + "\n'++':" + HelperFunctions.ANSI_GREEN + " increments the value of a variable by 1" + HelperFunctions.ANSI_BLUE + " ex: x++" + HelperFunctions.ANSI_RED + "\n'--':" + HelperFunctions.ANSI_GREEN + " decrements the value of a variable by 1" + HelperFunctions.ANSI_BLUE + " ex: x--" + HelperFunctions.ANSI_RESET);

    HelperFunctions.printAnimated(HelperFunctions.ANSI_RED + "Assignment operators:\n'=':" + HelperFunctions.ANSI_GREEN + " assign a value to any variable" + HelperFunctions.ANSI_BLUE + " ex: x=y" + HelperFunctions.ANSI_RED + "\n'+=':" + HelperFunctions.ANSI_GREEN + " adds a value to a variable" + HelperFunctions.ANSI_BLUE + " ex: x+=y" + HelperFunctions.ANSI_RED + "\n'-=':" + HelperFunctions.ANSI_GREEN + " subtracts a value from a variable" + HelperFunctions.ANSI_BLUE + " ex: x-=y" + HelperFunctions.ANSI_RED + "\n'*=':" + HelperFunctions.ANSI_GREEN + " multiplies a variable by a value" + HelperFunctions.ANSI_BLUE + " ex: x*=y" + HelperFunctions.ANSI_RED + "\n'/=':" + HelperFunctions.ANSI_GREEN + " divides a variable by a value " + HelperFunctions.ANSI_BLUE + " ex: x/=y" + HelperFunctions.ANSI_RESET);

    HelperFunctions.printAnimated(HelperFunctions.ANSI_RED + "Relational operators:\n'==':" + HelperFunctions.ANSI_GREEN + " checks if 2 values are equal " + HelperFunctions.ANSI_BLUE + " ex:" + HelperFunctions.ANSI_RED + " System.out.println(x == y)\n'!=':" + HelperFunctions.ANSI_GREEN + " checks if 2 values are not equal " + HelperFunctions.ANSI_BLUE + " ex:" + HelperFunctions.ANSI_RED + " System.out.println(x!=y)\n'<:'" + HelperFunctions.ANSI_GREEN + " checks if a value is less than another " + HelperFunctions.ANSI_BLUE + " ex:" + HelperFunctions.ANSI_RED + " System.out.println(x<y)\n'>:'" + HelperFunctions.ANSI_GREEN + " checks if a value is greater than another " + HelperFunctions.ANSI_BLUE + " ex:" + HelperFunctions.ANSI_RED + " System.out.println(x>y)\n'<=':" + HelperFunctions.ANSI_GREEN + " checks if a value is less than or equal to another " + HelperFunctions.ANSI_BLUE + " ex:" + HelperFunctions.ANSI_RED + " System.out.println(x<=y)\n'>='" + HelperFunctions.ANSI_GREEN + " checks if a value is greater than or equal to another " + HelperFunctions.ANSI_BLUE + " ex:" + HelperFunctions.ANSI_RED + " System.out.println(x>=y)" + HelperFunctions.ANSI_RESET);

    HelperFunctions.printAnimated( HelperFunctions.ANSI_RED + "Logical operators:\n'&&' (AND):" + HelperFunctions.ANSI_GREEN + " checks if 2 conditons are true" + HelperFunctions.ANSI_BLUE + " ex:" + HelperFunctions.ANSI_RED + " System.out.println(x && y)\n'||' (OR):" + HelperFunctions.ANSI_GREEN + " checks if 1 of 2 conditons are true" + HelperFunctions.ANSI_BLUE + " ex:" + HelperFunctions.ANSI_RED + " System.out.println(x || y)\n'!' (NOT):" + HelperFunctions.ANSI_GREEN + " changes the returned value of a conditon (false when true and true when false" + HelperFunctions.ANSI_BLUE + " ex:" + HelperFunctions.ANSI_RED + " System.out.println(!x)\n" + HelperFunctions.ANSI_RESET + "\nLogical operators are used in conditionals which you will learn about in the next lesson\nTake a look at the" + HelperFunctions.ANSI_RED + " 'Operators.java'" + HelperFunctions.ANSI_RESET + "in the" + HelperFunctions.ANSI_RED + " 'Intermediate Course'" + HelperFunctions.ANSI_RESET + " folder for more examples on these operators. Type 'ok' when you are ready to continue onto the next lesson about conditionals.\n");

    HelperFunctions.waitForCorrectInput("ok", "Type 'ok' when you are ready to continue!\n",false);
    HelperFunctions.updateProgress("activityProgress.txt", "learnConditionals");
    learnConditionals();
}  

  public static void learnConditionals(){
   HelperFunctions.printAnimated("Conditonals are expressions that evaluate to 'true' or 'false' and execute code based on the result. You will learn about the following conditionals: if, and if-else.\n");

    HelperFunctions.printAnimated("There are times when you need to execute code based on a condition/situation. For example, if you want to add coins to a player's inventory, you need to use a conditional to check if the player has touched a coin and then add it to their inventory. You can use an if statement for this. If statements are the most basic conditional statements and execute when a condition is met/true. The syntax for an if statement is as follows:\n" + HelperFunctions.ANSI_RED + "if(some condition)\n{\n  exectue following code\n}\n" + HelperFunctions.ANSI_RESET + "Inside of the parentheses, you can put any condition that evaluates to true or false. For example, you can check if a variable is greater than 5 by using the operators you learned about in the previous lesson. Inside the curly braces, you can put any code that you want to execute when the condition is met. Examine this code and predict what it will print once it has finished executing.\n" + HelperFunctions.ANSI_RED + "int x = 5;\nif(x > 3)\n{\n  x++;\n  System.out.println(x);\n}\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("6", false);

    HelperFunctions.printAnimated("Correct!\nThe code above will print 6 because the condition is true and the code inside the curly braces increments the value of x by 1 and prints it.If the condition was false such as\n" + HelperFunctions.ANSI_RED + "if(x < 3)\n" + HelperFunctions.ANSI_RESET + "then the code inside the curly braces would not execute. Sometimes we want to execute code if the condtion is not met/true. For example, we may want to decrease the value of x in the above example if x < 3. To do this we can use else statements. Else statements are used after an if statement and execute when the condition is not met/true and the if statement is not executed. The syntax for an else statement is as follows:\n" + HelperFunctions.ANSI_RED + "if(some condiiton)\n{\n  execute following code\n}\nelse\n{\n  execute following code as none of the if conditions are met\n}\n" + HelperFunctions.ANSI_RESET + "Notice that the else statement does not have a condition. This is because the else statement is executed if none of the if condiitons are met and therefore requires no condition." + HelperFunctions.ANSI_GREEN + "The 'if' in if-else statements checks if a condition is met/true and executes the code inside the curly braces if it is. The 'else' in if-else  statements executes when none of the 'if' conditions are met/true and executes the code inside the curly braces." + HelperFunctions.ANSI_RESET + "Examine the following code and perdict what will happen once it executes\n" + HelperFunctions.ANSI_RED + "int x = 1;\nif(x > 3)\n{\n  x++;\n  System.out.println(x);\n}\nelse\n{\n  x--;\n  System.out.println(x);\n}\n" + HelperFunctions.ANSI_RESET);

  HelperFunctions.waitForCorrectInput("0", false);

  HelperFunctions.printAnimated("Correct!\nThe code above will print 0 because the condition is false and the code inside the else statement decrements x by 1 and prints it. Sometimes we want to check if multiple conditons are true. In the previous example, we may want to multiply the value of x by a number if it equals 3. To do this we can use an 'else if' statement. Else if statement combine the functionality of 'if and 'else' statements. Here is the syntax for else if statements:\n" + HelperFunctions.ANSI_RED + "if(some condition)\n{\n  execute following code\n}\nelse if (some other condition)\n{\n  execute following code\n}\nelse\n{\n  execute following code if none of the 'if' conditions are met\n}\n" + HelperFunctions.ANSI_RESET + "This code will first check the  'if' condition, if it is not met/true, it will check the 'else if' condition and if it is not met/true, it will execute the else statement. Examine the following code and predict what will happen once it executes\n" + HelperFunctions.ANSI_RED + "int x = 3;\nif(x > 3)\n{\n  x++;\n  System.out.println(x);\n}\nelse if (x == 3)\n{\n  System.out.println(x);\n}\nelse\n{\n  x--;\n  System.out.println(x);\n}\n" + HelperFunctions.ANSI_RESET);

     HelperFunctions.waitForCorrectInput("3", false);

    HelperFunctions.printAnimated("Correct!\nThe code above will print 3 because the first condition is not true, so the 'else if' statement is checked and the condition is true. The code inside the 'else if' statement is executed and it prints the value of x. Here is another piece of code for you to examine and predict what will happen once it executes\n" + HelperFunctions.ANSI_RED + "int x = 5;\nif(x > 8)\n{\n  x++;\n  System.out.println(x);\n}\nelse if (x != 5)\n{\n  System.out.println(x);\n}\nelse if ( x > 3)\n{\n  x--;\n  System.out.println(x);\n}\nelse\n{\n  x *= 10;\n  System.out.println(x);\n}\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("4", false);

    HelperFunctions.printAnimated("Correct!\nThe code above will print 4 because the first condition is not true, so it checks the second condition which is also not true, so it checks the third condition which is true. The code inside the second 'else if' statement is executed and it decrements the value of x by 1 and prints it. Here is another piece of code for you to examine and predict what will happen once it executes\n" + HelperFunctions.ANSI_RED + "int age = 16;\nif(age < 10 || age >= 16)\n{\n  age += 4;\n}\nif(age > 25)\n{\n  age -= 2;\n}\nelse if (age > 15)\n{\n  age++;\n  System.out.println(age)\n}\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("21", false);

    HelperFunctions.printAnimated("Correct!\nThe code above will print 21 because the first 'if' condition is true, which adds 4 to age which makes age = 20. There is a second if condition after the first one so it will also execute. The condition 'age > 25' is not true so it checks the else if statement which is true as age > 15. The code executes and adds 1 to age which makes age = 21 and prints it.\nWe can also have if statements inside of if statements. These are known as 'nested if statements'. They can get complicated easily so dont worry if you cant fully understand them. Here is an example of a nested if statement:\n" + HelperFunctions.ANSI_RED + "if(some condition)\n{\n  if(another condition)\n  {\n    execute code\n  }\n  else\n  {\n    execute code because 'if' condition was not met\n  }\n}\nelse\n{\n  execute code because first 'if' condition was not true\n}" + HelperFunctions.ANSI_RESET + "\nHere is a nested if statement, try to guess what will happen once it executes\n" + HelperFunctions.ANSI_RED + "int x = 5;\nif(x > 3)\n{\n  if(x == 5)\n  {\n    System.out.println(\"x is 5\");\n  }\n  else\n  {\n    System.out.println(\"x is not 5\")\n  }\n}\nelse\n{\n  System.out.println(\"x is not greater than 3\");\n}\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("x is 5", true);

    HelperFunctions.printAnimated("Correct!\n The code above will print 'x is 5' because the first condition is true and 'if' statement inside that is also true. The code inside the 'if' statement is executed and it prints 'x is 5'. This is all you need to know about conditionals!\nGo to the" + HelperFunctions.ANSI_GREEN + "'Intermediate Challenges'" + HelperFunctions.ANSI_RESET +"folder and open and complete the" + HelperFunctions.ANSI_GREEN + " 'Conditionals Activity'" + HelperFunctions.ANSI_RESET);

    HelperFunctions.updateProgress("activityProgress.txt", "learnMethods");

    HelperFunctions.printAnimated("\nType 'ok' when you are ready to continue to the next topic about methods!\n");

    HelperFunctions.waitForCorrectInput("ok", false);
    learnMethods();
    
  }

  public static void learnMethods()  
  {
    HelperFunctions.printAnimated("Methods are a way to reuse code to make it organized and easier to read. They are also a way to make your code more efficient. Methods are blocks of code that run when they are called. A method must be defined with a name and parameters. Once the method has been declared it can called as many times as needed. The syntax for a method is as follow: \n" + HelperFunctions.ANSI_RED + "public void methodName (parameters)\n{\n  code to execute\n}\n" + HelperFunctions.ANSI_RESET + "The code above is the declaration of a method. We will explain what 'public void' means later. For now, declare your methods using 'public void'.\nTo call that method we can do the folowing:\n" + HelperFunctions.ANSI_RED + "methodName(parameters);\n" + HelperFunctions.ANSI_RESET + "This will run the code inside the method. \nWe can also decide to declare no parameters in methods:\n" + HelperFunctions.ANSI_RED + "public void methodName ()\n{\n  code to execute\n}\n" + HelperFunctions.ANSI_RESET  + "Similarly this method can be executed by:\n" + HelperFunctions.ANSI_RED + "methodName();\n" + HelperFunctions.ANSI_RESET +"The code inside the method will only run when the method is called. Examine the following code and determine if it will print anything or not (yes or no):\n" + HelperFunctions.ANSI_RED + "public void printSomething()\n{\n  System.out.println(\"Hello World\");\n}\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("no", false);

    HelperFunctions.printAnimated("Correct!\nThe code will not print anything as the method is never called, only defined. Remember, to call a method we have to do:\n" + HelperFunctions.ANSI_RED + "methodnName(parameters);\n" + HelperFunctions.ANSI_RESET + "Examine the following code and determine what it will do once it executes" + HelperFunctions.ANSI_RED + "\nint x = 25;\n\npublic void printSomething()\n{\n x *= 4;\n  System.out.println(x)\n}\n\nprintSomething();\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("100", false);

    HelperFunctions.printAnimated("Correct!\nThe code will print 100 because the method is called and the code inside the method multiples x by 4 which is 100 and prints it. Here is another pieced of code for you to examine and predict what will happen once it executes\n" + HelperFunctions.ANSI_RED + "int age = 28;\n\npublic void printSomething()\n{\n  if (age > 20 && age != 28)\n  {\n    System.out.println(\"age is not 28\")\n  }\n  else if (age == 28)\n  {\n    System.out.println(\"You are old!\")\n  }\n  else\n  {\n    System.out.println(\"You are young!\")\n  }\n}\n\nprintSomething();\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("You are old!", false);

    HelperFunctions.printAnimated("Correct!\nThe code will print 'You are old!' because the first condition is not true, so it checks the 'else if' statement which is true and prints 'You are old!'.\nPredict what the following code will print:\n" + HelperFunctions.ANSI_RED + "int money = 5;\n\npublic void makeMoney()\n{\n  money *= 2;\n}\n\nmakeMoney();\nmakeMoney();\n\nSystem..out.println(money);\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("20", false);

      HelperFunctions.printAnimated("Correct!\nIn this code, the function is called twice so we multiple money by 2 twice. 5 * 2 = 10, 10 * 2 = 20. So the code will print 20. Here is another piece of code for you to examine and predict what will happen once it executes\n" + HelperFunctions.ANSI_RED + "int money = 5;\n\npublic void makeMoney()\n{\n  money *= 2;\n}\n\npublic void logMoney()\n{\n  if(money <= 100)\n  {\n    makeMoney();\n    makeMoney();\n  }\n\n  System.out.println(money);\n}\n\nlogMoney();\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("20", false);

    HelperFunctions.printAnimated("Correct!\nThe code will print 20. First, the 'makeMoney' method is defined then the 'logMoney' method is defined. The 'logMoney' method is the method that is called at the end of the code. The 'logMoney' method first checks if money is less than 100 which is true, so it calls the 'makeMoney' method twice. The 'makeMoney' method multiples money by 2 twice which is 20. Then the 'logMoney' method prints money which is 20. After printing the code finishes executing.\nThere are examples of methods without parameters in" + HelperFunctions.ANSI_GREEN + " 'Methods.java'" + HelperFunctions.ANSI_RESET + "in the" + HelperFunctions.ANSI_GREEN + " 'Intermediate Course'" + HelperFunctions.ANSI_RESET + "folder. Type 'ok' when you are ready to continue to methods with parameters!\n");

    HelperFunctions.updateProgress("activityProgress.txt", "learnMethodParameters");
    HelperFunctions.waitForCorrectInput("ok", false);
    
  }


  
  public static void learnMethodParameters(){
    
    /*HelperFunctions.printAnimated("There are ways to make methods more efficient. One way is to use parameters. Parameters are a way to make functions more felxible and reusable. For example, imagine you had a function that was used to start a car:\n" + HelperFunctions.ANSI_RED + "public void startCar()\n{\n start(\"car\");\n}\n" + HelperFunctions.ANSI_RESET + "We can call this function as many times as needed to start a car but what if we needed to start another vehicle? We would need to make another method such as:" + HelperFunctions.ANSI_RED + "\npublic void startTruck()\n{\n start(\"truck\");\n}\n" + HelperFunctions.ANSI_RESET + "We might need to make this method for 100 more vehicles, which would be a lot of code that does basically the same thing. We can use parameters to make this code more efficient. Notice that the 2 methods above have basically the same code except for 'truck' and 'car'. Using parameters we can replace 'truck' and 'car' with a variable that we can chagne as needed. To do it we can do the following:\n" + HelperFunctions.ANSI_RED + "public void  startVehicle (String vehicle)\n{\n start(vehicle);\n}\n" + HelperFunctions.ANSI_RESET + "The parameters are like variables and we must define their type like 'int' or 'String'. The 'String vehicle' is the parameter that we can change everytime we call the method to start a different vehicle. To call this function we can do the following:\n" + HelperFunctions.ANSI_RED + "startVehicle(\"car\");\n" + HelperFunctions.ANSI_RESET + "The code above will assign the value of 'car' to the parameter 'vehicle'. This will use the string 'car' everytime there is a 'vehicle' in the method. The string 'car' is specific to the call above and we can still modify the parameter 'vehicle' later. For example:\n" + HelperFunctions.ANSI_RED + "startVehicle(\"car\");\nstartVehicle(\"truck\");\n" + HelperFunctions.ANSI_RESET + "The code avbove will call the 'startVehicle' method first and replace every instance of 'vehicle' with 'car', it will then call the 'startVehicle' method again and replace every instance of 'vehicle' with 'truck'.\nExamine the following code and determine what it will print:\n\n" + HelperFunctions.ANSI_RED + "int age = 30;\n\npublic void changeAge (int change)\n{\n  age += change;\n}\n\nchangeAge(10);\nSystem.out.println(age);\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("40", false);

    HelperFunctions.printAnimated("Correct!\nThe code above will print 40 because 'change' is added to 'age' and when we call the method, we set 'change' to 10. 30 + 10 = 40 and program prints 40.\n There are more examples of parameters in" + HelperFunctions.ANSI_GREEN + " 'Methods.java'" + HelperFunctions.ANSI_RESET + "in the" + HelperFunctions.ANSI_GREEN + " 'Intermediate Course'" + HelperFunctions.ANSI_RESET + "folder. Type 'ok' when you are ready to practice more!\n"); 

    HelperFunctions.waitForCorrectInput("ok", false);
                                  
    HelperFunctions.printAnimated("Here is a piece of code for you to examine and predict what will happen once it executes\n" + HelperFunctions.ANSI_RED + "int money = 5;\n\npublic void makeMoney(paycheck)\n{\n  if (paycheck > 100)\n  {\n    money += paycheck;\n  }\n  else\n  {\n    money++;\n  }\n}\n\nmakeMoney(200);\nSystem.out.println(money);\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("205", false);*/

    HelperFunctions.printAnimated("Correct!\nThe code will print 205 because the 'makeMoney' method is called and 'paycheck' is set to 200. 200 is > 100 so 'money' is increased by 'paycheck' which is 205. The code then prints money which is '205'. Here is another piece of code for you to examine and predict what will happen once it executes\n\n" + HelperFunctions.ANSI_RED + "int money = 100;\n\npublic void makeMoney(paycheck)\n{\n  if(paycheck > money)\n  {\n    money += paycheck;\n  }\n  else {\n  money -= paycheck;\n  }\n}\n\npublic void spendMoney(expense)\n{\n  if(expense > money)\n  {\n    System.out.println(\"You don't have enough money to spend that much!);\n  else {\n      money -= expense;\n  }\n}\n\nmakeMoney(200);\nspendMoney(25);\n\nSystem.out.println(money);" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("275", false);

    HelperFunctions.printAnimated("Correct!\nFirst the code defines methods 'make Money' and 'spendMoney'. The 'makeMoney' method is called first and since 200 > 100, 'paycheck' is added to 'money' making it 300. The 'spendMoney' method is called next and since 25 < 100, 'expense' is subtracted from 'money' which makes money 275. The code then prints money which is 275.\n");

    
        
}
  
  public static void launchIntermediateCourse() {
      HelperFunctions.clearConsole();  
      HelperFunctions.printAnimated("Welcome to the intermediate course! This course will teach you the basics of Java, such as operators, conditionals, methods, string methods, arrays, and ArrayList, loops, classes, and objects  ");
    HelperFunctions.updateProgress("activityProgress.txt", "learnOperators");
    learnOperators();
  }
}