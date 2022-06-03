package Homework.HW_9_2;

public final class Manager extends BaseEmployee{
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

    @Override
    public double getSalary(Month[] monthArray) {
        return super.getSalary(monthArray) * (1.0 + getSubOrdinates() / 100.0);
    }
}
