public class LongestPalindromicSubstring {

    //Problem: Find the longest substring which is a palindrome.

    public static void main(String[] args) {
        String inputString = "asdfgefe";
        System.out.println(longestPalindromic(inputString));
    }

    public static String longestPalindromic(String input) {
        if (input == null && input.isEmpty()) {
            return "Invalid input";
        }

        StringBuilder longestPalindrome = new StringBuilder();

        int i = 0;
        int j = 1;
        System.out.println("current substring " + input.substring(i,j+1));
        while(j < input.length()){
            String currentSubString = input.substring(i,j+1);
            if(checkPalindrome(currentSubString)) {
                longestPalindrome.append(currentSubString);
                j++;
            }
            else {
                j++;
                i = j;
            }
        }
        return longestPalindrome.toString();
    }

    public static boolean checkPalindrome(String input) {
        int i = 0;
        int j = input.length()-1;
        while(i < j) {
            if(input.charAt(i) == input.charAt(j)){
                i++;
                j--;
            }
            else {
                return false;
            }
        }
        if(i == j) {
            return true;
        }
        return false;
    }
}
