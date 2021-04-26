package task2house;

/**
 * Created by Rossen on 24.2.2016 г..
 */
/*
    Задача 2:
Дадена ни е къща. Всяка къща има стаи. Във всяка стая може да имате различен брой хора или животни.
Хората могат да хранят животните, а животните могат да си хапват от това, което им е оставено от хората
(ако не е оставено, ще стоят гладни – тоест, ако някой извика поведението хапвам на някое животно, то трябва преди
това задължително да бъде оставена храна от човека, в противен случай да се изпише в конзолата, че конкретната
животинка няма храна). Хората може да изпълняват различни роли: майка, баща, дете, и т.н. Всеки човек нека има име,
пол и възраст. Животните могат да бъдат куче, котка, рибка и каквото вие дефинирате.
Задачата е да се моделира тази къща с JAVA класове. Трябва да декларирате класове заедно с техните полета,
свойства, методи и конструктори. Дефинирайте и клас-програма, който демонстрира, че останалите класове работят
коректно: съставете си сценарии в тази къща, и го разпишете в този клас. Използвайте абстракция и/или интерфейси,
където смятате, че е нужно.
*/
public class Main {
    public static void main(String[] args) {
        House house = new House();

        Room diningRoom = new Room();
        house.room1 = diningRoom;
        Room livingRoom = new Room();
        house.room2 = livingRoom;

        Person rossen = new Person();
        Person elena = new Person();
        Person bogdan = new Person();
        Person nadya = new Person();
        Dog sharo = new Dog();
        Cat matsa = new Cat();
        Fish fish1 = new Fish();
        Fish fish2 = new Fish();
        Fish fish3 = new Fish();

        System.out.println(sharo.getName());
        System.out.println(sharo.getBreed());
        System.out.println(sharo.getAge());
        System.out.println(matsa.getName());
        System.out.println(matsa.getBreed());
        System.out.println(matsa.getAge());
        fish1.setColor("orange");
        fish2.setColor("blue");
        fish3.setColor("red");
        System.out.println(fish1.getColor());
        System.out.println(fish2.getColor());
        System.out.println(fish3.getColor());

        rossen.setAge(34);
        rossen.setName("Rossen");
        rossen.setGender(true);
        elena.setName("Elena");
        elena.setAge(33);
        elena.setGender(false);
        elena.setGender(false);
        nadya.setName("Nadya");
        bogdan.setName("Bogdan");
        nadya.setAge(5);
        bogdan.setAge(7);

        System.out.printf("%s's age is %d. %s is %s\n", rossen.getName(), rossen.getAge(),
                rossen.getName(), rossen.isMale ? "male" : "female");
        System.out.printf("%s's age is %d. %s is %s\n", elena.getName(), elena.getAge(),
                elena.getName(), elena.isMale ? "male" : "female");
        System.out.printf("%s's age is %d. %s is %s\n", nadya.getName(), nadya.getAge(),
                nadya.getName(), nadya.isMale ? "male" : "female");
        System.out.printf("%s's age is %d. %s is %s\n", bogdan.getName(), bogdan.getAge(),
                bogdan.getName(), bogdan.isMale ? "male" : "female");


        matsa.checkFood(false);
        rossen.feedThePet(matsa);
        matsa.eat();
        elena.cleanAfterPet(matsa);
        fish1.checkFood(false);
        elena.feedThePet(fish1, fish2, fish3);
        fish1.eat();
        fish2.eat();
        fish3.eat();
        rossen.cleanAfterPet(fish1, fish2, fish3);
        sharo.checkFood(false);
        nadya.feedThePet(sharo);
        sharo.eat();
        bogdan.cleanAfterPet(sharo);
        sharo.play(bogdan);
        rossen.play(matsa);
        elena.watch(fish1, fish2, fish3);
        matsa.play(elena);











    }
}
