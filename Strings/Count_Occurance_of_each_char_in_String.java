/**
 * ref video =-> https://www.youtube.com/watch?v=jb3gzPa7A9g
 */

package Strings;

import java.util.HashMap;
import java.util.Map;

public class Count_Occurance_of_each_char_in_String {
    
    public static void main(String[] args){
        
        String str = "Programming";
        Map<Character,Integer> charMapCount = new HashMap<>();

        for(Character c : str.toCharArray()){

            if(charMapCount.containsKey(c)){
                charMapCount.put(c,charMapCount.get(c) + 1);
            } else {
                charMapCount.put(c, 1);
            }
            
        }
        System.out.println(charMapCount);
    }
}
