package Homework.HW_10_1;

public interface IManager extends IEmployee{
    int INDEX = 3;

    int getNumberOfSubordinates();

    int getIndex();

    static IManager searchMinCount(Director[] managers) {
        Director min = null;
        for (int i = 0; i < managers.length; i++) {
            if (min == null || min.getNumberOfSubordinates() > managers[i].getNumberOfSubordinates()) {
                min = managers[i];
            }
        }
        return min;
    }

    static IManager searchMaxCount(Director[] managers) {
        Director max = null;
        for (int i = 0; i < managers.length; i++) {
            if (max == null ||max.getNumberOfSubordinates() < managers[i].getNumberOfSubordinates()) {
                max = managers[i];
            }
        }
        return max;
    }

    static double searchMore (Director[] managers) {
        double result = 0;
        for (int i = 0; i < managers.length; i++) {
            // result += managers[i];
        }
        return result;
    }

}
