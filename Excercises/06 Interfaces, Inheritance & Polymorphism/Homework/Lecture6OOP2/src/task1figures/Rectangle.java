package task1figures;

/**
 * Created by Rossen on 19.2.2016 г..
 */
public class Rectangle extends Figure {
    /**
     * defines fiels
     */
    private double length = 0.0;
    private  double width = 0.0;

    /**
     * Constructor with parameters
     * @param length
     * @param width
     */
    Rectangle (double length, double width) {
        super();
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
     * @param width sets value of width
     */
    public void setWidth(double width) {
        this.width = width;
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
     * @return the value of width
     */
    public double getWidth() {
        return this.width;
    }

    /**
     * Get Perimeter
     * @return the perimeter
     */
    public double getPerimeter (){
        return 2 * (this.length + this.width);
    }

    /**
     * Area
     * @return the area
     */
    public double getArea (){
        return (this.length * this.width);
    }

    /**
     * @return class, dimensions, perimeter, area
     */
    @Override
    public String printData() {
        return "RECTANGLE: " + this.getClass()  +  "\nLength: " + this.getLength() + " m and Width: " + this.getWidth() + " m." +
                "\nPerimeter: " + this.getPerimeter()  + " m." +
                "\nArea: " + this.getArea() + " m^2.\n\n";

    }
}
