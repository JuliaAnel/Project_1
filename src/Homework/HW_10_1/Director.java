package Homework.HW_10_1;

public class Director extends Worker implements IManager{

    private static final int INDEX = 9;

    private int numberOfSubordinates;

    public Director(String name, double salary, double baseSalary, int numberOfSubordinates) {
        super(name, salary, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getIndex() {
        return INDEX;
    }

    @Override
    public double getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return getBaseSalary();
        } else {
            return getBaseSalary() * (getNumberOfSubordinates() / 100.0 * getIndex());
        }
    }
}
