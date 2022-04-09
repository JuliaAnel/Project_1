package Homework.HW_6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr5 = new int[0]; //create empty array
        int[] arr6 = {}; //create empty array
        int[] arr = {1, 2, 3, 4};
        int[] arr1 = new int[10];
        int[] arr2 = new int[]{1, 2, 3, 4};
        int[] arr3 = null;

        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr1));

        Person person = new Person("Anna", 30, "female");
        Person person1 = new Person("Julia"); //() - пустой конструктор
//        person.name = "Ivan";
//        person.age = 30;
        person.printObject();
        person1.printObject();

        Person person2 = new Person("Victor", 35, "male");
        person2.getName();

        Person person3 = new Person("Julia", 28, "female");
        person3.getName();

        Employee Julia = new Employee("Julia", 28, "female", 1000);

        Employee Anton = new Employee("Anton", 35, "male", 1500);
        System.out.println(Julia.isSameName(Anton));
        Salary salary = new Salary();
        Employee[] employees = new Employee[] {Julia, Anton};
        System.out.println(salary.getSum(employees));

        Person p1 = new Person("Victor", 35, "male");
        Person p2 = new Person("Julia", 28, "female");
        Person[] personArray = {p1, p2};

        Person pMin = PersonHelper.getMinAge(personArray);
        System.out.println(pMin.getName1());
        System.out.println(person.getName1());

        System.out.println(person2.getName1());

        Codewars codewars = new Codewars();
        System.out.println(codewars.countingSheep(6));

        Month month = new Month("Jan");
        month.getName();
        Month[] MONTH_LIST = {
                new Month("Jan"),
                new Month("Feb")
        };
    }
}
