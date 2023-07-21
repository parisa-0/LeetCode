package SolvedLeetCode;

        //https://leetcode.com/problems/shuffle-the-array/
        //Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
        //Return the array in the form [x1,y1,x2,y2,...,xn,yn].
        class shuffleArray {
            public int[] shuffle(int[] nums, int n) {
                int[] newNums = new int [nums.length];

                for(int i = 0; i < nums.length/2; i++){
                    newNums[i*2] = nums[i];
                }

                for(int j = nums.length/2; j < nums.length; j++){
                    newNums[(j-nums.length/2) * 2 + 1] = nums[j];
                }


                return newNums;
            }
        }