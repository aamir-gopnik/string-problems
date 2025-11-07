public class ConcatenateFirstLetter {

    public static void main(String[] args) {

        String input = "This is example string";
        System.out.println(concatenate(input));
        System.out.println(concatenate(""));
        System.out.println(concatenate(null));

    }

    public static String concatenate(String input) {
        if(input == null || input.isEmpty()){
            return "Empty String provided";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(input.charAt(0));
        for(int i = 1; i < input.length(); i++) {
            if(input.charAt(i) == ' '){
                sb.append(input.charAt(i+1));
            }
        }
        return sb.toString();
    }
}
