import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUppercaseConverter {
    public static void main(String[] args) {
        String filename = "example.txt"; // Specify the file name here

        try {
            String content = readFileContent(filename);
            String uppercaseContent = convertToUppercase(content);
            writeFileContent(filename, uppercaseContent);
            System.out.println("Content converted to uppercase and written back to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFileContent(String filename) throws IOException {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }

        return content.toString();
    }

    public static String convertToUppercase(String content) {
        return content.toUpperCase();
    }

    public static void writeFileContent(String filename, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
        }
    }
}

