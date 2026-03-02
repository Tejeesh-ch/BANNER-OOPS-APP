/**
 * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
 * This version improves UC4 by declaring and initializing
 * the String array in a single statement.
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Declare and initialize array in one statement
        String[] lines = {

            String.join(" ",
                    " * ",
                    " * ",
                    " ***",
                    " ***"),

            String.join(" ",
                    "*   *",
                    "*   *",
                    "*   *",
                    "**     "),

            String.join(" ",
                    "*   *",
                    "*   *",
                    "*   *",
                    "**     "),

            String.join(" ",
                    "*   *",
                    "*   *",
                    "** ",
                    " *** "),

            String.join(" ",
                    "*   *",
                    "*   *",
                    "**     ",
                    "     **"),

            String.join(" ",
                    "*   *",
                    "*   *",
                    "**     ",
                    "     **"),

            String.join(" ",
                    " * ",
                    " * ",
                    "**     ",
                    "*** ")
        };

        // Use enhanced for-loop to print
        for (String line : lines) {
            System.out.println(line);
        }
    }
}