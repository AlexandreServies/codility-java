package lessons.counting;

public class MissingInteger {
    public int solution(int[] A) {
        int N = A.length;
        boolean[] switches = new boolean[N];
        for (int n : A) {
            if (n > 0 && n <= N)
                switches[n - 1] = true;
        }
        for (int i = 0; i < switches.length; i++) {
            if (!switches[i])
                return i + 1;
        }
        return N + 1;
    }
}
