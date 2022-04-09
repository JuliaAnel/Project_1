package Homework.HW_6;
/**Задача №2
 Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата.
 Класс должен иметь метод isSameName(Employee employee) который возвращает true,
 если у сотрудника у которого был вызван метод и сотрудника который был передан как параметр, одинаковое имя.
 */
 public class Employee {
    String name;
    int age;
    String gender;
    int salary;

    Employee (String name, int age, String gender, int salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    boolean isSameName (Employee e) {
        if (this.name.equals(e.name)) {
            return true;
        }
        else {
            return false;
        }
    }
}
