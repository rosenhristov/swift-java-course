package bg.swift.lectures.streams;

import java.io.*;

/**
 * Created by Anatoli.
 */
public class ObjectInputStreamExample {

    public static class Person implements Serializable {
        public String name = null;
        public int age = 0;
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("person.bin"));

        Person person = new Person();
        person.name = "Anatoli Iliev";
        person.age = 30;

        objectOutputStream.writeObject(person);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("person.bin"));

        Person personRead = (Person) objectInputStream.readObject();

        objectInputStream.close();

        System.out.println(personRead.name);
        System.out.println(personRead.age);
    }
}
