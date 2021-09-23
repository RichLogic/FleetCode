package com.richlogic.fleetcode.sort;

/**
 * <h3>FleetCode</h3>
 * <h4>com.richlogic.fleetcode.sort</h4>
 * <p></p>
 *
 * @author : richlogic
 * @since : 2021/09/16
 */
public class SortUtil {

    public static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}
