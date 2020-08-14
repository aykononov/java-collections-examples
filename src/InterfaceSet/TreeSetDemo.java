package InterfaceSet;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> users = new TreeSet<String>();
        // Добавим в список ряд элементов
        users.add("Alex");
        users.add("Ivan");
        users.add("Elena");
        users.add("Mariya");

        System.out.printf("В коллекции %d отсортированных элемента: ", users.size());

        for (String name : users) {
            System.out.print(name + " ");
        }

        System.out.println();
        System.out.println("\nПробуем добавить существующий элемент Alex, результат: " + users.add("Alex"));
        System.out.println("\nПробуем удалить существующий элемент Alex, результат: " + users.remove("Alex"));

    }
}
/* -----------------------------------------------------------
В коллекции 4 отсортированных элемента: Alex Elena Ivan Mariya

Пробуем добавить существующий элемент Alex, результат: false

Пробуем удалить существующий элемент Alex, результат: true
 */