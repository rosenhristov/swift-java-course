/**
 * Created by Rossen on 31.1.2016 г.
 */

/*
This program requires to define and initialize variables of different types.
To be sure the variable is defined properly, every variable is then printed on the console.
*/
public class TaskOneVarTypes {
    public static void main(String[] args) {

        byte byteVar = 5; //value type
        short shortVar = 100; //value type
        int intVar = 2000; //value type
        long longVar = 1000000; //value type
        float floatVar = 1.254f; //value type
        double doubleVar = 15.98765431203; //value type
        String str = "Rossen";//reference type
        char ch = 'R';
        boolean boolVar = true;
        Object obj1 = "Swift"; //reference type
        int[] intArray = new int[3]; //reference type

        //Printing of the variables in order to check if their definition and initialization is really all right
        System.out.println(byteVar);
        System.out.println(shortVar);
        System.out.println(intVar);
        System.out.println(longVar);
        System.out.println(floatVar);
        System.out.println(doubleVar);
        System.out.println(str);
        System.out.println(ch);
        System.out.println(boolVar);
        System.out.println(obj1);
        System.out.println(intArray);//prints the reference to the Heap stored in the Stack
        //printing all the values inside the array requires the use of a loop.
    }
}
