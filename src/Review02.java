import java.util.Scanner;
import java.lang.String;
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

    }
}
