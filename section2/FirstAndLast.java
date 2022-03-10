package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class FirstAndLast implements Assignment {
    public boolean solution(String word) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        boolean x = true;
        int n = word.length();
        if (n == 0) {
            return true;
        }
        char first = word.charAt(0);
        char last = word.charAt(n-1);

        return first == last;



        }


}

