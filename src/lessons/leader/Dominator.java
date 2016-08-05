package lessons.leader;

import java.util.Stack;

public class Dominator {
    public int solution(int[] A) {
        Stack<Integer> stack = new Stack<>();
        for (int n : A) {
            if (!stack.empty() && n != stack.peek())
                stack.pop();
            else
                stack.push(n);
        }
        if (stack.empty())
            return -1;

        int candidate = stack.peek();
        int count = 0, index = 0;
        for (int i = 0; i < A.length; i++)
            if (A[i] == candidate) {
                count++;
                index = i;
            }
        if (count > A.length / 2) {
            return index;
        }
        return -1;
    }
}
