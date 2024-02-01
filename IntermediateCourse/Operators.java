public class Operators {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int result;
        
        // Arithmetic operators
        // changing the value of result using 'a' and 'b'
        result = a + b; // 5 + 3 
        result = a - b; // 5 - 3
        result = a * b; // 5 * 3
        result = a / b; // 5 / 3
        result = a % b; // returns remainder of 5/3 
        
        // Relational operators
        //comparing the values of 'a' and 'b'
        boolean isEqual = (a == b); // returns false, 5 is not equal to 3
        boolean isNotEqual = (a != b); // returns true, 5 is not equal to 3
        boolean isGreater = (a > b); // returns true, 5 is greater than 3
        boolean isLesser = (a < b); // returns false, 5 is not less than 3
        boolean isGreaterOrEqual = (a >= b); // returns true, 5 is greater than or equal to 3
        boolean isLesserOrEqual = (a <= b); // returns false, 5 is not less than or equal to 3
        
        // Logical operators
        boolean andOperator = (a > 0 && b > 0); // returns true as both values are greater than 0 (would return false if one of the values was less than 0)
        boolean orOperator = (a > 0 || b > 0); // returns true as one of the values is greater than 0 (would still return true if one of the values was less than 0)
        boolean notOperator = !(a > 0); // returns false, 'a' is greater than 0 so the '!' operator inverts the value to false
        
        // Assignment operators
        result += a; // add 'a' to 'result'
        result -= a; // subtract 'a' from 'result'
        result *= a; // multiply 'a' with 'result'
        result /= a; // divide 'result' by 'a' (if 'result'= 10 and 'a' = 5, 10/5 = 2)
        result %= a; // return remainder of 'result' divided by 'a' (if 'result'= 10 and 'a' = 3, 1 is returned as it is the remainder)
    }
}