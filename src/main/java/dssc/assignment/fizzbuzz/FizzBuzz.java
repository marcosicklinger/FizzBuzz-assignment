package dssc.assignment.fizzbuzz;

public class FizzBuzz {

    public static void main(String... args) {

        for (int i = 1; i < 106; i++) {
            System.out.println(converter(i));
        }
        
    }

    static String converter (int i) {
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
            return "" + i;
        }
    }

}
