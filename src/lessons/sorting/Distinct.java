package lessons.sorting;

import java.util.HashSet;
import java.util.Set;

public class Distinct {
    public int solution(int[] A) {
        Set<Integer> distinctValues = new HashSet<>();
        for(int n : A){
            distinctValues.add(n);
        }
        return distinctValues.size();
    }
}
