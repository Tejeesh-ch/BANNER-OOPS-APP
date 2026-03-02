import java.util.HashMap;

public class OOPSBannerApp {

    // Create and fill the character map
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " * ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " * "
        });

        map.put('P', new String[]{
                "** ",
                "*   *",
                "*   *",
                "** ",
                "*    ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                " **",
                "*    ",
                "*    ",
                " * ",
                "    *",
                "    *",
                "** "
        });

        map.put(' ', new String[]{
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     "
        });

        return map;
    }

    // Display banner using map
    public static void displayBanner(String message,
                                     HashMap<Character, String[]> map) {

        int height = 7;

        for (int line = 0; line < height; line++) {
            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = map.get(ch);
                sb.append(pattern[line]).append("  ");
            }

            System.out.println(sb.toString());
        }
    }

    // Main method
    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();

        String message = "OOPS";

        displayBanner(message, charMap);
    }
}