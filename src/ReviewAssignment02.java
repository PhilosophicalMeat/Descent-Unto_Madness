import java.util.Scanner;
public class ReviewAssignment02 {
    public static void main(String[] args) {
        /*//Assignment #1
        //Creating the new string called "notes"
        String notes = "ABCDEFG", notesReference = "CDEFGAB";
        //Cycling through notes
        for (int i = 0; i < notes.length(); i++) {
            for (int j = 0; j < notes.length(); j++) {
                //comparing the current note to the reference note
                if(notes.charAt(j) == notesReference.charAt(i)) {
                    System.out.print(notes.charAt(j));
                }
            }
        }

        //Assignment #2
        //creating the array
        String[] nameArray = {"Beyonce (f)", "David Bowie (m)", "Elvis Costello (m)",
                "Madonna (f)", "Elton John (m)", "Charles Aznavour (m)"};
        //creating the necessary count variables
        int maleCount = 0, femaleCount = 0;
        //setting up the loop
        for (int i = 0; i < nameArray.length; i++) {
            //if the person is male
            if(nameArray[i].contains("(m)")){
                maleCount+=1;
            }
            //if the person is female
            else if(nameArray[i].contains("(f)")){
                femaleCount+=1;
            }
        }
        //printing the result
        System.out.println("Number of males: " +maleCount);
        System.out.println("Number of females: " +femaleCount);


        //Assignment #3
        //creating the arrays
        String[] instrumentsArray = {"cello", "guitar", "violin", "double bass"};
        char[] vowelsArray = {'a', 'e', 'i', 'o', 'u'};
        //creating the loop
        for (int i = 0; i < instrumentsArray.length; i++) {
            for (int j = 0; j < instrumentsArray[i].length(); j++) {
                for (int k = 0; k < vowelsArray.length; k++) {
                    if (instrumentsArray[i].charAt(j) == vowelsArray[k]){

                    }
                }
            }
        }
        //loop for printing the final values
        for (int i = 0; i < instrumentsArray.length; i++) {
            System.out.println(instrumentsArray[i]);
        }

        //Assignment #4
        //creating a variable to count the divisible numbers
        int divCount = 0;
        //creating the loop
        for (int i = 0; i < 1000 ; i++) {
            if(i % 3 == 0){
                System.out.println(i);
                divCount += 1;
            }
        }
        //printing the final count
        System.out.println("Total: " +divCount);


        //Assignment #5
        //creating an array containing values 1-20
        int[] scoreBaseArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        //creating the loop
        for (int i = 0; i < scoreBaseArray.length; i++) {
            int scoreDouble = scoreBaseArray[i] * 2, scoreTriple = scoreBaseArray[i] *3;
            System.out.println(scoreBaseArray[i] +", " +scoreDouble+ ", " +scoreTriple);
        }
*/
        //Assignment #6

        //this project isn't difficult, just thinking about how to do it most efficiently


        //Assignment #7
        String numString = "7-8-9-4-5";
        numString.replace("-", " ");


        //Assignment #8
        //creating the array containing the 5 integers
        int[] intInputArray = new int[5];
        //creating the loop to fill the array
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < intInputArray.length; i++) {
            System.out.println("Enter value " +i+ " in the array");
            intInputArray[i] = input.nextInt();

        }
        //cycling through the array
        for (int i = 0; i < intInputArray.length; i++) {
            for (int j = 0; j < intInputArray.length; j++) {
                if(intInputArray[i] == intInputArray[j] && i != j){
                    System.out.println("Match found at index " +i+ " and " +j+ ". The value is " +intInputArray[j]);
                }
            }

            //Assignment #9
            //creating an array to store the letters
            System.out.println("D");
            System.out.println(" I");
            System.out.println("  A");
            System.out.println("   G");
            System.out.println("    O");
            System.out.println("     N");
            System.out.println("      A");
            System.out.println("       L");
            System.out.println("        L");
            System.out.println("         Y");

            //Assignment #10


        }
    }
}
