package PracticeCleanCode;

public class Calculator {

    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firstOperand, int seconOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOperand + seconOperand;
            case SUBTRACTION:
                return firstOperand - seconOperand;
            case MULTIPLICATION:
                return firstOperand * seconOperand;
            case DIVISION:
                if (seconOperand != 0)
                    return firstOperand / seconOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
