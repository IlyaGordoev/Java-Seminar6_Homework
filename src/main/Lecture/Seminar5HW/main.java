package Seminar5HW;

import java.net.Socket;

public class main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иван", "78966");
        phoneBook.add("Иван", "54378");
        phoneBook.add("Иван", "45877");
        phoneBook.add("Игорь", "78967");
        phoneBook.add("Алексей", "45688");
        phoneBook.add("Андрей", "78969");
        System.out.println("Телефонная книга: ");
        phoneBook.getAll();

        System.out.println("\nПоиск по имени");
        System.out.println(phoneBook.getByName("Иван"));
        System.out.println("\nПоиск по телефоны");
        System.out.println(phoneBook.getByNum("78966"));
    }
}
