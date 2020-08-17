package InterfaceComparator;

// Пример использования цепочек класса компаратор для создания объекта TreeSet
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class Persons {
    private String name;
    private int age;

    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }
}

// Первый приоритет компраратора для сортировки по имени
class PersonNameComparator implements Comparator<Persons> {
    public int compare(Persons a, Persons b) {
        return a.getName().compareTo(b.getName());
    }
}

// Второй приоритет компаратора для сортировки по возрасту
class PersonAgeComparator implements Comparator<Persons> {
    public int compare(Persons a, Persons b) {
        if (a.getAge() > b.getAge())
            return 1;
        else if (a.getAge() < b.getAge())
            return -1;
        else
            return 0;
    }
}
//
class ComparatorChainsDemo {
    public static void main(String[] args) {
        // Метод thenComparing() использует цепочки компараторов для сортировки набора
        Comparator<Persons> pcomp = new PersonNameComparator().thenComparing(new PersonAgeComparator());
        TreeSet<Persons> users = new TreeSet<Persons>(pcomp);
        users.add(new Persons("Alex", 22));
        users.add(new Persons("Ivan", 23));
        users.add(new Persons("Elena", 32));
        users.add(new Persons("Mariya", 33));

        // Запись данных коллекции в файл
        String file = "outfile.txt";
        String path = "./src/InterfaceComparator/";
        System.out.print("Пользователи: ");
        try (FileWriter outfile = new FileWriter(path + file)){
            for (Persons person : users ) {
                outfile.write(person.getName() + " " + person.getAge() + "\n");
                System.out.print(person.getName() + " " + person.getAge() + "; ");
            }
            System.out.println("\nУспешно записаны в файл: " + file);
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
/* -------------------------------------------------
Пользователи: Alex 22; Elena 32; Ivan 23; Mariya 33;
Успешно записаны в файл: outfile.txt
 */