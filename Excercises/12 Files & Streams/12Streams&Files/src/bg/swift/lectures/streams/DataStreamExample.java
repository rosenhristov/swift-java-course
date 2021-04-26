package bg.swift.lectures.streams;

import java.io.*;

/**
 * Created by Anatoli.
 */
public class DataStreamExample {

    static final String dataFile = "datastream.data";
    static final double[] prices = {19.99, 9.99, 15.99, 3.99, 4.99};
    static final int[] units = {12, 8, 13, 29, 50};
    static final String[] descs = {"Java T-shirt",
            "Java Mug",
            "Duke Juggling Dolls",
            "Java Pin",
            "Java Key Chain"};

    public static void main(String[] args) {

        try {
            DataOutputStream out = new DataOutputStream(
                    new BufferedOutputStream(new FileOutputStream(dataFile)));

            for (int i = 0; i < prices.length; i++) {
                out.writeDouble(prices[i]);
                out.writeInt(units[i]);
                out.writeUTF(descs[i]);
            }
            out.close();

            DataInputStream in = new DataInputStream(
                    new BufferedInputStream(new FileInputStream(dataFile)));

            double price;
            int unit;
            String desc;
            double total = 0.0;
            for (int i = 0; i < prices.length; i++) {
                price = in.readDouble();
                unit = in.readInt();
                desc = in.readUTF();
                System.out.format("You ordered %d units of %s at %.2f%n", unit, desc, price);
                total += unit * price;
            }
            System.out.format("Total price: %.2f", total);
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
