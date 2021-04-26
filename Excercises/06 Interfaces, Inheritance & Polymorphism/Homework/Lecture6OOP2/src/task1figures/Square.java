package task1figures;

/**
 * Created by Rossen on 19.2.2016 г..
 */
public class Square extends Rectangle {
    private double length, width;


    /**
     * Constructor invokes the superconstructor
     * @param length dimension of the square
     * @param width dimension of the square
     */
    Square (double length, double width) {
        super(length, length);
        this.length = length;
        this.width = width;
    }

    /**
     * Setter
     * @param length sets value of length
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Setter
     * @param length sets width equal to length
     */
    public void setWidth(double length) {
        this.length = length;
    }

    /**
     * Getter
     * @return the value of length
     */
    public double getLength() {
        return this.length;
    }

    /**
     * Getter
     * @return the value of width equal to the value of length
     */
    public double getWidth() {
        return this.width = this.length;
    }

    /**
     * Get Perimeter
     * @return perimeter
     */
    @Override
    public double getPerimeter (){
        return 2 * (this.length + this.length);
    }

    /**
     * Get Area
     */
    @Override
    public double getArea() {
        return (this.length * this.width);
    }

    /**
     * @return class, dimensions, perimeter, area
     */
    @Override
    public String printData() {
        return "SQUARE: " + this.getClass() +  "\nSide: " + this.getLength() + " m." +
                "\nPerimeter: " + this.getPerimeter() + " m." +
                "\nArea: " + this.getArea() +  " m^2.\n\n";

    }
}
