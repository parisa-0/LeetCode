class Solution {
    public boolean wordPattern(String pattern, String s) {
       //a represents dog and b represents cat
       //split array put in hashmap
       //a dog b cat b is car if it doesn't contain that value then return false

        String[] words = s.split(" ");
        Map<Character,String> myMap = new HashMap<>();
        int length;

        if(words.length != pattern.length()) {
            return false;
        }

        if(words.length < pattern.length()) {
            length = words.length;
        }
        else {
            length = pattern.length();
        }

        for(int i = 0; i < length; i++) {
            if(myMap.containsKey(pattern.charAt(i)) 
            && !(myMap.get(pattern.charAt(i))).equals(words[i])) {
                return false;
            }
           else if(!myMap.containsKey(pattern.charAt(i))) {
            myMap.put(pattern.charAt(i), words[i]);
            }       
        }     

       Set<String> mySet = new HashSet<String>(myMap.values());
       return mySet.size() == myMap.size();
    }
}
