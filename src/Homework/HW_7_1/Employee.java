package Homework.HW_7_1;
/**Задача №1
 Необходимо создать класс Employee со следующими методами:
 getBaseSalary - получить базовую ставку
 setBaseSalary
 getName - получить имя
 setName
 getSalary - получить зарплату */
 public class Employee {

     private double baseSalary;
     private String name;
     private double Salary;

     double getBaseSalary() {
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
        return Salary;
    }
}
