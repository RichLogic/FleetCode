package com.richlogic.fleetcode.sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * <h3>fleetcode</h3>
 * <h4>com.richlogic.fleetcode.sort</h4>
 * <p></p>
 *
 * @author : richlogic
 * @since : 2021/09/15
 */
public class SortTest {

    int[] arr = new int[]{2, 9, 8, 4, 5, 1, 3, 7, 6};

    @Before
    public void before() {
        System.out.println(Arrays.toString(arr));
    }

    @After
    public void after() {
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testQuick() {
        new Quick().sort(arr);
    }

    @Test
    public void testMerge() {
        new Merge().sort(arr);
    }

}
