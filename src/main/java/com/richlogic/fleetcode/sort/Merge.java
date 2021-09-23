package com.richlogic.fleetcode.sort;

/**
 * <h3>FleetCode</h3>
 * <h4>com.richlogic.fleetcode.sort</h4>
 * <p></p>
 *
 * @author : richlogic
 * @since : 2021/09/16
 */
public class Merge {

    public void sort(int[] nums) {
        this.nums = nums;
        recursion(0, nums.length - 1);
    }

    int[] nums;
    private void recursion(int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start - end) / 2 + end;
        recursion(start, mid - 1);
        recursion(mid, end);
        this.merge(start, mid, end);
    }

    private void merge(int start, int mid, int end) {
        int i = start;
        int j = mid;

        while (i <= mid && j <= end) {
            if (nums[i] > nums[j]) {
                SortUtil.swap(nums, i, j);
                i ++;
            } else {
                j ++;
            }
        }

    }

}
