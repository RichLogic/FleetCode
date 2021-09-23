package com.richlogic.fleetcode.sort;

/**
 * <h3>fleetcode</h3>
 * <h4>com.richlogic.fleetcode.sort</h4>
 * <p></p>
 *
 * @author : richlogic
 * @since : 2021/09/14
 */
public class Quick {

    public void sort(int[] nums) {
        this.nums = nums;
        recursion(0, nums.length - 1);
    }

    int[] nums;
    private void recursion(int start, int end) {
        if (start >= end) {
            return;
        }
        int pivot = this.partition(start, end);
        recursion(start, pivot - 1);
        recursion(pivot + 1, end);
    }

    private int partition(int start, int end) {
        int i = start;
        int j = start;
        int target = nums[end];

        while (j <= end) {
            if (nums[j] < target) {
                SortUtil.swap(nums, i, j);
                i ++;
            }
            j ++;
        }
        SortUtil.swap(nums, i, end);
        return i;
    }


}
