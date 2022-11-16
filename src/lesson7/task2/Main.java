package lesson7.task2;

/*
2. Создать классы "Директор", "Рабочий", "Бухгалтер".
Реализовать интерфейс с методом, который печатает название должности и имплементировать этот метод в созданные классы
 */

public class Main {

    public static void main(String[] args) {
        Accountant accountant = new Accountant();
        Director director = new Director();
        Worker worker = new Worker();

        accountant.printPosition();
        director.printPosition();
        worker.printPosition();
    }

}
