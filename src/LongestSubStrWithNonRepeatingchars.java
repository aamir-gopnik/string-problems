import java.util.*;
import java.util.stream.Collectors;

public class LongestSubStrWithNonRepeatingchars {

    public static void main(String[] args) {
        String input = "abbac";
        String output = "bac";

        String input2 = "abcabcbb";
        String output2 = "abc";

        String input3 = "dvdf";
        String output3 = "vdf";

        System.out.println(longestSubStrLength(input));
    }

    //Solving using sliding window technique
    public static int longestSubStrLength(String input) {
        if(input.isEmpty())
            return 0;
        int lsLength = 0;
        String longestSubStr = "";
        int start = 0;
        int end = 0;
        Set<Character> charSet = new LinkedHashSet<>();
        while(end < input.length()) {
            char ch = input.charAt(end);
            if(!charSet.contains(ch)) {
                charSet.add(ch);
                lsLength = Math.max(lsLength, charSet.size());
                end++;
            } else {
                charSet.remove(Character.valueOf(input.charAt(start)));
                start++;
            }
        }
        System.out.println(charSet);
        return lsLength;
    }
}
