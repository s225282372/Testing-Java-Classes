
import java.util.ArrayList; // need this to store help us store our pets in a list
import java.util.Scanner;  // need this to take/read user input

// Abstract class
abstract class Animal // for common animal properties and methods
{ 
    String name;
    int age;

    public Animal(String name, int age) // constructor
    { 
        this.name = name;
        this.age = age;
    }

    public abstract void speak(); // abstract method, must be implemented by concrete subclasses

    public void displayInfo() // display pet info
    {   
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Interface
interface Trainable // for animals that are trainable 
{ 
    void doTrick(); // method to perform a trick, must be implemented by classes that implement this interface
}

// Dog class
class Dog extends Animal implements Trainable 
{
    public Dog(String name, int age) 
    {
        super(name, age); // used to call the constructor of the Super/Parent class (Animal)
    }

    @Override
    public void speak() 
    {
        System.out.println(name + " barks: Woof Woof!");
    }

    @Override
    public void doTrick() 
    {
        System.out.println(name + " can roll over!");
    }
}

// Cat class
class Cat extends Animal implements Trainable
{
    public Cat(String name, int age) 
    {
        super(name, age); // same as above
    }

    @Override
    public void speak() 
    {
        System.out.println(name + " meows: Meow Meow!");
    }
    @Override
    public void doTrick()
    {
        System.out.println(name + " can play dead!");
    }
}

// Bird class
class Bird extends Animal // for birds, lets not implement Trainable
{
    public Bird(String name, int age) 
    {
        super(name, age);
    }

    @Override
    public void speak() 
    {
        System.out.println(name + " chirps: Tweet Tweet!");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // (System.in) to read user input
        ArrayList<Animal> pets = new ArrayList<>(); // a list to store our pets

        System.out.println(" Welcome to Pet Manager ");

        while (true) 
        {
            System.out.println("\nChoose an animal to add (dog/cat/bird) or type 'done' to finish: ");
            String type = scanner.nextLine().toLowerCase(); // convert input to lowercase for easier comparison

            if (type.equals("done")) 
            {
                break;
            }

            if (!(type.equals("dog") || type.equals("cat") || type.equals("bird"))) 
            {
               System.out.println("Invalid Animal type! Please try again!");
               continue;  // go back to ask again
            }

            System.out.print("Enter the animal's name: ");
            String name = scanner.nextLine();

            System.out.print("Enter the animal's age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            Animal animal = null; // to hold the new animal object

            switch (type) 
            {
                case "dog":
                    animal = new Dog(name, age); // create a new Dog object
                    break;
                case "cat":
                    animal = new Cat(name, age); // create a new Cat object
                    break;
                case "bird":
                    animal = new Bird(name, age); // create a new Bird object
                    break;
                // default:
                //     System.out.println("Unknown animal type. Please try again.");
                //     continue;
            }

            pets.add(animal); // adds the new animal to the list
            System.out.println(name + " has been added to your pet list!");
        }

        // Display all pets
        System.out.println("\n--- Your Pets ---");
        for (Animal a : pets) // The loop goes through each animal in the list and assigns it temporarily to the variable a.
        {                     // in this case all the pets are treated as Animal because of polymorphism

            a.displayInfo(); // Calls the non-abstract methods from Animal class e.g displayInfo()
            a.speak();  // calls the overridden methods implemented in each subclass

            if (a instanceof Trainable) // instanceof checks if the current object (a) implements the Trainable interface
            {
                ((Trainable) a).doTrick(); // if true, cast a to Trainable and call doTrick()
            }

            System.out.println("----------------------");
        }

        scanner.close();
    }
}
