package InterfaceMap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Пример использования класса TreeMap
class Persons {
    private String name;

    public Persons(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> users = new TreeMap<Integer, String>();
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

        // Получим все объекты, после объекта с ключом (2)
        Map<Integer, String> afterMap = users.tailMap(2);
        System.out.println("Получим все объекты, ПОСЛЕ объекта с ключом (2): " + afterMap);

        // Получим все объекты, до объекта с ключом (3)
        Map<Integer, String> beforMap = users.headMap(3);
        System.out.println("Получим все объекты, ДО объекта с ключом (3): " + beforMap);

        // Получим последний элемент дерева
        Map.Entry<Integer, String> lastItem = users.lastEntry();
        System.out.printf("Получим последний элемент дерева: key %d values %s\n",
                          lastItem.getKey(), lastItem.getValue());

        Map<String, Persons> persons = new TreeMap<String, Persons>();
        persons.put("123i45",new Persons("Alex"));
        persons.put("456i78", new Persons("Ivan"));
        persons.put("789i01", new Persons("Petr"));

        // Перебор коллекции
        System.out.println("\nПеребор коллекции.");
        for (Map.Entry<String, Persons> item : persons.entrySet()) {
            System.out.printf("Key: %s Value: %s \n", item.getKey(), item.getValue().getName());
        }
    }
}
/* ------------------------------------------------------------------------
Получим объект по ключу (2): Ivan
Получим весь набор ключей: [1, 2, 3, 4]
Получим набор всех значений: [Alex, Ivan, Elena, Mariya]
Получим все объекты, ПОСЛЕ объекта с ключом (2): {2=Ivan, 3=Elena, 4=Mariya}
Получим все объекты, ДО объекта с ключом (3): {1=Alex, 2=Ivan}
Получим последний элемент дерева: key 4 values Mariya
 */