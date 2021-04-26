package task2house;

/**
 * Created by Rossen on 24.2.2016 г..
 */
public class Person implements Mother, Father, Child, PetOwner {
    String name = null;
    boolean isMale = false;
    int age = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void feedThePet(Dog dog) {
            System.out.println("Sharo is given food.");
    }

    @Override
    public void feedThePet(Cat cat) {
        System.out.println("Matsa is given food.");
    }

    @Override
    public void feedThePet(Fish... fish) {
        System.out.println("Food is given to the fishes.");
    }

    @Override
    public void cleanAfterPet(Dog dog) {
            System.out.println("It's cleaned after Sharo.");
    }

    @Override
    public void cleanAfterPet(Cat cat) {
        System.out.println("It's cleaned after Matsa.");
    }

    @Override
    public void cleanAfterPet(Fish... fish) {
        System.out.println("A person cleaned the aquarium of the fishes.");
    }

    @Override
    public void play(Dog dog) {
        System.out.println( "A person plays with Sharo");
    }

    @Override
    public void play(Cat cat) {
        System.out.println("A person plays with Matsa");
    }

    @Override
    public void watch(Fish... fish) {
        System.out.println("A person stares at the fishes.");
    }

    @Override
    public void cleanHouse() {
        System.out.println("Mother cleans the house.");
    }

    @Override
    public void helpChildWithHomework(Person person) {
        System.out.println("Father helps her child with the homework.");
    }

    @Override
    public void buyFromSupermarket() {
        System.out.println("Dad goes to the supermarket.");
    }

    @Override
    public void helpMam() {
        System.out.println("Child helps Mam.");
    }

    @Override
    public void helpDad() {
        System.out.println("Child helps Dad.");
    }
}


