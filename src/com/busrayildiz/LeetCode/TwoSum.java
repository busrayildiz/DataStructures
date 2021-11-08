package com.busrayildiz.LeetCode;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    public int[] optimalTwoSum(int[] nums, int target){
        HashMap<Integer, Integer> complementMap= new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(complementMap.containsKey(nums[i])){
                return new int[] {complementMap.get(nums[i]),i};
            }
            complementMap.put(target-nums[i],i);
        }
        return null;
    }
}
