import java.util.*;

public class Test {

    public static void main(String[] args) {

        int alphaArr[] = new int[256];
        //Given string
        String s = "aAamir@@@";
        String as = "w@@rimaAa";
        System.out.println("is anagram -> " + checkAnagram(s,as));
        Integer i = 3;
        System.out.println(Integer.toBinaryString(i));

    }

    public static boolean checkAnagram(String s, String as) {
        if(s.length() != as.length())
            return false;
        int temp[] = new int[256];

        for(int i = 0;i<s.length();i++) {
            temp[s.charAt(i)]++;
            temp[as.charAt(i)]--;
        }
        for(int i = 0; i< temp.length;i++)
        {
            if(temp[i] != 0) {
                System.out.println(temp[i] + " " + i);
                System.out.println(Arrays.toString(temp));
                return false;
            }

        }

        return true;
    }
}

