package binary_gap;

import java.util.Collections;
import java.util.LinkedList;

public class Solution {

    public LinkedList<Integer> decimalToBinary(int decimal) {
        LinkedList<Integer> binary = new LinkedList<>();
        Boolean isFirstElement1 = false;

        while (decimal != 0) {
            if (decimal % 2 == 0 ) {
                if (isFirstElement1)
                    binary.addFirst(0);
            } else {
                binary.addFirst(1);
                isFirstElement1 = true;
            }
            decimal = (int) (decimal / 2);
        }
        return binary;
    }

    public int solution(int N) {
        LinkedList<Integer> decimalInBinaryString = decimalToBinary(N);
        boolean isFirst1 = false;
        int binaryGapsCounter = 0;
        LinkedList<Integer> binaryGaps = new LinkedList<>();

        for (int i = 0; i < decimalInBinaryString.size(); i++) {
            if (decimalInBinaryString.get(i) == 1) {
                if (isFirst1) {
                    if (binaryGapsCounter > 0) {
                        if (i != decimalInBinaryString.size()-1) {
                            if (decimalInBinaryString.get(i + 1) == 0)
                                isFirst1 = true;
                            else
                                isFirst1 = false;
                        }
                    }
                    binaryGaps.addFirst(binaryGapsCounter);
                    binaryGapsCounter = 0;
                } else {
                    isFirst1 = true;
                }
            } else {
                binaryGapsCounter++;
            }
        }
        Collections.sort(binaryGaps);
        return binaryGaps.isEmpty() ? 0 : binaryGaps.getLast();
    }

    public static void main(String[] args) {
        Solution a = new Solution();
        int solution = a.solution(20);
        System.out.println(solution);
    }
}
