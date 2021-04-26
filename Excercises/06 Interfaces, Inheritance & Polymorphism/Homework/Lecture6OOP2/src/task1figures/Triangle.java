package task1figures;

/**
 * Created by Rossen on 19.2.2016 г..
 */
public class Triangle extends Figure {
    double side1, side2, side3;

    /**
     * Constructor
     * @return an object with the three dimensions values set
     */
    public Triangle (double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     * Getter
     * @return value of side1
     */
    public double getSide1() {
        return side1;
    }

    /**
     * Setter
     * @param side1 sets value of side1
     */
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    /**
     * Getter
     * @return value of side 2
     */
    public double getSide2() {
        return side2;
    }

    /**
     * Setter
     * @param side2 sets value of side2
     */
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    /**
     * Getter
     * @return value of side3
     */
    public double getSide3() {
        return side3;
    }

    /**
     * Setter
     * @param side3 sets value of side3
     */
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    /**
     * GetPerimeter
     * @return the perimeter of the triangle
     */
    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    /**
     * GetArea
     * @return the area of the triangle derived from Perimeter (Heron's formula)
     */
    public double getArea() {//Heron's formula: A = sqrt(p(p-a)(p-b)(p-c)), where 'p' is 0.5*P (perimeter),
        // i.e. p = (a+b+c)/2
        return Math.sqrt((this.getPerimeter()/2) * ((this.getPerimeter()/2)- this.side1) *
                ((this.getPerimeter()/2) - this.side2) *
                ((this.getPerimeter()/2) - this.side3));
    }

    /**
     * PrintData
     * @return the data about the figure: dimensions, perimeter and area
     */
    public String printData() {
        return "TRIANGLE: " + this.getClass() +  "\nSide1 = " + this.getSide1() + " m. Side2 = " + this.getSide2() +
                " m. Side3 = " + this.getSide3() + " m." +
                "\nPerimeter: " + this.getPerimeter() + " m." +
                "\nArea: " + this.getArea() + " m^2.\n\n";

    }
}
