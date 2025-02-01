import java.awt.*;
import java.io.IOException;

public class SwitchFirstAndLastNumber {
    public static int reverseFirstAndLast(int num) {
        // Handle single-digit numbers
        if (num < 10 && num > -10) {
            return num; // No need to reverse
        }

        // Determine if the number is negative
        boolean isNegative = num < 0;
        num = Math.abs(num);

        // Extract the last digit
        int lastDigit = num % 10;

        // Find the total number of digits and the first digit
        int temp = num;
        int numberOfDigits = 0;
        int firstDigit = 0;
        while (temp > 0) {
            firstDigit = temp % 10; // Update first digit
            temp /= 10;
            numberOfDigits++;
        }

        // Remove the first and last digits
        int middlePart = num % (int) Math.pow(10, numberOfDigits - 1); // Remove first digit
        middlePart /= 10; // Remove last digit

        // Reconstruct the number with swapped digits
        int result = (lastDigit * (int) Math.pow(10, numberOfDigits - 1)) + (middlePart * 10) + firstDigit;

        // Restore the sign if the number was negative
        return isNegative ? -result : result;
    }

    public static void main(String args[]) throws IOException, AWTException {

        int num = 12345; // Example number
        System.out.println("Original Number: " + num);
        System.out.println("After Reversing First and Last Digits: " + reverseFirstAndLast(num));
















    }
}
