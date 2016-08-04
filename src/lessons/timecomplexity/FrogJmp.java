package lessons.timecomplexity;

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        if (X == Y)
            return 0;
        return (Y - X) / D +
                ((Y - X) % D == 0
                        ? 0
                        : 1);
    }
}
