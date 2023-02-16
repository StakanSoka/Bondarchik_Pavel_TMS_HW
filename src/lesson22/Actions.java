package lesson22;

import java.io.*;
import java.text.ParseException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Actions {

    public static Set<String> readLinesFromFile(String filePath) {
        Set<String> lines = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return lines;
    }

    public static Map<Integer, Document> parseLines(Set<String> lines, String format) {
        Map<Integer, Document> documents = new HashMap<>();
        Document document;
        String[] parts;

        try {
            for (String line : lines) {
                parts = line.split(",");
                document = new Document();
                document.setName(parts[1].trim());
                document.setCreationDate(parts[2].trim(), format);
                document.setAuthor(parts[3].trim());

                documents.put(Integer.parseInt(parts[0]), document);
            }
        } catch (ParseException parseException) {
            System.out.println(parseException.getMessage());
        }

        return documents;
    }
}
