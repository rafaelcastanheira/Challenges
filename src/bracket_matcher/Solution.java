package bracket_matcher;

import java.util.HashMap;
import java.util.Stack;

public class Solution {


    public static String BracketMatcher(String str) {
        HashMap<Character, Integer> numberOfBrackets = new HashMap<>();
        numberOfBrackets.put('(', 0);
        numberOfBrackets.put(')', 0);

        if (!str.contains(String.valueOf('(')) && !str.contains(String.valueOf(')')))
            return "1";

        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (c == '(' || c == ')'){
                if ((numberOfBrackets.get(')') >= numberOfBrackets.get('(')) && c == ')')
                    return "0";
                int lastValue = numberOfBrackets.get(c);
                numberOfBrackets.replace(c, ++lastValue);
            }
        }
        return numberOfBrackets.get('(').equals(numberOfBrackets.get(')')) ? "1" : "0";
    }

    public static String BracketMatcher2 (String str) {
        Stack<Character> stackList = new Stack<>();

        for (char c : str.toCharArray()){
            if (c == '(')
                stackList.push(c);
            else if (c == ')'){
                if (stackList.empty())
                    return "0";
                else
                    stackList.pop();
            }
        }
        return stackList.empty() ? "1" : "0";
    }


    public static void main(String[] args) {
        //System.out.print(Solution.BracketMatcher2("()("));
        System.out.print(null+"oa");
    }
}
