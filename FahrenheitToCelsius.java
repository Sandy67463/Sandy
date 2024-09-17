import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minF = scanner.nextInt();
        int maxF = scanner.nextInt();
        int step = scanner.nextInt();
        for (int f = minF; f <= maxF; f += step) {
            int c = (int)((5.0 / 9) * (f - 32)); // Convert to Celsius
            System.out.println(f + " " + c);
        }
        scanner.close();
    }
}
