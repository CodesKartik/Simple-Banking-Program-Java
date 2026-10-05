

public class polymorphRuntime {
    static class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }

    static class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Cat meows");
        }
    }
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Upcasting
        myAnimal.sound(); // Calls Dog's sound method

        myAnimal = new Cat(); // Upcasting
        myAnimal.sound(); // Calls Cat's sound method
    }
}