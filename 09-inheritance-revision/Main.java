import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // a variable of a more generic type
        // can hold a refrence to a more specific type
        // as long as they are in the same family
        Animal a = new LandAnimal();

        // a.walk() // doesn't work because `a` is a reference
                 // to Animal and Animal does not have a `walk` method

        a.move(); // this will call LandAnimal.move() because
                 // Java will always use the most specific version of the method
                 // (i.e if the child class has the same method Java will prioritze that instead)
                // method overriding

        // inversely, a variable for a more specific class
        // cannot store a more generic object
        // LandAnimal land = new Animal(); // <-- illegal
        

        // if a variable of a more generic type can store
        // an object of a more specific type, then it's the
        // same for ArrayList!
        ArrayList<Animal> zoo = new ArrayList<Animal>();
        zoo.add(new LandAnimal());
        zoo.add(new FlyingAnimal());

   

    }   
}
