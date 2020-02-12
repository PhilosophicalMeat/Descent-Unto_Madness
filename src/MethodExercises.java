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
    //method for player one's turn
    public static void playerOneTurn(int tempCount){

    }
}
