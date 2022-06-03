package Homework.HW_7_2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Julia", 28, 'w', 1000);

        Month[] monthArray = {new Month("January", 31, 28),
        new Month("February", 28, 23),
        new Month("March", 30, 24),
        new Month("April", 30, 26),
        new Month("Mai", 31, 26),
        new Month("June", 30, 25),
        new Month("July", 31, 28),
        new Month("August", 31, 27),
        new Month("September", 31, 27),
        new Month("October", 31, 27),
        new Month("November", 31, 27),
        new Month("December", 31, 27)};

        System.out.println(employee.getSalary(monthArray));

        Month[] months = MonthUtils.getYEAR();
        months[0] = null;
        System.out.println(MonthUtils.getYEAR()[0]);
    }
}
