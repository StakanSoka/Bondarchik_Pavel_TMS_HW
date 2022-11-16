package lesson6.task1;

/*
Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте метод, который позволяет начислять
сумму на кредитную карточку. Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке. (переопределить toString(), пример:
Номер счёта : <сумма>
Количество денег на счету : <цифра>
Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма
Тестовый сценарий для проверки:
Положите деньги на первые две карточки и снимите с третьей. Выведите на экран текущее состояние всех трех карточек.
 */

public class Main {

    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard();
        CreditCard creditCard2 = new CreditCard(1);
        CreditCard creditCard3 = new CreditCard(2,100);

        System.out.println("Information before manipulations");
        System.out.println("First card");
        creditCard1.printCardInformation();
        System.out.println("Second card");
        creditCard2.printCardInformation();
        System.out.println("Third card");
        creditCard3.printCardInformation();

        creditCard1.addMoney(500);
        creditCard2.addMoney(1000);
        creditCard3.withdrawMoney(10000);

        System.out.println("Information after manipulations");
        System.out.println("First card");
        creditCard1.printCardInformation();
        System.out.println("Second card");
        creditCard2.printCardInformation();
        System.out.println("Third card");
        creditCard3.printCardInformation();

    }

}
