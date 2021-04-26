package tasktwocomparatorandcolator;

import java.text.Collator;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

/**
 * Created by Rossen on 6.4.2016 г..
 */
public class ComparatorAndColatorSorting {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        //Add values from Task 1
        ts.add("Yana");
        ts.add("Rossen");
        ts.add("Anton");
        ts.add("Nadya");
        ts.add("Iva");
        ts.add("Milena");
        ts.add("Aleksandra");
        ts.add("Ivo");
        ts.add("Bojidar");
        ts.add("Viktoriya");
        Iterator itr = ts.iterator();
        while (itr.hasNext()) {//iterates through the treeset and writes the names in the second file
            System.out.println(itr.next());
        }//TreeSet prints its elements sorted
        System.out.println("TreeSet prints its elements sorted");

        System.out.println("\nNow sorting with collator and printing again:");
        Object[] arr = ts.toArray();
        sortArray(Collator.getInstance(), arr);//sorting method using collator
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    //Implementation of the sorting method
    public static void sortArray(Collator collator, Object[] objArray) {
        Object tmp;
        if (objArray.length == 1)
            return;
        for (int i = 0; i < objArray.length; i++) {
            for (int j = i + 1; j < objArray.length; j++) {
                if (collator.compare(objArray[i], objArray[j]) > 0) {
                    tmp = objArray[i];
                    objArray[i] = objArray[j];
                    objArray[j] = tmp;
                }
            }
        }
    }
}
