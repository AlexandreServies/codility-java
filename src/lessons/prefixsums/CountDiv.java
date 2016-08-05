package lessons.prefixsums;

public class CountDiv {
    public int solution(int A, int B, int K) {
        return (int) (Math.floor((double) B / K) - Math.ceil((double) A / K)) + 1;
    }
}
