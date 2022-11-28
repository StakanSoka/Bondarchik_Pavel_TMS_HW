package lesson7.task3;

/*
Создать систему для учета документов.
Создать класс Регистр, который будет иметь методы:
- сохранения документа в регистре
- предоставление информации о документе
Система может работать с тремя типами документов:
1) Контракт на поставку товаров
Содержит поля:
- Номер документа
- Тип товаров
- Количество товаров
- Дата документа
2) Контракт с сотрудником
Содержит поля:
- Номер документа
- Дата документа
- Дата документа
- Дата окончания контракта
- Имя сотрудника
3) Финансовая накладная
Содержит поля:
- Итоговая сумма за месяц
- Дата документа
- Номер документа
- Код департамента

- Класс регистр должен содержать внутри себя массив и при добавлении документа в регистр этот добавляемый документ
должен добавляться в массив;
 Массив для класса регистра должен быть размером 10;
- Для полей "Дата документа" следует использовать тип данных Date;
- В методе предоставления информации о документе следует выводить на экран информацию о переданном входным параметром документе;
- Каждый класс для описания документов должен содержать конструктор с параметрами и без;
- Для имитации работы системы создайте класс Main, который будет содержать только один метод public static void main
В этом методе напишите код для создания каждого из типов документов, добавления их в регистр и вывода информации о документе;
- Все классы разместить по пакетам;
- При выполнении задания использовать понятия интерфейсов и абстрактных классов.
 */

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Register register = new Register();
        Date today = new Date(2022, 10, 16);
        EmployeeContract employeeContract = new EmployeeContract(123456, today,
                "Fedor", new Date(2025, 10, 16));
        FinancialBill financialBill = new FinancialBill(123457, today, 1e6, 1);
        GoodsContract goodsContract = new GoodsContract(123458, today, "Milk", 100);

        register.saveDocument(employeeContract);
        register.saveDocument(financialBill);
        register.saveDocument(goodsContract);

        Register.printInformation(employeeContract);
        System.out.println();
        Register.printInformation(financialBill);
        System.out.println();
        Register.printInformation(goodsContract);
    }

}