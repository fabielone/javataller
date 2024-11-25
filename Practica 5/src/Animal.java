class Animal {
  
    private String picture;
    private String food;
    private int hunger;
    private int boundaries;
    private int location;

    public Animal() {
        this.picture = "";
        this.food = "";
        this.hunger = 0;
        this.boundaries = 0;
        this.location = 0;
    }

    public Animal(String picture, String food, int hunger, int boundaries, int location) {
        this.picture = picture;
        this.food = food;
        this.hunger = hunger;
        this.boundaries = boundaries;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Animal make noise");
    }

    public void eat() {
        System.out.println("Animal eat");
    }

    public void sleep() {
        System.out.println("Animal sleep");
    }

    public void roam() {
        System.out.println("Animal roam");
    }

}