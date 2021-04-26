package task1figures;

/**
 * Created by Rossen on 19.2.2016 г..
 */
public class Circle extends Figure {
    private double radius = 0.0;

    /**
     * Constructor
     * @param radius the radius of the circle
     */
    Circle (double radius) {
        this.radius = radius;
    }

    /**
     * Setter
     * @param radius sets value of radius
     */
   public void setRadius(double radius) {
       this.radius = radius;
   }

    /**
     * Getter
     * @return gets value of radius
     */
   public double getRadius () {
       return this.radius;
   }

    /**
     * Get Perimeter
     * @return evaluates the perimeter
     */
    @Override
   public double getPerimeter (){
       return (2.0 * Math.PI * radius);
   }

    /**
     * Get Area
     * @return evaluates the area
     */
    @Override
    public double getArea () {
        return (Math.PI * Math.pow(this.radius, 2));
    }

    /**
     * Print data
     * @return class, radius, perimeter, area
     */
    @Override
    public String printData() {
        return "CIRCLE: " + this.getClass() + "\nRadius: " + this.getRadius() + " m." +
                "\nPerimeter: " + this.getPerimeter() + " m." +
                "\nArea: " + this.getArea() + " m^2.\n\n";

    }
}
