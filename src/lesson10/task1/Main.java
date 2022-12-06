package lesson10.task1;

/*
1. Написать программу со следующим функционалом:
На вход передать строку (будем считать, что это номер документа). Номер документа имеет
 xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.
- Вывести на экран в одну строку два первых блока по 4 цифры.
- Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
- Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
- Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре
(реализовать с помощью класса StringBuilder).
- Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет
(причем, abc и ABC считается одинаковой последовательностью).
- Проверить начинается ли номер документа с последовательности 555.
- Проверить заканчивается ли номер документа на последовательность 1a2b.
Все эти методы реализовать в отдельном классе в статических методах, которые на вход
(входным параметром) будут принимать вводимую на вход программы строку
 */

public class Main {

    public static void main(String[] args) {
        String document = "1234-ABC-5678-DEF-9G0H";
        String document2 = "5554-ABC-5678-DEF-9G0H";
        System.out.println(document);

        Document.printFirstTwoNumberBlocks(document);

        Document.printEncryption(document);

        Document.printFormattedNameInUpperCase(document);
        Document.printFormattedNameInLowerCase(document);

        System.out.println("Does document consist \"ABC\" : " + Document.consistABC(document));
        System.out.println("Does document start with 555 : " + Document.startsWith555(document));
        System.out.println("Does document start with 555 : " + Document.startsWith555(document2));
    }
}