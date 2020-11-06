package left_rotation;

import java.util.HashMap;


public class Solution {

    static int getNextIndex(int currentIndex, int d, int arrayLength){
        int dif = (currentIndex - d);
        if (dif < 0) {
            int aux = (arrayLength + dif);
            return aux;
        }
        return dif;
    }

    static int[] rotLeft(int[] a, int d) {
        HashMap<Integer, Integer> indexAndNextValue = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            int temp = getNextIndex(i, d, a.length);
            indexAndNextValue.put(temp, a[i]);
        }
        for (int i = 0; i < a.length; i++){
            if (indexAndNextValue.containsKey(i))
                a[i] = indexAndNextValue.get(i);
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        a = rotLeft(a, 4);
        System.out.print(a[0]);
        System.out.print(a[1]);
        System.out.print(a[2]);
        System.out.print(a[3]);
        System.out.print(a[4]);
    }
}
