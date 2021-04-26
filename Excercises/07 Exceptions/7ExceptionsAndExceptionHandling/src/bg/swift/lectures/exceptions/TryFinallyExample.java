package bg.swift.lectures.exceptions;

import java.io.IOException;

/**
 * Created by Anatoli.
 */
public class TryFinallyExample {

    public static void main(String[] args) {
        try {
            // Some code that could or could not cause an exception
        } finally {
            // Code here will always execute
        }
    }
}
