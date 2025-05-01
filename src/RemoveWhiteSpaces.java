//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String input  = "I want to tell you th is";
        System.out.println(removeWhiteSpaces(input));

    }

    public static String removeWhiteSpaces(String input) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = i;
        while(i < input.length()-1)
        {
            if(input.charAt(i) == ' '){
                sb.append(input.substring(j,i));
                j=i+1;
                i++;
            }
            else {
                i++;
            }
        }
        sb.append(input.substring(j));
        return sb.toString();
    }

}