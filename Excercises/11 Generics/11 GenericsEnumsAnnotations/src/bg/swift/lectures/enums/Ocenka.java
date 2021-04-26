package bg.swift.lectures.enums;

public enum Ocenka {
    SLAB(2), SREDEN(3), DOBAR(4), MNOGO_DOBAR(5), OTLICHEN(6);

    final int value;
    Ocenka(int value){
        this.value = value;
    }
    int getValue(){
        return this.value;
    }

    void print(){
        switch(this.value){
            case 2:
                System.out.println("Слаб 2");
                break;
            case 3:
                System.out.println("Среден 3");
                break;
            case 4:
                System.out.println("Добър 4");
                break;
            case 5:
                System.out.println("Много Добър 5");
                break;
            case 6:
                System.out.println("Отличен 6");
                break;
        }
    }

    static String describe(){
        return "Оценка по шестобалната система";
    }
}
