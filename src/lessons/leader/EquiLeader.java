package lessons.leader;

import java.util.Stack;

public class EquiLeader {
    public int solution(int[] A) {
        Integer[] leaderWithCount = findLeader(A);
        if (leaderWithCount == null) {
            return 0;
        }

        int leader = leaderWithCount[0];
        int count = leaderWithCount[1];
        int N = A.length;
        int leftCount = 0;
        int rightCount = count;

        int nEquiLeaders = 0;
        for (int S = 0; S < N - 1; S++) {
            if (A[S] == leader) {
                leftCount++;
                rightCount--;
            }
            if (leftCount > (S + 1) / 2 && rightCount > (N - S - 1) / 2)
                nEquiLeaders++;
        }
        return nEquiLeaders;
    }

    private Integer[] findLeader(int[] A) {
        Stack<Integer> stack = new Stack<>();
        for (int n : A) {
            if (!stack.empty() && n != stack.peek())
                stack.pop();
            else
                stack.push(n);
        }
        if (stack.empty())
            return null;

        int candidate = stack.peek();
        int count = 0;
        for (int n : A)
            if (n == candidate)
                count++;
        if (count > A.length / 2) {
            Integer[] result = {candidate, count};
            return result;
        }
        return null;
    }
}
