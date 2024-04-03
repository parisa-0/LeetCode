class Solution {
    public boolean isUgly(int n) {

       //divide by these numbers
       //if you're left with 1 it's true otherwise false
       int temp = n;
       for(int i = 0; i <= Math.sqrt(temp); i++) {
        if(n%2 == 0) {
            n = n/2;
        }
        else if(n%3 == 0) {
            n = n/3;
        }
        else if(n%5 == 0) {
            n = n/5;
        }
       }

       System.out.println(n);
       if(n == 1) {
        return true;
       } 
        return false;
    }
}
