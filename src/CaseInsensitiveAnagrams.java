public class CaseInsensitiveAnagrams {

    public static void main(String[] args) {
        String a = "anagramm";
        String b = "marganaa";
        System.out.println("Range of a to z is " + ((int)'a') + " -> " + ((int)'z'));
        System.out.println("Range of A to Z is " + ((int)'A') + " -> " + ((int)'Z'));
        System.out.println(isAnagram(a,b));
    }

    public static boolean isAnagram(String a, String b) {
        int[] arr = new int[52];
        if(a.length() != b.length())
        {
            return false;
        }
        for(int i = 0; i<a.length(); i++) {
            int checkIndexA = a.charAt(i) - 'A';
            int indexA =  checkIndexA > 25 ? checkIndexA-32 : checkIndexA;
            System.out.println("index for a string for char " + a.charAt(i) + " -> " + indexA);
            arr[indexA] = arr[indexA] + 1;

            int checkIndexB = b.charAt(i) - 'A';
            int indexB = checkIndexB > 25 ? checkIndexB-32 : checkIndexB;
            System.out.println("index for b string for char " + b.charAt(i) + " -> " + indexB);
            arr[indexB] = arr[indexB] - 1;
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0)
            {
                return false;
            }
        }
        return true;
    }
}
