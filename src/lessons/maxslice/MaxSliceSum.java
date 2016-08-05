package lessons.maxslice;

public class MaxSliceSum {
    public int solution(int[] A) {
        int N = A.length;
        int maxSlice = 0;
        int maxSliceEndingHere = 0;

        for (int i = 0; i < N; i++) {
            maxSliceEndingHere = Math.max(0, maxSliceEndingHere + A[i]);
            maxSlice = Math.max(maxSlice, maxSliceEndingHere);
        }
        return maxSlice;
    }
}
