import java.util.Scanner;
// Every program must be a class -> Java is a class-first programming language
public class L01BMICalculator {
    // Every Java must have a main function. The main function can accpet command line arguments
    // and they will be stored in `args`
    public static void main(String[] args) {
        System.out.println("BMI Calculator");
        
        // Ask the user for the data with the Java's built in classes Scanner
        // 1. Create an instance of scanner (the java.util.Scanner is a class aka template)
        // Getting things in Java means -> creating objects from classes, and using the methods in those objects
        // ==> OBJECT ORIENTED PROGRAMMING (OOP)
        Scanner sc = new Scanner(System.in); // System.in => keyboard

        System.out.println("Enter your name: ");
        String name = sc.nextLine();  // nextLine() will wait for the user to type in text and to press ENTER
                                      // and whatever the user enters in will be returned
        System.out.println("Welcome " + name + "!");

        System.out.println("Please enter your weight: ");
        double weight = sc.nextDouble();

        System.out.println("Please enter your height: ");
        double height = sc.nextDouble();

        // formula: weight / height ** 2
        double bmi = weight / (height * height);

        System.out.println("Your BMI is " + bmi);
        if (bmi <= 18.5) {
            System.out.println("Underweight");
        } else if (bmi <= 25) {
            System.out.println("Healthy Weight");
        } else if (bmi <= 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
