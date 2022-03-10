package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class SwitchItUp implements Assignment {
    public String solution(int x) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String num = "";
        switch (x) {
            case 1:
                num = "one";
                break;
            case 2:
                num = "two";
                break;
            case 3:
                num = "three";
                break;
            case 4:
                num = "four";
                break;
            case 5:
                num = "five";
                break;
            default:
                num = "none matched";
        }
        return num;
    }
}

