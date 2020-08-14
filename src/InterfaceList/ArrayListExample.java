package InterfaceList;

// Пример решения задачи с применением ArrayList
import java.util.ArrayList;
import java.util.Arrays;

/*
Задача:
Нужно заполнить два списка четными числами, первый от 4 до 20 с отступлением в 4.
Второй от 2 до 20 с отступлением в 2.
Первом случае результат должен выглядеть: 4, 8, 12, 16, 20
Во втором : 2, 4, 6, 8, 10, 12, 14, 16, 18, 20
Далее удалить из коллекции те цифры которые не повторяются.
Таким образом во втором списке должны остаться: 4, 8, 12, 16, 20
 */
public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> listNum1 = new ArrayList<Integer>();
        for (int i = 4; i <= 20; i += 4) {
            listNum1.add(i);
        }

        System.out.print("listNum1: ");
        for (int i : listNum1) {
            System.out.print(i + " ");
        }

        ArrayList<Integer> listNum2 = new ArrayList<Integer>();
        for (int i = 2; i <= 20; i += 2) {
            listNum2.add(i);
        }

        System.out.println();
        System.out.print("listNum2: ");
        for (int i : listNum2) {
            System.out.print(i + " ");
        }

        System.out.print("\nПосле удаления результат listNum2: ");

        for (int i = 0; i < listNum2.size(); i++) {
            if (!listNum1.contains(listNum2.get(i))) {
                listNum2.remove(i);
            }
        }

        for (int i : listNum2 ) {
            System.out.print(i + " ");
        }
    }
}
/* --------------------------------------------
listNum1: 4 8 12 16 20
listNum2: 2 4 6 8 10 12 14 16 18 20
После удаления результат listNum2: 4 8 12 16 20
 */