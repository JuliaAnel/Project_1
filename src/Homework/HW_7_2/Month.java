package Homework.HW_7_2;

public class Month {
    /**Создать класс Month с полями: имя месяца, количеством дней и
     * количеством рабочих дней.
     */
    private final String month;
    private final int days;
    private final int workDays;

    public Month(String month, int days, int workDays) {
        this.month = month;
        this.days = days;
        this.workDays = workDays;
    }

    public String getMonth() {
        return month;
    }

    public int getDays() {
        return days;
    }

    public int getWorkDays() {
        return workDays;
    }



}
