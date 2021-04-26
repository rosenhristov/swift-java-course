package bg.swift.lectures.exceptions;

import java.io.IOException;

/**
 * Created by Anatoli.
 */
public class TryCatchFinallyExample {

    public static void main(String[] args) {

        try {
            // Some code that may throw an exception
            throw new IOException();
        } catch (IOException objectName) {
            // Handle IOException and all its descendants
        } catch (Exception objectName) {
            // A (too) general exception handler
        } catch (Throwable objectName) {
            // A (too, too) general exception handler
        } finally {
            // Code here will always execute
        }
    }
}
