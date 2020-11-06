package question_marks;

import java.util.*;

class Solution {

    public static String QuestionsMarks(String str) {
        // code goes here
        String betweenSumOf10 = "";
        LinkedList<Integer> indexOfNumber = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char numChar = str.charAt(i);
            if (Character.isDigit(numChar))
                indexOfNumber.addLast(i);
        }

        for (int x = 0; x < indexOfNumber.size()-1; x++){
            int elem1 = Character.getNumericValue(str.charAt(indexOfNumber.get(x)));
            int elem2 = Character.getNumericValue(str.charAt(indexOfNumber.get(x+1)));

            if ((elem1 + elem2) == 10){
                betweenSumOf10 = str.substring(indexOfNumber.get(x), indexOfNumber.get(x+1)+1);
            }
            String[] temp = betweenSumOf10.split("\\?");
            if (temp.length-1 == 3){
                return "true";
            }
        }
        return "false";
    }

    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print(QuestionsMarks(s.nextLine()));
    }

}