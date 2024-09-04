public class Animal {
    protected String name;
    protected double weight; // in KG
    protected String diet;
   
    // default constructor
    public Animal() {
        name = "Unnamed";
        weight = 0.01;
        diet = "Unknown";
    }

    // overloaded constructor
    public Animal(String name, double weight, String diet) {
        this.name = name;
        this.weight = weight;
        this.diet = diet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    
}
