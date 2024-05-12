class Solution {
    String result = "";

    String forwardMotion(Map<Character, Integer> myMap) {
        for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
            if (myMap.containsKey(alphabet) && myMap.get(alphabet) - 1 > 0) {
                result = result + alphabet;
                myMap.put(alphabet, myMap.get(alphabet) - 1);
            } else if (myMap.containsKey(alphabet) && myMap.get(alphabet) - 1 <= 0) {
                result = result + alphabet;
                myMap.remove(alphabet);
            }
        }
        return result;
    }

    String backwardMotion(Map<Character, Integer> myMap) {
        for (char alphabet = 'z'; alphabet >= 'a'; alphabet--) {
            if (myMap.containsKey(alphabet) && myMap.get(alphabet) - 1 > 0) {
                result = result + alphabet;
                myMap.put(alphabet, myMap.get(alphabet) - 1);
            } else if (myMap.containsKey(alphabet) && myMap.get(alphabet) - 1 <= 0) {
                result = result + alphabet;
                myMap.remove(alphabet);
            }
        }
        return result;
    }
    public String sortString(String s) {

        Map<Character, Integer> myMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            myMap.put(s.charAt(i), myMap.getOrDefault(s.charAt(i), 0) + 1);
        }


        while(!myMap.isEmpty()) {
            forwardMotion(myMap);
            backwardMotion(myMap);
        }
        return result;
    }
}
