package lessons.maxslice;

public class MaxDoubleSliceSum {
    public int solution(int[] A) {
        int N = A.length;
        int maxDoubleSlice = 0;
        int[] maxEnding = new int[N];
        int[] maxStarting = new int[N];

        for (int i = 1; i < N; i++) {
            maxEnding[i] = Math.max(0, maxEnding[i - 1] + A[i]);
        }
        for (int i = N - 2; i >= 0; i--) {
            maxStarting[i] = Math.max(0, maxStarting[i + 1] + A[i]);
        }
        for (int Y = 1; Y < N - 1; Y++) {
            maxDoubleSlice = Math.max(maxDoubleSlice, maxEnding[Y - 1] + maxStarting[Y + 1]);
        }
        return maxDoubleSlice;
    }
}
