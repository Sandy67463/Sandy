import java.util.Scanner;

public class countdigits {
     public static int countDigitFrequency(int number, int digit) {
        int count = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit == digit) {
                count++;
            }
            number = number / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.print("Enter a digit to find: ");
        int digit = scanner.nextInt();

        int result = countDigitFrequency(number, digit);
        System.out.println("The digit " + digit + " is found " + result + " times in the number " + number + ".");
        
        scanner.close();
    }
}

