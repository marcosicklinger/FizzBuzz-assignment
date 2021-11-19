package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Test;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintOnStandardOutput {

    private static final String FIZZBUZZEZ_1_100 = "1, 2, 3, 4, 5, 6, Bang, 8, 9, 10, 11, 12, 13, Bang, 15, 16, 17, 18, 19, 20, FizzBang, 22, 23, 24, 25, 26, 27, Bang, 29, 30, 31, 32, 33, 34, BuzzBang, 36, 37, 38, 39, 40, 41, FizzBang, 43, 44, 45, 46, 47, 48, Bang, 50, 51, 52, 53, 54, 55, Bang, 57, 58, 59, 60, 61, 62, FizzBang, 64, 65, 66, 67, 68, 69, BuzzBang, 71, 72, 73, 74, 75, 76, Bang, 78, 79, 80, 81, 82, 83, FizzBang, 85, 86, 87, 88, 89, 90, Bang, 92, 93, 94, 95, 96, 97, Bang, 99, 100, 101, 102, 103, 104, FizzBuzzBang\n";

    @Test
    void numbers_from_1_to_100 () {
        ByteArrayOutputStream fakeStandardOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(fakeStandardOutput));

        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.print();
        assertEquals(FIZZBUZZEZ_1_100, fakeStandardOutput.toString());
    }

}
