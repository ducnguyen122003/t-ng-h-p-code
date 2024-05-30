package demkytu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CharacterCount {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\admin\\Desktop\\java\\demkytu\\newfile";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int characterCount = 0;


            while (( reader.read()) != -1) {

                characterCount++;
            }

            System.out.println("Total characters in the file: " + characterCount);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
