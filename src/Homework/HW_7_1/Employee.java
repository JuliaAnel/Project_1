package Homework.HW_7_1;

import common.IEmployee;
import common.ISalary;
import common.IName;

/**Задача №1
 Необходимо создать класс Employee со следующими методами:
 getBaseSalary - получить базовую ставку
 setBaseSalary
 getName - получить имя
 setName
 getSalary - получить зарплату */
 public class Employee implements ISalary, IName, IEmployee {

     private double baseSalary;
     private String name;

    public Employee(double baseSalary, String name) {
        this.baseSalary = baseSalary;
        this.name = name;
    }

    public double getBaseSalary() {
         return baseSalary;
     }

     void setBaseSalary (double baseSalary) {
         this.baseSalary = baseSalary;
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return baseSalary;
    }
}
