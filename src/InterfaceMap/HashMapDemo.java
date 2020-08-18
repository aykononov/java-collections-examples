package InterfaceMap;

import java.util.*;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> users = new HashMap<Integer, String>();
        users.put(1,"Alex");
        users.put(2,"Ivan");
        users.put(3,"Elena");
        users.put(4, "Mariya");

        // Получим объект по ключу
        System.out.println("Получим объект по ключу (2): " + users.get(2));

        // Получим весь набор ключей
        Set<Integer> keys = users.keySet();
        System.out.println("Получим весь набор ключей: " + keys);

        // Получим набор всех значений
        Collection<String> values = users.values();
        System.out.println("Получим набор всех значений: " + values);

        // Заменим элемент по ключу
        System.out.println("Заменим элемент по ключу (2): " + users.replace(2,"Petr"));
        System.out.println("Получим набор всех значений: " + values);

        // Удалим элемент по ключу
        System.out.println("Удалим элемент по ключу(2): " + users.remove(2));
        System.out.println("Получим набор всех значений: " + values);

        // Перебор элементов
        System.out.println("\nПеребор элементов.");
        for (Map.Entry<Integer, String> item : users.entrySet()) {
            System.out.printf("Key: %d Value: %s \n", item.getKey(), item.getValue());
        }

        // Перебор коллекции
        System.out.println("\nПеребор коллекции.");
        Map<String, Person> person = new HashMap<String, Person>();
        person.put("123i45",new Person("Alex"));
        person.put("456i78", new Person("Ivan"));
        person.put("789i01", new Person("Petr"));

        for (Map.Entry<String, Person> item : person.entrySet()) {
            System.out.printf("Key: %s Value: %s \n", item.getKey(), item.getValue().getName());
        }
    }
}
/*
Получим объект по ключу (2): Ivan
Получим весь набор ключей: [1, 2, 3, 4]
Получим набор всех значений: [Alex, Ivan, Elena, Mariya]
Заменим элемент по ключу (2): Ivan
Получим набор всех значений: [Alex, Petr, Elena, Mariya]
Удалим элемент по ключу(2): Petr
Получим набор всех значений: [Alex, Elena, Mariya]

Перебор элементов.
Key: 1 Value: Alex
Key: 3 Value: Elena
Key: 4 Value: Mariya

Перебор коллекции.
Key: 456i78 Value: Ivan
Key: 789i01 Value: Petr
Key: 123i45 Value: Alex
 */