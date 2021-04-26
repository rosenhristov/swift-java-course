package bg.swift.lectures.streams;

import java.io.*;

/**
 * Created by Anatoli.
 */
public class CopyCharactersExample {

    public static void main(String[] args) throws IOException {
        Reader inputStream = null;
        Writer outputStream = null;
        try {
            inputStream = new FileReader("in.jpg");
            outputStream = new FileWriter("charout.jpg");
            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
