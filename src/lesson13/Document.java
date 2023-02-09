package lesson13;

import lesson13.utils.Constant;

import java.io.*;
import java.util.*;

class Document {

    private final int VALID_SIZE = 15;
    private final String p = "src\\lesson13\\files";
    private final String n1 = "doc1.txt";
    private final String n2 = "doc2.txt";

    private Set<String> documents = new HashSet<>();
    private String reportPath = "src\\lesson13\\files\\report.txt";

    private String invalidReason(String documentNumber) {
        String reason = " ";

        if (documentNumber.length() != VALID_SIZE) reason += "Invalid length of the document...";
        if (!documentNumber.startsWith("docnum")) {
            if (!documentNumber.startsWith("kontract"))
                reason += "The document doesn't start with \"docnum\" or \"kontract\"";
        }

        return reason;
    }

    private void readDocumentFromFile(String path, String name) {
        String line = "";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path + "\\"+ name))) {
            while ((line = bufferedReader.readLine()) != null) {
                documents.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println(path + name + " has not been found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeReport() {
        try (FileWriter fileWriter = new FileWriter(reportPath)) {
            for (String element : documents) {
                fileWriter.write(element + " " + invalidReason(element) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void scanningPathsAndFileNames(List<String> paths, List<String> fileNames) {
        String line = "";

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the path of the document\nTo exit enter \"0\": ");
            line = scanner.nextLine();
            if (line.equals(Constant.FINISH)) break;

            paths.add(line);
            System.out.println("Enter the name of the file: ");
            fileNames.add(scanner.nextLine());
        }
    }

    public Document() {
        List<String> paths = new ArrayList<>();
        List<String> fileNames = new ArrayList<>();

        scanningPathsAndFileNames(paths, fileNames);

        for (int i = 0; i < paths.size(); i++) {
            readDocumentFromFile(paths.get(i), fileNames.get(i));
        }

        writeReport();
    }
}
