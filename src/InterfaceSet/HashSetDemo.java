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

        System.out.printf("В коллекции %d Несортированных элемента: ", users.size());
        for (String name : users) {
            System.out.print(name + " ");
        }
        System.out.println();
        System.out.println("\nПробуем добавить существующий элемент Alex, результат: " + users.add("Alex"));
        System.out.println("\nПробуем удалить существующий элемент Alex, результат: " + users.remove("Alex"));

        System.out.println("\nХэш-таблица Несортированных объектов Person:");
        HashSet<Person> people = new HashSet<Person>();
        people.add(new Person("Anna"));
        people.add(new Person("Olga"));
        people.add(new Person("Petr"));
        people.add(new Person("Vladimir"));

        for (Person p : people) {
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