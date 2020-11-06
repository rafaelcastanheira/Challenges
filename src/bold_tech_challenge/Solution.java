package bold_tech_challenge;

public class Solution {
    public String solution(String S) {
        // write your code in Java SE 8

        S = S.replace("-", "");
        S = S.replace(" ", "");

        String result = "";

        if (S.length() % 3 == 0){
            for (int i = 0; i < S.length(); i++){
                result += (S.charAt(i));
                if ((i+1)%3==0)
                    result += "-";
            }
        } else if(S.length() % 3 == 1){
            for (int i = 0; i < (S.length()-3-1); i++){
                result += (S.charAt(i));
                if ((i+1)%3==0)
                    result += "-";
            }

            String aux = S.substring(S.length()-5, S.length());
            for (int j = 0; j < 4; j++){
                result += (aux.charAt(j));
                if ((j+1)%2==0)
                    result += "-";
            }
        } else{
            for (int x = 0; x < S.length()-2; x++){
                result += (S.charAt(x));
                if ((x+1)%3==0)
                    result += "-";
            }
            String aux = S.substring(S.length()-3, S.length());
            for (int x = 0; x < 2; x++){
                result += (aux.charAt(x));
                if ((x+1)%2==0)
                    result += "-";
            }
        }
        result = result.substring(0, result.length()-1);

        return result;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.print(s.solution("00-44  48 55551234"));
    }
}
