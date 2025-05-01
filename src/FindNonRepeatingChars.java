import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class FindNonRepeatingChars {

    public static void main(String[] args) {
        String input  = "aamir kamaal";

        System.out.println("repeating chars -> " + findRepeatingCharacters(input));
        System.out.println("Non - repeating chars -> " + findNonRepeatingCharacters(input));

    }

    public static Iterator<Map.Entry<Character,Integer>> findCountOfCharacters(String input) {
        Map<Character, Integer> countMap = new HashMap<>();
        for(int i = 0; i < input.length()-1; i++) {
            if(countMap.containsKey(input.charAt(i))) {
                countMap.put(input.charAt(i),countMap.get(input.charAt(i))+1);
            }
            else {
                countMap.put(input.charAt(i),1);
            }
        }
        return countMap.entrySet().iterator();
    }

    public static List<Character> findRepeatingCharacters(String input) {
        List<Character> result = new ArrayList<>(input.length());
        Iterator<Map.Entry<Character,Integer>> i  = findCountOfCharacters(input);
        int j = 0;
        while(i.hasNext()) {
            Map.Entry<Character,Integer> entry = i.next();
            if(entry.getValue() > 1) {
                result.add(entry.getKey());
                j++;
            }
        }
        return result;
    }

    public static List<Character> findNonRepeatingCharacters(String input) {
        List<Character> result = new ArrayList<>(input.length());
        Iterator<Map.Entry<Character,Integer>> i  = findCountOfCharacters(input);
        int j = 0;
        while(i.hasNext()) {
            Map.Entry<Character,Integer> entry = i.next();
            if(entry.getValue() == 1) {
                result.add(entry.getKey());
                j++;
            }
        }
        return result;

    }

}
