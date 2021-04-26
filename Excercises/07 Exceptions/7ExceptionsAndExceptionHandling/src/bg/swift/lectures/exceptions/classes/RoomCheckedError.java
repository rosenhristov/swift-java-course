package bg.swift.lectures.exceptions.classes;

import java.io.IOException;

public class RoomCheckedError extends Building {
    void color() throws IOException {
        System.out.println("White Checked");
    }

    public static void main(String args[]) {
        Building obj = new RoomCheckedError();
        try {
            obj.color();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
