/**
 * Created by Rossen on 31.1.2016 г..
 */
/*
Declare two variables of types ‘float’ and ‘double’.
Print the results of comparing of the two variables on the screen using the operators for comparison, equality and inequality (==, !=, <=, <, >, =>). Let the initial value of the variables be:

double doubleDigit = 3.5;
float floatDigit = 3.5f;

After that change the values of the variables:
doubleDigit = 3.2;
floatDigit = 3.2f;

Print the comparisons again.

Try to explain the behaviour using comment in the bottom of the code. Why is such a behaviour possible according to you?
*/


public class TaskEightFloatDoubleComparison {
    public static void main(String[] args) {
        double doubleDigit = 3.5;
        float floatDigit = 3.5f;
        System.out.println(doubleDigit == floatDigit);
        System.out.println(doubleDigit != floatDigit);
        System.out.println(doubleDigit >= floatDigit);
        System.out.println(doubleDigit <= floatDigit);
        System.out.println(doubleDigit > floatDigit);
        System.out.println(doubleDigit < floatDigit);

        doubleDigit = 3.2;
        floatDigit = 3.2f;
        System.out.println(doubleDigit == floatDigit);
        System.out.println(doubleDigit != floatDigit);
        System.out.println(doubleDigit >= floatDigit);
        System.out.println(doubleDigit <= floatDigit);
        System.out.println(doubleDigit > floatDigit);
        System.out.println(doubleDigit < floatDigit);

        //the reason is this:
        doubleDigit = 3.5;
        floatDigit = 3.5f;
        System.out.println(doubleDigit - floatDigit);//0.0
        doubleDigit = 3.2;
        floatDigit = 3.2f;
        System.out.println(doubleDigit - floatDigit);//-4.7683715642676816E-8
        //Double (64 bit) and Float (32 bit) are types with different floating point accuracy -
        // double accuracy  and a single one, respectively. The Float accuracy
        // is up to the 7th - 8th number after the floating point whereas the
        // double accuracy is up to the 15th - 16th number after the floating point.
        //Numbers are represented in the following way (IEEE-754 Standard for Floating Point Arithmetic):
        //R = M * q^p, where:
        //R - real number
        //M - Mantice
        //q - the base of the numerical system, e.g. binary system (0 and 1, used by computers)
        //p - exponential order of the number



    }
}
