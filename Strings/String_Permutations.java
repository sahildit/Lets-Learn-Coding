// ref video => https://www.youtube.com/watch?v=S8QqfQ_7qfw

package Strings;
import java.util.*;

public class String_Permutations {
    
    public static void main(String[] args){
        String s = "ABC";
        permute(0,s);
    }

public static String swap(String s, int a, int b){

    char[] ch = s.toCharArray();
    char p = ch[a];
    ch[a] = ch[b];
    ch[b] = p;

    return String.valueOf(ch);
}

    private static void permute(int index, String s) {

        // base model
        if(index == s.length()-1){
            System.out.println(s);
            return;
        }

        // logic
        for(int i = 0; i < s.length(); i++){
            // swap
            s = swap(s,i,index);

            // recursion
            permute(index + 1, s);

            s = swap(s,i,index);
        }
    }

}
