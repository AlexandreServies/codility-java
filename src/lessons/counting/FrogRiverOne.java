package lessons.counting;

import java.util.Arrays;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        int[] leavesETA = new int[X];
        Arrays.fill(leavesETA, -1);
        for (int leafETA = 0; leafETA < A.length; leafETA++) {
            int position = A[leafETA];
            int currentPositionETA = leavesETA[position - 1];
            if (currentPositionETA == -1) {
                leavesETA[position - 1] = leafETA;
            } else {
                leavesETA[position - 1] = Math.min(currentPositionETA, leafETA);
            }
        }
        return findArrayMaxOrMinusOne(leavesETA);
    }

    private int findArrayMaxOrMinusOne(int[] A) {
        int max = 0;
        for (int n : A) {
            if (n == -1)
                return -1;
            if (n > max)
                max = n;
        }
        return max;
    }
}
