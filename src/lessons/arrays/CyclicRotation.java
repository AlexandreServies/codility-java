package lessons.arrays;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        int N = A.length;
        if (N == 0) {
            return new int[0];
        }
        int realK = K % N;

        int[] B = new int[N];
        for (int i = 0; i < N - realK; i++) {
            B[i + realK] = A[i];
        }
        for (int i = 0; i < realK; i++) {
            B[i] = A[N - realK + i];
        }
        return B;
    }
}
