package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class CounterForLoop implements Assignment {
    public String solution(int count) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String  str= "";
        for(int x = count; x>=0; x--){
            str += x;


        }

        return str;
    }
}