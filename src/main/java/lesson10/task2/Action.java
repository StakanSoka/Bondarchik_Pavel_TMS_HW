package lesson10.task2;

class Action {

    public static void printDoubleCharacter(String str) {
        for (char ch : str.toCharArray()) System.out.print(String.valueOf(ch).repeat(2));
    }

}
