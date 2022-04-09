package Homework.HW_5;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Test t = new Test();
        int f = 5;
        int g = 10;

        t.sum(f, g); // аргументы метода

        int x = 3;
        int y = 11;

        t.sum(x, y);

        int u = 4;
        System.out.println(t.sum3(x, y, u));

//        int a = 9;
//        int b = 2;
//        System.out.println(a / b);
//        //приводим 9 к типу double
//        System.out.println((a * 1.0) / b);
//        System.out.println((a + 0.0) / b);
//        //------------------------ctrl + alt + l - отформотировать код для читабельности
//        //при взаимодействии нескольких типов данных в результате арифметических операций, результат приводит к более сложному типу
//        double c = 9;
//        int d = 2;
//        System.out.println(c / d);
//        //---------------------------ctrl + / -- закомментировать код
//        //по дефолту целочисленные числа - типа int, нецелочисленные - типа double
//        long v = 2_148_483_648L;
//        long g = 2148000000L;
//        float f = 1.1F;
//        System.out.println("Hello" + "\t" + "world" + "\n" + "!!!");
//        System.out.println("Hello\tworld\n!!!");
//        System.out.print("Hello world!!!\n");
        int i = 2;
        if (i == 1) {
            System.out.println("1");
        } else if (i > 1) {
                System.out.println("i > 1");
            } else {
                System.out.println("i < 1");
            }

        if (i == 1) {
            System.out.println("1");
        } else {
            if (i > 1) {
                System.out.println("i > 1");
            } else {
                System.out.println("i < 1");
            }
        }
//        int k = 0;
//        while (k < 5) {
//            System.out.println(k);
//            k++;
//        }
        int g1 = 0;
        do {
            System.out.println(g1);
            g1++;
        } while (g1 < 5);

            int[] array = {2, 4, 6, 8, 10}; //shift + F6 --- change name of variable in each places (refactoring)
            System.out.println(array.length);
//        array[0] = 12;
//        int a = array[1];
//        System.out.println(a);
//        for (int j = 0; j < array.length; j++) {
//            System.out.println(array[j]);
//        }
            //   array[0] = 10;
               System.out.println(Arrays.toString(array)); // print array
            //value type:
        int e = 8;
        int r = e;
        r = 40;
        System.out.println(e);
      //  reference type:
             int[] a = {2, 4};
           int[] b = a;
           b[0] = 20;
            System.out.println(Arrays.toString(a));
            String str1 = "Привет!";
            String str2 = str1;
            System.out.println(str2);
            System.out.println(str1.length());
            String result = str1.substring(1, 4);
            System.out.println(result);
//        System.out.println(str1.substring(1,4)); //ctrl + Q справка
//        for(int j = 0; j < str1.length(); j++) {
//            if (str1.charAt(j) == '!') {
//                System.out.println(str1.charAt(j));
//            }
//        }
//            String str3 = "привет!";
//            String str4 = str3.replace('!', '-');
//            System.out.println(str4);
//
//            int[] a = {2, 4};
//            int[] b = {2, 4};

            //       System.out.println(a == b); //false потому что переменные ссылаются на разные массивы
            //       System.out.println(a);
            //       System.out.println(b);

//        int[] a = {2, 4};
//        int[] b = a;
//
//        System.out.println(a == b); // true
//        System.out.println(a);
//        System.out.println(b);

            String ab = "Hi!";
            String bc = "Hi!";

            System.out.println(ab == bc);
            System.out.println(ab.equals((bc)));

            Integer c = 10;
            Integer d = 10;
            System.out.println(c.equals(d));

            int[] v = {8, 2, 3, 5};
            int[][] n = {{1, 2}, {3, 4, 5}};

            for (; i < n.length; i++) {
                for (int j = 0; j < n[i].length; j++) {
                    System.out.println(n[i][j]);
                }
            }

            System.out.println(Arrays.toString(v)); // распечатать одномерный массив
            System.out.println(Arrays.deepToString(n)); //распечатать многомерный массив

            String str = "Hi!";
            System.out.println(str.indexOf('!'));

            int[][] array1 = {{1, 10, 100, 1000}, {2, 20, 200, 2000}, {3, 30, 300, 3000}, {4, 40, 400, 4000}};
            int sum = 0;
            for (int k = 0; k < array1.length; k++) {
                System.out.println(Arrays.toString(array1[k]));
                sum = 0;
                for (int j = 0; j < array1[k].length; j++) {
                    sum = sum + array1[k][j];
                }
                System.out.println(" sum = " + sum);
            }


//        for ( int i = 0; i < 5; i++) {
//            if (i == 3) {
//                break; // заканчивает цикл
//            }
//            System.out.println(i);
//        }
//
//        for ( int i = 0; i < 5; i++) {
//            if (i == 3) {
//                continue; //заканчивает итерацию
//            }
//            System.out.println(i);
//        }
            String string = "Hi!";
            System.out.println(string.indexOf('!')); //можно передавать в эту функцию как символ, так и строку
            System.out.println(string.indexOf("!"));
//        String result;
//        public static String numberToString(int num) {
//             result = Integer.toString(num);
//        }
//        System.out.println(result);
//        }
//    }
            int[] array5 = {2, 6, 4, 7, 8};
            Main1 main = new Main1();
            main.findSmallestInt(array5);
        System.out.println(main.findSmallestInt1(array5));

            System.out.println(main.numberToString(5));
            System.out.println(main.numberToString1(4));
    }
}