package bg.swift.lectures.exercise.one;

/**
 * Created by Anatoli on 23-Feb-16.
 */
public class Sedan extends Car {
    private float length;

    /**
     * Constructor
     *
     * @param speed        speed of the car
     * @param regularPrice regularPrice of the car
     * @param color        color of the car
     * @param length    length of the sedan
     */
    public Sedan(int speed, double regularPrice, String color,
                 float length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    /**
     * If length > 4 meters, 5% discount, Otherwise, 10% discount.
     * @return
     */
    @Override
    public double getSalePrice() {
        if (length > 4) {
            return super.getSalePrice() - super.getSalePrice() * 0.05;
        }

        return super.getSalePrice() - super.getSalePrice() * 0.10;
    }
}
