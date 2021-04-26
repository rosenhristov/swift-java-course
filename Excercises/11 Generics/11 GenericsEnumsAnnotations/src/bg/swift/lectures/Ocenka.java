package bg.swift.lectures;

import java.io.Serializable;

public enum Ocenka {
    SLAB(2) {
        void print(){
            System.out.println("Слаб 2");
        }
    },
    SREDEN(3){
        void print(){
            System.out.println("Среден 3");
        }
    },
    DOBAR(4){
        void print(){
            System.out.println("Добър 4");
        }
    },
    MNOGO_DOBAR(5){
        void print(){
            System.out.println("Много добър 5");
        }
    },
    OTLICHEN(6){
        void print(){
            System.out.println("Отличен 6");
        }
    };

    abstract void print();

    final int value;

    Ocenka(int value){
        this.value = value;
    }
    int getValue(){
        return this.value;
    }

    static String describe(){
        return "Оценка по шестобалната система";
    }
}
