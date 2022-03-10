package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class CheckForPalindrome implements Assignment {
    public boolean solution(String pally) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        String str = pally;
        String reversPally = "";
        boolean x = true;
        for (int i = str.length() - 1; i >= 0; i--) {
            reversPally = reversPally + pally.charAt(i);
        }
        if (str.equals(reversPally)) {
            x = true;
            return true;
        } else{
            return false;
        }

    }
}
