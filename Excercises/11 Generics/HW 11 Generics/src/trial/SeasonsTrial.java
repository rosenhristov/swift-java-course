package trial;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Rossen on 24.3.2016 г..
 */
public class SeasonsTrial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        al.ensureCapacity(3);
        al.add(num1);
        al.add(num2);
        System.out.println(al.get(1));
        System.out.println(al.get(0));
        System.out.println(al.get(2));

    }
}
