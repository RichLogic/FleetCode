package com.richlogic.fleetcode.dp;

import java.util.HashMap;
import java.util.Map;

/**
 * <h3>fleetcode</h3>
 * <h4>com.richlogic.fleetcode.dp</h4>
 * <p></p>
 *
 * @author : richlogic
 * @since : 2021/09/12
 */
public class Fib {

    /**
     * 时间复杂度 N!
     */
    public int fib1(int N) {
        if (N == 1 || N == 2) {
            return 1;
        }
        return fib1(N - 1) + fib1(N - 2);
    }


    /**
     * 时间复杂度 N
     */
    Map<Integer, Integer> map = new HashMap<>();
    public int fib2(int N) {
        if (map.containsKey(N)) {
            return map.get(N);
        }
        if (N == 1 || N == 2) {
            return 1;
        }
        int res = fib1(N - 1) + fib1(N - 2);
        map.put(N, res);
        return res;
    }


    /**
     * 时间复杂度 N
     */
    public int fib3(int N) {
        int[] arr = new int[N + 1];
        arr[1] = 1;
        arr[2] = 2;
        for (int i=3; i<=N; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }
        return arr[N];
    }

    /**
     * 时间复杂度 O(n) 空间复杂度 O(1)
     */
    public int fib4(int N) {
        int a = 1;
        int b = 1;
        int t = 0;
        for (int i=0; i<N; i++) {
            t = a;
            a = b;
            b = a + t;
        }
        return t;
    }

    public static void main(String[] args) {
        System.out.println(new Fib().fib1(11));
        System.out.println(new Fib().fib4(11));
    }
}