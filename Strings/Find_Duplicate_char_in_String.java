/**
 * ref video => https://www.youtube.com/watch?v=mJyi6GhOlO0
 * 
 */

package Strings;

public class Find_Duplicate_char_in_String{

    public static void main(String[] args){

        String str = "testingofstr";

        char[] ch = str.toCharArray();

        for(int i = 0; i< str.length();i++){
            for(int j = i+1; j<str.length();j++){

                if(ch[i] == ch[j]){
                    System.out.println(ch[j]);
                    break;
                }
            }
        }
    }
    
}