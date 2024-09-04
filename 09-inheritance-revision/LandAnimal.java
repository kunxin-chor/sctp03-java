public class LandAnimal extends Animal {
    private int legs;
    private void walk() {
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
