package codeland_username_validation;

import java.util.*;
import java.io.*;

class Solution {

    public static boolean CodelandUsernameValidation(String str) {
        boolean solution = false;
        if (4 < str.length() && str.length() < 25) {
            if (Character.isAlphabetic(str.toCharArray()[0])) {
                if (str.toCharArray()[str.length() - 1] != '_'){
                    for (int i = 0; i < str.length(); i++) {
                        if (Character.isLetter(str.toCharArray()[i]) || Character.isDigit(str.toCharArray()[i]) || str.toCharArray()[i] == '_') {
                            solution = true;
                        }else{
                            solution = false;
                            break;
                        }
                    }
                }
            }
        }
        return solution;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(CodelandUsernameValidation(s.nextLine()));
    }

}