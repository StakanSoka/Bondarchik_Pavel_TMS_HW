package lesson10.task5;

/*
5. Дана строка произвольной длины с произвольными словами. Написать программу для проверки является ли любое выбранное
слово в строке палиндромом. Например, есть строка, вводится число 3, значит необходимо проверить является ли 3-е слово
в этой строке палиндромом. Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций: например, в строке 5
слов, а на вход программе передали число 500 и т. п. ситуации.
 */

public class Main {

    private static void isPalindrome(String sentence, int index) {
        String[] words = sentence.split(" ");
        StringBuilder word;

        if (words.length < index) {
            System.out.println("Getting index is out of range");
            return;
        }

        word = new StringBuilder(words[index - 1]);
        if (word.toString().equals(word.reverse().toString())) {
            System.out.printf("Word %s is a palindrome", word);
        }
        else System.out.printf("Word %s is not a palindrome", word);
    }

    public static void main(String[] args) {
        String sentence = "101 13 did";
        isPalindrome(sentence, 3);
    }
}