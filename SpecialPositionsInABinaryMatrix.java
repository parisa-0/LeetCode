class Solution {
    public int numSpecial(int[][] mat) {
       
        Map<Integer,Integer> myMapRow = new HashMap<>();
        Map<Integer,Integer> myMapColumn = new HashMap<>();
        Map<Integer,Integer> myMapStoreValues = new HashMap<>();

        for(int i = 0; i < mat.length;i++) {
            for(int j = 0; j < mat[i].length;j++) {
             if(mat[i][j] == 1) {
                  myMapRow.put(i, myMapRow.getOrDefault(i, 0)+1);
                  myMapColumn.put(j, myMapColumn.getOrDefault(j, 0)+1);
                 myMapStoreValues.put(i,j);
               }

            }
        }

        myMapRow.entrySet()
                .removeIf(
                        entry -> (entry.getValue()) > 1);

        myMapColumn.entrySet()
                .removeIf(
                        entry -> (entry.getValue()) > 1);
        

        int count = 0;
        for (Map.Entry<Integer, Integer> entry : myMapStoreValues.entrySet()) {
            if(myMapRow.containsKey(entry.getKey()) && myMapColumn.containsKey(entry.getValue())) {
                count++;
            }

        }
        
       return count;
    }
}
