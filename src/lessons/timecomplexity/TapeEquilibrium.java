package lessons.timecomplexity;

public class TapeEquilibrium {
    public int solution(int[] A) {
        int N = A.length;
        int leftSum = 0;
        int rightSum = sumOfArray(A);

        int minDifference = Integer.MAX_VALUE;
        int difference;

        for (int P = 1; P < N; P++) {
            leftSum += A[P - 1];
            rightSum -= A[P - 1];
            difference = Math.abs(leftSum - rightSum);
            if (difference < minDifference) {
                minDifference = difference;
            }
        }

        return minDifference;
    }

    private int sumOfArray(int[] A) {
        int res = 0;
        for (int n : A) {
            res += n;
        }
        return res;
    }
}
