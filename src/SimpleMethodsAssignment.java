public class SimpleMethodsAssignment {
    public static void main(String[] args) {
        //Assignment #1
        outString("I will be paid on friday the ");
        outInt(23);
        outString("rd day of September. \nI expect to be paid $");
        outDouble(234.56);

        //using the outLn methods
        outLnString("All hail his mAjesty! The sAAAddest piece of garbage in the entIIIRe cosmoooos!");
        outLnInt(6);
        outLnString("It'll come out... eventually");
        outDouble(5.99999999999999999999999);


        //Assignment #3
    }
//"out" methods
    public static void outString(String inputString) {
        System.out.print(inputString);
    }
    public static void outInt(int inputInt){
        System.out.print(inputInt);
    }
    public static void outDouble(double inputDouble){
        System.out.print(inputDouble);
    }
    //"outln" methods
    public static void outLnString(String inputString){
        System.out.println(inputString);
    }
    public static void outLnInt(int inputInt){
        System.out.println(inputInt);
    }
    public static void outLnDouble(double inputDouble){
        System.out.println(inputDouble);
    }

    //testPrimeNumber methods
    public static void testPrimeNumber(int testInputInt){
        boolean prime = true;
        for (int i = 2; i < testInputInt-1; i++) {
            prime = (testInputInt%i == 0)? false : true;
        }
        if(prime = true){
            System.out.println();
        }
    }
}