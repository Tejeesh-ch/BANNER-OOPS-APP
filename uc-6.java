/**
 * OOPSBannerApp UC6 – OOPS Banner using Methods
 * Refactored to use helper methods for each letter pattern.
 */

public class OOPSBannerApp {

    // Method to generate pattern for letter 'O'
    public static String[] getOPattern() {
        return new String[] {
                " * ",
                "* *",
                "* *",
                "* *",
                "* *",
                "* *",
                " * "
        };
    }

    // Method to generate pattern for letter 'P'
    public static String[] getPPattern() {
        return new String[] {
                "** ",
                "* *",
                "* *",
                "** ",
                "**   ",
                "**   ",
                "**   "
        };
    }

    // Method to generate pattern for letter 'S'
    public static String[] getSPattern() {
        return new String[] {
                " **",
                "**   ",
                "**   ",
                " * ",
                "   **",
                "   **",
                "** "
        };
    }

    // Main method
    public static void main(String[] args) {

        // Get patterns
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Loop to print O O P S
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                    oPattern[i] + "  " +
                    oPattern[i] + "  " +
                    pPattern[i] + "  " +
                    sPattern[i]
            );
        }
    }
}