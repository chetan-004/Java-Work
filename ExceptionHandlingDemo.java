
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class ExceptionHandlingDemo {

    // Demonstrates 'throws'
    static void checkAge(int age) throws AgeException {
        // Demonstrates 'throw'
        if (age < 18) {
            throw new AgeException("Age must be 18 or above.");
        }

        System.out.println("Age is valid.");
    }

    public static void main(String[] args) {

        // 1. try-catch and multiple catch
        try {
            int a = 10;
            int b = 0;

            int result = a / b;   // ArithmeticException

            System.out.println("Result = " + result);
        }

        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        catch (Exception e) {
            System.out.println("Some other exception occurred.");
        }

        // 2. finally
        finally {
            System.out.println("Finally block executed.");
        }


        // 3. Nested try
        try {
            System.out.println("\nOuter try started.");

            try {
                int[] numbers = {10, 20, 30};

                System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
            }

            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Array index is invalid.");
            }

            System.out.println("Outer try continues.");
        }

        catch (Exception e) {
            System.out.println("Outer catch executed.");
        }


        // 4. User-defined exception + throw + throws
        try {
            System.out.println("\nChecking age...");

            checkAge(16);
        }

        catch (AgeException e) {
            System.out.println("User-defined Exception: " + e.getMessage());
        }


        // 5. Another example of exception handling
        try {
            String number = "ABC";

            int n = Integer.parseInt(number);

            System.out.println("Number = " + n);
        }

        catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        }

        finally {
            System.out.println("Program completed.");
        }
    }
}