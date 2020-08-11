package InterfaceList;

// Пример использования ArrayDequeDemo
import java.util.ArrayDeque;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> users = new ArrayDeque<String>();

        // Обычное добавление элементов
        users.add("Alex");
        users.add("Ivan");
        users.add("Elena");
        users.add("Mariya");

        // Добавляем элементы в начало
        users.addFirst("Olga");
        users.push("Anna");

        // Добавляем элемнты в конец
        users.addLast("Petr");
        users.add("Vladimir");

        // Получаем все элементы
        System.out.printf("В коллекции %d элементов: ",users.size());
        for (String name : users) {
            System.out.print(name + " ");
        }

        // Извлекаем все элменты
        System.out.print("\nИзвлекаем все элементы с начала коллекции: ");
        while (users.peek() != null) {
            // извлекаем с начала коллекции
            System.out.print(users.pop() + " ");
        }

        System.out.printf("\nВ коллекции осталось %d элементов.",users.size());

        // очередь из объектов класса Person
        ArrayDeque<Person> people = new ArrayDeque<Person>();
        people.addFirst(new Person("Britney"));
        people.addLast(new Person("Tom"));

        // Получаем все элементы
        System.out.printf("\nВ очереди %d элемента: ",people.size());
        for (Person p : people) {
            System.out.print(p.getName() + " ");
        }

    }
}
/* --------------------------------------------------------------------------------------
В коллекции 8 элементов: Anna Olga Alex Ivan Elena Mariya Petr Vladimir
Извлекаем все элементы с начала коллекции: Anna Olga Alex Ivan Elena Mariya Petr Vladimir
В коллекции осталось 0 элементов.
В очереди 2 элемента: Britney Tom
 */