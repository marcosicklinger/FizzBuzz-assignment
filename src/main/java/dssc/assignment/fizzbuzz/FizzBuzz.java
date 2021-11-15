package dssc.assignment.fizzbuzz;

public class FizzBuzz {

    public static void main(String... args) {

        for (int i = 1; i < 106; i++) {
            if (i % 7 == 0) {
                if (i % 3 == 0) {
                    if (i % 5 == 0) {
                        System.out.println("FizzBuzzBang");
                    }
                    else {
                        System.out.println("FizzBang");
                    }
                }
                else if (i % 5 == 0){
                    System.out.println("BuzzBang");
                }
                else {
                    System.out.println("Bang");
                }
            }
            else {
                System.out.println(i);
            }
        }
        
    }

}
