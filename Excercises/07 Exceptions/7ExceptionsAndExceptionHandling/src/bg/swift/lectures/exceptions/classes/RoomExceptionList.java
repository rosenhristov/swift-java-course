package bg.swift.lectures.exceptions.classes;

import java.io.EOFException;
import java.io.IOException;

public class RoomExceptionList extends BuildingChecked {
    void color() throws EOFException {
        System.out.println("White Checked");
    }

    public static void main(String args[]) throws Throwable {
        BuildingChecked obj = new RoomExceptionList();
        try {
            obj.color();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
