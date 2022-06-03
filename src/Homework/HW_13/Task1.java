package Homework.HW_13;

import java.util.*;

public class Task1 {
    /**Задача №1
     Создать лист и добавить в него следующие слова:
     White.
     Tan.
     Yellow.
     Orange.
     Red.
     Pink.
     Purple.
     Blue.
     Затем удалить из этого списка все цвета в которых встречается буква “L”
     */
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("White");
        list.add("Tan");
        list.add("Yellow");
        list.add("Orange");
        list.add("Red");
        list.add("Pink");
        list.add("Purple");
        list.add("Blue");

        for(String color : list) {
            System.out.println(color);
        }

        System.out.println();
        //for(int i = list.size(); i-- > 0;) {
        for (int i = list.size() - 1; i >= 0 ; i--) {
            if(list.get(i).contains("l")) {
                System.out.println(list.remove(i));
            }
        }

        System.out.println(list);
        System.out.println(list.size());

//        list.removeIf(color -> color.contains("l"));
//        System.out.println(list);
//        System.out.println(list.size());

//        Iterator<String> iterator = list.iterator();
//
//        while(iterator.hasNext()) {
//            //String color = iterator.next();
//            if(iterator.next().contains("l")) {
//                iterator.remove();
//            }
//        }
//        System.out.println(list);
//        System.out.println(list.size());
    }
}
