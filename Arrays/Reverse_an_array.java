/**
 * ref vide => https://www.youtube.com/watch?v=IhPh24NQNBY
 */

package Arrays;

import java.util.Arrays;

public class Reverse_an_array {
    public static void main(String args[]){
        
        int temp;
        int arr[] = {1,2,3,4,5,6};
        int i = 0, j = arr.length-1;

        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
