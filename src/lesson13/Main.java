package lesson13;

/*
Основное задание
1. Вернемся к домашнему заданию занятия номер 12 и модифицируем его.
Программа должна получать имена файлов с номерами документов с
консоли: каждая новая строка - это путь к файлу и имя файла.
Для завершения ввода списка файлов следует ввести 0.
После получения списка документов программа должна обработать
каждый документ: вычитать из файла номера документов и
провалидировать их.
В конце работы создать один файл отчет с выходной информаций: номер
документа - комментарий(валиден или не валиден и по какой причине).
Пусть каждый файл содержит каждый номер документа с новой строки и
в строке никакой другой информации, только номер документа.
Валидный номер документа должен иметь длину 15 символов и
начинаться с последовательности docnum(далее любая
последовательность букв/цифр) или kontract(далее любая
последовательность букв/цифр).
Учесть, что номера документов могут повторяться в пределах одного
файла и так же разные документы могут содержать одни и те же номера
документов.
Если номера документов повторяются, то повторные номера документов
не проверять, не валидировать.
 */

public class Main {

    public static void main(String[] args) {
        Document document = new Document();
    }
}
