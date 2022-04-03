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
