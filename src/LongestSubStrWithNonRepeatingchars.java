import java.util.*;

public class LongestSubStrWithNonRepeatingchars {

    public static void main(String[] args) {
        String[] inputs = new String[]{"abcdabcbb","abbac","abcabcbb","dvdf"};
        String[] output = new String[]{"abcd","bac","abc","vdf"} ;
        int[] outputLength = new int[]{4,3,3,3};
        int indx = 0;
        for(String s : inputs){
            int length = longestSubStrLength(s);
            if(outputLength[indx] == length) {
                System.out.println("Test case passed -> " + inputs[indx] + " -> " + length);
            }
            else {
                System.out.println("Test case failed -> " + inputs[indx] + " -> " + length);
            }
            indx++;
        }
    }

    //Solving using sliding window technique
    public static int longestSubStrLength(String input) {
        if(input.isEmpty())
            return 0;
        int lsLength = 0;
        int start = 0;
        int end = 0;
        Set<Character> charSet = new LinkedHashSet<>();
        while(end < input.length()) {
            char ch = input.charAt(end);
            if(!charSet.contains(ch)) {
                charSet.add(ch);
                lsLength = Math.max(lsLength,charSet.size());
                end++;
                //System.out.println("state when no repeating char -> " + charSet);
            } else {
                charSet.remove(input.charAt(start));
                start++;
                //System.out.println("state when rep char -> " + charSet);
            }
        }
        return lsLength;
    }


}
