import java.util.*;

public class WordPattern {
    public static void main(String[] args) {
        String strs[] = {"eat","tea","tan","ate","nat","bat"};

        Map<String, List<String>> myMap = new HashMap<>();
        for(int i = 0; i < strs.length; i++) {
            char[] strsToCharArray = strs[i].toCharArray();
            Arrays.sort(strsToCharArray);
            String strsToChar = new String(strsToCharArray);

           if(!myMap.containsKey(strsToChar)) {
               myMap.put(strsToChar, new ArrayList<>());
            }
               myMap.get(strsToChar).add(strsToChar);
        }
        System.out.println(new ArrayList<>(myMap.values()));
    }
}
