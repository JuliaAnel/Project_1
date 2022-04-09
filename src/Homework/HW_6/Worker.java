package Homework.HW_6;

public class Worker extends Person {

    private int salary;

    public Worker(String name, int age, String gender) {
        super(name, age, gender);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
