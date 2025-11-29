public class EnglishRuler {

    /** Draws an English ruler for the given number of inches and major tick length. */
    public static void drawRuler(int nInches, int majorLength) {
        drawLine(majorLength, 0); // draw inch 0 line and label
        for (int j = 1; j <= nInches; j++) {
            drawInterval(majorLength - 1); // recursively draw top interval
            drawLine(majorLength, j);      // draw inch j line and label
        }
    }

    /** Recursively draws the interior ticks for a given interval length. */
    private static void drawInterval(int centralLength) {
        if (centralLength >= 1) {
            drawInterval(centralLength - 1); // top interval
            drawLine(centralLength);         // draw center tick line (without label)
            drawInterval(centralLength - 1); // bottom interval
        }
    }

    /** Draws a line with the given tick length and optional label. */
    private static void drawLine(int tickLength, int tickLabel) {
        for (int j = 0; j < tickLength; j++) {
            System.out.print("-");
        }
        if (tickLabel >= 0) {
            System.out.print(" " + tickLabel);
        }
        System.out.print("\n");
    }

    /** Draws a line with the given tick length (but no label). */
    private static void drawLine(int tickLength) {
        drawLine(tickLength, -1);
    }

    /** Main method to test the ruler */
    public static void main(String[] args) {
        int inches = 2;
        int majorTickLength = 4;
        drawRuler(inches, majorTickLength);
    }
}
