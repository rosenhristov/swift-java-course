package bg.swift.lectures.exceptions;

import java.io.IOException;

public class ThrowsExample {

    public static void main(String[] args)  {
        RuntimeException exception = new NullPointerException("We have a problem");
        throw exception;
    }
}
