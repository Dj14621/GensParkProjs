package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class IncrementWhileLoop implements Assignment {
    public String solution(int from, int to) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        String reverse = "";
        char ch;

        while (from <= to) {
            String x = Integer.toString(from);
            for (int i = 0; i < x.length(); i++) {
                ch = x.charAt(i);
                reverse = reverse + ch;
            }
            from++;
        }
        return reverse;
    }

}