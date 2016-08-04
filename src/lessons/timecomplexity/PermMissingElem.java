package lessons.timecomplexity;

public class PermMissingElem {
    public int solution(int[] A) {
        int N = A.length;
        if (N == 0)
            return 1;

        long globalSum = (long) (N + 1) * (long) (N + 2) / 2;
        long arraySum = sumOfArray(A);
        return (int) (globalSum - arraySum);
    }

    private long sumOfArray(int[] A) {
        long res = 0;
        for (int n : A) {
            res += n;
        }
        return res;
    }
}
