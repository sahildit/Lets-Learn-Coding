/**
 * Ref videp => https://www.youtube.com/watch?v=0CpFbQUJ0xE
 * this is a sorting method.
 */

package Strings;

import java.util.Scanner;

public class Check_2_strings_are_anagrams_orNot {
        public static void main(String[] args){

            Scanner in = new Scanner(System.in);

            System.out.println("Enter 2 strings: ....");

            String str1 = in.nextLine();
            String str2 = in.nextLine();

            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            String Sortedstr1 = new String(arr1);
            String Sortedstr2 = new String(arr2);

            if(Sortedstr1.equals(Sortedstr2)){
                System.out.println("This is anagram");
            } else{
                System.out.print("This is not anagram!!!!");
            }
            
        }
}
