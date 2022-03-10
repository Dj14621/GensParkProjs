package genspark.assignments.section2;

import genspark.assignments.Assignment;
import org.joda.time.field.StrictDateTimeField;

public class ReverseAnInteger implements Assignment {
    public String solution(int number) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String x = Integer.toString(number);
        String reverse="";
        char ch;
        for (int i=0; i<x.length(); i++){
        ch=x.charAt(i);
        reverse=ch+reverse;
        }
        return reverse;
    }
}
