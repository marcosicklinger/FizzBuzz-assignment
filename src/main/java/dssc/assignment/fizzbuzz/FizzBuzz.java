package dssc.assignment.fizzbuzz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzz {

    public String converter(int i) {
        if (i % 7 == 0) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    return "FizzBuzzBang";
                }
                else {
                    return "FizzBang";
                }
            }
            else if (i % 5 == 0){
                return "BuzzBang";
            }
            else {
                return "Bang";
            }
        }
        else {
            return Integer.toString(i);
        }
    }

    public void print () {
        Stream<String> fizzBuzzes = IntStream.range(1, 106).mapToObj(this::converter);
        fizzBuzzes.collect(Collectors.joining(", "));
    }

}
