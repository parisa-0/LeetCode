class Solution {
    public int longestConsecutive(int[] nums) {
       TreeSet<Integer> orderedNums = new TreeSet<>();

        for (int num : nums) {
            orderedNums.add(num);
        }
        List<Integer> listOrderedNums = new ArrayList<>();
        listOrderedNums.addAll(orderedNums);
        if(listOrderedNums.size() == 1) {
            return 1;
        }
        else if(listOrderedNums.isEmpty()) {
            return 0;
        }
        

        Set<Integer> mySet = new HashSet<>();
        List<Integer> listMySet = new ArrayList<>();
        System.out.println(listOrderedNums);

        for (int i = 0; i < listOrderedNums.size() -1; i++) {         
            if(listOrderedNums.get(i) + 1 == listOrderedNums.get(i+1)){     
                mySet.add(listOrderedNums.get(i));
                 mySet.add(listOrderedNums.get(i+1));                  
            }
            else if(listOrderedNums.get(i) + 1 != listOrderedNums.get(i+1)) {   
                if(mySet.size() > listMySet.size()) {
                     listMySet.clear();
                     listMySet.addAll(mySet);
                }                
                mySet.clear();
            }
        }

          if(mySet.size() >= listMySet.size() && !mySet.isEmpty()) {
            return mySet.size();
          }
          else if(mySet.size() < listMySet.size()){
           return listMySet.size();
          }
          return 1;
    }
}
