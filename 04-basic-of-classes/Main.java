

class Main {
    public static void main(String args[]) {
        Meal lunch = new Meal();  // create a new object of the Meal class and store it in the lunch variable
                                  // an object is also known as an instance of a class.

        lunch.calories = 300;
        lunch.description = "Chicken Rice";
       
        Meal dinner = new Meal();
        dinner.description = "Duck Rice";
        dinner.calories = -300;

        System.out.println(lunch.description);
        System.out.println(lunch.calories);

        Chef gordon = new Chef();
        gordon.setName("Gordon Ramesy");
        gordon.setYearsOfExperience(-40);

        System.out.println("Chef name is " + gordon.getName());
        System.out.println("Years of experience = " + gordon.getYearsOfExperience());
       
    }
}

class Chef {
    private String name;
    private int yearsOfExperience;

    // getter methods 
    public String getName() {
        return this.name;  // return the `name` of the object that called the method
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    // setter methods
    public void setName(String newName) {
        name = newName;
    }

    public void setYearsOfExperience(int newYears) {
        if (newYears >= 0) {
            this.yearsOfExperience = newYears;  // set the yearsOfExperience variable of the object that called the method
        } else {
            // inform the program that there been error of some sorts
            throw new IllegalArgumentException("newYears cannot be negative");
        }
      
    }

}

class Ingredient {
    private String name;
    private double weight;

    // getter
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private int contactNumber;

    public String getFullName() {
        return firstName +  " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    
}