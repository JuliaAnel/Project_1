import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {

        Person[] arr4 = new Person[10];
        int[] arr5 = new int[0]; //create empty array
        int[] arr6 = {}; //create empty array
        int[] arr = {1, 2, 3, 4};
        int[] arr1 = new int[10];
        int[] arr2 = new int[]{1, 2, 3, 4};
        int[] arr3 = null;

        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr1));

        Person person = new Person("Anna", 30);
        Person person1 = new Person("Anna");
//        Person person1 = new Person(); //() - пустой конструктор
//        person.name = "Ivan";
//        person.age = 30;

        person.printObject();

        Person1 person2 = new Person1("Victor", 35, "male");
        person2.getName();

        Person1 person3 = new Person1("Julia", 28, "female");
        person3.getName();

        Employee Julia = new Employee("Julia", 28, "female", 1000);

        Employee Anton = new Employee("Anton", 35, "male", 1500);
        System.out.println(Julia.isSameName(Anton));
        Salary salary = new Salary();
        Employee[] employees = new Employee[] {Julia, Anton};
        System.out.println(salary.getSum(employees));
    }
}
