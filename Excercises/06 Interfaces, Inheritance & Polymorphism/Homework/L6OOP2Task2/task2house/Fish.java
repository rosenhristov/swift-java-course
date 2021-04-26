package task2house;

/**
 * Created by Rossen on 24.2.2016 г..
 */
public class Fish implements Pet {
    private String color = null;

    public String getColor() {
        return "The color of the fish is " + this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println("The fishes ate some food. " +
                "Now they're satisfied.");
    }

    public void checkFood(boolean isFed) {
        if (isFed) {
            System.out.println("The fishes have food.");
        } else {
            System.out.println("The fishes have no food");
        }
    }

    @Override
    public void play(Person person) {
        System.out.println("The fish hides between the plants in the aquarium.");
    }
}
