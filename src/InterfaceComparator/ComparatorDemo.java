package InterfaceComparator;

// Пример использования класса компаратор для создания объекта TreeSet
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class Person {
    String name;

    public Person (String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
// Для применения интерфейса нужно создать класс компаратора, который реализует этот интерфейс
class PersonComparator implements Comparator<Person> {
    // Метод compare() возвращает числовое значение,
    // если оно отрицательное, то объект a предшествует объекту b, иначе - наоборот
    public int compare(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }
}
// Используем класс компаратора для создания объекта TreeSet
// Теперь вне зависимости от того, реализован ли в классе Person интерфейс Comparable,
// логика сравнения и сортировки будет использоваться та, которая определена в классе компаратора.
class ComparatorDemo {
    public static void main(String[] args) {
        // Для создания TreeSet используется один из конструкторов,
        // который принимает в качестве параметра компаратор.
        PersonComparator pcomp = new PersonComparator();
        TreeSet<Person> users = new TreeSet<Person>(pcomp);

        users.add(new Person("Alex"));
        users.add(new Person("Ivan"));
        users.add(new Person("Elena"));
        users.add(new Person("Mariya"));

        // Запись данных коллекции в файл
        String file = "users.txt";
        String path = "./src/InterfaceComparator/";
        System.out.print("Пользователи: ");
        try (FileWriter outfile = new FileWriter(path + file)) {
            for (Person person : users) {
                outfile.write(person.getName() + "\n");
                System.out.printf("%s ", person.getName());
            }
            System.out.println("\nУспешно записаны в файл: " + file);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
/* ---------------------------------
Пользователи: Alex Elena Ivan Mariya
Успешно записаны в файл: users.txt
 */