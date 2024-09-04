public class FlyingAnimal extends Animal {
    private double wingspan;
    private void fly() {
        System.out.println("Flying!");
    }

    public FlyingAnimal() {
        super(); // call the parent's default constructor to construct the parent
        wingspan = 1;
    }

    public FlyingAnimal(String name, double weight, String diet, double wingspan) {
        super(name, weight, diet); // <-- call the parent's overloaded constructor
        this.wingspan = wingspan;
     }
}
