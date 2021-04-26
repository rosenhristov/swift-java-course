package bg.swift.lectures.exercise.one;

/**
 * Created by Anatoli on 23-Feb-16.
 */

/**
 * Implementation of Car class
 */
public class Car {

    private int speed;
    private double regularPrice;
    private String color;

    /**
     * Constructor
     *
     * @param speed speed of the car
     * @param regularPrice regularPrice of the car
     * @param color color of the car
     */
    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    /**
     * Gets the regularPrice
     *
     * @return regularPrice
     */
    public double getSalePrice() {
        return regularPrice;
    }

    /**
     * Gets the speed
     *
     * @return speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Gets the regularPrice
     *
     * @return regularPrice
     */
    public double getRegularPrice() {
        return regularPrice;
    }

    /**
     * Gets the color
     *
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets speed
     * @param speed speed of the car
     */
    public void setSpeed(int speed){
        this.speed = speed;
    }

    /**
     * Sets regularPrice
     *
     * @param regularPrice regularPrice of the car
     */
    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    /**
     * Sets color
     *
     * @param color color of the car
     */
    public void setColor(String color) {
        this.color = color;
    }


}
