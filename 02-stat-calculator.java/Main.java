import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // ArrayList<T>, where T is a data type (Integer, Double etc.)
        // Anytime you see a <T> attached to something, that something is a generic
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Alternatively:
        // ArrayList<Integer> numbers = new ArrayList<>();
        // var numbers = new ArrayList<Integer>();

        // Create a scanner to get input from user
        Scanner sc = new Scanner(System.in);

        // if the user keys in anything but "Q" or 'q'

        // Method 1
        //   System.out.print("Enter number: ");
        // String input = sc.nextLine();
        //
        // while (!input.toLowerCase().equals("q")) {
        //     // convet the string into an integer
        //     int givenNumber = Integer.parseInt(input);
        //     // add it to the array list
        //     numbers.add(givenNumber);
        //     // ask for the next number
        //     System.out.print("Enter number: ");
        //     input = sc.nextLine();
        // }

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
      
        
        // Show the content of the array
        for (int n : numbers) {
            System.out.println(n);
        }

        int median = numbers.get( numbers.size() / 2);
        int total = 0;
        for (int n : numbers) {
            total = total + n;
        }

        // cast the total variable as double
        double mean = (double)total / numbers.size();

        System.out.println("Median =" + median);
        System.out.println("Mean = " + mean);

        // calculate the mode
        // count each occurence of each number
        LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<Integer>();

        for (int n : numbers) {
            uniqueNumbers.add(n);  // duplicated number will be ignored
        }

        System.out.println(uniqueNumbers);
        int mode = -999;
        int count = 0;
        int currentCount = 0;
        for (int currentCandidate : uniqueNumbers) {

            // count how many times did the currentCandidate occurs in the numbers arraylist
            for (int number: numbers) {
                if (number == currentCandidate) {
                    currentCount++;
                }
            }

            if (currentCount > count) {
                mode = currentCandidate;
                count = currentCount;
            }
        }
        System.out.println("Mode = " + mode);
    }
}
