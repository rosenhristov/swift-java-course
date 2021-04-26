package Task1MonthEnum;

/**
 * Created by Rossen on 18.3.2016 г..
 */
public enum Months {
    JANUARY(1) {
        void print(){
            System.out.println("JANUARY");
        }
    },
    FEBRUARY(2){
        void print(){
            System.out.println("FEBRUARY");
        }
    },
    MARCH(3){
        void print(){
            System.out.println("MARCH");
        }
    },
    APRIL(4) {
        void print() {
            System.out.println("APRIL");
        }
    },
    MAY(5) {
        void print() {
            System.out.println("MAY");
        }
    },
    JUNE(6) {
        void print() {
            System.out.println("JUNE");
        }
    },
    JULLY(7) {
        void print() {
            System.out.println("JULLY");
        }
    },
    AUGUST(8) {
        void print() {
            System.out.println("AUGUST");
        }
    },
    SEPTEMBER(9) {
        void print() {
            System.out.println("SEPTEMBER");
        }
    },
    OCTOBER(10) {
        void print() {
            System.out.println("OCTOBER");
        }
    },
    NOVEMBWER(11) {
        void print() {
            System.out.println("NOVEMBWER");
        }
    },
    DECEMBER(12) {
        void print() {
            System.out.println("DECEMBER");
        }
    };

    abstract void print();

    final int value;

    Months(int value) {
        this.value = value;
    }
    int getValue(){
        return this.value;
    }
    static String describe(){
        return "Prints the name of a month after its number's been input.";
    }
}
