package lessons.maxslice;

public class MaxSliceSum {
    public int solution(int[] A) {
        int maxSlice = A[0];
        int maxSliceEndingHere = 0;

        for (int n : A) {
            maxSliceEndingHere = n + Math.max(0, maxSliceEndingHere);
            maxSlice = Math.max(maxSlice, maxSliceEndingHere);
        }
        return maxSlice;
    }
}
