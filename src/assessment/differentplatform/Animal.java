package assessment.differentplatform;

public class Animal {
    public void makeSound()
    {
        System.out.println("Animal sound");
    }
public static class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof! Woof!");

    }
}
public static class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow! Meow!");
    }
}

    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.makeSound();
        Animal a2= new Cat();
        a2.makeSound();

    }
}
