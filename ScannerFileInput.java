// 16. Read a file line by line using Scanner
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileInput {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt"); // Replace with your file name
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
