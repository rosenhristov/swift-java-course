package Task4GenericValueSwapper;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
* Зад.4: Напишете генеричен метод, който разменя две числа използвайки генерични типове
*/
/**
 * Created by Rossen on 27.3.2016 г.
 * This program exchanges the values of two numbers entered by the user. It is working with generic types, thus it
 * doesn't matter what type of numbers the user inputs.
 */

public class GenericValueSwapper<T> {
    /**
     * @param num1 first number
     * @param num2 second number
     */
    private T num1;
    private T num2;

    /**
     * Seeter for num1
     * @param num1
     */
    public void setNum1(T num1) {
        this.num1 = num1;
    }
    /**
     * Setter for num2
     * @param num2
     */
    public void setNum2(T num2) {
        this.num2 = num2;
    }
    /**
     * Getter for num1
     * @return num2
     */
    public T getNum1() {
        return num1;
    }

    /**
     * Getter for num2
     * @return num2
     */
    public T getNum2() {
        return num2;
    }

    /**
     * Method main() of the program
     * @param args
     * @throws InputMismatchException
     */
    public static void main(String[] args) throws InputMismatchException {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose the type of the number\n" +
                "Type one of the following:\n" +
                "\"byte\", \"short\", \"int\", \"long\" or \"double\"");
        String valueType = input.nextLine();

        if (valueType.equalsIgnoreCase("byte")) {
            GenericValueSwapper<Byte> gvsb = new GenericValueSwapper<Byte>();
            Byte temp = null;
            System.out.println("Insert Number1: ");
            gvsb.setNum1(input.nextByte());
            System.out.println("Insert Number2: ");
            gvsb.setNum2(input.nextByte());
            System.out.println(gvsb.swapValues(gvsb.getNum1(), gvsb.getNum2(), temp));
        }
        else if (valueType.equalsIgnoreCase("short")) {
            GenericValueSwapper<Short> gvss = new GenericValueSwapper<Short>();
            Short temp = null;
            System.out.println("Insert Number1: ");
            gvss.setNum1(input.nextShort());
            System.out.println("Insert Number2: ");
            gvss.setNum2(input.nextShort());
            System.out.println(gvss.swapValues(gvss.getNum1(), gvss.getNum2(), temp));
        } else if (valueType.equalsIgnoreCase("int")) {
            GenericValueSwapper<Integer> gvsi = new GenericValueSwapper<Integer>();
            Integer temp = null;
            System.out.println("Insert Number1: ");
            gvsi.setNum1(input.nextInt());
            System.out.println("Insert Number2: ");
            gvsi.setNum2(input.nextInt());
            System.out.println(gvsi.swapValues(gvsi.getNum1(), gvsi.getNum2(), temp));
        } else if (valueType.equalsIgnoreCase("long")) {
            GenericValueSwapper<Long> gvsl = new GenericValueSwapper<Long>();
            Long temp = null;
            System.out.println("Insert Number1: ");
            gvsl.setNum1(input.nextLong());
            System.out.println("Insert Number2: ");
            gvsl.setNum2(input.nextLong());
            System.out.println(gvsl.swapValues(gvsl.getNum1(), gvsl.getNum2(), temp));
        } else if (valueType.equalsIgnoreCase("float")) {
            GenericValueSwapper<Float> gvsf = new GenericValueSwapper<Float>();
            Float temp = null;
            System.out.println("Insert Number1: ");
            gvsf.setNum1(input.nextFloat());
            System.out.println("Insert Number2: ");
            gvsf.setNum2(input.nextFloat());
            System.out.println(gvsf.swapValues(gvsf.getNum1(), gvsf.getNum2(), temp));
        } else if (valueType.equalsIgnoreCase("double")) {
            GenericValueSwapper<Float> gvsf = new GenericValueSwapper<Float>();
            Float temp = null;
            System.out.println("Insert Number1: ");
            gvsf.setNum1(input.nextFloat());
            System.out.println("Insert Number2: ");
            gvsf.setNum2(input.nextFloat());
            System.out.println(gvsf.swapValues(gvsf.getNum1(), gvsf.getNum2(), temp));
        } else {
            System.out.println("You have not typed one of the numerical value types shown above.\n" +
                    "Please restart the programme and type exactly the name of one of the following value types:\n" +
                    "\"byte\" | \"short\" | \"int\" | \"long\" | \"double\" (case insensitive)");
        }
    }

    /**
     * Method that exchanges the values of num1 and num2 with generic types
     * @param num1 num1
     * @param num2 num2
     * @param temp temporary variable used for a value container during the change
     * @return a string with the exchanged values of num1 and num2
     */
    public T swapValues(T num1, T num2, T temp) {//method that exchange values of generic types of vars
        this.num1 = num1;
        this.num2 = num2;
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("The exchanged values:\tNumber1 = " + num1  + "\tNumber2 = " + num2);
        return temp = null;
    }
}
