package lesson12.task1;

import java.io.*;
import java.util.Scanner;

class Document {

    static final int DOCUMENT_LENGTH = 15;

    private static String getMistake(String line) {
        String totalMistake = "";
        if (line.length() != DOCUMENT_LENGTH)
            totalMistake += "Wrong document length\n";
        line = line.trim();
        if (line.length() != DOCUMENT_LENGTH)
            totalMistake += "There are whitespaces characters\n";
        if (!line.startsWith("document")) {
            if (!line.startsWith("contract"))
                totalMistake += "The document does not start with \"document\" or \"contract\"\n";
        }

        return totalMistake;
    }

    public static void readAndWriteDocuments() {
        Scanner scanner = new Scanner(System.in);
        String path;
        String validOutputPath = "src\\lesson12\\task1\\valid report.txt";
        String invalidOutputPath = "src\\lesson12\\task1\\invalid report.txt";

        System.out.println("Enter the path of the file");
        path = scanner.nextLine();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
             BufferedWriter validWriter = new BufferedWriter(new FileWriter(validOutputPath));
             BufferedWriter invalidWriter = new BufferedWriter(new FileWriter(invalidOutputPath))) {

            String line;
            String mistake;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.print(line);

                mistake = getMistake(line);
                if (mistake.equals("")) {
                    System.out.println(" - correct");
                    validWriter.write(line);
                }
                else {
                    System.out.println(" - incorrect");
                    invalidWriter.write(line + " " + mistake + "\n");
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

}
