public class HW_5_1 {
//    Задача №1
public static int sum (int a, int b) {
    return a + b;
}

    public static boolean isLove(final int flower1, final int flower2) {
        if (flower1 % 2 == 0 && flower2 % 2 != 0 || flower1 % 2 != 0 && flower2 % 2 == 0 ) {
            return true;
        }
        else {
            return false;
        }

    }
//    Необходимо написать 4 метода:
//    сложение 2х чисел
//    вычитание 2х чисел
//    умножение 2х чисел
//    деление 2х чисел
//
//    public static void getSum (int a, int b) {
//        int sum = a + b;
//        System.out.println(sum);
//    }
//
//    public static void getSubtraction (int a, int b) {
//        int subtraction = a - b;
//        System.out.println(subtraction);
//    }
//
//    public static void getMultiplication (int a, int b) {
//        int multiplication = a * b;
//        System.out.println(multiplication);
//    }
//
//    public static void getDivision (int a, int b) {
//        double division = a / (b + 0.0);
//        System.out.println(division);
//    }

    public static void main(String[] args) {
        HW_5_1_1 s = new HW_5_1_1();
        int c = 5;
        int d = 10;
        System.out.println(sum(5, 8));

//        getSum(c, d);
//        getSubtraction(c, d);
//        getMultiplication(c, d);
//        getDivision(c, d);
//
//        s.getSum(c, d);
//        s.getSubtraction(c, d);
//        s.getMultiplication(c, d);
//        s.getDivision(c, d);
//
    }
}
