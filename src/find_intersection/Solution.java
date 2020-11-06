package find_intersection;

import java.util.*;
import java.io.*;


class Solution {

    public static String solution1(String[] strArr) {
        String[] arg1 = strArr[0].trim().split(",");
        String[] arg2 = strArr[1].trim().split(",");
        String solution = "";

        for (String elem1 : arg1){
            for (String elem2 : arg2){
                if(elem1.trim().equals(elem2.trim())){
                    solution+=elem1.trim()+",";
                }
            }
        }
        return solution.equals("") ? "false" : solution.substring(0, solution.length()-1) ;
    }


    public static String solution2(String[] strArr){
        String[] arg1 = strArr[0].split(", ");
        String[] arg2 = strArr[1].split(", ");
        String result = "";
        HashMap<String, Boolean> matchMap = new HashMap<String, Boolean>();

        for (String elem1 : arg1)
            matchMap.put(elem1, true);


        for (String elem2 : arg2){
            if(matchMap.containsKey(elem2))
                result += elem2+",";
        }

        return result.length() == 0 ? "false" : result.substring(0, result.length()-1);
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(solution1(new String[] {"1, 2, 3, 4, 5", "2, 3, 4, 6, 7"})); //N * N
        System.out.println("\n");
        System.out.print(solution2(new String[] {"5, 6, 9, 11, 12, 16", "4, 6, 7, 11, 16"})); // N + N
    }

}