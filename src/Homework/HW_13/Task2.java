package Homework.HW_13;

import java.util.*;

public class Task2 {
    /**
     * Задача №2
     * Создать лист со значениями от 100 до 1000.
     */

    public static void main(String[] args) {

        List<Integer> list1 = new LinkedList<>();

        for (int i = 100; i <= 1000; i++) {
            list1.add(i);
        }

/**Задача №3
 Удалить из листа, созданного в предыдущей задаче, все четные элементы.
 */

        for (int i = list1.size(); i-- > 0;) {
            if (list1.get(i) % 2 == 0) {
                list1.remove(i);
            }
        }

            System.out.println(list1);


        /**Экстра задача
         Попробуйте изменить тип итерационной переменной из цикла, в третьей задаче, на Integer (не int, а Integer)
         и добиться такого же результата как и с типом int.
         */

        for (Integer i = list1.size(); i-- > 0;) {
            if (list1.get(i) % 2 == 0) {
                list1.remove(i.intValue());
            }
        }
        System.out.println(list1);

//        list1.removeIf(integer -> integer % 2 == 0);
//
//        for(Integer num : list1) {
//            System.out.println(num);
//        }
    }

}
