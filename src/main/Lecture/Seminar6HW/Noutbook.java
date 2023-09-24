package Seminar6HW;

import java.util.*;

public class Noutbook {
    /*
    Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
    Реализовать в java. Создать множество ноутбуков.
    Написать метод, который будет запрашивать у пользователя критерий (или критерии)
    фильтрации и выведет ноутбуки, отвечающие фильтру.
    Критерии фильтрации можно хранить в Map. Например: “Введите цифру,
    соответствующую необходимому критерию:
    1 - ОЗУ
    2 - Объем ЖД
    3 - Операционная система
    4 - Цвет …
    Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры
    фильтрации можно также в Map.
    Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    */
    private Integer ram;
    private Integer ssd;
    private String os;
    private String color;

    private static Map<Integer, String> mapFilter = new HashMap<>();

    public Noutbook(int ram, int ssd, String os, String color) {
        this.ram = ram;
        this.ssd = ssd;
        this.os = os;
        this.color = color;
    }

    @Override
    public String toString() {
        return "RAM: " + ram + "| SSD: " + ssd + "| os: " + os + "| color: " + color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Noutbook)) {
            return false;
        }
        Noutbook noutbook = (Noutbook) o;
        return ram == noutbook.ram && ssd == noutbook.ssd && os.equals(noutbook.os) && color.equals(noutbook.color);
    }

    @Override
    public int hashCode() {
        return 21 * ram + 18 * ssd + 9 * os.hashCode() + 5 * color.hashCode();
    }

    public int getRam() {
        return ram;
    }

    public int getSsd() {
        return ssd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public static Map<Integer, String> menu() {
        Map<Integer, String> map = new LinkedHashMap<>();
        System.out.println("Выберите параметр фильтрации:");
        map.put(1, "ОЗУ");
        map.put(2, "Объем ЖД");
        map.put(3, "Операционная система");
        map.put(4, "Цвет");
        printMap(map);
        return choice(scanner());
    }

    public static void printMap(Map map) {
        for (int i = 1; i < map.size() + 1; i++) {
            System.out.printf("%s - %s \n", i, map.get(i));
        }
    }

    static int scanner() {
        Scanner iScanner = new Scanner(System.in);
        int item = iScanner.nextInt();
        return item;
    }

    public static Map<Integer, String> choice(int item) {
        switch (item) {
            case 1:
                Map<Integer, String> map1 = new LinkedHashMap<>();
                System.out.println("Выберите параметр фильтрации:");
                map1.put(1, "4");
                map1.put(2, "8");
                map1.put(3, "16");
                map1.put(4, "32");
                printMap(map1);
                filter(1, map1.get(scanner()));
            case 2:
                Map<Integer, String> map2 = new LinkedHashMap<>();
                System.out.println("Выберите параметр фильтрации:");
                map2.put(1, "256");
                map2.put(2, "512");
                map2.put(3, "1024");
                map2.put(4, "2048");
                printMap(map2);
                filter(2, map2.get(scanner()));
            case 3:
                Map<Integer, String> map3 = new LinkedHashMap<>();
                System.out.println("Выберите параметр фильтрации:");
                map3.put(1, "Windows");
                map3.put(2, "Linux");
                map3.put(3, "MacOS");
                printMap(map3);
                filter(3, map3.get(scanner()));
            case 4:
                Map<Integer, String> map4 = new LinkedHashMap<>();
                System.out.println("Выберите параметр фильтрации:");
                map4.put(1, "White");
                map4.put(2, "Black");
                map4.put(3, "Silver");
                printMap(map4);
                filter(4, map4.get(scanner()));
            default:
                return mapFilter;
        }
    }

    public static void filter(int key, String value) {
        mapFilter.put(key, value);
        System.out.println(mapFilter);
    }

    public static void search(HashSet<Noutbook> set) {

        for (Noutbook item : set) {
            if (item.getRam() == Integer.parseInt(mapFilter.get(1)) &&
                item.getSsd() == Integer.parseInt(mapFilter.get(2)) &&
                item.getOs().equals(mapFilter.get(3)) &&
                item.getColor().equals(mapFilter.get(4))) {
                System.out.println(item);
            }
        }
    }
}

