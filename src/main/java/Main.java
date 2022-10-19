import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Tells whether or not what the user entered is a number
        // b. Flips the case of the string
        // c. Reverses the string
        System.out.print("Enter a string value: ");
        String userInput = scanner.next();
        System.out.println("Entered number: " + StringUtils.isNumeric(userInput));
        System.out.println("Case flip: " + StringUtils.swapCase(userInput));
        System.out.println("Value flipped: " + StringUtils.reverse(userInput));
    }
}
