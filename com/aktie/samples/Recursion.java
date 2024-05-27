package src.com.aktietech.samples;

public class Recursion {

    public static void main(String[] args) {
        double factorial = factorial(5);

        System.out.println("Factorial " + 5 + " = " + factorial);
    }

    public static double factorial(double baseNumber) {
        if (baseNumber == 1) {
            return 1;
        }

        return baseNumber * factorial(baseNumber - 1);
    }
    
    //5 * 4!--> 5 * 24 
    //4 * 3!--> 24
    //3 * 2!--> 6
    //2 * 1!--> 2
    //1 * 1 --> 1

}
