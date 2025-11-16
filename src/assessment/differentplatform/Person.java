package assessment.differentplatform;

public class Person {

    Person(String name, int age)
    {
        System.out.println("Name: " + name + "," + "Age: " + age);
    }

    public static void main(String[] args) {
        Person P1 = new Person("John" , 25);
        Person P2 = new Person("Alice" , 30);
    }
}
