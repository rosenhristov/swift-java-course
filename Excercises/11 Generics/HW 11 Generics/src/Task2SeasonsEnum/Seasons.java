package Task2SeasonsEnum;

/**
 * Created by Rossen on 23.3.2016 г..
 */
public enum Seasons {
    SPRING(1) {
        void print(){
            System.out.println("Spring");
        }
    },
    SUMMER(2){
        void print(){
            System.out.println("Summer");
        }
    },
    AUTUMN(3){
        void print(){
            System.out.println("Autumn");
        }
    },
    WINTER(4){
        void print(){
            System.out.println("Winter");
        }
    };

    abstract void print();

    final int value;

    Seasons(int value){
        this.value = value;
    }
    int getValue(){
        return this.value;
    }

    static String describe(){
        return "Returns the name of a season";
    }
}
