package InterfaceSet;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> users = new TreeSet<String>();
        // Добавим в список ряд элементов
        // при вставке объекты сразу же сортируются по возрастанию
        users.add("Alex");
        users.add("Ivan");
        users.add("Elena");
        users.add("Mariya");

        System.out.printf("В коллекции %d отсортированных элемента: ", users.size());
        // Вывод получает остортированный набор
        for (String name : users) {
            System.out.print(name + " ");
        }

        System.out.println();
        System.out.println("\nПробуем добавить существующий элемент Alex, результат: " + users.add("Alex"));
        System.out.println("\nПробуем удалить существующий элемент Alex, результат: " + users.remove("Alex"));
        System.out.println("\nПолучим первый элемент: " + users.first());
        System.out.println("\nПолучим последний элемент: " + users.last());
        System.out.println("\nДобавим элемент Petr, результат: " + users.add("Petr"));

        // Создадим набор элемнотв С одного элемента До другого
        SortedSet<String> sortSetOfElements = users.subSet("Elena","Petr");
        System.out.println("\nПоднабор: " + sortSetOfElements);

        System.out.println("\nЭлемент " + users.higher("Ivan") + " выше Ivan");
        System.out.println("\nЭлемент " + users.lower("Ivan") + " ниже Ivan");

        System.out.print("\nВозвращаем набор в обратном порядке: ");
        NavigableSet<String> navSetElements = users.descendingSet();
        System.out.println(navSetElements);

        System.out.print("\nВозвращаем набор в котором все элементы меньше Ivan: ");
        SortedSet<String> sortSetLower = users.headSet("Ivan");
        System.out.println(sortSetLower);

        System.out.print("\nВозвращаем набор в котором все элементы больше (включая) Ivan: ");
        SortedSet<String> setGreater = users.tailSet("Ivan");
        System.out.println(setGreater);
    }
}
/* -----------------------------------------------------------
В коллекции 4 отсортированных элемента: Alex Elena Ivan Mariya

Пробуем добавить существующий элемент Alex, результат: false

Пробуем удалить существующий элемент Alex, результат: true
 */