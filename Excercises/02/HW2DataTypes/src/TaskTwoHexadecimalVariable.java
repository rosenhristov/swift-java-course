/**
 * Created by Rossen on 31.1.2016 г..
 * Variable defined in a hexadecimal format. Then printed on the console to check if the definition is correct.
 */

/*
    Task 2
    Initialize a variable of type int equal to 256 in hexadecimal format(256 is 100 in numeric system with base 16)
*/
public class TaskTwoHexadecimalVariable {
    public static void main(String[] args) {
        int hexVariable = 0x100; //256 in 16-al format is defined as '0x100'

        System.out.println(hexVariable);//prints 256 (decimal format)
    }
}
