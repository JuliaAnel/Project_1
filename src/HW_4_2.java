public class HW_4_2 {
    public static void main(String[] args) {
//        Задача №1
//        Дана строка:
//        String s = “Перестановочный алгоритм быстрого действия”;
//        необходимо вывести все буквы “о” из этой строки.
//                Для указанной строки ответ будет “ооооо” (или в столбик)
        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ('о')) {
                System.out.println(s.charAt(i));
            }
        }
//        Задача №2
//        Дана строка:
//        String s = “Перевыборы выбранного президента”;
//        необходимо подсчитать количество букв “е” в строке.
//        Для указанной строки ответ будет 4.
        String t = "Перевыборы выбранного президента";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ('е')) {
                sum = sum + s.charAt(i);
            }
        }
        System.out.println(sum);
//        Задача №3
//
//        Дана строка:
//        String s = “Посмотрите как Рите нравится ритм”;
//        необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
//                Для указанной строки ответ будет 6, 15, 29.
//
//
//        Экстра задача
//
//        Дан массив:
//        String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
//        необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
//

    }
}
