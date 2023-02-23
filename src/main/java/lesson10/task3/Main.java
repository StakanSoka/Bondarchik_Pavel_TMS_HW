package lesson10.task3;

/*
3. Дана строка произвольной длины с произвольными словами. Найти самое короткое слово в строке и вывести его на экран.
Найти самое длинное слово в строке и вывести его на экран. Если таких слов несколько, то вывести последнее из них.
 */
public class Main {

    public static void printTheShortestWord(String str) {
        String[] words = str.split(" ");
        String shortest = words[0];

        for (int i = 1; i < words.length; i++) {
            if (shortest.length() >= words[i].length()) {
                shortest = words[i];
            }
        }

        System.out.println("The shortest word : " + shortest);
    }

    public static void printTheLargestWord(String str) {
        String[] words = str.split(" ");
        String largest = words[0];

        for (int i = 1; i < words.length; i++) {
            if (largest.length() <= words[i].length()) {
                largest = words[i];
            }
        }

        System.out.println("The largest word : " + largest);
    }

    public static void main(String[] args) {
        String sentence = "The magazine devotes a lot of space to advertising";

        System.out.println("Sentence : " + sentence);
        printTheLargestWord(sentence);
        printTheShortestWord(sentence);
    }
}
