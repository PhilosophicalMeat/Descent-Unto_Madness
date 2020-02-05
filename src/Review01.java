public class Review01 {
    public static void main(String[] args) {

        //Assignment #2
        //String
        String stringTemp = "This is a string. It contains a line, or lines, of text";

        //char
        char charTemp = 'a'; //contains single characters

        //integer
        int tempInt = 24; //contains exclusively WHOLE numbers

        //double
        double doubleTemp = 14.63754; //holds approximate values (decimals & whole values)

        //boolean
        boolean boolTemp = true; //values can be 'true', 'false', '1', or '0'

        //long
        long longTemp = 1; //contains whole values. not sure what the distinction is from 'int'

        //byte
        byte byteTemp = 75; //not sure what the deal is with byte

        //short
        short shortTemp = 15; //again, not sure what the deal is

        //Assignment #3
        //float
        float floatTemp = 1.5f; //if that 'f' is not entered, it will be recognized as a double instead of a float(in the case of decimal values)


        //Assignment #4
        //declaring the necessary variables
        int packageTotal = 12;
        double packageCost = 3.5;
        String brandName = "Pure Life";

        //Assignment #5
        packageTotal = 24;
        packageCost = 4.5;
        brandName = "Selection Natural Spring Water";

        //Assignment #6
        //calculating and printing the cost of a single bottle at the same time
        System.out.println("Cost of a single bottle: $" +(packageCost/packageTotal));

        //Assignment #7
        //creating a variable containing the cost of a single bottle
        double bottleCost = packageCost/packageTotal;
        for (int i = 1; i <= packageTotal; i++) {
            System.out.println("The price of " +i+ " bottle(s) of " +brandName+ " is $" +(bottleCost*i));
        }
        System.out.println();

        //Assignment #8
        //creating the array to store the costs
        double[] costArray = new double[100];
        //inititializing a for loop to store the data into the array
        for (int i = 0; i < 100; i++) {
            costArray[i] = (i+1)*bottleCost;
            System.out.println(costArray[i]);
        }

        //Assignment #9
        //method 1: you could use a "while" loop to automatically fill the array with the values
        //method 2: you can use "do-while" loops
        //potention third method: methods

        //Assignment #10
        //creating an array with 10 rows and 3 columns
        int count = 0;
        int[][] tempIntArray = new int[10][3];
        for (int i = 0; i < tempIntArray.length; i++) {
            for (int j = 0; j < tempIntArray[i].length; j++) {
                tempIntArray[i][j] = count+1;
                count+=1;
                System.out.println(tempIntArray[i][j]);
            }
        }
    }
}
