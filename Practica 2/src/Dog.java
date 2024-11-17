// clase dog con arreglos

class Dog{
    String name;
    
    public static void main(String[] args){
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = new Dog();
        
        myDogs[0].name = "Fido";
        myDogs[1].name = "Zeus";
        myDogs[2].name = "Luna";
        
        System.out.print("El ultimo perro se llama ");
        System.out.println(myDogs[2].name);
        
        int x = 0;
        while(x < myDogs.length){
            myDogs[x].bark();
            x = x + 1;
        }
    }


public void bark(){
    System.out.println(name + " dice Guau!");
}

public void eat(){
    System.out.println("comiendo!!");
} 

public void chaseCat(){
    System.out.println(name + " persigue gatos");
} 

}