public class BinaryToDecimal {

    public static int binaryToDecimal(String binaryStr) {
        return Integer.parseInt(binaryStr, 2);
    }

    public static void main(String[] args) {
        String binaryNumber = "101010"; 

        int decimalValue = binaryToDecimal(binaryNumber);

        System.out.println("The decimal value of binary " + binaryNumber + " is: " + decimalValue);
    }
}
