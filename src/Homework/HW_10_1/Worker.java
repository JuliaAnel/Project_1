package Homework.HW_10_1;

public class Worker implements IEmployee {
    private String name;
    private double salary;
    private double baseSalary;

    public Worker(String name, double salary, double baseSalary) {
        this.name = name;
        this.salary = salary;
        this.baseSalary = baseSalary;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
