import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.*;
import java.util.stream.Stream;

public class LexicographicallyOrdering {

    public static void main(String[] args) {
        String input = "welcometojava";
        int k = 3;
        System.out.println(getSmallestAndLargest(input, k));
        System.out.println("value of a - A is " + ('a' - 'A'));
        System.out.println("value of b - B is " + ('b' - 'B'));

    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);

        for(int i=0; i <= s.length()-k; i++) {
            String word = s.substring(i,i+k);
            largest = word.compareTo(largest) > 0 ? word : largest;
            smallest = word.compareTo(smallest) < 0 ? word : smallest;
        }
        return smallest + "\n" + largest;
    }
}
