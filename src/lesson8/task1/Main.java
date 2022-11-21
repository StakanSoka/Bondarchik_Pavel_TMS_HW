package lesson8.task1;

public class Main {

    /*
    Создайте класс Phone, который содержит переменные number, final model и weight, массив контактов.
создать класс Contact с полями имя контакта, номер контакта.
поля приватные.
Создайте три экземпляра этого класса.
Добавить конструктор в класс Phone, который принимает на вход три параметра для
    инициализации переменных класса - number, model и weight.
Добавить конструктор, который принимает на вход два параметра для инициализации
    переменных класса - number, model.
Добавить конструктор без параметров.
Вызвать из конструктора с тремя параметрами конструктор с двумя.
Добавить в класс Phone методы:
    receiveCall, имеет один параметр – объект контакта. Выводит на консоль сообщение “Звонит {name} + {номер телефона}”.
    getNumber – возвращает номер телефона.
Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего
    и номер телефона звонящего. Вернуть объект типа контакт найденный в массиве контаков по имени и номеру.
Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход контакты и сообщение, которым
будет отправлено сообщение. Метод выводит на консоль номера этих телефонов и само сообщение.
     */

    public static void main(String[] args) {
        Contact contact1 = new Contact("Fedor", new Number(1234567));
        Contact contact2 = new Contact("Abdul", new Number(1111111));
        Contact contact3 = new Contact("Swallow", new Number(2222222));
        Phone phone = new Phone("Iphone 20", new Number(7777777), 200);

        phone.addContact(contact1);
        phone.addContact(contact2);
        phone.addContact(contact3);

        phone.receiveCall(contact1);
        System.out.println();

        System.out.println(phone.findContact("Swallow"));
        System.out.println(phone.findContact("Ss"));
        System.out.println();

        phone.sendMessage("hello",contact1, contact3);

        phone.printAllContacts();
        System.out.println();

        System.out.println(phone.getNumber());
    }
}
