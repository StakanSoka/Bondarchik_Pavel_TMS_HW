package lesson10.task1;

class Document {

    private final int[] NUMBER_INDEXES = new int[] { 0, 1, 2, 3, 9, 10, 11, 12, 18, 20 };
    private final int[] CHARACTER_INDEXES = new int[] { 5, 6, 7, 14, 15, 16, 19, 21 };

    public static void printFirstTwoNumberBlocks(String name) {
        int firstIndexBlock = 0;
        int secondIndexBlock = 2;
        String[] blocks = name.split("-");

        System.out.println(blocks[firstIndexBlock] + blocks[secondIndexBlock]);
    }

    public static void printEncryption(String name) {
        String[] blocks = name.split("-");
        for (int i = 0; i < blocks.length; i++) {
            if (i % 2 != 0) System.out.print("***-");
            else System.out.print(blocks[i] + '-');
        }

        System.out.println("\b");
    }

    private static String getFormattedName(String name) {
        String[] blocks = name.split("-");
        StringBuilder formattedName = new StringBuilder();
        char[] lastBlock = blocks[blocks.length - 1].toCharArray();

        for (int i = 1; i < blocks.length; i += 2) { // first two character blocks
            formattedName.append(blocks[i]).append("/");
        }

        for (int i = 1; i < lastBlock.length; i += 2) { // last character block
            formattedName.append(lastBlock[i]);
            if (i + 1 < lastBlock.length) formattedName.append("/");
        }

        return formattedName.toString();
    }

    public static void printFormattedNameInUpperCase(String name) {
        System.out.println(getFormattedName(name).toUpperCase());
    }

    public static void printFormattedNameInLowerCase(String name) {
        System.out.println(getFormattedName(name).toLowerCase());
    }

    public static boolean consistABC(String name) {
        return name.contains("abc") || name.contains("ABC");
    }

    public static boolean startsWith555(String name) {
        return name.startsWith("555");
    }

    public static boolean endsWith1a2b(String name) {
        return name.endsWith("1a2b");
    }


}