package Homework.HW_7_2;

import common.IEmployee;
import common.ISalary;
import common.IName;

public class Employee implements IEmployee {
    /**Необходимо создать класс Employee с полями:
     * имя, возраст, пол и ЗП в день. Все поля сделать
     * приватными и для каждого поля добавить методы set и get.
     * Класс должен иметь метод - getSalary(Month[] monthArray),
     * метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
     */
    private String name;
    private int age;
    private char gender;
    private double salary;

    public Employee(String name, int age, char gender, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSalary () {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary(Month[] monthArray) {
        double result = 0;
        for (int i = 0; i < monthArray.length; i++) {
            result += getSalary() * monthArray[i].getWorkDays();
        }
        return result;
    }
}
