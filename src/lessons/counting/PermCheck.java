package lessons.counting;

public class PermCheck {
    public int solution(int[] A) {
        int N = A.length;
        boolean[] switches = new boolean[N];
        for(int n : A){
            if(n > N)
                return 0; //Optimisation to quickly exclude any input with an element > N
            switches[n-1] = !switches[n-1];
        }
        //If the array is a permutation, now all the switches must be set to true.
        for(boolean b : switches){
            if(!b)
                return 0;
        }
        return 1;
    }
}
