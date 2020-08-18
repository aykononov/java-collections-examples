package InterfaceMap;

import java.util.TreeMap;

// Пример использования класса TreeMap
class Persons {
    private String name;

    public Persons(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> users = new TreeMap<Integer, String>();
        users.put(1,"Alex");
        users.put(2,"Ivan");
        users.put(3,"Elena");
        users.put(4, "Mariya");
    }
}
