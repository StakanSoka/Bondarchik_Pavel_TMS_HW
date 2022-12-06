package lesson10.task4;

/*
4. Дана строка произвольной длины с произвольными словами. Найти слово, в котором число различных символов минимально.
Слово может содержать буквы и цифры. Если таких слов несколько, найти первое из них.
Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".
 */

public class Main {

    private static StringBuilder createCache(String word) {
        StringBuilder cache = new StringBuilder(word.length());
        for (char ch : word.toCharArray()) {
            if (!cache.toString().contains(String.valueOf(ch))) {
                cache.append(ch);
            }
        }

        return cache;
    }

    public static void findWordWithMinDifferentCharacters(String sentence) {
        String[] words = sentence.split(" ");
        String searchableWord = words[0];
        StringBuilder searchableCache = createCache(searchableWord);
        StringBuilder cacheI;

        for (String word : words) {
            cacheI = createCache(word);
            if (cacheI.length() < searchableCache.length()) {
                searchableWord = word;
                searchableCache = cacheI;
            }
        }

        System.out.println("Searchable word : " + searchableWord);
    }

    public static void main(String[] args) {
        String sentence = "Лёша на sss полке клопа нашёл 303";
        findWordWithMinDifferentCharacters(sentence);
    }
}