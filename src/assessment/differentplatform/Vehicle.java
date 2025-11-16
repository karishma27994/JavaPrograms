package assessment.differentplatform;

public class Vehicle {
    public void start()
    {

    }
    public static class car extends Vehicle{
        @Override
        public void start() {
            System.out.println("Car engine starts with a roar!");
        }
    }
    public static class bike extends Vehicle{
        @Override
        public void start() {
            System.out.println("Bike engine starts with a purr!");
        }
    }

    public static void main(String[] args) {
        Vehicle[] vehicles = {new car(), new bike()};
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].start();
        }
    }
}
