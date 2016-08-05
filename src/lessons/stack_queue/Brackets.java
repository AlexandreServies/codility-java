package lessons.stack_queue;

import java.util.Stack;

public class Brackets {
    public int solution(String S) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (!stack.empty() && formsValidPair(stack.peek(), c))
                stack.pop();
            else
                stack.push(c);
        }
        return stack.empty() ? 1 : 0;
    }

    private boolean formsValidPair(char peek, char c) {
        return peek == '{' && c == '}'
                || peek == '[' && c == ']'
                || peek == '(' && c == ')';
    }
}
