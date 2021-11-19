package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Test;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintOnStandardOutput {


    @Test
    void numbers_from_1_to_100 () {
        ByteArrayOutputStream fakeStandardOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(fakeStandardOutput));

        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.print();
        assertEquals(FIZZBUZZEZ_1_100, fakeStandardOutput.toString());
    }

}
