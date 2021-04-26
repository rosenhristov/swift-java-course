package bg.swift.lectures.streams;

import java.io.*;

/**
 * CopyBytesExample.java
 */
public class CopyBytesExample {

    public static void main(String[] args) throws IOException {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream("in.jpg");
            out = new FileOutputStream("out.jpg");

            int c;
            while ((c = in.read()) != -1) {
                    out.write(c);
                    out.flush();
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
