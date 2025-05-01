public class CreateShortestPalindrome {

    public static void main(String[] args) {
        String str = "aabcd";
        String output = "dcbaabcd";

        String str2 = "adam";
        String output2 = "madam";

        String str3 = "ab";
        String output3 = "bab";

        String result = makeShortestPalindrome(str2);
        System.out.println("Shortest palindrome by prepending: " + result);
    }

    /**
     * Approach for this problem :
     * We will check palindromic substring from the given string while iterating
     * from 0 to N-1, N-2, N-3 ... till 1.
     * If any substring found as palindromic, we will chop the suffix from N-i to N.
     * Then we will reverse that suffix and add to the start of Given String.
     * if No substring is found palindromic then reverse entire string from 1 to N
     * and append at the start of string.
     * REASON to start from first index -> single character is always palindromic.
     */
    public static String makeShortestPalindrome(String input) {
        if (input == null || input.length() <= 1) {
            return input;
        }
        for (int i = input.length(); i > 0; i--) {
            System.out.println("For substring -> " + input.substring(0, i)
                    + " | isPalindrome : " + isPalindrome(input.substring(0, i)));
            if (isPalindrome(input.substring(0, i))) {
                String suffix = input.substring(i);
                StringBuilder reversedSuffix = new StringBuilder(suffix).reverse();
                return reversedSuffix + input;
            }
        }

        // No palindromic prefix found; reverse everything except first character
        return new StringBuilder(input.substring(1)).reverse() + input;
    }

    private static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
