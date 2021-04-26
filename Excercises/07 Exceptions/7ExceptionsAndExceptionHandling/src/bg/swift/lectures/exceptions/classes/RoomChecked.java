package bg.swift.lectures.exceptions.classes;

import java.io.IOException;

public class RoomChecked extends BuildingChecked {
    void color() throws IOException {
        System.out.println("White Checked");
    }

    public static void main(String args[]) {
        BuildingChecked obj = new RoomChecked();
        try {
            obj.color();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
