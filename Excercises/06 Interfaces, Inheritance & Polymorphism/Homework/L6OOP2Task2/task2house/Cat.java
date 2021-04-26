package task2house;

/**
 * Created by Rossen on 24.2.2016 г..
 */
public class Cat implements Pet {
    private String name = "Matsa";
    private String breed = "Bobtail";
    private int age = 2;
    private boolean isFed = false;

    public String getName() {
        return "Cat's name is " + name;
    }
    public String getAge() {
        return "Matsa's age is " + age;
    }

    public String getBreed() {
        return "Matsa's breed is " + breed;
    }

    public void eat() {
        System.out.println("The cat ate its food. " +
                "Now it's satisfied.");
    }

    public void checkFood(boolean isFed) {
        if (isFed) {
            System.out.println("The cat has food.");
        } else {
            System.out.println("The cat has no food");
        }
    }

    public void play(Person person) {
        System.out.println("The cat plays with a person from the family.");
    }
}
