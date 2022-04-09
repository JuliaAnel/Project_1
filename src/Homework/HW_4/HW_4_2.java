package Homework.HW_4;

import java.util.Locale;

public class HW_4_2 {
    public static void main(String[] args) {
/**        Задача №1
 Дана строка:
 String s = “Перестановочный алгоритм быстрого действия”;
 необходимо вывести все буквы “о” из этой строки.
 Для указанной строки ответ будет “ооооо” (или в столбик) */
        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'о') {
                System.out.println(s.charAt(i));
            }
        }
/**        Задача №2
 Дана строка:
 String s = “Перевыборы выбранного президента”;
 необходимо подсчитать количество букв “е” в строке.
 Для указанной строки ответ будет 4. */
        String t = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == 'е') {
                count++;
            }
        }
        System.out.println(count);
/**        Задача №3
 Дана строка:
 String s = “Посмотрите как Рите нравится ритм”;
 необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
 Для указанной строки ответ будет 6, 15, 29. */
        String m = "Посмотрите как Рите нравится ритм";
        m = m.toLowerCase(Locale.ROOT);
        int index = m.indexOf("рит");
        while (index != -1) {
            System.out.println(index);
            index = m.indexOf("рит", index + 1);
        }
        String subPart = "рит";
        int subCount = subPart.length();
        for ( int i = 0; i < m.length() - subCount; i++) {
            String subStr = m.substring(i, i + subCount);
            if (subPart.equalsIgnoreCase(subStr)) {
                System.out.println(i);
            }
        }
/**        Экстра задача
 Дан массив:
 String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
 необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”. */
 String[][] array = {{"Привет", "всем", "кто" }, {"изучает", "язык", "программирования" }, {"java" }};
        int count1 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!array[i][j].contains("е")) {
                    count1++;
                }
            }
        }
        System.out.println(count1);
    }
}
