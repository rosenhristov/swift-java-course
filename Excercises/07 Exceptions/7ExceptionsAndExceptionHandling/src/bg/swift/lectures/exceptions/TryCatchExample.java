package bg.swift.lectures.exceptions;

import java.io.IOException;

/**
 * Created by Anatoli.
 */
public class TryCatchExample {

    public static void main(String[] args) {
        try {
            // Some code that may throw an exception
            throw new IOException();
        } catch (IOException objectName) {
            // Code handling an Exception
        } catch (Exception objectName) {
            // Code handling an Exception
        }
    }
}
