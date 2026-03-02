/**
 * OOPSBannerApp UC7 – Store Character Pattern in a Class
 *
 * This use case extends UC6 by implementing a CharacterPatternMap
 * inner class to encapsulate character-to-pattern mappings.
 * The application retrieves and displays the "OOPS" banner
 * using these stored mappings.
 *
 * @author Developer
 * @version 7.0
 */

public class OOPSBannerApp {

    /**
     * Inner Static Class to store character and its ASCII pattern
     */
    static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor
         * @param character character to map
         * @param pattern 7-line ASCII pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return mapped character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return ASCII pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Creates CharacterPatternMap array
     * @return array of character pattern mappings
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        return new CharacterPatternMap[] {

                new CharacterPatternMap('O', new String[] {
                        " * ",
                        "*   *",
                        "*   *",
                        "*   *",
                        "*   *",
                        "*   *",
                        " * "
                }),

                new CharacterPatternMap('P', new String[] {
                        "** ",
                        "*   *",
                        "*   *",
                        "** ",
                        "*    ",
                        "*    ",
                        "*    "
                }),

                new CharacterPatternMap('S', new String[] {
                        " **",
                        "*    ",
                        "*    ",
                        " * ",
                        "    *",
                        "    *",
                        "** "
                }),

                new CharacterPatternMap(' ', new String[] {
                        "     ",
                        "     ",
                        "     ",
                        "     ",
                        "     ",
                        "     ",
                        "     "
                })
        };
    }

    /**
     * Returns ASCII pattern for given character
     */
    public static String[] getCharacterPattern(char ch,
                                              CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        // If character not found, return space pattern
        return getCharacterPattern(' ', charMaps);
    }

    /**
     * Prints message as ASCII banner
     */
    public static void printMessage(String message,
                                    CharacterPatternMap[] charMaps) {

        int height = 7;

        for (int row = 0; row < height; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {

                String[] pattern =
                        getCharacterPattern(message.charAt(i), charMaps);

                lineBuilder.append(pattern[row]).append("  ");
            }

            System.out.println(lineBuilder);
        }
    }

    /**
     * Main Method – Entry point
     */
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps =
                createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}