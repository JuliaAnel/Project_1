public class HW_4_1 {
    public static void main(String[] args) {
//        Задача №1
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести сумму всех значений массива.
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        System.out.println(sum);
//        Задача №2
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести максимальное значение массива.
        int max = Integer.MIN_VALUE;//array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);

//                Задача №3

//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести минимальное значение массива.
        int min = Integer.MAX_VALUE;//array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);
//                Задача №4

//        Дан массив:
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        необходимо вывести среднее арифметическое всех значений массива.
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        double sum1 = 0;
        //double average = 0;
        for(int i = 0; i < array1.length; i++){
            sum1 = sum1 + array1[i];

        }
       // average = sum1 / array1.length;
       // System.out.println(average);
        System.out.println(sum1 / array1.length);
//                Задача №5

//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести сумму элементов массива.
        int[][] array2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
            int sum2 = 0;
        for(int i = 0; i < array2.length; i++){
           for(int j = 0; j < array2[i].length; j++) {
               sum2 = sum2 + array2[i][j];
           }
    }
        System.out.println(sum2);
//                Задача №6
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести максимальное значение массива.
        int[][] array3 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int max1 = Integer.MIN_VALUE;
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                if (max1 < array3[i][j]) {
                    max1 = array3[i][j];
                }
            }
        }
            System.out.println(max1);


//        Задача №7
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести количество элементов в массиве.
        int count = 0;
        for (int i = 0; i < array3.length; i++) {
            count = count + array3[i].length;
            }
            System.out.println(count);

        }
    }

