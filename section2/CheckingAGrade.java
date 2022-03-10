package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class CheckingAGrade implements Assignment {
    public String solution(int grade) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if (grade<=100 && grade>=90){
        return "A";
    }
    else if (grade<=89 && grade>=80) {
            return "B";
        }else if (grade<=79 && grade>=70) {
            return "C";
        }else{
        return "FAILURE";
            }
        }
}
