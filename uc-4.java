/**
 * OOPSBannerApp UC4 – Render OOPS as Banner using String Array and Loop
 * This use case improves UC3 by storing banner lines in a String array
 * and printing them using a for-each loop.
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create String array for 7 lines
        String[] lines = new String[7];

        // Populate array using String.join()

        lines[0] = String.join(" ",
                " * ",
                " * ",
                " ***",
                " ***");

        lines[1] = String.join(" ",
                "* *",
                "* *",
                "*  *",
                "**    ");

        lines[2] = String.join(" ",
                "* *",
                "* *",
                "*  *",
                "**    ");

        lines[3] = String.join(" ",
                "* *",
                "* *",
                "*** ",
                " ** ");

        lines[4] = String.join(" ",
                "* *",
                "* *",
                "**    ",
                "    **");

        lines[5] = String.join(" ",
                "* *",
                "* *",
                "**    ",
                "    **");

        lines[6] = String.join(" ",
                " * ",
                " * ",
                "**    ",
                "*** ");

        // Print using enhanced for-loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}