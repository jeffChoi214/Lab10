import java.util.Scanner;

/**
 * Created by hyunchoi on 2/9/17.
 */
public class Validator {
    // check string
    // check int
    // check int w min max
    // check double
    // check doubule w min max

    public static String getString(Scanner sc) {
        // unnecessary to check for string
        String theString = sc.next();
        sc.nextLine();
        return theString;
    }

    public static int getInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Please enter an integer! ");
            sc.next();
        }

        int theInt = sc.nextInt();
        sc.nextLine();
        return theInt;
    }

    public static double getDouble(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.print("Please enter a proper number! ");
            sc.next();
        }

        double theDouble = sc.nextDouble();
        sc.nextLine();
        return theDouble;
    }

    public static char getYesNo(Scanner sc) {
        char value = sc.next().charAt(0);
        boolean isGood = true;

        if (value != 'y' && value != 'Y' && value != 'n' && value != 'N') {
            isGood = false;
            while (true) {
                System.out.print("Please enter y or n! ");
                value = sc.next().charAt(0);
                
                if (value == 'y' || value == 'Y'|| value == 'n' || value == 'N') {
                    break;
                }
            }
        }
        
        return value;
    }
}
