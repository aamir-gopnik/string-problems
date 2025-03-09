//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ReverseWordsOfString {
    //Given: All Apples are Red
    //Result: Red are Apples All

    public static void main(String[] args) {
        String s = "All Apples are Red";
        System.out.println("Hello and welcome!");
        System.out.println(reverseWordsInString(s));
    }

    public static String reverseWordsInString(String inputString)
    {
        //char[] arr = inputString.toCharArray();
        StringBuilder b = new StringBuilder();
        int l = inputString.length()-1;
        int j = l;
        for(int i = l; i >= 0 ; i--)
        {

            if(inputString.charAt(i) == ' ')
            {
                b.append(getSubString(inputString,i+1,j+1));
                b.append(" ");
                j = i-1;
            }
        }
        b.append(getSubString(inputString,0,j+1));
        return b.toString();
    }

    public static String getSubString(String s, int start, int end) {
        return s.substring(start,end);
    }
}
