public class Methods
{
  //running this file would give us outputs of: 
  //1. 'You are old!'
  //2. 'The sum of the 2 numbers is 15'
  //3. '600'
  
  //define variable with 'static' to use it inside of our methods (note: this variable is defined outside of the main method)
  static int age = 30;
  
  //'main' method (must be defined like this or you will get errors)
  public static void main(String[] args)
  {
    //call the method without parameters
    useLogic();

    //call the method with parameters 
    addInt(5, 10);


    //we can still use the 'main' method to code like we used to do. For ex. this code defines 'money', adds 500 to it and prints it 
    int money = 100; 
    money += 500;
    System.out.println(money);
  }

  //define a method without parameters
  public static void useLogic()
  {
    if(age > 25)
    {
      System.out.println("You are old!");
    }else {
      System.out.println("You are young!");
    }
  }

  //define a method with parameters
  public static void addInt(int num1, int num2)
  {
      System.out.println("The sum of the 2 numbers is " + (num1 + num2));
  }
  
}