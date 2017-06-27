package gc;

import java.util.Scanner;

/**CHECKLIST
 * Need to define variables
 * Create prompts for valid user input
 * Calculate for perimeter and volume
 * Create a loop until the user prompts with a yes or no.
 * take into account for unrecognized input
 */

public class Main {

    public static void main(String[] args) {

        double length = 0;            //
        double width = 0;            //defining variables as doubles for use of decimal digits
        double height = 0;          //
        String cont = "y";

        /*"The PROGRAM LOOP"
         ends when a user doesn't enter y into the scanner at the very end.
         "y" is defined when I first initialized the string. I then defined the while loop in the beginning
         to recognize "y" as a true value. Any character other than "y" ends the program.
         */
        while (cont.equalsIgnoreCase("y")) {

            //First Prompt
            System.out.println("Welcome to Grand Circus' Room Detail Generator!");
            System.out.println("Enter your numbers below as prompted");

            //Initializing the scanner followed by gathering user input values
            Scanner input = new Scanner(System.in);

            System.out.println("Enter Length: ");

            //Validating user input fore each of the inputs
            while (!input.hasNextDouble()) {
                System.out.println("This is really hard without numbers...");
                input.nextLine();
            }
            length = input.nextDouble();


            System.out.println("Enter Width:");
            while (!input.hasNextDouble()) {
                System.out.println("This is really hard without numbers...");
                input.next();
            }
            width = (input.nextDouble());

            System.out.println("Enter Height:");
            while (!input.hasNextDouble()) {
                System.out.println("This is really hard without numbers...");
                input.next();
            }
            height = (input.nextDouble());

            //Calculations using the "validated" user input

            System.out.println("The Perimeter of the room is...     " + ((length * 2) + (width * 2)));
            System.out.println("The area of the room is...          " + (length * width));
            System.out.println("The volume of the room is...        " + (length * width * height));
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Ready to do another set of numbers? (y/n)");

            input.nextLine();
            cont = input.nextLine();
        }
        System.out.println("Goodbye!");





    }
}
