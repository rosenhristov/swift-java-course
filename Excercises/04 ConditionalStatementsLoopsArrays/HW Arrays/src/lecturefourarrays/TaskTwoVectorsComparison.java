package lecturefourarrays;

import java.util.Arrays;

/**
 * Created by Rossen on 8.2.2016 г..
 */
/*
    2. Напишете програма, която срявнява два масива за идентичност (например масивът {1,2,3} ще е равен на масива
    {1,2,3}, но няма да е равен на {1,2,2} или {1,2}).Напишете два варианта, използвайки масиви от един примитивен тип
    и от един референтен тип по ваш избор.
*/
public class TaskTwoVectorsComparison {
    public static void main(String[] args) {
        //declaring two arrays of type 'int'
        int[] intArray1 = new int [5];
        int[] intArray2 = new int [5];

        //initialization of the two int[] arrays
        for (int i = 0; i < intArray1.length; i++) {
            intArray1[i] = (i + 1) * 2;//example values
        }
        for (int i = 0; i < intArray2.length; i++) {
            intArray2[i] = (i + 1) * 2;//example values
        }
        //Print the two arrays
        System.out.println("Array 1 is:");
        System.out.println(Arrays.toString(intArray1));
        System.out.println("Array 2 is:");
        System.out.println(Arrays.toString(intArray2));

        if (intArray1.length == intArray2.length) {//arrays are not equal if they do not have equal length
            System.out.println("The two arrays of type 'int' are with equal length.");
            for (int i = 0; i < intArray1.length; i++) {
                if (intArray1[i] == intArray2[i]) {
                    System.out.printf("Elements with index [%d] are equal.\n", i);
                    if(i == intArray1.length-1) {
                        System.out.println("The two arrays are totally identical");
                    }
                } else {//it is enough to find one pair of nonequal elements and the arrays are not equal as a whole
                    System.out.println("The two arrays have different elements. They are not identical.");
                    break;
                }
            }
        } else {
            System.out.println("int arrays are not with equal length");
            System.out.println("The two arrays are not identical");
        }
        System.out.println();

        //SOLUTION TWO: String Arrays(refference type)

        //declaring and initaialization of two arrays of type 'String'
        String[] strArray1 = {"Rossen", "Plamenov", "Hristov", "Swift", "Java", "course"};
        String[] strArray2 = {"Rossen", "Plamenov", "Hristov", "Swift", "Java", "Course"};

        //Print the two arrays
        System.out.println(Arrays.toString(strArray1));
        System.out.println(Arrays.toString(strArray2));

        if (strArray1.length == strArray2.length) {//arrays are not equal if they do not have equal length
            System.out.println("The two arrays of type 'String' are with equal length.");
            for (int i = 0; i < strArray1.length; i++) {
                if (strArray1[i].compareTo(strArray2[i])!= 0) {
                    System.out.printf("The elements with index [%d] are equal.\n", i);
                } else {//it is enough to find one pair of nonequal elements and the arrays are not equal as a whole
                    System.out.println("The two arrays of type 'String' have different elements. They are not identical.");
                    break;//"Course" differs from "course". Java is a case sensitive language.
                }
            }
        } else {
            System.out.println("int arrays are not with equal length");
            System.out.println("The two arrays are not identical");
        }

    }
}
