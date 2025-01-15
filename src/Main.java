public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.setPerson("Иванов", "+79179875000");
        phoneBook.setPerson("Петров", "+79179875001");
        phoneBook.setPerson("Сидоров", "+79179875002");
        phoneBook.setPerson("Иванов", "+79179875003");
        phoneBook.setPerson("Иванов", "+79179875004");

        System.out.println(phoneBook.getPhoneNumber("Иванов"));
    }
}