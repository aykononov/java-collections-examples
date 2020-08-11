package InterfaceList;

// Пример использования класса LinkedList и его методов https://metanit.com/java/tutorial/5.3.php
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
        users.add(0,"Anna");

        // Добавляем элемнты в конец
        users.addLast("Petr");
        users.add("Vladimir");
    }
}
