package featurea.learn.javafx;

import java.util.Arrays;
import java.util.List;

// AggregateOperations
public class Test7 {

    public static void main(String[] args) {
        // create a list of values
        List<Integer> values = Arrays.asList(23, 84, 74, 85, 54, 60);
        System.out.println("values: " + values.toString());
        // non-local variable to be used in lambda expression.
        int threshold = 54;
        System.out.println("Values greater than " + threshold + " converted to hex:");
        // using aggregate functions filter() and forEach()
        values.stream()
                .filter(value -> value > threshold) // Predicate functional interface
                .sorted()
                .map(dec -> Integer.toHexString(dec).toUpperCase()) // Consumer functional interface
                .forEach(value -> System.out.println(value)); // for each output values.
    }

}
