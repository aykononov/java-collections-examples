package InterfaceIterator;

// Пример использования ListIterator

import java.util.ArrayList;
import java.util.ListIterator;

class ListIteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> users = new ArrayList<String>();
        users.add("Alex");
        users.add("Ivan");
        users.add("Boris");
        users.add("Petr");

        // Перебор всех элементов коллекции
        ListIterator<String> listIter = users.listIterator();
        System.out.print("Перебор всех элементов коллекции:");
        // Цикл продолжается, пока не достигнут конец коллекции и есть слдейющий элемент
        while (listIter.hasNext()) {
            System.out.printf(" %s", listIter.next()); // получим текущий элемент и перейдем к следующему
        }

        // изменим текущий элемент (сейчас это Petr)
        System.out.println("\nИзменить текущий элемент: Petr <- Roman");
        listIter.set("Roman");

        // Перебор всех элементов коллекции в обратном порядке
        System.out.print("Перебор всех элементов в обратном порядке:");
        while (listIter.hasPrevious()) {
            System.out.printf(" %s", listIter.previous()); // получим текущий элемент и перейдем к предыдущему
        }
    }
}
/*
Перебор всех элементов коллекции: Alex Ivan Boris Petr
Изменить текущий элемент: Petr <- Roman
Перебор всех элементов в обратном порядке: Roman Boris Ivan Alex
 */