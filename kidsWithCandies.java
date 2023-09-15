class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
          List<Boolean> candiesBoolean = new ArrayList<Boolean>();

        int max = Arrays.stream(candies)
                  .max()
                  .getAsInt();

        for(int i = 0; i < candies.length; i++) {
           if(candies[i] + extraCandies >= max) {
                candiesBoolean.add(true);
            }
            else {
               candiesBoolean.add(false);
           }
        }
        return candiesBoolean;
    }
}
