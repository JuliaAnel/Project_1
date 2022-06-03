package Homework.HW_9_1;

public final class Director extends BaseManager {
    public static final int INDEX = 9;

    public Director(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }

    @Override
    protected int getIndex() {
        return INDEX;
    }
}

