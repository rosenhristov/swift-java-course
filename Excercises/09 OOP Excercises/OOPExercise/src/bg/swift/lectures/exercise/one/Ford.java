package bg.swift.lectures.exercise.one;

/**
 * Created by Anatoli on 23-Feb-16.
 */
public class Ford extends Car {
    private int year;
    private double manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color,
                int year, double manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    /**
     * From the salePrice
     * computed from Car class, subtract the manufacturerDiscount
     * @return
     */
    @Override
    public double getSalePrice() {
        return super.getSalePrice() - manufacturerDiscount;
    }
}
