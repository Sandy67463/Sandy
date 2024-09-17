import java.util.Scanner;

public class replacethemall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = 0;
        int place = 1;
        if (num == 0) { 
            result = 5;
        } else {
            while (num > 0) {
                int digit = num % 10;
                if (digit == 0) {
                    digit = 5; 
                }
                result = result + digit * place; 
                place = place * 10; 
                num = num/10; 
            }
        }  
        System.out.println(result);
        scanner.close();
    }
}
