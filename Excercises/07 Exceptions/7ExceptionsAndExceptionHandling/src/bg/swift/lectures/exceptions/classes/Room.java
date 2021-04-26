package bg.swift.lectures.exceptions.classes;

public class Room extends Building {

    void color() throws NullPointerException {
        System.out.println("White");
    }

    public static void main(String args[]){
        Building obj = new Room();
        obj.color();
    }
}
