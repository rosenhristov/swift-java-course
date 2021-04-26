package bg.swift.lectures.interfaces;

public class Cat implements Animal, Lovable {
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void drink() {
        System.out.println("Cat drinks too..? (wtf)");
    }

    @Override
    public void showsLove() {
        System.out.println("Cat purrs");
    }
}
