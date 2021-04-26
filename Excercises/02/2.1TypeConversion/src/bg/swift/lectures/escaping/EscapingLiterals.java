package bg.swift.lectures.escaping;

/**
 * Created by Anatoli on 30/01/2016.
 */
public class EscapingLiterals {

    public static void main(String[] args) {
        // An ordinary symbol
        char symbol = 'a';
        System.out.print(symbol);

        // Unicode symbol code in a hexadecimal format
        symbol = '\u003A';
        System.out.print(symbol);

        // Assigning the single quote symbol
        symbol = '\'';
        System.out.print(symbol);

        // Assigning the backslash symbol
        symbol = '\\';
        System.out.print(symbol);
    }
}
