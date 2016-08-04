package lessons.counting;

import java.util.HashMap;
import java.util.Map;

public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int baseValue = 0;
        int maxINCsinceLastMAX = 0;
        Map<Integer, Integer> increases = new HashMap<>();
        for (int n : A) {
            if (n == N + 1) {
                baseValue += maxINCsinceLastMAX;
                increases.clear();
                maxINCsinceLastMAX = 0;
            } else {
                incrementOrPutOne(increases, n);
                if (increases.get(n) > maxINCsinceLastMAX) {
                    maxINCsinceLastMAX = increases.get(n);
                }
            }
        }
        setCounters(counters, baseValue, increases);
        return counters;
    }

    //Set each counter i to the base value + the number of increases it received since the last MAX operation
    private void setCounters(int[] counters, int toAddEverywhere, Map<Integer, Integer> increases) {
        for (int i = 0; i < counters.length; i++) {
            counters[i] = toAddEverywhere;
            if (increases.containsKey(i + 1)) {
                counters[i] += increases.get(i + 1);
            }
        }
    }

    private void incrementOrPutOne(Map<Integer, Integer> increases, int n) {
        if (increases.containsKey(n)) {
            increases.put(n, increases.get(n) + 1);
        } else {
            increases.put(n, 1);
        }
    }
}
