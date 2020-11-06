package new_year_caos;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

public class Solution {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        HashMap<Integer, Integer[]> positions = new HashMap<>();
        int minimumTotalBribes = 0;
        int[] sorted = new int[q.length];
        System.arraycopy(q, 0, sorted, 0, q.length);
        Arrays.sort(sorted);


        for (int i = 0; i < q.length; i++){
            Integer[] aux = new Integer[2];
            aux[1] = i;
            positions.put(q[i], aux);
        }

        for (int j = 0; j < sorted.length; j++){
            Integer[] aux = positions.get(sorted[j]);

            if (positions.containsKey(sorted[j])){
                aux[0] = j;
            }
            int numberOfBribes = (Math.max(aux[1], aux[0])) - (Math.min(aux[1], aux[0]));

            if (numberOfBribes > 2){
                System.out.print("Too chaotic"+"\n");
                break;
            }else{
                minimumTotalBribes += numberOfBribes;
            }
        }
        System.out.print(minimumTotalBribes/2);
    }

    public static void main(String[] args) {
        int[] a = {2,5,1,3,4};
        minimumBribes(a);
    }
}
