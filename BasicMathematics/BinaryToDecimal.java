package BasicMathematics;

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        try {
            int decimalNumber = binaryToDecimal(binaryString);
            System.out.println("Decimal equivalent: " + decimalNumber);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number. Please enter a string containing only 0s and 1s.");
        } finally {
            scanner.close();
        }
    }

    /**
     * Converts a binary string to its decimal equivalent.
     *
     * @param binary The binary number as a String.
     * @return The decimal equivalent as an int.
     * @throws NumberFormatException If the input string is not a valid binary number.
     */
    public static int binaryToDecimal(String binary) throws NumberFormatException {
        if (binary == null || binary.isEmpty()) {
            throw new NumberFormatException("Input string cannot be null or empty.");
        }

        // Using Integer.parseInt() with radix 2 for direct conversion
//        The second argument, 2, specifies that the input string binary should be interpreted as a base-2 (binary) number.
        return Integer.parseInt(binary, 2);

        /*
        // Manual conversion (alternative implementation)
        int decimal = 0;
        int power = 0;

        // Iterate from right to left (least significant bit to most significant bit)
        for (int i = binary.length() - 1; i >= 0; i--) {
            char digitChar = binary.charAt(i);

            if (digitChar == '1') {
                decimal += Math.pow(2, power);
            } else if (digitChar != '0') {
                throw new NumberFormatException("Invalid character in binary string: " + digitChar);
            }
            power++;
        }
        return decimal;
        */
    }
}
