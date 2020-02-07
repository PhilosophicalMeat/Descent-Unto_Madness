import java.lang.String;
import java.util.Scanner;
public class Review03 {
    public static void main(String[] args) {

        //YOURE NOT DONE HERE. GET TO WORK


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

        //break and continue statements
        System.out.println("Break & Continue Statments: Int");
        Scanner scanner = new Scanner(System.in);
        int target;
        int[] valueArray = new int[10];
        for (int i = 0; i < 9; i++) {
            System.out.println("Enter value #" +(i+1));
            valueArray[i] = scanner.nextInt();
        }
        System.out.println("Enter Target Value");
        target = scanner.nextInt();
        for (int j = 0; j < valueArray.length; j++) {
            if(valueArray[j] == target){
                System.out.println("Target Confirmed: Value #" +(j+1));
                break;
            }
            else if(j == valueArray.length && valueArray[j] != target){
                System.out.println("Target not located amongst data.");
            }
        }

        //Break & Continue Statements: String
        System.out.println("Break & Continue Statements: String (Target: 'p')");
        String range = "Peter Piper picked a peck of pickled peppers.\n" +
                "A peck of pickled peppers Peter Piper picked.\n" +
                "If Peter Piper picked a peck of pickled peppers,\n" +
                "Where's the peck of pickled peppers Peter Piper picked?";
        char locate = 'i';
        System.out.println(range);
        for (int i = 0; i < range.length(); i++) {
            if (range.charAt(i) == locate) {
                System.out.println("Target Found: Character #" + (i + 1));
                break;
            }
            else if(i == range.length() && range.charAt(i) != locate){
                System.out.println("Target not in range.");
            }
        }

        //The '? : ' Operator: Integer Example
        int indepVar, depVarOne, depVarTwo, finalVar; //Declaring the independent and dependent variables
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the value of the independent variable");
        indepVar = reader.nextInt(); //Assigning a value to the independent variable
        System.out.println("The final value if the independent value is less than or equal to 10?");
        depVarOne = reader.nextInt(); //Declaring the resulting value if the independent variable is less than or equal to 10
        System.out.println("If the independent value is greater than 10?");
        depVarTwo = reader.nextInt(); //Declaring the resulting value if the independent variable is greater than 10
        finalVar = (indepVar <= 10) ? depVarOne : depVarTwo; //Conditional operator
        System.out.println("Resulting value: " +finalVar); // Printing the resulting value

        //The '? : ' Operator: String Example
        String inputVar, targetVar, resultString; //Stating the input and target variable
        boolean targetFound;
        System.out.println("Enter the independent string");
        inputVar = reader.nextLine(); //Stating independent string. Re-using 'reader' function from previous code
        System.out.println("Enter the target character or string");
        targetVar = reader.nextLine(); //Stating target character or string
        targetFound = (inputVar.contains(targetVar)) ? true : false;
        resultString = (targetFound == true) ? "Target '"+targetVar+"' located in text" : "Target not found in text"; //Determining printed response
        System.out.println(resultString);


    }
}
