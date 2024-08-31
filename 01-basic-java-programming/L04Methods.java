public class L04Methods {
    
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        System.out.println(addTwoNumber(n1, n2));
    }

    // methods are functions but are attached to a class
    // just default to `public static` and don't worry about what it does
    // every method in Java has the following <RETURN DATA TYPE> <METHOD NAME> (<PARAMETERS)
    // `int addTwoNumber(int n1, int n2)` -> addTwoNumber recieves two integer parameters and return an integer as a result
    public static int addTwoNumber(int number1, int number2) {
        return number1 + number2;
    }

    // we want a method that returns the user's weight category based on their bmi
    public static String getWeightCategory(double bmi) {
        if (bmi <= 18.5) {
            return "Underweight";
        } else if (bmi <= 25) {
            return "Healthy";
        } else if (bmi <= 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

}
