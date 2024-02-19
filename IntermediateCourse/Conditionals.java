public class Conditionals {
    public static void main(String[] args) {

      int age = 10; 

      //'if' statement (checks conditon and executes code if true)
      if (age > 5)
      {
        System.out.println("age is greater than 5");

      }

      //'if else' staement (checks conditon and executes code if true, if not executes else statement)
      if (age > 5)
      {
        System.out.println("age is greater than 5");

      }else 
      {
        System.out.println("age is not greater than 5");
      }

      //'else if' statement (checks conditon and executes code if true, if not checks next condition, if not executes else statement)
      if (age > 5)
      {
        System.out.println("age is greater than 5");

      }else if ( age == 10)
      {
        System.out.println("age is equal to 10");
      }else
      {
        System.out.println("age is not greater than 5");
      }

      /*'nested if' staement 
      checks first condition*/
      if (age > 5)
      {
        //if the condition above is true, executes code inside that if statement which checks condition below
        if(age > 10)
        {
          System.out.println("age is greater than 10");
        }else
        {
          System.out.println("age is not greater than 10");
        }
      }else //executed if the first condition is not met (first conditon is age > 5)
      {
        System.out.println("age is not greater than 5");
      }
      
    }
}