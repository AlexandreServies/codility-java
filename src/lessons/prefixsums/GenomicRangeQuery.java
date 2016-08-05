package lessons.prefixsums;

public class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {
        int M = P.length;
        int N = S.length();
        int[] result = new int[M];
        int[][] genoms = new int[3][N + 1];
        short a, c, g;
        //Compute prefix sums
        for (int i = 0; i < N; i++) {
            a = 0;
            c = 0;
            g = 0;
            switch (S.charAt(i)) {
                case 'A':
                    a = 1;
                case 'C':
                    c = 1;
                case 'G':
                    g = 1;
                    break;
            }
            genoms[0][i + 1] = genoms[0][i] + a;
            genoms[1][i + 1] = genoms[1][i] + c;
            genoms[2][i + 1] = genoms[2][i] + g;
        }

        //Process queries
        for (int i = 0; i < M; i++) {
            int fromIndex = P[i];
            int toIndex = Q[i];
            if (genoms[0][toIndex + 1] - genoms[0][fromIndex] > 0)
                result[i] = 1;
            else if (genoms[1][toIndex + 1] - genoms[1][fromIndex] > 0)
                result[i] = 2;
            else if (genoms[2][toIndex + 1] - genoms[2][fromIndex] > 0)
                result[i] = 3;
            else
                result[i] = 4;
        }

        return result;
    }
}
