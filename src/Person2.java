public class Person2 {
    String name;
    int age;
    String gender;

    Person2 (String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    String getName () {
        if (gender.equals("male")) {
            return "Mr. " + this.name;
        }
        else {
            return "Mrs. " + this.name;
        }
    }

}
