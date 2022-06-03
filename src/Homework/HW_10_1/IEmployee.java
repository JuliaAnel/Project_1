package Homework.HW_10_1;

public interface IEmployee {
    String getName();
    double getSalary();
    double getBaseSalary();

    static IEmployee findWorkerByName (Worker[] workers, String name) {
        for (int i = 0; i < workers.length; i++) {
            if (name.equals(workers[i].getName())) {
                return workers[i];
            }
        }
        return null;
    }

     static IEmployee findWorkerBySubName (Worker[] workers, String subName) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getName().contains(subName)) {
                return workers[i];
            }
        }
        return null;
    }

    static double getMinSalary (Worker[] workers) {
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < workers.length; i++) {
            if (min > workers[i].getSalary()) {
                min = workers[i].getSalary();
            }
        }
        return min;
    }

    static double getMaxSalary (Worker[] workers) {
        double max = Integer.MIN_VALUE;
        for (int i = 0; i < workers.length; i++) {
            if (max < workers[i].getSalary()) {
                max = workers[i].getSalary();
            }
        }
        return max;
    }
}
