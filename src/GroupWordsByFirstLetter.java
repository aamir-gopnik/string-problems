import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsByFirstLetter {

    public static void main(String[] args) {
        String input = "This is true string that we are supposed to group";

        String[] inputString  = input.split(" ");
        System.out.println(Arrays.toString(inputString));

        Map<Character, List<String>> firstLetterGrp =
        Arrays.stream(inputString).collect(Collectors.groupingBy(str -> str.charAt(0)));

        firstLetterGrp.forEach((key,value) -> System.out.println(key + " -> " + value));
    }



}
