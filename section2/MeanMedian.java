package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class MeanMedian implements Assignment {
    public String solution(int a, int b, int c) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        //find mean
        double mean = (a + b + c) /3;
        String strmean = Double.toString(mean);
// find median
        int median = 0;
        if (a >= b && c >= a) {
            median = a;
        } else if (b >= a && b <= c) {
            median = b;
        } else median = c;
//print combination
        String strmedian = Integer.toString(median);
        return (strmean + " " + strmedian);
    }
}

