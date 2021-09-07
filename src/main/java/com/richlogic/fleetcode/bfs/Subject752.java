package com.richlogic.fleetcode.bfs;

import java.util.*;

/**
 * <h3>FleetCode</h3>
 * <h4>com.richlogic.fleetcode.bfs</h4>
 * <p>
 * 你有一个带有四个圆形拨轮的转盘锁。每个拨轮都有10个数字： '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' 。
 * 每个拨轮可以自由旋转：例如把 '9' 变为 '0'，'0' 变为 '9' 。每次旋转都只能旋转一个拨轮的一位数字。
 * 锁的初始数字为 '0000' ，一个代表四个拨轮的数字的字符串。
 * 列表 deadends 包含了一组死亡数字，一旦拨轮的数字和列表里的任何一个元素相同，这个锁将会被永久锁定，无法再被旋转。
 * 字符串 target 代表可以解锁的数字，你需要给出解锁需要的最小旋转次数，如果无论如何不能解锁，返回 -1 。
 * 示例 1:
 * 输入：deadends = ["0201","0101","0102","1212","2002"], target = "0202"
 * 输出：6
 * 解释：
 * 可能的移动序列为 "0000" -> "1000" -> "1100" -> "1200" -> "1201" -> "1202" -> "0202"。
 * 注意 "0000" -> "0001" -> "0002" -> "0102" -> "0202" 这样的序列是不能解锁的，
 * 因为当拨动到 "0102" 时这个锁就会被锁定。
 * 示例 2:
 * 输入: deadends = ["8888"], target = "0009"
 * 输出：1
 * 解释：
 * 把最后一位反向旋转一次即可 "0000" -> "0009"。
 * 示例 3:
 * 输入: deadends = ["8887","8889","8878","8898","8788","8988","7888","9888"],
 * target = "8888"
 * 输出：-1
 * 解释：
 * 无法旋转到目标数字且不被锁定。
 * 示例 4:
 * 输入: deadends = ["0000"], target = "8888"
 * 输出：-1
 * 提示：
 * 1 <= deadends.length <= 500
 * deadends[i].length == 4
 * target.length == 4
 * target 不在 deadends 之中
 * target 和 deadends[i] 仅由若干位数字组成
 * </p>
 *
 * @author : richlogic
 * @since : 2021/09/07
 */
public class Subject752 {

    public static void main(String[] args) {
        Subject752 s = new Subject752();
        System.out.println(s.handle("1100"));
    }

    public int openLock(String[] deadends, String target) {

        if ("0000".equals(target)) {
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        Set<String> deadSet = new HashSet<>(Arrays.asList(deadends));
        queue.offer("0000");
        visited.add("0000");

        int count = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String s = queue.poll();
                if (target.equals(s)) {
                    return count;
                }
                if (deadSet.contains(s)) {
                    continue;
                }
                for (String s1 : this.handle(s)) {
                    if (!visited.contains(s1)) {
                        queue.offer(s1);
                        visited.add(s1);
                    }
                }
            }
            count++;
        }

        return -1;
    }

    private List<String> handle(String s) {
        char a = s.charAt(0);
        char b = s.charAt(1);
        char c = s.charAt(2);
        char d = s.charAt(3);
        List<String> list = new ArrayList<>();
        list.add(new String(new char[]{this.addOne(a), b, c, d}));
        list.add(new String(new char[]{this.minusOne(a), b, c, d}));
        list.add(new String(new char[]{a, this.addOne(b), c, d}));
        list.add(new String(new char[]{a, this.minusOne(b), c, d}));
        list.add(new String(new char[]{a, b, this.addOne(c), d}));
        list.add(new String(new char[]{a, b, this.minusOne(c), d}));
        list.add(new String(new char[]{a, b, c, this.addOne(d),}));
        list.add(new String(new char[]{a, b, c, this.minusOne(d)}));
        return list;
    }

    private char addOne(char c) {
        if (c == '9') {
            return '0';
        }
        return (char) (c + 1);
    }

    private char minusOne(char c) {
        if (c == '0') {
            return '9';
        }
        return (char) (c - 1);
    }

}
