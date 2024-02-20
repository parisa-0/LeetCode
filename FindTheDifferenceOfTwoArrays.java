class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
     List<List<Integer>> myList = new ArrayList<>();
     List<Integer> answer0 = new ArrayList<>();
     List<Integer> answer1 = new ArrayList<>();
     Set<Integer> set0 = new HashSet<>();
     Set<Integer> set1 = new HashSet<>();

     for(int i = 0; i < nums1.length; i++) {
         set0.add(nums1[i]);
     }

for(int k = 0; k < nums2.length; k++) {
     set1.add(nums2[k]);
}
    for(int j = 0; j < nums2.length; j++) {
        if(set0.contains(nums2[j])) {
            set0.remove(nums2[j]);
        }
    }

       for(int l = 0; l < nums1.length; l++) {  
        if(set1.contains(nums1[l])) {
            set1.remove(nums1[l]);
        }
     }

    for(int a : set0) {
        answer0.add(a);
    }

     for(int b : set1) {
        answer1.add(b);
    }

     myList.add(answer0);
     myList.add(answer1);
     return myList;
}
}
