import java.io.*;

class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);

        // Serialization
        try (FileOutputStream fos = new FileOutputStream("person.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(person);
            System.out.println("Object serialized successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (FileInputStream fis = new FileInputStream("person.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Object deserialized successfully.");

            System.out.println("Name: " + deserializedPerson.getName());
            System.out.println("Age: " + deserializedPerson.getAge());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

