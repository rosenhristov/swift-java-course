package bg.swift.lectures.enums;

public interface Grade {
    void print();
    int getValue();
    static String describe(){
        return "Оценка";
    }
}
