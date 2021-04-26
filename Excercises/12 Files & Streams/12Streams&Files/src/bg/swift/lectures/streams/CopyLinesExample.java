package bg.swift.lectures.streams;

import java.io.*;

/**
 * Created by Anatoli.
 */
public class CopyLinesExample {
    public static void main(String[] args) throws IOException {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        try {
            inputStream =
                    new BufferedReader(new FileReader("in.txt"));
            outputStream =
                    new PrintWriter(new FileWriter("charout.txt"));
            String line;

            while ((line = inputStream.readLine()) != null) {
                outputStream.println(line);
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
