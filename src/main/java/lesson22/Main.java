package lesson22;

import java.util.Map;
import java.util.Set;

public class Main {

    public static String BASED_PATH = "src\\main\\java\\lesson22\\documents.txt";

    public static void main(String[] args) {
        String path = BASED_PATH;
        Set<String> fileLines = Actions.readLinesFromFile(path);
        Map<Integer, Document> documents = Actions.parseLines(fileLines);

        for (Map.Entry<Integer, Document> element : documents.entrySet()) { // Dates store "date" in milliseconds
            System.out.println("Number : " + element.getKey() + " " + element.getValue());
        }
    }
}