package InterfaceList;

// Пример использования ArrayDequeDemo
import java.util.ArrayDeque;

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

        //
    }
}
