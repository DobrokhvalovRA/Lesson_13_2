import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void checkPhone(ArrayList phoneNumbers) throws NameExeption {
        if (phoneNumbers == null) throw new NameExeption("не найден!");
    }


    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        //Добавляем абонентов
        phoneBook.addPerson("Иванов", "+79179875000");
        phoneBook.addPerson("Петров", "+79172222222");
        phoneBook.addPerson("Сидоров", "+79179875002");
        phoneBook.addPerson("Иванов", "+79179875003");
        phoneBook.addPerson("Иванов", "+79179875004");


        //Вводим фамилию для поиска телефонного номера
        System.out.println("Введите фамилию абонента:");
        Scanner console = new Scanner(System.in);
        String checkName = console.nextLine();

        //Проыеряем фамилию и выводим номер
        try {
            checkPhone(phoneBook.getPhoneNumber(checkName));
            System.out.println("Абонент " + checkName + " имеет следующий телефонный номер: " + phoneBook.getPhoneNumber(checkName));
        } catch (NameExeption e) {
            System.out.println("Абонент с фамилией " + checkName + " - " + e.getMessage());
        }

    }
}