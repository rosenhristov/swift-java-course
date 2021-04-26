package task2house;

/**
 * Created by Rossen on 24.2.2016 г..
 */
public class Dog implements Pet {
   private String name = "Sharo";
    private String breed = "Collie";
    private int age = 3;
    private boolean isFed = false;

    public String getName() {
        return "Dog's name is " + name;
    }
    public String getAge() {
        return "Sharo's age is " + age;
    }

    public String getBreed() {
        return "Sharo's breed is " + breed;
    }

    @Override
    public void eat() {
        System.out.println("The dog ate its food. " +
                "Now it's satisfied.");
    }

    @Override
    public void checkFood(boolean isFed) {
        if (isFed) {
            System.out.println("The dog has food.");
        } else {
            System.out.println("The dog has no food");
        }
    }

    @Override
    public void play(Person person) {
        System.out.println("The dog plays with a person from the family.");
    }
}
