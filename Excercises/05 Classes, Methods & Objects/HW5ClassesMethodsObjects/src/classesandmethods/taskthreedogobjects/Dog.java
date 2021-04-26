package classesandmethods.taskthreedogobjects;

/**
 * Created by Rossen on 14.2.2016 г..
 */

/*
    Задача 3:
    Напишете програма, която създава x на брой обекта от тип Dog. x се въвежда от клавиатурата. Дава им имена от вида
    MyDog-N, където N e уникален пореден номер на обекта, и накрая извиква метода bark() на всеки от тях.
    Нека Dog има член променлива: name и метод, чиято импленентация да принтира name + “ is barking very loud”.
    Напишете метод, който връща броя на създадените обекти от класа Dog. Напишете проверка дали броят създадени обекти
    е равен на x.
*/

public class Dog {
    public String name;
    static int counter = 0;;

    public Dog() {

    }

    public Dog(String name) {
        this.name = name;
    }

    public String bark(String name) {
        counter++;
        String output = name + " is barking very loudly.";
        return output;

    }
}