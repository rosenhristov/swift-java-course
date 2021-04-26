package bg.swift.lectures.exercise.one;

/**
 * Created by Anatoli on 23-Feb-16.
 */
public class MyOwnAutoShop {

    public static void main(String[] args) {
        Sedan sedan = new Sedan(220, 20000, "black", 3.5f);
        Ford fordOne = new Ford(180, 26000, "silver", 2016, 4f);
        Ford fordTwo = new Ford(180, 36000, "white", 2016, 4f);
        Truck truck = new Truck(160, 120000, "coca-cola", 5000);
        Car car = new Car(240, 30000, "red");

        System.out.printf("Sedan SalePrice %.2f %n", sedan.getSalePrice());
        System.out.printf("fordOne SalePrice %.2f %n", fordOne.getSalePrice());
        System.out.printf("fordTwo SalePrice %.2f %n", fordTwo.getSalePrice());
        System.out.printf("Car SalePrice %.2f %n", car.getSalePrice());
        System.out.printf("Truck SalePrice %.2f %n", truck.getSalePrice());
    }
}
