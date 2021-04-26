package bg.swift.lectures.classes;

/**
 * Created by Anatoli on 09-Feb-16.
 */
public class SwiftStudent {

    final int AGE_INCREMENT = 1;

    String name;
    int age;
    char gender;
    boolean driver;

    public SwiftStudent() {
        System.out.println("calling constructor");
        driver = false;
    }

    public SwiftStudent(String nameParam,
                        int ageParam,
                        char genderParam,
                        boolean driverParam) {
        name = nameParam;
        age = ageParam;
        gender = genderParam;
        driver = driverParam;
    }

    public void setNameAgeGenderAndDriver(String nameParam,
                                          int ageParam,
                                          char genderParam,
                                          boolean driverParam) {
        name = nameParam;
        age = ageParam;
        gender = genderParam;
        driver = driverParam;
    }

    public void learn() {
        System.out.println("I'm learning");
    }

    public boolean canDrive() {
        return driver;
    }

    public void gettingOld() {
        age += AGE_INCREMENT;
    }

    public void productive(boolean isProductive) {
        if (isProductive) {
            System.out.println("I am productive!");
        } else {
            System.out.println("I am not productive!");
        }
    }

}
