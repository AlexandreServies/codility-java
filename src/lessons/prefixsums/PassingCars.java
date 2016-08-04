package lessons.prefixsums;

public class PassingCars {
    public int solution(int[] A) {
        int nPairs = 0;
        int nOnes = 0;
        int N = A.length;
        for (int i = N - 1; i >= 0; i--) {
            if (A[i] == 1)
                nOnes++;
            else {
                nPairs += nOnes;
                if (nPairs > 1000000000)
                    return -1;
            }
        }
        return nPairs;
    }
}
