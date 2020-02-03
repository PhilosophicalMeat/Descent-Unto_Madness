public class ReviewAssignment01 {
    public static void main(String[] args) {
        //Assignment #2
        //This is a string. It contains text values.
        String tempString = "This is a string";
        //This is a char. It contains single characters and can be printed as text
        char tempChar = 'A';
        //This is an int. It contains a WHOLE numerical value that can be positive or negative
        int tempInt = 15;
        //This is a double. It contains a DECIMAL value that can be positive or negative
        double tempDouble = 1.75;
        //This is a float. It contains a WHOLE numerical value that can be positive or negative
        float tempFloat = 18;
        //This is a long. It contains a WHOLE numerical value that can be positive or negative
        long tempLong = 12;
        //This is a byte. It can hold any WHOLE numerical value between -127 and +127 inclusive
        byte tempByte = 8;

        //assignment 3 is unnecessary

        //Assignment #4
        int bottlePackage = 12;
        double packageCost = 3.50;
        String brandName = "PureLife";

        //Assignment #5
        //changing the number of bottles in a package
        bottlePackage = 24;
        //changing the cost per package
        packageCost = 4.50;
        //changing the brand
        brandName = "Selection Natural Spring Water";

        //Assignment #6
        double bottleCost = packageCost / bottlePackage;
        System.out.println(bottleCost);

        //Assignment #7
        //creating a for loop
        for (int i = 0; i < bottlePackage; i++) {
            System.out.println("The price of " +i+ " bottles is $" +(i*bottleCost));
        }

        //Assignment #8
        //creating the array
        double[] priceArray = new double[101];
        //creating the loop
        for (int i = 0; i <100 ; i++) {
            priceArray[i] = bottleCost*i;
        }

        //Assignment #9
        //to navigate the task presented in assignment #8. Creating a method to fill an array with specific information
        //is entirely possible, but the most simple solution would be the use of a while loop.

        //Assignment #10
        //to create an array that has 3 rows with 10 columns, you initialize the array how you normally would, but add
        //a second set of square brackets. The first set represents rows, and the second represents columns.
        int [][] tempArray = new int[3][10];
        int num = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                num+=1;
                tempArray[i][j] = num;
                System.out.print(tempArray[i][j] + ", ");
            }
            System.out.println();
        }


    }
}
