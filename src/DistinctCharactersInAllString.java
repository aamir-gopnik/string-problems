import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistinctCharactersInAllString {

    public static void main(String[] args) {

        String[] arr = {"aamir", "Shivanshu", "gaurav"};
        String[] arr2 = new String[10];

        findDistinctCharacters(arr2).forEach(System.out::println);

    }

    public static List<String> findDistinctCharacters(String[] array) {

        if(array != null || array.length <= 0) {
            throw new IllegalArgumentException("Invalid or empty input array");
        }

        return Stream.of(array).map(DistinctCharactersInAllString::removeDuplicate)
                .collect(Collectors.toList());

    }

    public static String removeDuplicate(String input) {
        int size = input.length();
        Set<Character> charSet = new LinkedHashSet<>();
        for(int i = 0; i < size; i++) {
            charSet.add(input.charAt(i));
        }

        return charSet.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
