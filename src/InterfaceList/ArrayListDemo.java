package InterfaceList;
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> users = new ArrayList<String>();

        // Добавить в список новые элементы
        users.add(0,"Alex");
        users.add(1,"Ivan");
        users.add(2,"Elena");
        users.add(3,"Mariya");

        System.out.println("Присваиваем новое значение 1-му элементу:");
        // Получаем 1-й элемент по индексу
        System.out.print(users.get(0));
        users.set(0,"Aleksandr");
        System.out.println(" <- " + users.get(0));


        System.out.printf("\nСписок пользователей содержит %d элемента: \n", users.size());
        for (String person : users ) {
            System.out.println(person);
        }

        // Проверить наличие элемента в списке
        if (users.contains("Aleksandr")) {
            System.out.println("\nВ списке присутствует элемент: Aleksandr");
        }

        // Удаляем элемнты из списка
        users.remove(0); // по индексу
        users.remove("Ivan"); // конкретного элемента

        System.out.printf("\nПосле удаления, в списке %d элемента: \n", users.size());
        for (String person : users ) {
            System.out.println(person);
        }

        // Добавляем элементы из другого массива в список пользователей
        System.out.println("\nДобавляем элементы в список.");
        String[] addUsers = {"Aleksandr","Ivan","Petr"};
        for (String addperson : addUsers) {
            users.add(addperson);
        }


        System.out.printf("\nНовый список пользователей содержит %d элемента: \n", users.size());
        // С помощью метода toArray() мы можем преобразовать список в массив объектов.
        Object[] obArray = users.toArray();
        for (Object person : obArray) {
            System.out.println(person);
        }

    }
}
/* --------------------------------------
Присваиваем новое значение 1-му элементу:
Alex <- Aleksandr

Список пользователей содержит 4 элемента:
Aleksandr
Ivan
Elena
Mariya

В списке присутствует элемент: Aleksandr

После удаления, в списке 2 элемента:
Elena
Mariya

Добавляем элементы в список.

Новый список пользователей содержит 5 элемента:
Elena
Mariya
Aleksandr
Ivan
Petr
 */