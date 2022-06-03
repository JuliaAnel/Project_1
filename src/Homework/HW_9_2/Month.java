package Homework.HW_9_2;

public final class Month {
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
