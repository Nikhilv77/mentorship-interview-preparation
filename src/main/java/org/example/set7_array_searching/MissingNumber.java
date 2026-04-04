package org.example.set7_array_searching;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int rangeSum =  nums.length * (nums.length + 1) / 2;

        int actualSum = 0;
        for(int val : nums){
            actualSum += val;
        }
        return rangeSum - actualSum;
    }
}
