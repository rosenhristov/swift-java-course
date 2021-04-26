package classesandmethods.taskthreedogobjects;

import java.util.Scanner;

/**
 * Created by Rossen on 14.2.2016 г.
 * Creates N objects of type Dog. 'N' is defined by the user. The names are of type 'MyDog-N', containes a static field
 * that counts the number of the created objects and finally checks if the value of the counter coincides with the
 * value inputed by the user, it prints the number of objects created successfully.
 */
/*
    Задача 3:
    Напишете програма, която създава x на брой обекта от тип Dog. x се въвежда от клавиатурата. Дава им имена от вида
    MyDog-N, където N e уникален пореден номер на обекта, и накрая извиква метода bark() на всеки от тях.
    Нека Dog има член променлива: name и метод, чиято импленентация да принтира name + “ is barking very loud”.
    Напишете метод, който връща броя на създадените обекти от класа Dog. Напишете проверка дали броят създадени обекти
    е равен на x.
*/
public class TaskThreeDogObjectsCreator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter the number of the dogs: ");
        int x = input.nextInt();
        Dog[] dogs = new Dog[x];

        createDogs(x, dogs);

        //Check if x dogs were created successfully
        if (x == dogs[x-1].counter) {
            System.out.printf("%d dogs were created successfully.", dogs[x-1].counter);
        }
    }

    private static String generateDogName(int i) {
        String name = ("MyDog-" + (i + 1));
        return name;
    }

    public static Dog[] createDogs(int x, Dog[] dogs) {
        for (int i = 0; i < x; i++) {
            String dogName = generateDogName(i);
            dogs[i] = new Dog(dogName);
            System.out.println(dogs[i].bark(dogName));
        }
        return dogs;
    }
}