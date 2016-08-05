package lessons.maxslice;

public class MaxProfit {
    public int solution(int[] A) {
        int N = A.length;
        int maxProfit = 0;
        int maxProfitForDay = 0;

        for (int i = 1; i < N; i++) {
            maxProfitForDay = Math.max(0, maxProfitForDay + A[i] - A[i-1]);
            maxProfit = Math.max(maxProfit, maxProfitForDay);
        }
        return maxProfit;
    }
}
