package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertNumbersToStrings {

    @Test
    void number_1 () {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.converter(1));
    }

    @Test
    void number_2 () {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("2", fizzBuzz.converter(2));
    }

    @ParameterizedTest
    @CsvSource({"1, 1", "2, 2", "40, 40"})
    void numbers_not_divisible_by_3_or_5 (int n, String expected) {
        assert (0 != (n % 3)) && (0 != (n % 5));
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(expected, fizzBuzz.converter(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {7, 14, 28})
    void numbers_divisible_by_7 (int n) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Bang", fizzBuzz.converter(n));
    }
}
