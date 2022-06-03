import Homework.HW_7_1.Worker;
import Homework.HW_7_2.Employee;
import common.IEmployee;
import common.ISalary;
import common.IName;

public class Main {
    public static void main(String[] args) {

//    ISalary salary7 = new Worker(1000, "Julia");
//    ISalary salary9 = new Employee("Julia", 28, 'W', 1000);
        //or
        Worker worker = new Worker(10000, "Julia");
        Employee employee = new Employee("Anna", 28, 'W', 1000);

        ISalary salaryW = worker;
        ISalary salaryE = employee;

        IName nameW = worker;
        IName nameE = employee;

        System.out.println(salaryW.getSalary());
        System.out.println(salaryE.getSalary());

        System.out.println(nameW.getName());
        System.out.println(nameE.getName());

        IEmployee[] employeeArray = {worker, employee};

        for (int i = 0; i < employeeArray.length; i++) {
            System.out.print(employeeArray[i].getName());
            System.out.print(" - ");
            System.out.println(employeeArray[i].getSalary());

            IEmployee.println("klkl");
            worker.print("klkl");

        }
    }
}
