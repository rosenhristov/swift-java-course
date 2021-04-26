package task2house;

/**
 * Created by Rossen on 24.2.2016 г..
 */
public interface PetOwner {
    public void feedThePet(Dog dog);
    public void feedThePet(Cat cat);
    public void feedThePet(Fish... fish);
    public void cleanAfterPet(Dog dog);
    public void cleanAfterPet(Cat cat);
    public void cleanAfterPet(Fish... fish);
    public void play(Dog dog);
    public void play(Cat cat);
    public void watch( Fish... fish);

}
