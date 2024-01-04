class Solution {
    public boolean isPalindrome(int x) {
        
        List<Integer> myList = new LinkedList<>();

        if(x < 0) {
            return false;
        }
       
        while (x > 0) { 
            int r = x%10;
            myList.add(r);
            x = x/10;
        }

        for(int i = 0; i < myList.size()/2; i++) {
            if(myList.get(i) != myList.get(myList.size()-1-i)) {
                return false;
            }
        }
        return true;
    }
}
