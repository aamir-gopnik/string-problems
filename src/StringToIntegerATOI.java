public class StringToIntegerATOI {

    /**
     * atoi() function converts a numeric string to integer.
     * atoi - ascii to integer abbreviation
     */

    public static void main(String[] args) {
        String data = "-53";
        Integer converted = stringToInteger(data);
        System.out.println("corresponding integer value is -> " + converted);
        System.out.println("value of 2 is " + (int) '2');
        System.out.println("value of 0 is " + (int) '0');
        System.out.println("My check for converson -> " + ('2' - '0'));

    }

    public static int stringToInteger(String input) {
        if(input == null || input.isEmpty())
        {
            return 0;
        }
        //Adding check for signed integer
        int sign = 1;
        int i = 0;
        char signChar = input.charAt(i);
        if(signChar == '-' || signChar == '+') {
            sign = signChar == '-' ? -1 : 1;
            i++;
        }
        int result = 0;
        for(int j = i;j < input.length(); j++) {
            char ch = input.charAt(j);
            if(ch < '0' || ch > '9')
            {
                return 0;
            }
            int digit = ch - '0';
            result = result * 10 + digit;
        }
        return result * sign;
    }
}
