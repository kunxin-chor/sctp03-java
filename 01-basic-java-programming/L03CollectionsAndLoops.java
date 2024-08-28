

// the class' nane and the filename must match

import java.util.ArrayList;

public class L03CollectionsAndLoops {
    public static void main(String[] args) {

        // arrays in Java
        // 1. fixed size 
        // 2.  fixed data type
        int[] ages = new int[3]; 
        ages[0] = 22;
        ages[1] = 33;
        ages[2] = 45;

        // create a string array with three strings
        String[] superheroes = {"Iron Man", "Spiderman", "Crazyman"};

        // while loop
        int currentIndex = 0;
        while (currentIndex < superheroes.length) {
            System.out.println(superheroes[currentIndex]);
            currentIndex++; // => same as currentIndex = currentIndex + 1
        }

        // for loop (same as JavaScript: for..of)
        for (String s : superheroes) {
            System.out.println(s);
        }
        
        // Collections are 'infinite' arrays
        // 1. ArrayList (in some other programming languages known as vector)
        // 2. Map (in some other programming languages known as dictionary)
    
        // We define an ArrayList that can store integers
        // ArrayList<T>  is known as a `generic`, where T is a data type
        // --> we can customize the DATA TYPE its stores
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(13); // .add is like the JS push
        numbers.add(15);
        numbers.add(55);
        for (int n : numbers) {
            System.out.println(n);
        }
    
    }
}
