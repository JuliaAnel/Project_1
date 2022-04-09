package Homework.HW_6;
/**Задача №1
 Необходимо создать класс Person с полями: имя, возраст, пол.
 Класс должен иметь метод - getName, метод возвращает имя с префиксом “Mr. ”
 если пол указан как мужской и префикс “Mrs. ” если женский.
*/
 public class Person {
    private String name;
    private int age;
    private String gender;

    static int VERSION_APP = 1;
    static int[] VERSION_APP1 = {1, 2};

//    private Person friend;

//    public Person() {
//        this.friend = null;
//    }
//
//    public Person (String name, int age, String gender) {
//        this();
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//    }

    public Person (String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    Person(String name) {
        this.name = name;
    }

    void getName () {
        if (this.gender.equals("male")) {
            System.out.println("Mr." + this.name);
        } else {
            System.out.println("Mrs." + this.name);
        }
    }

        String getName1 () {
            if (gender.equals("male")) {
                return "Mr. " + this.name;
            }
            else {
                return "Mrs. " + this.name;
            }
        }

    public void printObject() {
        if (name != null) {
            System.out.println(name);
        }
    }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public String getGender() {
                return gender;
            }

            public void setGender(String gender) {
                this.gender = gender;
            }



            public void setName(String name) {
                this.name = name;
            }
        }


