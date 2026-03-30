package org.example.set1_arrays;
import java.util.*;

class TwoSum {
    class Pair implements Comparable<Pair>{
        int value;
        int index;
        Pair(int value, int index){
            this.value = value;
            this.index = index;
        }
        public int compareTo(Pair other){
            return this.value - other.value;
        }
    }
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Pair[] pair = new Pair[nums.length];
        for(int i = 0;i<nums.length; i++){
            pair[i] = new Pair(nums[i],i);
        }
        Arrays.sort(pair);
        int leftIndex = 0;
        int rightIndex = pair.length - 1;
        while(leftIndex < rightIndex){
            if(pair[leftIndex].value + pair[rightIndex].value < target){
                leftIndex++;
            }else if(pair[leftIndex].value + pair[rightIndex].value > target){
                rightIndex--;
            }else{
                result[0] = pair[leftIndex].index;
                result[1] = pair[rightIndex].index;
                break;
            }
        }
        return result;
    }
}