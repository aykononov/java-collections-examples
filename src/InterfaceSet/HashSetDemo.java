package InterfaceSet;

// Пример использования класса HashSet

import java.util.HashSet;

class Persons {
    private String name;

    public Persons(String name) {
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

        System.out.printf("В коллекции %d Несортированных элемента: ", users.size());
        for (String name : users) {
            System.out.print(name + " ");
        }
        System.out.println();
        System.out.println("\nПробуем добавить существующий элемент Alex, результат: " + users.add("Alex"));
        System.out.println("\nПробуем удалить существующий элемент Alex, результат: " + users.remove("Alex"));

        System.out.println("\nХэш-таблица Несортированных объектов Person:");
        HashSet<Persons> people = new HashSet<Persons>();
        people.add(new Persons("Anna"));
        people.add(new Persons("Olga"));
        people.add(new Persons("Petr"));
        people.add(new Persons("Vladimir"));

        for (Persons p : people) {
            System.out.println(p.hashCode() + "\t" + p.getName());
        }
    }
}
/*
В коллекции 4 Несортированных элемента: Alex Mariya Ivan Elena

Пробуем добавить существующий элемент Alex, результат: false

Пробуем удалить существующий элемент Alex, результат: true

Хэш-таблица Несортированных объектов Person:
559670971	Olga
1576861390	Vladimir
1144648478	Petr
853119666	Anna
 */