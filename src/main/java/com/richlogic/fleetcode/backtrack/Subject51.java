package com.richlogic.fleetcode.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>FleetCode</h3>
 * <h4>com.richlogic.fleetcode.backtrack</h4>
 * <p>
 * n 皇后问题 研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
 * 给你一个整数 n ，返回所有不同的 n 皇后问题 的解决方案。
 * 每一种解法包含一个不同的 n 皇后问题 的棋子放置方案，该方案中 'Q' 和 '.' 分别代表了皇后和空位。
 * 示例 1：
 * 输入：n = 4
 * 输出：[[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
 * 解释：如上图所示，4 皇后问题存在两个不同的解法。
 * 示例 2：
 * 输入：n = 1
 * 输出：[["Q"]]
 * 提示：
 * 1 <= n <= 9
 * 皇后彼此不能相互攻击，也就是说：任何两个皇后都不能处于同一条横行、纵行或斜线上。
 * </p>
 *
 * @author : richlogic
 * @since : 2021/09/05
 */
public class Subject51 {

    public static void main(String[] args) {
        System.out.println(new Subject51().solveNQueens(4));
    }

    private int len;
    List<List<String>> resultList = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        this.len = n;
        backtrack(new int[n][n], 0);
        return resultList;
    }

    public void backtrack(int[][] track, int row) {
        if (row == len) {
            resultList.add(this.print(track));
            return;
        }

        for (int col = 0; col < len; col++) {
            if (this.isValid(track, row, col)) {
                track[row][col] = 1;
                backtrack(track, row + 1);
                track[row][col] = 0;
            }
        }
    }

    private List<String> print(int[][] track) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < len; j++) {
                builder.append(track[i][j] == 0 ? "." : "Q");
            }
            list.add(builder.toString());
        }
        return list;
    }

    private boolean isValid(int[][] track, int row, int col) {
        for (int i = 1; i <= row; i++) {
            if (row - i >= 0) {
                if (track[row - i][col] == 1) {
                    return false;
                }
                if (col - i >= 0 && track[row - i][col - i] == 1) {
                    return false;
                }
                if (col + i < len && track[row - i][col + i] == 1) {
                    return false;
                }
            }
        }
        return true;
    }

}
