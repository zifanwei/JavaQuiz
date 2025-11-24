import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q7 {

    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));

        FileReader file = new FileReader("./resource/Q7.txt");
        BufferedReader reader = new BufferedReader(file);

        StringBuilder textBuilder = new StringBuilder();
        String line = reader.readLine();

        while (line != null) {
            textBuilder.append(line.toLowerCase());
            line = reader.readLine();
        }

        String text = textBuilder.toString();

        System.out.println("=== SIMPLE WAY ===");
        simpleCount(text);

        System.out.println("=== REDUNDANT WAY ===");
        redundantCount(text);

        reader.close();
    }

    // simple version using replace differences
    static void simpleCount(String text) {
        for (char c = 'a'; c <= 'z'; c++) {
            int count = text.length() - text.replace(String.valueOf(c), "").length();
            System.out.println(c + " appear times: " + count);
        }
    }

    // redundant version: check each character with cascading if
    static void redundantCount(String text) {
        int[] freq = new int[26];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'a') freq[0]++;
            else if (ch == 'b') freq[1]++;
            else if (ch == 'c') freq[2]++;
            else if (ch == 'd') freq[3]++;
            else if (ch == 'e') freq[4]++;
            else if (ch == 'f') freq[5]++;
            else if (ch == 'g') freq[6]++;
            else if (ch == 'h') freq[7]++;
            else if (ch == 'i') freq[8]++;
            else if (ch == 'j') freq[9]++;
            else if (ch == 'k') freq[10]++;
            else if (ch == 'l') freq[11]++;
            else if (ch == 'm') freq[12]++;
            else if (ch == 'n') freq[13]++;
            else if (ch == 'o') freq[14]++;
            else if (ch == 'p') freq[15]++;
            else if (ch == 'q') freq[16]++;
            else if (ch == 'r') freq[17]++;
            else if (ch == 's') freq[18]++;
            else if (ch == 't') freq[19]++;
            else if (ch == 'u') freq[20]++;
            else if (ch == 'v') freq[21]++;
            else if (ch == 'w') freq[22]++;
            else if (ch == 'x') freq[23]++;
            else if (ch == 'y') freq[24]++;
            else if (ch == 'z') freq[25]++;
        }

        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            System.out.println(c + " appear times: " + freq[i]);
        }
    }
}
