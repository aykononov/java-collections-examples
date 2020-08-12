package InterfaceSet;

// Пример использования класса HashSet

import java.util.HashSet;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> users = new HashSet<String>();

        // Добавим в список ряд элементов
        users.add("Alex");
        users.add("Ivan");
        users.add("Elena");
        users.add("Mariya");


        System.out.println("Попробуем добавить существующий элемент: " + users.add("Alex"));
    }
}
