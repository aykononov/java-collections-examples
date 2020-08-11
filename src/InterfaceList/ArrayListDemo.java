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
        // Получаем, выводим 1-й элемент списка
        System.out.print(users.get(0));
        users.set(0,"Aleksandr");
        System.out.println(" <- " + users.get(0));


        System.out.printf("\nСписок пользователей содержит %d элемента: \n", users.size());
        for (String person : users ) {
            System.out.println(person);
        }
    }
}
