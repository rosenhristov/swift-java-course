package bg.swift.lectures.exceptions.classes;

public class RoomException extends BuildingChecked {
    void color() throws Exception {
        System.out.println("White Checked");
    }

    public static void main(String args[]) {
        BuildingChecked obj = new RoomException();
        try {
            obj.color();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
