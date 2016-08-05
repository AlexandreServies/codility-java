package lessons.prefixsums;

public class MinAvgTwoSlice {
    public int solution(int[] A) {
        int N = A.length;
        float minAvgValue = (float) (A[0] + A[1]) / 2;
        int minAvgPos = 0;
        for (int i = 1; i < N - 1; i++) {
            float newAvgValue = (float) (A[i] + A[i + 1]) / 2;
            if (newAvgValue < minAvgValue) {
                minAvgValue = newAvgValue;
                minAvgPos = i;
            }
        }
        for (int i = 0; i < N - 2; i++) {
            float newAvgValue = (float) (A[i] + A[i + 1] + A[i + 2]) / 3;
            if (newAvgValue < minAvgValue) {
                minAvgValue = newAvgValue;
                minAvgPos = i;
            }
        }
        return minAvgPos;
    }
}
