package bg.swift.lectures.console;

import java.util.Scanner;

/**
 * Created by Rossen on 01.02.2016
 */
public class IOConsole {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        System.out.printf("Your name is: %s! %n", name);
        System.out.print("Enter your age: ");
        int number = in.nextInt();
        System.out.printf("Your name is %s, and you are %d years old! %n ", name , number);
    }
}
