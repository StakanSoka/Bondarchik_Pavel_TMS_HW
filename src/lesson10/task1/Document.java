package lesson10.task1;

class Document {

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

    public static boolean consistABC(String name) throws  ConsistingABCException {
        if (!(name.contains("abc") || name.contains("ABC")))
            throw new ConsistingABCException("The document doesn't consist \"ABC\" sequence");

        return true;
    }

    public static boolean startsWith555(String name) throws StartsWith555Exception {
         if (!name.startsWith("555"))
             throw new StartsWith555Exception("The document doesn't start with \"555\"");

         return true;
    }

    public static boolean endsWith1a2b(String name) throws EndsWith1a2bException {
        if (!name.endsWith("1a2b"))
            throw new EndsWith1a2bException("The document doesn't end with \"1a2b\"");
        return true;
    }
}