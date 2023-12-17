class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}
class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Bark! Bark!");
    }
    public void fetch() {
        System.out.println("Fetching the ball");
    }
}
class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
    public void scratch() {
        System.out.println("Scratching furniture");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makeSound();
        cat.makeSound();
        ((Dog) dog).fetch();
        ((Cat) cat).scratch();
    }
}
