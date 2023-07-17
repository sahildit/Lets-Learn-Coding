/** 
* Its via recursion.
 * Ref vide0 => https://www.youtube.com/watch?v=eFXcYym2ymo
 */


package Strings;

public class Reverse_string {

    private static String reverse(String str){

        if(str == null || str.length() <=1){
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
        
    }
    
    public static void main(String[] args){

        String str = "object";
        String revStr = reverse(str);   

        System.out.print(revStr);
    }
}
