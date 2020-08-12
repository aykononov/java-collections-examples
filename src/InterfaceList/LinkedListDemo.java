package InterfaceList;

// Пример использования класса LinkedList и его методов
import java.util.LinkedList;

class Personal {
    private String name;

    public Personal(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> users = new LinkedList<String>();

        // Добавим в список ряд элементов
        users.add("Alex");
        users.add("Ivan");
        users.add("Elena");
        users.add("Mariya");

        // Добавляем элементы в начало
        users.addFirst("Olga"); // добавляем на первое место
        users.add(0,"Anna"); // добавляем по индексу 0, а текущий элемент сдвигается в конец

        // Добавляем элемнты в конец
        users.addLast("Petr");
        users.add("Vladimir");

        System.out.printf("В коллекции %d элементов: ", users.size());
        for (String person : users) {
            System.out.print(person + " ");
        }

        System.out.printf("\nпервый элемент %s", users.getFirst());
        System.out.printf("\nвторой элемент %s ", users.get(1));
        System.out.printf("\nпоследний элемент %s\n", users.getLast());

        // Проверяем наличие элемента в коллекции
        if (users.contains("Anna")) {
            System.out.println("\nУдаляем элемент Anna");
            users.remove("Anna"); // удаляем такой элемент
        }

        System.out.printf("Удаляем второй элемент по индексу -> %s\n", users.get(1));
        users.remove(1); // удаляем по индексу "Alex"
        System.out.printf("Удаляем последний элемент -> %s\n", users.getLast());
        users.removeLast(); // удаляем последний элемент

        System.out.printf("\nВ коллекции %d элементов: ", users.size());
        for (String person : users) {
            System.out.print(person + " ");
        }

        // очередь из объектов класса Personal
        LinkedList<Personal> people = new LinkedList<Personal>();
        people.add(new Personal("Olga"));
        people.addFirst(new Personal("Anna"));
        people.addLast(new Personal("Petr"));
        people.add(new Personal("Vladimir"));

        System.out.printf("\n\nВ очереди %d элемента: ", people.size());
        for (Personal p : people) {
            System.out.print(p.getName() + " ");
        }

        Personal firstPeople = people.getFirst();
        System.out.println("\nпервый элемент в очереди: " + firstPeople.getName());

        Personal lastPeople = people.peekLast();
        System.out.println("последний элемент в очереди: " + lastPeople.getName());
    }
}
/* --------------------------------------------------------------------
В коллекции 8 элементов: Anna Olga Alex Ivan Elena Mariya Petr Vladimir
первый элемент Anna
второй элемент Olga
последний элемент Vladimir

Удаляем элемент Anna
Удаляем второй элемент по индексу -> Alex
Удаляем последний элемент -> Vladimir

В коллекции 5 элементов: Olga Ivan Elena Mariya Petr

В очереди 4 элемента: Anna Olga Petr Vladimir
первый элемент в очереди: Anna
последний элемент в очереди: Vladimir
 */