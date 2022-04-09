package Homework.HW_5;
/**    Необходимо написать 4 метода:
 сложение 2х чисел
 вычитание 2х чисел
 умножение 2х чисел
 деление 2х чисел */
public class HW_5_1_1 {
    public static void getSum (int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static void getSubtraction (int a, int b) {
        int subtraction = a - b;
        System.out.println(subtraction);
    }

    public static void getMultiplication (int a, int b) {
        int multiplication = a * b;
        System.out.println(multiplication);
    }

    public static void getDivision (int a, int b) {
        double division = a / (b + 0.0);
        System.out.println(division);
    }
        //    Задача №1
        public static int sum (int a, int b) {
            return a + b;
    }
}
