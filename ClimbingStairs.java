class Solution {
    public int climbStairs(int n) {
        /*
        recursive

        If theres one step in staircase then one way to climb it
        If theres zero step in staircase then no way to climb it

    if(n == 0) {
        return 0;
    }

    if(n == 1) {
        return 1;
    }

    if(n== 2) {
        return 2;
    }
    
   System.out.println("n = " + n);
  return climbStairs(n - 1) + climbStairs(n - 2);
   */

   //iterative approach

    int[] myArray = new int[45];
            myArray[0] = 0;
            myArray[1] = 1;
            myArray[2] = 2;
        for(int i = 3; i < myArray.length; i++) {
            myArray[i] = myArray[i-1] + myArray[i-2];
        }


        if(n == 0 || n == 1 || n == 2) {
           return myArray[n];
        }

    
        return myArray[n-1] + myArray[n-2];
    }
}
