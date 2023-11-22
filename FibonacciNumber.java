class Solution {
    public int fib(int n) {

      int[] myArray = new int[30];
            myArray[0] = 0;
            myArray[1] = 1;
        for(int i = 2; i < myArray.length; i++) {
            myArray[i] = myArray[i-1] + myArray[i-2];
        }

        if(n == 0 || n == 1) {
           return myArray[n];
        }

    
        return myArray[n-1] + myArray[n-2];
    }
}
