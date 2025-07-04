import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

public class SortStringInAlphabeticalOrder {

    public static void main(String[] args) {
        String input = "Aamir Kamaal";
        System.out.println(sortString(input));

    }

    public static String sortString(String input) {
        /*Comparator<Integer> compareAscii = (a, b) -> a > b ? 1 : -1 ;
        int[] asciiArray = input.chars().sorted().toArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < asciiArray.length; i++) {
            sb.append((char) asciiArray[i]);
        }
        System.out.println(sb);
        return sb.toString();*/
        return input.chars()
                .sorted()
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
    }

}
