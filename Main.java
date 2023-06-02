import java.io.*;
import java.util.*;

// Custom exception class
class CustomException extends Exception {
    CustomException(String message) {
        super(message);
    }
}

// Serializable class
class SerializableClass implements Serializable {
    private int value;

    public SerializableClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

// Thread class
class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + " is running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Array declaration and initialization
        int[] nums = {1, 2, 3, 4, 5};

        // Array access and manipulation
        System.out.println("Array elements:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("Sum of array elements: " + Arrays.stream(nums).sum());

        // Custom exception handling
        try {
            throw new CustomException("Custom exception thrown!");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

        // Inheritance
        Animal cat = new Cat("Tom");
        cat.makeSound();

        // Serialization
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.txt"));
            out.writeObject(new SerializableClass(42));
            out.close();
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.txt"));
            SerializableClass obj = (SerializableClass)in.readObject();
            System.out.println("Serialized object value: " + obj.getValue());
            in.close();
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }

        // Threading
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");
        t1.start();
        t2.start();
    }
}

// Inherited class
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(name + " says meow!");
    }
}

// Base class
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + " makes a sound!");
    }
}
