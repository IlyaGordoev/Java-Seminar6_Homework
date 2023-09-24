package Seminar6HW;

import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Noutbook noutbook1 = new Noutbook(4, 256, "Windows", "White");
        Noutbook noutbook2 = new Noutbook(8, 512, "Linux", "Black");
        Noutbook noutbook3 = new Noutbook(16, 1024, "MacOS", "Silver");
        Noutbook noutbook4 = new Noutbook(32, 2048, "MacOS", "Silver");
        Noutbook noutbook5 = new Noutbook(4, 512, "Windows", "White");

        System.out.println(noutbook1);
        System.out.println(noutbook2);
        System.out.println(noutbook3);

        Set<Noutbook> set = new HashSet<>();
        set.add(noutbook1);
        set.add(noutbook2);
        set.add(noutbook3);
        set.add(noutbook4);
        set.add(noutbook5);

        System.out.println(set);
        System.out.println(noutbook4.equals(noutbook1));

        Noutbook.menu();
        Noutbook.search((HashSet<Noutbook>) set);





        }
    }
