package lessons.arrays;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {
    public int solution(int[] A) {
        Map<Integer, Boolean> paired = new HashMap<>();
        for (int n : A) {
            if (!paired.containsKey(n)) {
                paired.put(n, false);
            } else {
                paired.put(n, !paired.get(n));
            }
        }
        for (int n : paired.keySet()) {
            if (!paired.get(n)) {
                return n;
            }
        }
        throw new RuntimeException("This shouldn't happen if input hypothesis are met, i.e. all values in A are paired except one");
    }
}
