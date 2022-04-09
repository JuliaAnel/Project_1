package Homework.HW_6;

public class PersonHelper {
    static Person getMinAge(Person[] arr) {
        Person min = null;
        for ( int i = 0; i < arr.length; i++) {
            if (min == null || min.getAge() > arr[1].getAge()) {
                min = arr[i];
            }
        }
        return min;
    }

}
