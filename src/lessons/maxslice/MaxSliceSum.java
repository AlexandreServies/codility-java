package lessons.maxslice;

public class MaxSliceSum {
    public int solution(int[] A) {
        int N = A.length;
        int maxSlice = 0;
        int maxSliceEndingHere = 0;

        for (int n : A) {
            maxSliceEndingHere = Math.max(0, maxSliceEndingHere + n);
            maxSlice = Math.max(maxSlice, maxSliceEndingHere);
        }
        return maxSlice;
    }
}
