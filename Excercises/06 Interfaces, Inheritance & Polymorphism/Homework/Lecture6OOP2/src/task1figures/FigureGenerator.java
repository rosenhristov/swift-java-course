package task1figures;

/**
 * Created by Rossen on 22.2.2016 г..
 */
public class FigureGenerator {
    int figType = 0;

    /**
     * Figure factory
     * @param figType random number between 1 and 4 to define what kind of figure will be instantiated
     * @return a figure, child of abstract class Figure
     */
    public Figure getFigure(int figType) {
        this.figType = figType;

        switch (figType) {
            case 1:
                return new Circle(0.01 + Math.random());
            case 2:
                return new Square((0.01 + Math.random()), (0.01 + Math.random()));
            case 3:
                return new Rectangle((0.01 + Math.random()), (0.01 + Math.random()));
            case 4:
                return new Triangle((0.01 + Math.random()), (0.01 + Math.random()), (0.01 + Math.random()));
        }
        return null;
    }
}
