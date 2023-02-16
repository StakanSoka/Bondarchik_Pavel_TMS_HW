package lesson22;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, Document> documents;
        String path = "src\\lesson22\\documents.txt";
        String format = "dd.MM.yyyy";

        documents = Actions.parseLines(Actions.readLinesFromFile(path), format);

        for (Map.Entry<Integer, Document> element : documents.entrySet()) { // Dates store "date" in milliseconds
            System.out.println("Number : " + element.getKey() + " " + element.getValue());
        }
    }
}
