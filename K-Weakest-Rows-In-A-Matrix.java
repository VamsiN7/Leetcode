// https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/description/

import java.util.*;

public class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;

        List<int[]> rowStrengths = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int strength = 0;
            for (int j = 0; j < n; j++) {
                strength += mat[i][j];
            }
            rowStrengths.add(new int[]{i, strength});
        }

        Collections.sort(rowStrengths, (a, b) -> {
            if (a[1] == b[1]) {
                return a[0] - b[0];
            } else {
                return a[1] - b[1];
            }
        });

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = rowStrengths.get(i)[0];
        }

        return result;
    }
}