class Main {
    public static void main(String args[]) {
        Meal lunch = new Meal();  // create a new object of the Meal class and store it in the lunch variable
                                  // an object is also known as an instance of a class.

        lunch.description = "Chicken Rice";
        lunch.calories = 450;

        System.out.println(lunch.description);
        System.out.println(lunch.calories);
       
    }
}