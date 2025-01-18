import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingUtility {

    public static void main(String[] args) {
        String filePath = "example.txt";

        // Write to a file
        writeFile(filePath, "Hello, this is a test file.\nThis file will be modified.");

        // Read from a file
        readFile(filePath);

        // Modify the file
        modifyFile(filePath, "This file has been modified.");

        // Read the modified file
        readFile(filePath);
    }

    // Method to write to a file
    public static void writeFile(String filePath, String content) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    // Method to read from a file
    public static void readFile(String filePath) {
        try (Scanner scanner = new Scanner(new File(filePath))) {
            System.out.println("Reading file content:");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    // Method to modify a file
    public static void modifyFile(String filePath, String newContent) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write("\n" + newContent);
            System.out.println("File modified successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while modifying the file.");
            e.printStackTrace();
        }
    }
}
