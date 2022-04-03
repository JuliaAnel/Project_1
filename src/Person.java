public class Person {

    String name; //fields of the class
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(String name) {
        this.name = name;
    }

    void printObject() {
//         if(name != null) {
//             System.out.println(name);
//         }
        System.out.println(this.name); //this - обращение к полю класса
         System.out.println(this.age);

     }

}