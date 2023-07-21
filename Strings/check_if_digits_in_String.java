/**
 * ref video -> https://www.youtube.com/watch?v=8dhQsh16ed0
 */

public class Check_if_digits_in_String {
    
    public static void main(String[] args){
        String str = "this is my 1 test based on assumptions 123";
        System.out.println(ContainsDigits(str));
    }

    public static Boolean ContainsDigits(String input){

        // boolean is used so that it will return either true (if any digits) and false(if no digits in string)

        // here ".*\\d+.*" is a rejects patter which is used to find any digit in string -> its just a formula

        // input.matches is used simply to check if our string that we are checking matches the rules defined in for rejects and in this case it finds if there's any digit present or not.
        return input.matches(".*\\d+.*");
    }
}
