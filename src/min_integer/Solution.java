package min_integer;// you can also use imports, for example:
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] A) {
        A = IntStream.of(A).distinct().toArray();
        Arrays.sort(A);
        int minimumNumber = 1;

        for (int i = 0; i < A.length; i++){
            if (A[i] > 0) {
                if (minimumNumber == A[i])
                    minimumNumber++;
                else
                    return minimumNumber;
            }
        }
        return minimumNumber;
    }

}
