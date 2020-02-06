import java.util.Scanner;
import java.lang.String;
import java.util.ArrayList;
public class Review02 {
    public static void main(String[] args) {
        //Exercise #1
        String baseLetters = "ABCDEFG", newKeys;
        for (int i = 0; i < baseLetters.length(); i++) {
            if(baseLetters.charAt(i) == 'C' && i != 0){
                String tempString = baseLetters.substring(0, i);
                newKeys = baseLetters.substring(i).concat(tempString);
                System.out.println(newKeys);
            }
        }

        //Exercise #2
        String[] nameArray = {"Beyonce (f)", "David Bowie (m)", "Elvis Costello (m)", "Madonna (f),",
        "Elton John (m)", "Charles Aznavour (m)"};
        int numMale = 0, numFemale = 0;
        for (int i = 0; i < nameArray.length; i++) {
            if(nameArray[i].contains("(m)")){
                numMale += 1;
            }
            else if(nameArray[i].contains("(f)")){
                numFemale += 1;
            }
        }
        System.out.println("Number of males: " +numMale);
        System.out.println("Number of females: " +numFemale);

        //Exercise #3
        String instrumentsArray[] = {"cello", "guitar", "violin", "double bass"};
        String vowelsArray[] = {"a", "e", "i", "o", "u"};
        String vowelReplace[] = new String[instrumentsArray.length];
        for (int i = 0; i < instrumentsArray.length; i++) {
            vowelReplace[i] = instrumentsArray[i];
            for (int j = 0; j < vowelsArray.length; j++) {
                vowelReplace[i] = vowelReplace[i].replace(vowelsArray[j], "");
            }
            System.out.println(vowelReplace[i]);
        }

        //Exercise #4
        int divisorCount = 0;
        for (int i = 1; i < 1000; i++) {
            if(i%3 == 0){
                divisorCount += 1;
            }
        }
        System.out.println("Multiples of 3 under 1000: " +divisorCount);

        //Exercise #5
        for (int i = 1; i <= 20; i++) {
            System.out.println("Single: " +i+ "     Double: " +(i*2)+ "     Triple: " +(i*3));
        }

        //Exercise #6
        for (int i = 0; i < 4; i++) {
            System.out.println("white-black-white-black-white-black-white-black");
            System.out.println("black-white-black-white-black-white-black-white");
        }

        //Exercise #7
        int[] numArrayOne = {1,2,4,3,5};
        boolean leastToGreat = true, greatToLeast = true;
        int tempVal = numArrayOne[0];
        for (int i = 1; i < numArrayOne.length; i++) {
            if(tempVal < numArrayOne[i]){
                greatToLeast = false;
            }
            else if(tempVal > numArrayOne[i]){
                leastToGreat = false;
            }
            tempVal = numArrayOne[i];
        }
        if(leastToGreat == false && greatToLeast == false){
            System.out.println("The numbers are not in order");
        }
        else{
            System.out.println("The numbers are in order");
        }

        //Exercise #8
        int[] numCompareArray = {1,4,7,8,7};
        boolean matchFound = false;
        for (int i = 0; i < numCompareArray.length; i++) {
            for (int j = 1; j < numCompareArray.length; j++) {
                if(numCompareArray[i]==numCompareArray[j] && i!= j){
                    matchFound = true;
                }
            }
        }
        if(matchFound == true){
            System.out.println("Pair of numbers found");
        }
        else if(matchFound == false){
            System.out.println("No pairs found");
        }


        //Exercise #9
        String[] diagArray = {"D", " I", "  A", "   G", "    O",
                "     N", "      A", "       L", "        L", "         Y"};
        for (int i = 0; i < diagArray.length; i++) {
            System.out.println(diagArray[i]);
        }

        //Exercise #10
        String results = "Manchester United 1 Chelsea 0, " +
                "Arsenal 1 Manchester United 1, Manchester United 3 Fulham 1," +
                " Liverpool 2 Manchester United 1, Swansea 2 Manchester United 4";
        //coming back to this one
    }
}
