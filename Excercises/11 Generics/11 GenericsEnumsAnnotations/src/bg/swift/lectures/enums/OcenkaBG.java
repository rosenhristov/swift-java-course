package bg.swift.lectures.enums;

public enum OcenkaBG implements Grade {
    SLAB(2), SREDEN(3), DOBAR(4), MNOGO_DOBAR(5), OTLICHEN(6);

    final int value;
    OcenkaBG(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }

    public void print(){
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
        return Grade.describe()+" по шестобалната система в България";
    }
}
