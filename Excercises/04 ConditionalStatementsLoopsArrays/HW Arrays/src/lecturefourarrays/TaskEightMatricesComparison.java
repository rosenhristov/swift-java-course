package lecturefourarrays;

/**
 * Created by Rossen on 13.2.2016 г..
 */
/*
    Напишете програма, която срявнява две матрици от тип NxM за идентичност. Напишете два варианта, използвайки масиви
    от един примитивен тип и от един референтен тип по ваш избор.
*/
public class TaskEightMatricesComparison {
    public static void main(String[] args) {
        //declaring two arrays of type 'int'
        int[][] intMatrix1 = new int [4][5];
        int[][] intMatrix2 = new int [4][5];

        System.out.println("SOLUTION ONE: Arrays containing primitive data type (int):");
        //initialization of the two matrices of type int[][]
        for (int i = 0; i < intMatrix1.length; i++) {
            for (int j = 0; j < intMatrix1[0].length ; j++) {
                intMatrix1[i][j] = (i + j) * 2;//example values
            }
        }
        for (int i = 0; i < intMatrix2.length; i++) {
            for (int j = 0; j < intMatrix2[0].length; j++) {
                intMatrix2[i][j] = (i + j) * 2;//example values
            }
        }

        //Print the two arrays
        System.out.println("Matrix 1 is: ");
        for (int i = 0; i < intMatrix1.length; i++) {
            for (int j = 0; j < intMatrix1[0].length ; j++) {
                System.out.printf("%d ", intMatrix1[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Matrix 2 is: ");
        for (int i = 0; i < intMatrix2.length; i++) {
            for (int j = 0; j < intMatrix2[0].length; j++) {
                System.out.printf("%d ", intMatrix2[i][j]);
            }
            System.out.println();
        }

        //arrays are equal if their both dimentions are equal
        if ((intMatrix1.length == intMatrix2.length) && (intMatrix1[0].length == intMatrix2[0].length)) {
            System.out.println("The two arrays of type 'int' are with equal dimensions.");
            for (int i = 0; i < intMatrix1.length; i++) {
                for (int j = 0; j < intMatrix2[0].length; j++) {
                    if (intMatrix1[i][j] == intMatrix2[i][j]) {
                        System.out.printf("Elements with index [%d][%d] are equal.\n", i, j);
                        if((i == intMatrix1.length - 1)&&(j == intMatrix1[0].length - 1)){
                            System.out.println("The two matrices are totally identical.");
                        }
                    } else {//it is enough to find one pair of nonequal elements and the arrays are not equal as a whole
                        System.out.printf("Elements with indexes [%d][%d] are NOT equal.\n", i, j);
                        System.out.println("The two matrices are not identical.");
                        break;
                    }
                }
            }
        } else {
            System.out.println("The two 'int' matrices are not with equal dimensions. " +
                    "They are not identical");
        }
        System.out.println();

        System.out.println("SOLUTION TWO: Arrays containing refference data type (String):");

        //Declaration and initaialization of two 2D arrays of type 'String'
        String[][] strMatrix1 = {
                {"Rossen", "Plamenov", "Hristov"},
                {"Swift", "Java", "course"}
        };
        String[][] strMatrix2 = {
                {"Rossen", "Plamenov", "Hristov"},
                {"Swift", "Java", "Course"}
        };

        //Print the two arrays
        System.out.println("String matrix 1 is: ");
        for (int i = 0; i < strMatrix1.length; i++) {
            for (int j = 0; j < strMatrix1[0].length ; j++) {
                System.out.printf("%s ", strMatrix1[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("String matrix 2 is: ");
        for (int i = 0; i < strMatrix2.length; i++) {
            for (int j = 0; j < strMatrix2[0].length; j++) {
                System.out.printf("%s ", strMatrix2[i][j]);
            }
            System.out.println();
        }

        //Matrices are not identical if they don't have equal dimensions
        if ((strMatrix1.length == strMatrix2.length) && (strMatrix1[0].length == strMatrix2[0].length)) {
            System.out.println("The two arrays of type 'String' are with equal dimensions.");
            for (int i = 0; i < strMatrix1.length; i++) {
                for (int j = 0; j < strMatrix1[0].length; j++) {
                    if (strMatrix1[i][j].compareTo(strMatrix2[i][j])!= 0) {
                        System.out.printf("The elements with index [%d][%d] are equal.\n", i, j);
                        if((i == strMatrix1.length - 1)&&(j == strMatrix1[0].length - 1)){
                            System.out.println("The two matrices are totally identical.");
                        }
                    } else {//it is enough to find one pair of nonequal elements and the arrays are not equal as a whole
                        System.out.println("The two arrays of type 'String' have different elements. " +
                                "They are not equal.");
                        break;//"Course" differs from "course". Java is a case sensitive language.
                    }
                }
            }
        } else {
            System.out.println("String matrices are not with equal dimensions. " +
                    "They are not identical.");
        }


    }
}
