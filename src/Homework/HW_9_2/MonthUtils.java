package Homework.HW_9_2;

public class MonthUtils {
    private final static Month M1 = new Month("January", 31, 28);
    private final static Month M2 = new Month("February", 28, 23);
    private final static Month M3 = new Month("March", 30, 24);
    private final static Month m4 = new Month("April", 30, 26);
    private final static Month m5 = new Month("Mai", 31, 26);
    private final static Month m6 = new Month("June", 30, 25);
    private final static Month m7 = new Month("July", 31, 28);
    private final static Month m8 = new Month("August", 31, 27);
    private final static Month m9 = new Month("September", 31, 27);
    private final static Month m10 = new Month("October", 31, 27);
    private final static Month m11 = new Month("November", 31, 27);
    private final static Month m12 = new Month("December", 31, 27);

    private final static Month[] YEAR = {M1, M2, M3, m4, m5, m6, m7, m8, m9, m10, m11, m12};
    private final static Month[] THREE_MONTHS_1 = {M1, M2, M3};
    private final static Month[] THREE_MONTHS_2 = {m4, m5, m6};
    private final static Month[] THREE_MONTHS_3 = {m7, m8, m9};
    private final static Month[] THREE_MONTHS_4 = {m10, m11, m12};
    private final static Month[] HALF_A_YEAR_1 = {M1, M2, M3, m4, m5, m6};
    private final static Month[] HALF_A_YEAR_2 = {m7, m8, m9, m10, m11, m12};

    public static Month[] getYear() {
        return YEAR;
    }

    public static Month getMonth( int index) {
        return YEAR[index];
    }

    public static int getMonthSize() {
        return YEAR.length;
    }

    public static Month[] getThreeMonths1() {
        return THREE_MONTHS_1;
    }
    public static Month[] getThreeMonths2() {
        return THREE_MONTHS_2;
    }
    public static Month[] getThreeMonths3() {
        return THREE_MONTHS_3;
    }
    public static Month[] getThreeMonths4() {
        return THREE_MONTHS_4;
    }
    public static Month[] getHalfAYear1() {
        return HALF_A_YEAR_1;
    }
    public static Month[] getHalfAYear2() {
        return HALF_A_YEAR_2;
    }

}
