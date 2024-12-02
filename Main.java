package com.robert;

public class Main {
    public static void main(String[] args) {

    }

    public int pivotIndex(int[] nums) {

        for(int i = 1; i < nums.length; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
        if(nums[0]- nums[nums.length-1] == 0){
            return 0;
        }

        for(int i = 1; i < nums.length-1; i++){
            if(nums[nums.length-1] - nums[i] == nums[i-1]){
                return i;
            }
        }
        if(nums[nums.length-2] == 0 ){
            return nums.length;
        }

        return -1;
    }

}