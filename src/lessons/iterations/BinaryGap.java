package lessons.iterations;

public class BinaryGap {
    public int solution(int N) {
        char[] binaryN = Integer.toBinaryString(N).toCharArray();
        int currentGapLength = 0;
        int maxGapLength = 0;
        for (char c : binaryN) {
            if (c == '0') {
                currentGapLength++;
            }
            if (c == '1') {
                if (currentGapLength > maxGapLength) {
                    maxGapLength = currentGapLength;
                }
                currentGapLength = 0;
            }
        }

        return maxGapLength;
    }
}
