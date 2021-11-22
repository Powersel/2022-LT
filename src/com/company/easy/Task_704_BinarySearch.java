package com.company.easy;

public class Task_704_BinarySearch {
    public static int search(int[] nums, int target) {
        return binnarySearch(nums, target, 0, nums.length - 1);
    }

    private static int binnarySearch(int[] nums, int target, int left, int right) {
        int arrayLength = nums.length;
        if (left > arrayLength || left > right) {
            return -1;
        }
        int rRight = (right - left) / 2;
        int center = left + rRight;
        int value = nums[center] ;

        if (value == target) {
            return center;
        } else if (value > target) {
            return binnarySearch(nums, target, left, center - 1);
        }

        return binnarySearch(nums, target, center + 1, right);
    }

}
