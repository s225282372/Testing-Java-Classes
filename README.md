# 🐾 Pet Manager App

This is a simple Java console application that demonstrates **Object-Oriented Programming (OOP)** concepts such as **inheritance, abstraction, interfaces, and polymorphism**.

## 🚀 Features
- Add multiple pets (Dog, Cat, Bird)
- Each pet has a name and age
- Dogs & Cats can perform tricks (interface implementation)
- Uses **Scanner** for user input
- Demonstrates **ArrayList, loops, and instanceof**

## 🛠 Technologies
- Java (JDK 8+)
- VS Code or any Java IDE

## 📂 Project Structure
```
Main.java
```

- `Animal` (abstract class): Base class for all pets  
- `Dog`, `Cat`, `Bird` (subclasses): Extend `Animal`  
- `Trainable` (interface): Implemented by `Dog` & `Cat`
- `Main`: Contains program entry point and user interaction  

## 💻 Example Run
```
🐾 Welcome to Pet Manager 🐾

Choose an animal to add (dog/cat/bird) or type 'done' to finish: 
dog
Enter the animal's name: Rex
Enter the animal's age: 5
Rex has been added to your pet list! ✅

Choose an animal to add (dog/cat/bird) or type 'done' to finish: 
cat
Enter the animal's name: Whiskers
Enter the animal's age: 2
Whiskers has been added to your pet list! ✅

Choose an animal to add (dog/cat/bird) or type 'done' to finish: 
done

--- 🐶🐱🐦 Your Pets ---
Name: Rex, Age: 5
Rex barks: Woof Woof!
Rex rolls over!
----------------------
Name: Whiskers, Age: 2
Whiskers meows: Meow Meow!
Whiskers can play dead!
----------------------
```

## 📖 Concepts Shown
- **Abstract class** → common base (`Animal`)
- **Interface** → optional behavior (`Trainable`)
- **Polymorphism** → calling `speak()` on different animals
- **Collections** → store pets in an `ArrayList`
- **User Input** → handled with `Scanner`

---

## 🧑‍💻 Author
Maselaelo Glen
