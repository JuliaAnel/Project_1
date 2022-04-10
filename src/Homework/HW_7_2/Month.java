package Homework.HW_7_2;

public class Month {
    /**Создать класс Homework.HW_6.Month с полями: имя месяца, количеством дней и
     * количеством рабочих дней. Создать класс MonthUtils который бы хранил
     * подготовленные месяцы или их массивы для использования (объекты класса Homework.HW_6.Month).
     */
    private String month;
    private int countOfDays;
    private int countOfWorkingDays;

    public Month(String month, int countOfDays, int countOfWorkingDays) {
        this.month = month;
        this.countOfDays = countOfDays;
        this.countOfWorkingDays = countOfWorkingDays;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getCountOfDays () {
        return countOfDays;
    }

    public void setCountOfDays (int countOfDays) {
        this.countOfDays = countOfDays;
    }

    public int getCountOfWorkingDaysCountOfDays () {
        return countOfWorkingDays;
    }

    public void setCountOfWorkingDaysCountOfDays (int countOfWorkingDays) {
        this.countOfWorkingDays = countOfWorkingDays;
    }
}
