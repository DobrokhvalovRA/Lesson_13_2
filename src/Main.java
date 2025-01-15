import java.util.ArrayList;

public class Main {

    public static void checkPhone(ArrayList phoneNumbers) throws NameExeption {
            if (phoneNumbers == null) throw new NameExeption("Данный абонент не найден!");
    }



    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.setPerson("Иванов", "+79179875000");
        phoneBook.setPerson("Петров", "+79179875001");
        phoneBook.setPerson("Сидоров", "+79179875002");
        phoneBook.setPerson("Иванов", "+79179875003");
        phoneBook.setPerson("Иванов", "+79179875004");

        String checkName = "Сидоров1";

        try {
            checkPhone(phoneBook.getPhoneNumber(checkName));
            System.out.println("Абонент " + checkName + " имеет следующий телефонный номер: " + phoneBook.getPhoneNumber(checkName));
        } catch (NameExeption e) {
            System.out.println("Ошибочка: " + e.getMessage());
        }

    }
}