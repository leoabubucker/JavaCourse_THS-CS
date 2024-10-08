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
    HelperFunctions.printAnimated("Methods are a way to reuse code to make it organized and easier to read. They are also a way to make your code more efficient. Methods are blocks of code that run when they are called. A method must be defined with a name and parameters. Once the method has been declared it can called as many times as needed. The syntax for a method is as follow: \n" + HelperFunctions.ANSI_RED + "public static void methodName (parameters)\n{\n  code to execute\n}\n" + HelperFunctions.ANSI_RESET + "The code above is the declaration of a method. We will explain what 'public static void' means later. For now, declare your methods using 'public static void'.\nTo call that method we can do the folowing:\n" + HelperFunctions.ANSI_RED + "methodName(parameters);\n" + HelperFunctions.ANSI_RESET + "This will run the code inside the method. \nWe can also decide to declare no parameters in methods:\n" + HelperFunctions.ANSI_RED + "public static void methodName ()\n{\n  code to execute\n}\n" + HelperFunctions.ANSI_RESET  + "Similarly this method can be executed by:\n" + HelperFunctions.ANSI_RED + "methodName();\n" + HelperFunctions.ANSI_RESET +"The code inside the method will only run when the method is called. Here is what defining and calling a method in a '.java' file looks like:\n" + HelperFunctions.ANSI_RED + "public class Main {\n\n  public static void main(String[] args) {\n    methodName();\n  }\n\n  public static void methodName() {\n\n  }\n}\n\n" + HelperFunctions.ANSI_RESET + "There is one big change that will occur when we are defining methods." + HelperFunctions.ANSI_GREEN + " We will need to define our variables with 'static' if we want to use them in our methods that are defined with 'public static void'. For ex:\n" + HelperFunctions.ANSI_RED + "static int x - 5;\n\npublic static void add()\n{\n  x++;\n}\n" + HelperFunctions.ANSI_RESET + "If we do not have 'static' on our variables we will get errors when we try to use them in our methods. We will expain later in the course what 'static' does and why we need to define our methods and variables with 'static'.");
                                
    HelperFunctions.printAnimated("Examine the following code and determine if it will print anything or not (yes or no):\n" + HelperFunctions.ANSI_RED + "public static void printSomething()\n{\n  System.out.println(\"Hello World\");\n}\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("no", false);

    HelperFunctions.printAnimated("Correct!\nThe code will not print anything as the method is never called, only defined. Remember, to call a method we have to do:\n" + HelperFunctions.ANSI_RED + "methodnName(parameters);\n" + HelperFunctions.ANSI_RESET + "Examine the following code and determine what it will do once it executes" + HelperFunctions.ANSI_RED + "\nstatic int x = 25;\n\npublic static void printSomething()\n{\n  x *= 4;\n  System.out.println(x)\n}\n\nprintSomething();\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("100", false);

    HelperFunctions.printAnimated("Correct!\nThe code will print 100 because the method is called and the code inside the method multiples x by 4 which is 100 and prints it. Here is another pieced of code for you to examine and predict what will happen once it executes\n" + HelperFunctions.ANSI_RED + "static int age = 28;\n\npublic static void printSomething()\n{\n  if (age > 20 && age != 28)\n  {\n    System.out.println(\"age is not 28\")\n  }\n  else if (age == 28)\n  {\n    System.out.println(\"You are old!\")\n  }\n  else\n  {\n    System.out.println(\"You are young!\")\n  }\n}\n\nprintSomething();\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("You are old!", false);

    HelperFunctions.printAnimated("Correct!\nThe code will print 'You are old!' because the first condition is not true, so it checks the 'else if' statement which is true and prints 'You are old!'.\nPredict what the following code will print:\n" + HelperFunctions.ANSI_RED + "static int money = 5;\n\npublic static void makeMoney()\n{\n  money *= 2;\n}\n\nmakeMoney();\nmakeMoney();\n\nSystem..out.println(money);\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("20", false);

      HelperFunctions.printAnimated("Correct!\nIn this code, the function is called twice so we multiple money by 2 twice. 5 * 2 = 10, 10 * 2 = 20. So the code will print 20. Here is another piece of code for you to examine and predict what will happen once it executes\n" + HelperFunctions.ANSI_RED + "static int money = 5;\n\npublic static void makeMoney()\n{\n  money *= 2;\n}\n\npublic static void logMoney()\n{\n  if(money <= 100)\n  {\n    makeMoney();\n    makeMoney();\n  }\n\n  System.out.println(money);\n}\n\nlogMoney();\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("20", false);

    HelperFunctions.printAnimated("Correct!\nThe code will print 20. First, the 'makeMoney' method is defined then the 'logMoney' method is defined. The 'logMoney' method is the method that is called at the end of the code. The 'logMoney' method first checks if money is less than 100 which is true, so it calls the 'makeMoney' method twice. The 'makeMoney' method multiples money by 2 twice which is 20. Then the 'logMoney' method prints money which is 20. After printing the code finishes executing.\nThere are examples of methods without parameters in" + HelperFunctions.ANSI_GREEN + " 'Methods.java'" + HelperFunctions.ANSI_RESET + "in the" + HelperFunctions.ANSI_GREEN + " 'Intermediate Course'" + HelperFunctions.ANSI_RESET + "folder. Type 'ok' when you are ready to continue to methods with parameters!\n");

    HelperFunctions.updateProgress("activityProgress.txt", "learnMethodParameters");
    HelperFunctions.waitForCorrectInput("ok", false);
    
    learnMethodParameters();
  }


  
  public static void learnMethodParameters(){

    HelperFunctions.printAnimated("Before we learn about parameters, there is another important mehtod we need to know about. It is the 'main' method. The main method is what starts executing the code and without a main method in the code, there will be errors. The main method is where we put all of our code to execute that is not in another method such as variable manipulations and conditionals. The main method is defined as follows:\n" + HelperFunctions.ANSI_RED+ "public class Main {\n\n  public static void main(String[] args) {\n\n  }\n\n}\n\n"+ HelperFunctions.ANSI_RESET + "The 'public static void main (String[] args)' is the main method and where we call other methdos or put other code. The 'main' mehthod has to be the defined like above and must be in all of our files or we will get errors. Practice defining the main method here (do not include LINE SPACES in parenthesis() or brackets{} ):\n" );

    HelperFunctions.waitForCorrectInput("public static void main (String[] args) {}", false);

    HelperFunctions.printAnimated("Great Job! Type 'ok' to continue to methods with parameters!\n");
    
    HelperFunctions.waitForCorrectInput("ok", false);
    
    HelperFunctions.printAnimated("There are ways to make methods more efficient. One way is to use parameters. Parameters are a way to make functions more felxible and reusable. For example, imagine you had a function that was used to start a car:\n" + HelperFunctions.ANSI_RED + "public static void startCar()\n{\n start(\"car\");\n}\n" + HelperFunctions.ANSI_RESET + "We can call this function as many times as needed to start a car but what if we needed to start another vehicle? We would need to make another method such as:" + HelperFunctions.ANSI_RED + "\npublic static void startTruck()\n{\n start(\"truck\");\n}\n" + HelperFunctions.ANSI_RESET + "We might need to make this method for 100 more vehicles, which would be a lot of code that does basically the same thing. We can use parameters to make this code more efficient. Notice that the 2 methods above have basically the same code except for 'truck' and 'car'. Using parameters we can replace 'truck' and 'car' with a variable that we can chagne as needed. To do it we can do the following:\n" + HelperFunctions.ANSI_RED + "public static void  startVehicle (String vehicle)\n{\n start(vehicle);\n}\n" + HelperFunctions.ANSI_RESET + "The parameters are like variables and we must define their type like 'int' or 'String'. The 'String vehicle' is the parameter that we can change everytime we call the method to start a different vehicle. To call this function we can do the following:\n" + HelperFunctions.ANSI_RED + "startVehicle(\"car\");\n" + HelperFunctions.ANSI_RESET + "The code above will assign the value of 'car' to the parameter 'vehicle'. This will use the string 'car' everytime there is a 'vehicle' in the method. The string 'car' is specific to the call above and we can still modify the parameter 'vehicle' later. For example:\n" + HelperFunctions.ANSI_RED + "startVehicle(\"car\");\nstartVehicle(\"truck\");\n" + HelperFunctions.ANSI_RESET + "The code avbove will call the 'startVehicle' method first and replace every instance of 'vehicle' with 'car', it will then call the 'startVehicle' method again and replace every instance of 'vehicle' with 'truck'.\nExamine the following code and determine what it will print:\n\n" + HelperFunctions.ANSI_RED + "static int age = 30;\n\npublic static void changeAge (int change)\n{\n  age += change;\n}\n\nchangeAge(10);\nSystem.out.println(age);\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("40", false);

    HelperFunctions.printAnimated("Correct!\nThe code above will print 40 because 'change' is added to 'age' and when we call the method, we set 'change' to 10. 30 + 10 = 40 and program prints 40.\n There are more examples of parameters in" + HelperFunctions.ANSI_GREEN + " 'Methods.java'" + HelperFunctions.ANSI_RESET + "in the" + HelperFunctions.ANSI_GREEN + " 'Intermediate Course'" + HelperFunctions.ANSI_RESET + "folder. Type 'ok' when you are ready to practice more!\n"); 

    HelperFunctions.waitForCorrectInput("ok", false);
                                  
    HelperFunctions.printAnimated("Here is a piece of code for you to examine and predict what will happen once it executes\n" + HelperFunctions.ANSI_RED + "static int money = 5;\n\npublic static void makeMoney(paycheck)\n{\n  if (paycheck > 100)\n  {\n    money += paycheck;\n  }\n  else\n  {\n    money++;\n  }\n}\n\nmakeMoney(200);\nSystem.out.println(money);\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("205", false);

    HelperFunctions.printAnimated("Correct!\nThe code will print 205 because the 'makeMoney' method is called and 'paycheck' is set to 200. 200 is > 100 so 'money' is increased by 'paycheck' which is 205. The code then prints money which is '205'. Here is another piece of code for you to examine and predict what will happen once it executes\n\n" + HelperFunctions.ANSI_RED + "static int money = 100;\n\npublic static void makeMoney(paycheck)\n{\n  if(paycheck > money)\n  {\n    money += paycheck;\n  }\n  else {\n  money -= paycheck;\n  }\n}\n\npublic static void spendMoney(expense)\n{\n  if(expense > money)\n  {\n    System.out.println(\"You don't have enough money to spend that much!);\n  else {\n      money -= expense;\n  }\n}\n\nmakeMoney(200);\nspendMoney(25);\n\nSystem.out.println(money);\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("275", false);

    HelperFunctions.printAnimated("Correct!\nFirst the code defines methods 'make Money' and 'spendMoney'. The 'makeMoney' method is called first and since 200 > 100, 'paycheck' is added to 'money' making it 300. The 'spendMoney' method is called next and since 25 < 100, 'expense' is subtracted from 'money' which makes money 275. The code then prints money which is 275.\n\nThere are examples of methods with parameters in" + HelperFunctions.ANSI_GREEN + " 'Methods.java'" + HelperFunctions.ANSI_RESET + "in the" + HelperFunctions.ANSI_GREEN + " 'Intermediate Course'" + HelperFunctions.ANSI_RESET + "folder. Type 'ok' when you are ready to continue to return statements!\n");

    HelperFunctions.updateProgress("activityProgress.txt", "learnReturnStatements");
    HelperFunctions.waitForCorrectInput("ok", false);

    learnReturnStatements();
        
}

  public static void learnReturnStatements(){
    
    HelperFunctions.printAnimated("The 'return' statement is used to return a value from a method. For example, imagine we have a method 'quiz' that asks questions and updates a 'score' variable depending on the answer. The 'score' is very important and we may need it in another method to check if the user passed the quiz. The 'quiz' method may look like this:\n\n" + HelperFunctions.ANSI_RED + "public class Main {\n\n  public static void main(String[] args) {\n    quiz();\n  }\n\n  public static void quiz() {\n    int score = 0;\n\n    code for quiz that updates score\n\n  }\n}\n\n" + HelperFunctions.ANSI_RESET + "To get back the score we need to return it. We can return a value from a method by using the following:" + HelperFunctions.ANSI_RED + "\nreturn variableName\n" + HelperFunctions.ANSI_RESET + "In our code above we need to return 'score' so what code would we type to reuturn it?\n");

    HelperFunctions.waitForCorrectInput("return score;", true);

    HelperFunctions.printAnimated("Correct! We need to type 'return score;' to return the score value. Once we have returned the value of 'score' we can use it in different ways. For example:\n" + HelperFunctions.ANSI_RED + "public class Main {\n\n  public static void main(String[] args) {\n\n    int userScore = quiz();\n\n    if(userScore > 5)\n    {\n      System.out.println(\"You passed!\");\n    }\n    else\n    {\n      System.out.println(\"You failed\");\n    }\n\n  }\n\n  public static int quiz() {\n    int score = 0;\n\n    code for quiz that updates score\n\n    return score;\n\n  }\n}\n\n" + HelperFunctions.ANSI_RESET + "The code above calls the 'quiz' method inside of another variable called 'userScore' and since the 'quiz' method returned 'score', 'userScore' now stores the 'score' the user got. Then the code checks if the user got above or below 5 and prints a message accordingly.\n\nIf you notice, there is something different about the 'quiz' method. It is defined using 'public static int' instead of 'public static void'. This is because the 'quiz' method returns a value. When we use 'void' to define a method, we are telling the computer that this method will not return any valud hence the 'void'. Since we are returning a value, we must tell the computer that the method will return a value and what type of value it needs to return. We are returing an 'int' value so we must use 'public static int'. If we were trying to return a 'String' or a 'double', we would use 'public static String' or 'public static double'. Whenever we use 'return' we have to define the method using 'publc static [return type]' where return type can be anything like 'int' or 'String'.\n\nAnother thing about return statements is that they completely stop a method and any code below the return statement will not execute. For example:\n\n" + HelperFunctions.ANSI_RED + "public static int add()\n{\n  int age = 10;\n\nage += 10;\n\n  return age;\n\n System.out.println(\"returned!\");\n}\n\n" + HelperFunctions.ANSI_RESET + "\nIn the code above, if we call the 'add' method, the code will add 10 to 'age' and then return 'age' but it will not print 'returned!' because it is below the return statement and the return statement ends the method before the print statement is executed.\n Go to the" + HelperFunctions.ANSI_GREEN + " 'Intermediate Challenges'" + HelperFunctions.ANSI_RESET + "folder and complete the" + HelperFunctions.ANSI_GREEN + " 'Methods Activity'\n\n" + HelperFunctions.ANSI_RESET + "Type 'ok' when you are ready to continue to string methods!\n");

    HelperFunctions.updateProgress("activityProgress.txt", "learnStringMethods");
    HelperFunctions.waitForCorrectInput("ok", false);

    learnStringMethods();
   
  }

  public static void learnStringMethods(){
    //equals, equalsignorease, length, toUpperCase,toLowerCase, charAt, indexOf, isEmpty, trim, replace
    HelperFunctions.printAnimated("As you have learned previously, the 'String' class represents character strings. Strings are constant, meaning their values cannot be changed after they are created. However, the String class has a set of built-in methods that you can use on strings!\n The first method we will learn is 'equals'. It is used to compare two strings and returns true if they are. For example:\n" + HelperFunctions.ANSI_RED + "\nString str1 = \"Hello\";\nString str2 = \"Hello\";\nString str3 = \"hello\";\n\nSystem.out.println(str1.equals(str2));  prints true \nSystem.out.println(str1.equals(str3));  prints false\n\n" + HelperFunctions.ANSI_RESET + "The first print statement will print true as they are the same string. The second print statement will print false as 'Hello' is not the same as 'hello' due to the capitalization. This issue of capitalization is called 'case sensitivity'. We can avoid case sensitivity by using the 'equalsIgnoreCase' method instead of 'equals'.\n\n" + HelperFunctions.ANSI_RED + "String str1 = \"hElLo\"\nString str2 = \"HELLO\"\n\nSystem.out.println(str1.equalsIgnoreCase(str2));  prints true\n\n" + HelperFunctions.ANSI_RESET + "The code above prints true as 'hElLo' and 'HELLO' are the same string but the capiatalization is different.\nDetermine what the following code will print:\n\n" + HelperFunctions.ANSI_RED + "String userInput = \"Buy\";\nString action = \"buy\";\n\nif(userInput.equals(action))\n{\n  System.out.println(\"You bought something\");\n}\n\nelse if (userInput.equalsIgnoreCase(action))\n{\n  System.out.println(\"You bought something\");\n}\nelse\n{\n  System.out.println(\"error\");\n}\n" + HelperFunctions.ANSI_RESET);

  HelperFunctions.waitForCorrectInput("You bought something", false);

  HelperFunctions.printAnimated("Correct! The code above will print 'You bought something' because 'userInput' is set to 'Buy' and action is set to 'buy'. The first if statement will be false due to case senstivity but the second one will be true because of 'equalsIgnoreCase'. The 'equalsIgnoreCase' is useful when taking in input from the user as the user may not type in the same thing that is written in the code. There are also other methods we can use when dealing with user input. They are '.toLowerCase' and '.toUpperCase'. These methods will change the string to all lowercase or all uppercase. For example:\n\n" + HelperFunctions.ANSI_RED + "String str1 = \"HELLO\"\nString str2 = \"wow\"\n\nSystem.out.println(str1.toLowerCase());  prints 'hello'\nSystem.out.println(str2.toUpperCase());  prints 'WOW'\n\n" + HelperFunctions.ANSI_RESET + "These methods are useful in manipulating the user input to look like what is written in the code during comparisons. Determine what the following code will print:\n\n" + HelperFunctions.ANSI_RED + "String userInput = \"BUY\"\nString action = \"buy\"\n\nif(userInput.toLowerCase(\"buy\"))\n{\n  System.out.println(\"You have bought something\");\n}\n\nelse\n{\n  System.out.println(\"error\");\n}\n" + HelperFunctions.ANSI_RESET);

  HelperFunctions.waitForCorrectInput("You have bought something", false);
                                
  HelperFunctions.printAnimated("Correct! The next method we will learn about is the 'length' method. It returns the length of a string. For example:\n\n" + HelperFunctions.ANSI_RED + "String str = \"Hello\";\n\nSystem.out.println(str.length());\n\n" + HelperFunctions.ANSI_RESET + "The code above will print 5 as 'Hello' has 5 characters. The length method is useful when trying to restrict input lengths such as requiring a minimum length for a password. What will the followng code print:\n\n" + HelperFunctions.ANSI_RED + "String str = \"\";\n\nSystem.out.println(str.length());\n\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("0", false); 

    HelperFunctions.printAnimated("Correct! The code above will print 0 as the stirng is empty and doesnt have a length.\nThe next method we will learn about is the 'charAt' method. It returns the character at a specific index. For example:\n\n" + HelperFunctions.ANSI_RED + "String str = \"Hello\";\n\nSystem.out.println(str.charAt(0));  prints 'H'\n\n" + HelperFunctions.ANSI_RESET + "The word 'char' is short for 'character'. 'Char' is a variable type like 'int' or 'String'. 'Char' is like a string but it only stores one character such as 'h' or 'e'. The 'charAt' method takes in a parameter that is the index (position/number) of the character you want to return. The index starts at 0 and goes up by 1. This is the reason we use 'charAt(0)' instead of 'charAt(1)' to return the first character. Always remember to start counting at 0 when talking about indexes. Determine what the following code will print:\n\n" + HelperFunctions.ANSI_RED + "String str1 = \"My name is John\";\n\nSystem.out.println(str1.charAt(0));\n\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("M", false);

    HelperFunctions.printAnimated("Correct! The first character at index 0 is 'M'.\nThe next method we will learn about is the 'indexOf' method. It returns the index of a character in a string. For example:\n\n" + HelperFunctions.ANSI_RED + "String str = \"Hello\";\n\nSystem.out.println(str.indexOf(\"e\"));  prints '1'\n\n" + HelperFunctions.ANSI_RESET + "The 'indexOf' method takes in a parameter that is the character you want to find. The methods then returns the index of that character. Remeber, the index starts as 0 which is why the code above will print 1 even though 'e' is the second letter in 'Hello'. The 'indexOf' method will return -1 if the character is not found. Determine what the following code will print:\n\n" + HelperFunctions.ANSI_RED + "String str = \"Name\";\n\nSystem.out.println(str.indexOf(\"L\"));\n\n" + HelperFunctions.ANSI_RESET);

  HelperFunctions.waitForCorrectInput("-1", false); 

  HelperFunctions.printAnimated("Correct! The 'indexOf' method will return -1 if the character is not found. Here is another problem for you to solve:\n\n" + HelperFunctions.ANSI_RED + "String str = \"Name\";\n\nSystem.out.println(str.indexOf(\"m\"));\n\n" + HelperFunctions.ANSI_RESET);

  HelperFunctions.waitForCorrectInput("2", false); 

  HelperFunctions.printAnimated("Correct! The code will return 2 because 'm' is the 2nd character if counting starts from 0.\nThe next method we will learn about is the 'isEmpty' method. This method checks to see if a string is empty or not and returns true or false. For example:\n\n" + HelperFunctions.ANSI_RED + "String str1 = \"\";\nString str2 = \"Hello\";\n\nSystem.out.println(str1.isEmpty());  returns true\nSystem.out.println(str2.isEmpty());  returns false\n\n" + HelperFunctions.ANSI_RESET + "This method can be useful in checking if user input is empty or not and requiring fields such as username to be filled out. What will the following code print:\n\n" + HelperFunctions.ANSI_RED + "String userInput = \"Joe\";\nString userName = \"\";\n\nif(userInput.isEmpty())\n{\n  System.out.println(\"No Input!\")\n}\nelse {\n  userName = userInput;\n  System.out.println(userName);\n}\n" + HelperFunctions.ANSI_RESET);

  HelperFunctions.waitForCorrectInput("Joe", false);

    HelperFunctions.printAnimated("Correct! The if statement is false as 'userInput' is not empty so 'userName' is set to 'userInput' which is 'Joe'. The else statement then prints 'userName'.\nThe next method we will learn about is the 'trim' method. This method removes any spaces at the beginning and end of a string. For example:\n\n" + HelperFunctions.ANSI_RED + "String str = \"  Hello  \";\n\nSystem.out.println(str.trim());  prints 'Hello'\n\n" + HelperFunctions.ANSI_RESET + "What will the following code print:\n\n" + HelperFunctions.ANSI_RED + "String str = \"  Hello World  \";\n\nSystem.out.println(str.trim());\n\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("Hello World", false);

    HelperFunctions.printAnimated("Correct! The spaces at the front and end of the string are removed and 'Hello World' is printed.\nThe next method we will learn about is the 'replace' method. This method replaces all instances of a character with another character. For example:\n\n" + HelperFunctions.ANSI_RED + "String str = \"Hello\";\n\nSystem.out.println(str.replace(\"H\", \"J\"));  prints 'Jello'\n\n" + HelperFunctions.ANSI_RESET + "What will the following code print:\n\n" + HelperFunctions.ANSI_RED + "String str = \"Hello\";\n\nSystem.out.println(str.replace(\"l\", \"p\"));\n\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("Heppo", false);

    HelperFunctions.printAnimated("Correct! All instances of 'l' are replaced with 'p' and 'Heppo' is printed.\n\nThese are all of the methods we will cover in this course. There are other useful string methods in Java that can be found here: https://www.w3schools.com/java/java_ref_string.asp\n\nThere are also examples of these string methods in the " + HelperFunctions.ANSI_GREEN + " StringMethods.java" + HelperFunctions.ANSI_RESET + " file in the " + HelperFunctions.ANSI_GREEN + "IntermediateCourse" + HelperFunctions.ANSI_RESET + " folder.\n\nType 'ok' when you are ready to continue to arrays!\n");

    HelperFunctions.updateProgress("activityProgress.txt", "learnArrays");
    HelperFunctions.waitForCorrectInput("ok", false);

    learnArrays();
}

  public static void learnArrays()
  {
    HelperFunctions.printAnimated("A lot of times we need to store a lot of data that is very similar, This could include a lot of usernames, ages, or even a list of items. We can use arrays to store this data. Arrays are used to store multiple values in a single variable instead of having to using different variables for each value. All values in an array must be the same type such as string or int. Arrays are defined as follows:\n\n" + HelperFunctions.ANSI_RED + "String[] arrayName = {\"first\", \"second\", \"third\"};\n\n" + HelperFunctions.ANSI_RESET + "Arrays are defined by first defining the type of data they will store such as String, int, char, or double. Then we need to put '[]' after the data type to define the variable as an array. We then need to define the name of the array. All the values in an array are then defined inside of curly brackets{} and are separated by commas. The values inside of an array are refered to as 'elements' of the array. Arrays use 0-based indexing meaning that the first element (value) of an array is at index (posiiton) 0. We will use indexing when we need to access a specific element (value) in an array.\n\nPractice defining an array of integers called 'numbers' with elemnts 1, 2, and 3. Make sure to define everything on the same line and be careful with case sensitivity.\n\n"); 

    HelperFunctions.waitForCorrectInput("int[] numbers = {1, 2, 3};", true);

    HelperFunctions.printAnimated("Correct! We also need to know how to access specific elements of an array. We can access elements of an array by using their index value. For example:\n\n" + HelperFunctions.ANSI_RED + "String[] cars = {\"Volvo\", \"Toyota\", \"Honda\"};\n\n" + HelperFunctions.ANSI_RESET + "Remember, arrays start indexing at 0 which means that the first value in the array is the 0th posiiton instead of the 1st. To acess specific elements we first need the array name followed by the index in '[]'. If we want to access 'Toyota' in the 'cars' array we can do:\n\n" + HelperFunctions.ANSI_RED + "\\cars[1]  (specific code to access toyota in cars)\n\nSystem.out.println(cars[1]);  prints 'Toyota'\n\n" + HelperFunctions.ANSI_RESET + "Similarly, if we want to access 'Volvo' we can do:\n\n" + HelperFunctions.ANSI_RED + "System.out.println(cars[0]); prints 'Volve'\n\n" + HelperFunctions.ANSI_RESET +"Print 10 on a new line using the array:\n\n" + HelperFunctions.ANSI_RED + "int[] numbers = {5, 10, 15}\n\n" + HelperFunctions.ANSI_RESET); 
                                  
    HelperFunctions.waitForCorrectInput("System.out.println(numbers[1]);", true);
    
    HelperFunctions.printAnimated("Correct! Using this we can manipulate arrays just like variables. For example, if we want to change the value of 'Toyota' we can do:\n\n" +  HelperFunctions.ANSI_RED + "String[] cars = {\"Volvo\", \"Toyota\", \"Honda\"};\n\ncars[1] = \"Mazda\";\n\n" + HelperFunctions.ANSI_RESET + "Change the value of '5' to '1' in the following array:\n\n" + HelperFunctions.ANSI_RED + "int[] numbers = {5, 10, 15}\n\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("numbers[0] = 1;", true);

    HelperFunctions.printAnimated("Correct!\n\nThe confusing part about arrays is understanding the difference between indexing and length. Indexing is the position of the elements which starts at 0. Length is the total amount of elements in an array which start at 1. For example:\n\n" + HelperFunctions.ANSI_RED + "String[] names = {\"Joe\", \"Max\"\"Cole\"}\n\n" + HelperFunctions.ANSI_RESET + "The length of the array above is 3 because there are a total of 3 values in the array (start counting at 1). However, there are 2 elements in this array due to the fact that the first value 'Joe' is at index 0 instead of index 1. What is the length of the following array:\n\n" + HelperFunctions.ANSI_RED + "char[] characters = {'H', 'e', 'l', 'l', 'o'};\n\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("5", false); 

    HelperFunctions.printAnimated("Correct! There are a total of 5 values in the array. How many elements are in this following array:\n\n" + HelperFunctions.ANSI_RED + "double[] numbers = {9.1, 2.3, 4.5, 6.7};" + HelperFunctions.ANSI_RESET + "\n\n");

    HelperFunctions.waitForCorrectInput("3", false);

    HelperFunctions.printAnimated("Correct! There are 3 elements in the array as counting begins at 0. Also notice that the amount of elements in an array is the arrays length - 1\n\nThere are other ways to create arrays. One of them is by creating the array and allocating memory to it. Then we can use that memory later in the code to add values to the array. For example, if we wanted to create an array of integers and store 10 values in that array, we can do:\n\n" + HelperFunctions.ANSI_RED +"int[] numbers = new int[10];\n\n" + HelperFunctions.ANSI_RESET + "This tells the computer that we have created an array of integers and we want to set aside enough memory to store 10 values in that array (9 elemnts in terms of indexing). To actually add values to this array we can do:\n\n" + HelperFunctions.ANSI_RED + "numbers[0] = 1;\n\n" + HelperFunctions.ANSI_RESET + "We can keep doing this until,\n\n" + HelperFunctions.ANSI_RED + "numbers[9] = 50;\n\n" + HelperFunctions.ANSI_RESET + "due to the fact that we have set aside only 10 total values for the array, and at the 9th index we have 10 total values in the array (including the 0th index). We can do this with all data types:\n\n" + HelperFunctions.ANSI_RED + "String[] names = new String[2];  creating a array that can hold up to 2 values\n\nnames[0] = \"Joe\";  Storing 'Joe' in the first value (0th index)\nnames[1] = \"Max\"  Storing 'Max' in the second value (1st index)\n\n" + HelperFunctions.ANSI_RESET + "Create an array of doubles called 'numbers' that can store 3 total values:\n\n");

    HelperFunctions.waitForCorrectInput("double[] numbers = new double[3];", true); 

    HelperFunctions.printAnimated("Correct!\n\nUnlike other programming languages, once an array is created in Java its size cannot be changed. This means that if we wanted to add new values to the array we need to create another array. There are many ways to change the size of an array such as arrayList; however, we will not be learning those right now.\n\nType 'ok' when you are ready to continue to the next seciton!\n");

    HelperFunctions.updateProgress("activityProgress.txt", "learnSplitandSubstring");
    HelperFunctions.waitForCorrectInput("ok", false);
    learnSplitandSubstring();
  }

  public static void learnSplitandSubstring(){
    HelperFunctions.printAnimated("Before we continue to loops, there are 2 important string methods that we need to learn about. They are split() and substring().\n\nFirst we will talk about the substring() method. The substring() method is used to return a part of a string. For example:" + HelperFunctions.ANSI_RED + "\n\nString str1 = \"Hello, World!\";\n\nSystem.out.println(myStr.substring(7, 12));  \\prints 'World'\n\n" + HelperFunctions.ANSI_RESET + "The substring() method takes 2 parameters. The first parameter is the position of the first character you want the substring to start at (inclusive) and the second parameter is the position of the character you want the substring to end at (exclusive). In the example above, we wanted to print 'World' from 'Hello, World!'. In the first parameter we put 7 because 'W' is in the 7th index (start counting at 0 and include spaces as indexes) and in the second parameter we put 12 becuase '!' is in the 12th index and everything before '!' will be printed. Perdict what the following will print:\n\n" + HelperFunctions.ANSI_RED + "String name = \"My name is john\";\n\nSystem.out.println(name.substring(3, 14));\n\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("name is joh", true);

    HelperFunctions.printAnimated("Correct!\nThe first parameter is 3 which is the letter 'n' (where the substring begins) and the last parameter is 14 which is the letter 'n' (of john) is not included meaning the substring will be 'name is joh'.\n\nThe substring() method is special as it doeesnt require the second paramtere (the end of the substring). If the second parameter is not included the substring will end at the end of the string. For example:\n\n" + HelperFunctions.ANSI_RED + "String str1 = \"Hello, World!\";\n\nSystem.out.println(str1.substring(7));  prints 'World!'\n\n" + HelperFunctions.ANSI_RESET + "In the code above, 7 is the starting index which is the leter 'W' and since there is no second parameter, the substring ends as the end of the string and prints 'World!'. Examine what the following will print:\n\n" + HelperFunctions.ANSI_RED + "String username = \"Not Human\";\n\nSystem.out.println(username.substring(4));" + HelperFunctions.ANSI_RESET + "\n\n");

    HelperFunctions.waitForCorrectInput("Human", true);

    HelperFunctions.printAnimated("Correct! The 4th index is at character 'H' and the rest of the string is printed as there is no second parameter.\n\n" + HelperFunctions.ANSI_RED + "String name = \"No_Name\";\n\n" + HelperFunctions.ANSI_RESET + "Use the code above and the substring method to print 'Name' (remember to use only one parameter as the other is not necessary in this context):\n\n");

    HelperFunctions.waitForCorrectInput("System.out.println(name.substring(3));", true);

    HelperFunctions.printAnimated("Correct! The third index is the character 'N' and we dont need a second parameter in this situation.\n\nThe next method we will learn about is the split() method. The split method is used to split one string into an array. The split method like the substring method takes 2 parameters.\n\n" + HelperFunctions.ANSI_RED + "String.split(String regex, int limit)\n\n" + HelperFunctions.ANSI_RESET + "The first parameter is the regular expression (regex) that you want to use to split the string. The second parameter is and int and the number of times you want to split the string. Lets take a look at the first parameter:\n\n" + HelperFunctions.ANSI_RED + "String fruit = \"Orange, Apple, Banana\";\n\nString[] fruitArray = fruits.split(\",\");\n\nSystem.out.println(Arrays.toString(fruitArray)  //ignore the 'Arrays.toString' we will cover it later\n\nOutput:\nOrange\nApple\nBanana\n\n" + HelperFunctions.ANSI_RESET + "In the code above, we firts define a string called 'fruit' that contains the values 'Orange, Apple, Banana'. We then define a 'fruitArray' that is an array of strings. We then use the split() method to split the string 'fruit' by ',' and store the values in the 'fruitArray'. We then print out the fruitArray. Examine the following code and determine the output:\n\n" + HelperFunctions.ANSI_RED + "String cars = \"Volvo, Toyota, Honda\";\n\nString[] carArray = cars.split(\",\")\n\nSystem.out.println(carArray[2]);\n\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("Honda", true);

    HelperFunctions.printAnimated("Correct! The string 'cars' is split by ',' and the second value in the array is printed which is 'Honda'.\nLets look at the second parameter. We can use the second parameter to place a limit on how many times we want to split the string. For exampel:\n\n" + HelperFunctions.ANSI_RED + "String names = \"Thomas, John, James, Nick, Cole, Ben, Will\";\n\nString[] nameArray = names.split(\",\", 2);\n\n" + HelperFunctions.ANSI_RESET + "If you print out the 'nameArray' you might expect to get outputs of 'Thomas (0th index), John (1st index)' but instead the output you will receive is 'Thomas (0th index), John, James, Nick, Cole, Ben, Will (1st index)'. This is due to the fact that when a limti is set for the split method, the last element of the array will contain the remainaing string. In the example above, the second parameter is set to 2 meaning that there will be a limit of 2 elements in the array. The first element is filled when 'Thomas' is split due to the ',' but the second element is filled with the rest of the remaning string which is 'John, James, Nick, Cole, Ben, Will'. The second parameter in the 'split' method is optional and does not need to be defined. If the second parameter is left blank or set to 0, there will be no limit on the amount of elements in the array. Examine the following code and determine the output:\n\n" + HelperFunctions.ANSI_RED + "String teams = \"Ravens, Colts, Steelers, Seahawks, Browns, Jaguars, Texans\";\n\nString[] teamArray = teams.split(\",\", 0);\n\nSystem.out.println(teamArray[3]);\n\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("Seahawks", false);

    HelperFunctions.printAnimated("Correct! Since the second parameter is set to 0, there is no limit on the amount of elements in the array. The third index is 'Seahawks' which is printed.\n\nThere are examples of split() and subString() in the " + HelperFunctions.ANSI_GREEN + "StringMethods.java" + HelperFunctions.ANSI_RESET + " file in the " + HelperFunctions.ANSI_GREEN + "IntermediateCourse" + HelperFunctions.ANSI_RESET +"folder.\n\nType 'ok' when you are ready to continue to the next activity\n");

    HelperFunctions.updateProgress("activityProgress.txt", "learnLoops");
    HelperFunctions.waitForCorrectInput("ok", false);
    learnWhileLoops();
    
  }
  
  public static void learnWhileLoops(){
    
    HelperFunctions.printAnimated("Many times we may want to repeat a block of code multiple times. This could be as simple as printing out every username in an array of strings. Depending on the amount of usernames, we may need thousands of lines to just accomplish this simple task. In this situtaion we can use loops. Loops are used to repeat code until a certain condition is met. Printing thousands of usernames could go from 1000 lines of code to just a few lines of code. There are 2 types of loops we will be learning about: while loop, and for loop.\n\nA while loop runs a block of code as long as a certain condition is true. This is similar to an if statement as a condition has to be true for the code to execute, except unlike if statements, while loops will repeat. To define a while loop we use the keyword 'while' followed by a condiiton in paretheses '()' and the code we want to execute in brackets '{}'. For example:\n\n" + HelperFunctions.ANSI_RED + "while (condiiton) {\n  code to execute\n}\n\n"  + HelperFunctions.ANSI_RESET + "Assume that we want to print out numbers from 0 to 4. We can do the following:\n\n" + HelperFunctions.ANSI_RED + "int i = 0;  create a variable and set it to 0\n\nwhile (i < 5)  run the code as long as i is less than 5\n{\n  System.out.println(i);  print the value of i\n  i++;  increment i by 1\n}\n\n" + HelperFunctions.ANSI_RESET + "The code above will print '0, 1, 2, 3, 4' each on a new line. The while loop above is going to run as long as i is less than 5. If i < 5 then the code will print the value of i and add 1 to i. This wiill continue until i is no longer less than 5. The code will then stop runnning and prnting. The reason we add 1 to i is to becasue we want the loop to end at some point. In order for the loop to end, i has to be above 5 which can only be done if the value of i is increased. If we do not increase the value of i then we will have an infinte loop that will never end and give an error. To modify the code above to print numbers from 0-10 instead of 0-4 we can do:\n\n" + HelperFunctions.ANSI_RED + "int i = 0;\n\nwhile (i <= 10)  notice that the condiiton has now changed to run the code as long as i is less than or equal to 10\n{\n  System.out.println(i);  print the value of i\n  i++;  increment i by 1\n}\n\n" + HelperFunctions.ANSI_RESET + "The code above will print '0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10'. Lets take this loop as an example:\n\n" + HelperFunctions.ANSI_RED + "int i = 0;  create a variable and set it to 0\n\nwhile (i < 5)  run the code as long as i is less than 5\n{\n  System.out.println(i);  print the value of i\n  i++;  increment i by 1\n}\n\n" + HelperFunctions.ANSI_RESET + "The way this loop works is by first checking if i < 5 which it is as i = 0. It then prints i which is 0 and then adds 1 to i making it 1. Now we have 0 printed on the console and i = 1. We then again check if i < 5 which is true. We print i which is 1 and add 1 to i making it 2. We then check if i < 5 which is true. We print 2 and i = 3. We do this again and print 3 and i = 4. We do this one more time and print 4 and i = 5. Currently we have '0, 1, 2, 3, 4' printed on the console and i = 5. We then again check if i < 5 which is false as i = 5. The loop then stops running and the program ends.\n\nHow many times will the following code run?\n\n" + HelperFunctions.ANSI_RED + "int x = 0;\n\nwhile (x < 7)\n{\n  System.out.println(x);\n  x++;\n}\n\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("7", false);

    HelperFunctions.printAnimated("Correct!\n\nWhat will the following code print (do not include spaces or commas between the numbers):\n\n" + HelperFunctions.ANSI_RED + "int x = 1;\n\nwhile (x < 8)\n{\n  System.out.println(x);\n  x++;\n}\n\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("1234567", false);

    HelperFunctions.printAnimated("Correct!\n\nThe next loop we will learn about is a variation of the while loop. This is the do/while loop. The do/while loop looks like this:\n\n" + HelperFunctions.ANSI_RED + "do {\n  code to execute\n} while (condition);\n\n" + HelperFunctions.ANSI_RESET + "The do/while loop is different from the while loop as the code is executed first, then the condiiton is checked. This means that the code will always be executed at least once, even if the condition is false. For example:\n\n" + HelperFunctions.ANSI_RED + "int x = 10;\n\ndo {\n  System.out.println(x);\n  x++;\n} while (x < 5);\n\n" + HelperFunctions.ANSI_RESET + "The code above will print 10 even thought the condition is not met as the code is executed first, then the condiiton is checked.\n\nThe do/while loop still works the same as the while loop\n\n" + HelperFunctions.ANSI_RED + "int x = 0;\n\ndo {\n  System.out.println(x);\n  x++;\n} while (x < 5);\n\nOutput: 0 1 2 3 4\n\n" + HelperFunctions.ANSI_RESET + "Examine what the following code will print (do not include spaces or commas between the numbers)\n\n" + HelperFunctions.ANSI_RED + "int x = 0;\n\ndo {\n  System.out.println(x);\n  x++;\n}, while (x < 2);\n\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("01", false);

    HelperFunctions.printAnimated("Correct!\n\nHow many times will the following code execute?\n\n" + HelperFunctions.ANSI_RED + "int x = 8;\n\ndo {\n  System.out.println(x);\n  x++;\n} while (x < 5);\n\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("1", false);

    HelperFunctions.printAnimated("Corrrect!\n\nThere are examples of the while and do/while loop in the " + HelperFunctions.ANSI_RED + "Loops.java" + HelperFunctions.ANSI_RESET + " file in the " + HelperFunctions.ANSI_RED + "IntermediateCourse" + HelperFunctions.ANSI_RESET + " folder.\n\nType 'ok' when you are ready to continue learning about for loops!\n\n");

    HelperFunctions.updateProgress("activityProgress.txt", "learnForLoops");
    HelperFunctions.waitForCorrectInput("ok", false);

    learnForLoops();
  }

  public static void learnForLoops()
  {
    HelperFunctions.printAnimated("Another type of loop is the for loop. The for loop is like a shortened version of the while loop. The for loop is defined as follows:\n\n" + HelperFunctions.ANSI_RED + "for (statement1; statement2; statement3) {\n  code to execute\n}\n\n" + HelperFunctions.ANSI_GREEN + "Statement 1:" + HelperFunctions.ANSI_RESET + " is executed one time (this is like the int x = 0; of the while loop).\n\n" + HelperFunctions.ANSI_GREEN + "Statement 2:" + HelperFunctions.ANSI_RESET + " the condition for the loop to run (this is like the while (condition) part of the while loop)\n\n" + HelperFunctions.ANSI_GREEN + "Statemenet 3:" + HelperFunctions.ANSI_RESET + "is executed every time after the code inside the for loop has been executed (this is like the x++ of the while loop).\n\nLets look at an example of a for loop:\n\n" + HelperFunctions.ANSI_RED + "for (int i = 0; i < 5; i++) {\n  System.out.println(i);\n}\n\nOutput: 0 1 2 3 4\n\n" + HelperFunctions.ANSI_RESET + "The above for loop works similar to a while loop. First, we define a variable i and set it to 0. Then we check if 'i < 5' which is true. Since the condition is true, we skip statement 3 and immediately run the code inside the for loop (System.out.println(i) in this case). After we have finished running the code inside the for loop, we run statement 3 (add 1 to i).\n\nDetermine the output of the following code (do not include spaces between the numbers):\n\n" + HelperFunctions.ANSI_RED + "for (i = 5; i > 0; i--) {\n  System.out.println(i);\n}\n\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("54321", false);

    HelperFunctions.printAnimated("Correct!\n\nHow many numbers will the following loop print?\n\n" + HelperFunctions.ANSI_RED + "for (i = 0; i <= 10; i++)  {\n  System.out.println(i);\n}\n\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("11", false);

    HelperFunctions.printAnimated("Correct!\n\nDetermine the output of the following code (include commas after every name but do not include spaces):\n\n" + HelperFunctions.ANSI_RED + "String[] names = {\"John\", \"Thomas\", \"Cole\", \"Ben\"};\n\nfor (int i = 0; i < names.length; i++) {\n  System.out.println(names[i]);\n}\n\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("John,Thomas,Cole,Ben", false);

    HelperFunctions.printAnimated("Correct!\n\nWhat we are doing above is called iterating through an array. When we iterate through an array, we access each element of the array one by one to perfrom some action. In the example above, we first define a string array with 4 names. In the for loop we define a variable 'i' and set it to 0. We then check if i is less than the length of the array (4). By checking if 'i' is less than the length of the array we can be sure that we always print all of the elements in the array and do not have to manually change anything if we decide to remove or add elements to the array. After we have made sure the condition is true, the code inside the for loop is going to print out the element at index 'i' in the array. This allows us to use our variable 'i' to access each element in the array and print it. After we have finished the code inside the for loop, we increase the value of 'i' by 1. This is what allows us to go through the elements of the array.\n\n Examine what the following code will print (include commas after every name but do not include spaces):\n\n" + HelperFunctions.ANSI_RED + "String[] names = {\"John\", \"Thomas\", \"Cole\", \"Ben\"};\n\nfor (int i = names.length; i > 0; i--) {\n  System.out.println(names[i-1]);\n}\n\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("Ben,Cole,Thomas,John", false);

    HelperFunctions.printAnimated("Correct!\n\nPractice defining a for loop below that uses an int 'i' to print numbers from 0-4 (although you will need to include spaces when actually defining a for loop, to avoid any input errors DO NOT INCLUDE ANY SPACES IN YOUR ANSWER):\n\n");

    HelperFunctions.waitForCorrectInput("for(inti=0;i<5;i++){System.out.println(i);}", true);

    HelperFunctions.printAnimated("Correct!\n\nBefore we learn about the next type of loop, we need to talk about nested loops. Nested loops are like nested if statements. They are loops inside of loops. For example:\n\n" + HelperFunctions.ANSI_RED + "for (int i = 0; i < 5; i++) {\n  for (int j = 0; j < 5; j++)  {\n    System.out.println(j);\n  }\n}\n\nOutput:\n01234\n01234\n01234\n01234\n01234\n\n" + HelperFunctions.ANSI_RESET + "In the nested loop above, the loop that prints 'j' (child loop) is run completely for every time the parent loop is run (the loop with int i). This means that the child loop will print out '01234' everytime the parent loop runs which in this case is 5. So there are 5 rows of '01234' that are printed.\n\nExamine what the following loop will print (do not include any spaces between the numbers):\n\n" + HelperFunctions.ANSI_RED + "for( int i = 0; i < 5; i++) {\n  for( int j = 0; j < 2; j++)  {\n    System.out.println(i);\n  }\n}\n\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("0011223344", false);

    HelperFunctions.printAnimated("Correct!\n\nThe last type of loop we will learn is the for-each loop. This is a specific type of for loop that is used to loop/iterate through an array. The for-each loop is defined as follows:\n\n" + HelperFunctions.ANSI_RED + "for (typeOfVariable variableName: arrayName) {\n  code to execute\n}\n\n" + HelperFunctions.ANSI_RESET + "The for-each loop works by creating a variable that is the same type as the array. Then we use the variable to access each element of the array and perfrom some action. For example:\n\n" + HelperFunctions.ANSI_RED + "String[] names = {\"John\", \"Thomas\", \"Cole\", \"Ben\"};\n\nfor (String name: names) {\n  System.out.println(name);\n}\n\nOutput: John Thomas Cole Ben\n\n" + HelperFunctions.ANSI_RESET + "In the code above, we first create a 'names' array. We then use a for-each loop to access each element of the array and print it out. Notice that the type of the variable in the for loop is the same as the type of the array. Also notice that we call the variable, 'name', this is not necessary and can be any name we want but it is convention to use a singular name similar to the name of the array.\n\nExamine what the following code will print (do not include spaces or commas):\n\n" + HelperFunctions.ANSI_RED + "String[] cars = {\"Volvo\", \"BMW\", \"Ford\", \"Mazda\"};\n\nfor (String i : cars)  {\n  System.out.println(i);\n}\n\n" + HelperFunctions.ANSI_RESET);

    HelperFunctions.waitForCorrectInput("VolvoBMWFordMazda", false);

    HelperFunctions.printAnimated("Correct!\n\nYou can learn more about loops in" + HelperFunctions.ANSI_GREEN + " Loops.java " + HelperFunctions.ANSI_RESET + "in the " + HelperFunctions.ANSI_GREEN + "Intermediate Course " + HelperFunctions.ANSI_RESET + "folder.\n\nComplete the " + HelperFunctions.ANSI_GREEN + "Loops Activity " + HelperFunctions.ANSI_RESET + "in the " + HelperFunctions.ANSI_GREEN + "Intermediate Challenges" + HelperFunctions.ANSI_RESET + " folder.\n\nType 'ok' when you are ready to move on to the next activity!\n\n");

    HelperFunctions.updateProgress("activityProgress.txt", "learnClassessAndObjects");
    HelperFunctions.waitForCorrectInput("ok", false);

    learnClassesAndObjects();
  }

  public static void learnClassesAndObjects()
  {
    HelperFunctions.printAnimated("Watch this video to learn about classes and objects:\n\nhttps://www.youtube.com/watch?v=IUqKuGNasdM\n\nType 'ok' when you are ready to continue!\n\n");

    HelperFunctions.waitForCorrectInput("ok", false);

    HelperFunctions.printAnimated("Go to the following link:\n\nhttps://www.codecademy.com/enrolled/courses/learn-java\n\nCreate an account and complete the 'Object-Oriented Java' topic. This will include a review of methods, make sure to complete it as it is being introduced in a new way. You will have to pay for the 2 projects at the end, DO NOT PAY FOR THEM (unless you want to).\n\n There is a cheat sheets with notes for classes and objects in the " + HelperFunctions.ANSI_GREEN + "ClassesAndObjects.txt" + HelperFunctions.ANSI_RESET + "in the " + HelperFunctions.ANSI_GREEN + "Intermediate Challenges" + HelperFunctions.ANSI_RESET + " folder.\n\nType 'ok' when you are finished and ready to continue to the challenge!\n\n");

    HelperFunctions.waitForCorrectInput("ok", false);

    HelperFunctions.printAnimated("The classes and objects challenge is available in the " + HelperFunctions.ANSI_GREEN + "ClassesAndObjects.txt" + HelperFunctions.ANSI_RESET + " in the " + HelperFunctions.ANSI_GREEN + "Intermediate Challenges" + HelperFunctions.ANSI_RESET + " folder.\n\nType 'ok' when you are ready to continue!\n\n");

    HelperFunctions.waitForCorrectInput("ok", false);

    
    
  }
  
  public static void launchIntermediateCourse() {
      HelperFunctions.clearConsole();  
      HelperFunctions.printAnimated("Welcome to the intermediate course! This course will teach you the basics of Java, such as operators, conditionals, methods, string methods, arrays, and ArrayList, loops, classes, and objects  ");
    HelperFunctions.updateProgress("activityProgress.txt", "learnOperators");
    learnOperators();
  }
  
}