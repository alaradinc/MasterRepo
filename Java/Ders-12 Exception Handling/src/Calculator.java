public class Calculator {
    static int divide(int num1, int num2) throws ArithmeticException{ //prevents the crash and collapse of the program
//        try{
//            return num1 / num2;
//        }
//        catch (Exception e){
//            return -1;
//        }
        return num1 / num2; //if this crashed and didn't have a 'throws exception' the compiler would crash and cause the entire program to collapse
    } //so we write throws exception to tell the method to carry on with the code and deliver it to the main class
    //in the main class we use try and catch to re-evaluate the problem and continue with the overall program
}
