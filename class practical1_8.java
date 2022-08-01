//The problem is to write a program that will grade multiple-choice tests. Assume there are eight students and ten questions, and the answers are stored in a two-dimensional array. 
//Each row records a student’s answers to the questions, as shown in the following array.
//Student 0  A  B  A  C  C   D  E  E  A  D
//Student 1  D  B  A  B  C  A   E  E  A  D
//Student 2  E  D  D  A  C  B   E  E  A  D
//Student 3  C  B  A  E  D  C   E  E  A  D
//Student 4  A  B  D  C  C  D  E  E  A   D
//Student 5  B  B  E  C   C  D  E  E  A  D
//Student 6  B  B  A  C  C  D  E   E  A  D
//Student 7  E  B  E  C  C   D  E  E  A  D

//Prepared by Khushi Shah 21CE127

import java.util.*;
public class pract1_8 {
    public static void main(String args[])
    {
    Scanner s= new Scanner(System.in);
    String  arr[][]=new String[8][10];
    String key[]={"D","B","D","C","C","D","A","E","A","D"};
    for (int i = 0; i < 8; i++) {
        System.out.println("Student "+(i+1));
        int count=0;
        for (int j = 0; j < 10; j++) {
            arr[i][j]= s.next();
            if(arr[i][j].equals(key[j]))
            {
                count++;
            }
        }
        System.out.println("COUTN:"+count);
    }
    
    s.close();
    }
}
