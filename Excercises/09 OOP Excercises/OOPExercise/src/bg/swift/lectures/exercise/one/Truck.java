package bg.swift.lectures.exercise.one;

/**
 * Created by Anatoli on 23-Feb-16.
 */
public class Truck extends Car {
    int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Returns sales price.
     * If weight>2000, 10% discount. Otherwise, 20% discount.
     *
     * @return discounted sales price
     */
    @Override
    public double getSalePrice() {
        if (weight > 2000) {
            return super.getSalePrice() - (.1 * super.getSalePrice());
        } else {
            return super.getSalePrice() - (.2 * super.getSalePrice());
        }
    }
}
