import java.util.Scanner;
import java.io.*;
import java.lang.Math;
import java.lang.String;

public class Review03 {
    public static void main(String[] args) {

        //for(int ;array) example
        int[] tempArray = {10,9,8,7,6,5,4,3,2,1,0};
        for (int i : tempArray) {
            System.out.println(i);
        }

        //bitwise: XOR operator
        boolean x = true, y = false, xOrY = x ^ y;
        //output is true
        System.out.println(xOrY);
        y = true;
        xOrY = x ^ y;
        //output is false
        System.out.println(xOrY);

        //switch statement: String
        int howManyDays = 8;
        String whatDay;
        switch (howManyDays){
            case 1: whatDay = "One day";
            break;
            case 2: whatDay = "Two day";
            break;
            case 3: whatDay = "Three day";
            break;
            case 4: whatDay = "Four";
            break;
            case 5: whatDay = "Five Day";
            break;
            case 6: whatDay = "Six Day";
            break;
            case 7: whatDay = "Seven Day";
            break;
            case 8: whatDay = "More";
            break;
        }
        //switch statement: int
        int theNumbers = 1;
        switch(theNumbers){
            case 1:
                System.out.println(4);
            case 2:
                System.out.println(8);
            case 3:
                System.out.println(15);
            case 4:
                System.out.println(16);
            case 5:
                System.out.println(23);
            case 6:
                System.out.println(42);
        }

        //
    }
}
