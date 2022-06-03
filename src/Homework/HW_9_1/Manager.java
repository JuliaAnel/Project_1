package Homework.HW_9_1;

public final class Manager extends BaseManager {

    private static final int INDEX = 3;

    public Manager(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }

    @Override
    protected int getIndex() {
        return INDEX;
    }
}
