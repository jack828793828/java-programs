import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileSorter {
    public static void main(String[] args) {
        String filePath = "input.txt"; // Replace with the path to your input file

        List<String> lines = readLinesFromFile(filePath);
        if (lines != null) {
            Collections.sort(lines);

            String outputPath = "output.txt"; // Replace with the path to your output file
            boolean success = writeLinesToFile(outputPath, lines);
            if (success) {
                System.out.println("File sorted and saved successfully.");
            } else {
                System.out.println("Failed to save sorted file.");
            }
        } else {
            System.out.println("Failed to read file.");
        }
    }

    private static List<String> readLinesFromFile(String filePath) {
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return lines;
    }

    private static boolean writeLinesToFile(String filePath, List<String> lines) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
