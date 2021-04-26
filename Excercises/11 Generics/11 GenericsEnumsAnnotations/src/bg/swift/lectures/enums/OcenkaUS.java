package bg.swift.lectures.enums;

public enum OcenkaUS implements Grade {
    A(4){
        public void print(){
            System.out.println("Excellent A");
        }
    },
    B(3){
        public void print(){
            System.out.println("Very Good B");
        }
    },
    C(2){
        public void print(){
            System.out.println("Good C");
        }
    },
    D(1){
        public void print(){
            System.out.println("Average D");
        }
    },
    F(0){
        public void print(){
            System.out.println("Poor F");
        }
    };

    public abstract void print();

    final int value;
    OcenkaUS(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }

    static String describe(){
        return Grade.describe()+" по шестобалната система в САЩ";
    }
}
