class Solution {
    public String removeDuplicates(String s) {

        List<Character> myList = new ArrayList<>();
        myList.add(s.charAt(0));
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == myList.get(myList.size() - 1)) {
                myList.remove(myList.size() - 1);
                if(myList.isEmpty()) {
                    myList.add(' ');
                }
            }
            else if(s.charAt(i) != myList.get(myList.size() - 1)) {
                myList.add(s.charAt(i));
            }
        }
      
        final var result = new StringBuilder();
        myList.forEach(val -> {
        result.append(val);
    });
        return result.toString().trim();
    }
}
