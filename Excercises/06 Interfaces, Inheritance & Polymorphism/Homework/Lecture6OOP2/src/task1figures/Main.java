package task1shapes;

import task1figures.Figure;
import task1figures.FigureGenerator;
import java.util.Random;

/**
 * Created by Rossen on 19.2.2016 г..
 */
/*
    Задача 1:
    Моделирайте йерархия от геометрични обекти:
    - Circle
    - Rectangle
    - Square
    - Triangle
    За всички от тях трябва да имаме възможност да пресмятаме обиколката и площта им. Използвайте абстрактен базов клас
    като корен на тази йерархия от класове. Създайте 10 произволни фигури и ги запишете в масив. За всеки фигура в
    масива отпечатайте нейните измерения, периметър и площ. Прочетете в интернет как работи методът Math.random() –
    използвайте го за да генерирате числата необходими за тези 10 произволни фигури. Може да разгледате и каква
    функционалност ви предлага класът java.util.Random – може да го ползвате вместо Math.random();
*/
public class Main {
    public static void main(String[] args) {
       Figure[] figs = new Figure[10];

        initializeFigsArray(figs);
        for (int i = 0; i < figs.length; i++) {
            System.out.println(figs[i].printData());
        }


    }

    public static Figure[] initializeFigsArray(Figure[] figs) {
        FigureGenerator figGen = new FigureGenerator();
        Random rand = new Random();
        for (int i = 0; i < figs.length; i++) {
            int figType = 1 + rand.nextInt(4);
            figs[i] = figGen.getFigure(figType);
        }
        return figs;
    }
}
