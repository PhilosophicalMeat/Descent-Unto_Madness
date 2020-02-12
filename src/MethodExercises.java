import java.util.Scanner;
public class MethodExercises {
    public static Scanner input = new Scanner(System.in);
    //main method
    public static void main(String[] args) {
        gameStart();
    }
    //startGame method
    public static void gameStart(){
        int nimStartAmount;
        System.out.println("Enter the start amount for this match (15-30)");
        nimStartAmount = input.nextInt();
        checkStartAmount(nimStartAmount);
        while(nimStartAmount > 0) {
            int decAmount = 0;
            checkPlayerOneTurn();

        }
    }
    //method for checking the start amount
    public static void checkStartAmount(int tempInt){
        if(tempInt > 30 || tempInt < 15){
            System.out.println("Error: entered start value is not within the established max or min. please enter a valid number.");
            tempInt = input.nextInt();
            checkStartAmount(tempInt);
        }
        else{
            System.out.println("Value accepted");
        }
    }
    //method for checking player's removal amount
    public static void checkPlayerOneTurn(int tempInt, int tempCount){
        if(tempInt > 3 || tempInt <=0 || tempCount < tempInt){
            System.out.println("There are " +tempCount+ " stones remaining. Player One's turn.");
            System.out.println("error: invalid input. please enter a value between 1 and 3 that does not exceed the number of remaining stones");
            tempInt = input.nextInt();
            checkPlayerOneTurn(tempInt, tempCount);
        }
        else{
            tempCount -= tempInt;
            if(tempCount == 0){
                System.out.println("Player One loses. Player Two wins!!!");
            }
        }
    }
}
