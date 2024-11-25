// Práctica 6. Jerarquía de clases de animales con interfaz Pet y clase de prueba.

class Dog extends Animal implements Pet {
    private String name;

  public Dog(String name) {
    this.name = name;
  }

  public void beFriendly() {
    System.out.println("Dog " + name + " is friendly.");
  }

  public void play() {
    System.out.println("Dog " + name + " is playing.");
  }
}

class Cat extends Animal implements Pet {
     private String name;
  public Cat(String name) {
    this.name = name;
  }

  public void beFriendly() {
    System.out.println("Cat " + name + " is friendly.");
  }

  public void play() {
    System.out.println("Cat " + name + " is playing.");
  }
}

public class Main {
  public static void main(String[] args) {
    Dog dog = new Dog("Firulais");
    Cat cat = new Cat("Garfield");

    dog.beFriendly();
    dog.play();
    cat.beFriendly();
    cat.play();
  }
}