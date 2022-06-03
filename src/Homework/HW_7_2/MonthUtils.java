package Homework.HW_7_2;

/** Создать класс MonthUtils который бы хранил
 * подготовленные месяцы или их массивы для использования (объекты класса Month).
 */
public class MonthUtils {

    private static Month m1 = new Month("January", 31, 28);
    private static Month m2 = new Month("February", 28, 23);
    private static Month m3 = new Month ("March", 30, 24);
    private static Month m4 = new Month("April", 30, 26);
    private static Month m5 = new Month("Mai", 31, 26);
    private static Month m6 = new Month("June", 30, 25);
    private static Month m7 = new Month("July", 31, 28);
    private static Month m8 = new Month("August", 31, 27);
    private static Month m9 = new Month("September", 31, 27);
    private static Month m10 = new Month("October", 31, 27);
    private static Month m11 = new Month("November", 31, 27);
    private static Month m12 = new Month("December", 31, 27);

    private static Month[] YEAR = {m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12};

    public static Month[] getYEAR() {
        return YEAR;
    }

}
