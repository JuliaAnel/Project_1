package common;

public interface IEmployee extends IName, ISalary{

    String NAME = "Ivan"; //public static final

    default void print(String str) { //it is rarely used
        System.out.println(str);
    }

    static void println(String str) { //it is rarely used
        System.out.println(str);
    }
}
