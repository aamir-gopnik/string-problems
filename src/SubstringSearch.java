public class SubstringSearch {

    public static void main(String[] args) {
        String toSearch = "at";
        String source = "You dont know this at all";
        System.out.println("Search string found in source -> " + bruteForceSearch(toSearch,source));



    }

    public static boolean bruteForceSearch(String needle,String hayStack) {
        if(needle.isEmpty())
            return false;
        int needleLength = needle.length();
        int haystackLength = hayStack.length();
        int counter = 0;
        for(int i = 0; i < haystackLength-needleLength; i++) {
            int j;
            for(j = 0; j < needleLength; j++) {
                if(needle.charAt(j) != hayStack.charAt(i+j)) {
                    counter++;
                    break;
                }
            }
            if(j == needleLength)
            {
                return true;
            }
        }
        return false;
    }
}
