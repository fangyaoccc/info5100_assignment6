import java.util.ArrayList;
import java.util.Arrays;

public class assignment {
    public static void main(String[] args) {
        String word = "Oakland";
        int length = word.length();
        System.out.println("Length of the string: " + length);
        char charAtIndex2 = word.charAt(2);
        System.out.println("Character at index 2: " + charAtIndex2);
        String substring = word.substring(word.indexOf("land"));
        System.out.println("Extracted substring: " + substring);
        String upperCaseStr = word.toUpperCase();
        System.out.println("String in uppercase: " + upperCaseStr);
    
        int[] abc = {1, 3, 5, 2, 5};
        int length1 = abc.length;
        System.out.println("Length of the array: " + length1);
        int last = abc[length1 - 1];
        System.out.println("Last member of the array: " + last);
        
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Austin", "Houston", "Oakland", "Paris", "San Francisco", "Seattle"));
        cities.remove("Paris");
        System.out.println("ArrayList after removing Paris: " + cities);
    
    }
}
