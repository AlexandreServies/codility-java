package lessons.stack_queue;

import java.util.Stack;

public class StoneWall {
    public int solution(int[] H) {
        Stack<Integer> blocks = new Stack<>();
        int nBlocks = 0;
        for (int height : H) {
            //If the new height is lower than the current height, we need to pop blocks to lower the wall
            while (!blocks.empty() && height < blocks.peek()) {
                blocks.pop();
            }
            //If we ended up at the exact needed height no need to add a block.
            //Otherwise add a block to match the required height
            if (blocks.empty() || height > blocks.peek()) {
                blocks.push(height);
                nBlocks++;
            }
        }
        return nBlocks;
    }
}
