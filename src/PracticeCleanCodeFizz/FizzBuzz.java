package PracticeCleanCodeFizz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public static String fizzBuzz(int number) {
        boolean isDivision3 = number % 3 == 0;
        boolean isDivision5 = number % 5 == 0;
        if (isDivision3 && isDivision5)
            return FIZZ + BUZZ;

        if (isDivision3)
            return FIZZ;

        if (isDivision5)
            return BUZZ;

        return number + "";
    }
}
