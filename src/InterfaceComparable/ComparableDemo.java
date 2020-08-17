package InterfaceComparable;

// Пример типизации класса TreeSet объектом типа Person и сохранить в файл
import java.io.*;
import java.util.TreeSet;
/*
Для того, чтобы объекты Person можно было сравнить и сортировать,
они должны применять интерфейс Comparable<E>.
При применении интерфейса он типизируется текущим классом. Применим его к классу Person
 */


class Person implements Comparable<Person> {
    private String name;

    Person(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    // Здесь реализован метод compareTo()
    public int compareTo(Person p) {
        return name.compareTo(p.getName());
    }
}
class ComparableDemo {
    public static void main(String[] args) {

        // типизировать TreeSet типом Person и добавить в дерево соответствующие объекты
        TreeSet<Person> users = new TreeSet<Person>();
        users.add(new Person("Alex"));
        users.add(new Person("Ivan"));
        users.add(new Person("Elena"));
        users.add(new Person("Mariya"));

        // Запись данных коллекции в файл
        String file = "users.txt";
        String path = "./src/InterfaceComparable/";
        System.out.print("Пользователи: ");
        try (FileWriter outfile = new FileWriter(path + file)) {
            for (Person person : users ) {
                outfile.write(person.getName() + "\n");
                System.out.printf("%s ", person.getName());
            }
            System.out.println("\nУспешно записаны в файл: " + file);
        }  catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
/* ---------------------------------
Пользователи: Alex Elena Ivan Mariya
Успешно записаны в файл: users.txt
 */