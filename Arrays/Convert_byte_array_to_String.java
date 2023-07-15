/**
 * ref video = https://www.youtube.com/watch?v=_earCrJ5eI4 
 */

package Arrays;

public class Convert_byte_array_to_String {
    
    public static void main(String[] args){

        String JavaText = "this is my first test";

        byte[] bytes = JavaText.getBytes();

        String newString = new String(bytes);

        System.out.println(newString);
    }
}
