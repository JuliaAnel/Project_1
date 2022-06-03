package Homework.HW_7_1;

import Homework.HW_7_2.Employee;
import common.IEmployee;

public class Main {
  public static void main(String[] args) {
   Worker w1 = new Worker(1000, "Julia");
   Manager m1 = new Manager(1000, "John", 0);
   Director d = new Director(1000, "Ivan", 20);

   System.out.println(w1.getSalary());
   System.out.println(m1.getSalary());
   System.out.println(d.getSalary());
   }
}
