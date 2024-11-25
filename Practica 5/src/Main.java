// Implemente una jerarquía de clases con información de animales y escriba una clase de prueba donde 
//se declare un arreglo de animales, creando un objeto de cada tipo de animal e invocando los métodos declarados en la superclase Animal.

class Dog extends Animal {
    public void makeNoise() {
        System.out.println("Dog make noise");
    }

    public void eat() {
        System.out.println("Dog eat");
    }

    public void sleep() {
        System.out.println("Dog sleep");
    }

    public void roam() {
        System.out.println("Dog roam");
    }
}

class Cat extends Animal {
    public void makeNoise() {
        System.out.println("Cat make noise");
    }

    public void eat() {
        System.out.println("Cat eat");
    }

    public void sleep() {
        System.out.println("Cat sleep");
    }

    public void roam() {
        System.out.println("Cat roam");
    }
}

class Lion extends Animal {
    public void makeNoise() {
        System.out.println("Lion make noise");
    }

    public void eat() {
        System.out.println("Lion eat");
    }

    public void sleep() {
        System.out.println("Lion sleep");
    }

    public void roam() {
        System.out.println("Lion roam");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Lion();

        for (Animal animal : animals) {
            animal.makeNoise();
            animal.eat();
            animal.sleep();
            animal.roam();
        }
    }
}