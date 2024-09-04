public class LandAnimal extends Animal {
    private int legs;
    public void walk() {
        System.out.println("Walking");
    }

    // The @Override is a reminder that the programmer
    // the method is actually "superceding" the one in the parent
    @Override
    public void move() {
        System.out.println("Walking");
    }

    public LandAnimal() {
        super();  // call the parents default constructor to construct the parent
        legs = 4;
        
    }

    public LandAnimal(String name, double weight, String diet, int legs) {
        super(name, weight, diet); // construct the parent first
        this.legs = legs;
    }
}
