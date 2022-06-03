package Homework.HW_7_2;

public class Manager extends Employee {

    private int subOrdinates;
    public Manager(String name, int age, char gender, double salary, int subOrdinates) {
        super(name, age, gender, salary);
        this.subOrdinates = subOrdinates;
    }

    public int getSubOrdinates() {
        return subOrdinates;
    }

    public void setSubOrdinates(int subOrdinates) {
        this.subOrdinates = subOrdinates;
    }

    public double getSalary(Month[] monthArray) {
        double result = 0;
        for (int i = 0; i < monthArray.length; i++) {
            result += getSalary() * monthArray[i].getWorkDays() * (1.0 + getSubOrdinates() / 100.0);
        }
        return result;
    }
}
