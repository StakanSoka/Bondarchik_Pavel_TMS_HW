package lesson7.task3;

class Register {

    Document[] documents;
    int size = 0;
    final int CAPACITY = 10;

    Register() {
        documents = new Document[CAPACITY];
    }

    boolean saveDocument(Document document) {
        if (size < CAPACITY) {
            documents[size] = document;
            size++;
            return true;
        }
        return false;
    }

    static void printInformation(PrintableDocument printableDocument) {
        printableDocument.print();
    }
}
