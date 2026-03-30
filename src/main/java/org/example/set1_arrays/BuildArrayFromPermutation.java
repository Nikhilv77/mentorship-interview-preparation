package org.example.set1_arrays;

class BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int answerIndex = nums[i];
            result[i] = nums[answerIndex];
        }
        return result;
    }
}