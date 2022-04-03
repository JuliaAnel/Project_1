public class Person1 {
    String name;
    int age;
    String gender;

    Person1 (String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void getName () {
        if (this.gender.equals("male")) {
            System.out.println("Mr." + this.name);
        }
        else {
            System.out.println("Mrs." + this.name);
        }
    }
}
