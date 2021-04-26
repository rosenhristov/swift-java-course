package bg.swift.lectures.abstraction;

public class Laptop {

    CPU cpu = new IntelCPU();

    public static void main(String[] args) {
        Laptop myLaptop = new Laptop();
        myLaptop.cpu.calculate();
    }
}
