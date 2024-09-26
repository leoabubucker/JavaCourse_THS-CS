public class Loops {

    public static void main(String[] args) {
        
        // while loop
        //do something while a condition is true
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        //output: 0 1 2 3 4

        // do-while loop
        //do something and then check if the codition is true (code is run atleast once even if the condiiton isnt met)
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 5);
         //output: 0 1 2 3 4
    
        // for loop
        //shorter way to write a while loop 
        for (int k = 0; k < 5; k++) {
            System.out.println(k);
        }
         //output: 0 1 2 3 4
    
        // for-each loop
        //used to iterate through elements in an array
        String[] fruits = {"apple", "banana", "orange"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
         //output: apple banana orange
    }
}