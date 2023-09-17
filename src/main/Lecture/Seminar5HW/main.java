package Seminar5HW;

import java.net.Socket;

public class main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иван", "78966");
        phoneBook.add("Иван", "54378");
        phoneBook.add("Иван", "45877");
        phoneBook.add("Игорь", "78966");
        phoneBook.add("Алексей", "45688");
        phoneBook.add("Андрей", "78966");
        System.out.println(phoneBook.getAll());
        System.out.println(phoneBook.getByName("Иван"));
        System.out.println(phoneBook.getByNum("78966"));
    }
}
