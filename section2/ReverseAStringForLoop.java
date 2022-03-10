package genspark.assignments.section2;

import genspark.assignments.Assignment;

import java.lang.reflect.Array;

public class ReverseAStringForLoop implements Assignment {
    public String solution(String str) {
        // ↓↓↓↓ your code goes here ↓↓↓↓



  String revstr="";
//System.out.println("initial value : "+str);
   for(int i=str.length()-1;i>=0;i--){
       revstr=revstr+str.charAt(i);
//       System.out.println("inside loop value : "+revstr);
   }
     return revstr;
    }
}
