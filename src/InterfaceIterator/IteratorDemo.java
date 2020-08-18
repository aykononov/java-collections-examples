package InterfaceIterator;

// Пример Итератора для перебора коллекции ArrayList

import java.util.*;

class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> users = new ArrayList<String>();
        users.add("Alex");
        users.add("Ivan");
        users.add("Boris");
        users.add("Petr");

        // Перебор всех элементов коллекции
        Iterator<String> iter = users.iterator();
        System.out.print("Перебор всех элементов коллекции:");
        // Цикл продолжается, пока не достигнут конец коллекции и есть слдейющий элемент
        while (iter.hasNext()) {
            System.out.printf(" %s",iter.next()); // получим текущий элемент и перейдем к следующему
        }
    }
}
/* ---------------------------------------------------
Перебор всех элементов коллекции: Alex Ivan Boris Petr
 */