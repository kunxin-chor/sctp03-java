import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void askUserForNumbers(ArrayList<Integer> numbers) {
        // Create a scanner to get input from user
        Scanner sc = new Scanner(System.in);

        // Method 2
        while (true) {
            System.out.print("Enter number: ");
            String input = sc.nextLine();

            if (input.toLowerCase().equals("q")) {
                break;
            }

            int givenNumber = Integer.parseInt(input);
            numbers.add(givenNumber);
        }
    }

    public static void displayNumbers(ArrayList<Integer> numbers) {
        // Show the content of the array
        for (int n : numbers) {
            System.out.println(n);
        }
    }

    public static int calculateMedian(ArrayList<Integer> numbers) {
        int median = numbers.get(numbers.size() / 2);
        return median;
    }

    public static int calculateTotal(ArrayList<Integer> numbers) {
        int total = 0;
        for (int n : numbers) {
            total = total + n;
        }
        return total;
    }

    public static double calculateMean(ArrayList<Integer> numbers) {

        int total = calculateTotal(numbers);

        // cast the total variable as double
        double mean = (double) total / numbers.size();

        return mean;
    }

    public static int calculateMode(ArrayList<Integer> numbers) {
        LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<Integer>();

        for (int n : numbers) {
            uniqueNumbers.add(n); // duplicated number will be ignored
        }

        System.out.println(uniqueNumbers);
        int mode = -999;
        int count = 0;
        int currentCount = 0;
        for (int currentCandidate : uniqueNumbers) {

            // count how many times did the currentCandidate occurs in the numbers arraylist
            for (int number : numbers) {
                if (number == currentCandidate) {
                    currentCount++;
                }
            }

            if (currentCount > count) {
                mode = currentCandidate;
                count = currentCount;
            }
        }
        return mode;

    }

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        askUserForNumbers(numbers);

        displayNumbers(numbers);

        int median = calculateMedian(numbers);
        double mean = calculateMean(numbers);
        int mode = calculateMode(numbers);

        System.out.println("Median =" + median);
        System.out.println("Mean = " + mean);
        System.out.println("Mode = " + mode);
    }
}
