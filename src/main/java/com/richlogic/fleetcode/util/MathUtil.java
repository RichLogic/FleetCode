package com.richlogic.fleetcode.util;

/**
 * <h3>fleetcode</h3>
 * <h4>com.richlogic.fleetcode.util</h4>
 * <p></p>
 *
 * @author : richlogic
 * @since : 2021/09/13
 */
public class MathUtil {

    public static int min(int... nums) {
        int res = Integer.MAX_VALUE;
        for (int num : nums) {
            res = Math.min(res, num);
        }
        return res;
    }

}
