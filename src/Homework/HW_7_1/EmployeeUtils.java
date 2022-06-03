package Homework.HW_7_1;

public class EmployeeUtils {
    /**Задача №3
     Необходимо создать утилитарный класс со следующими методами:
     поиск сотрудника в массиве по его имени
     поиск сотрудника в массиве по вхождению указанной строки в его имени
     подсчет зарплатного бюджета для всех сотрудников в массиве
     поиск наименьшей зарплаты в массиве
     поиск наибольшей зарплаты в массиве
     поиск наименьшего количества подчиненных в массиве менеджеров
     поиск наибольшего количества подчиненных в массиве менеджеров
     поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
     поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров
     */
    public static Worker findWorkerByName (Worker[] workers, String name) {
        for (int i = 0; i < workers.length; i++) {
            if (name.equals(workers[i].getName())) {
                return workers[i];
            }
        }
        return null;
}

    public static Worker findWorkerBySubName (Worker[] workers, String subName) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getName().contains(subName)) {
                return workers[i];
            }
        }
        return null;
    }

    public static double salarySum (Worker[] workers) {
        double sum = 0;
        for (int i = 0; i < workers.length; i++) {
            sum += workers[i].getSalary();
        }
        return sum;
    }

    public static double getMinSalary (Worker[] workers) {
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < workers.length; i++) {
            if (min > workers[i].getSalary()) {
            min = workers[i].getSalary();
        }
    }
        return min;
    }

    public static double getMaxSalary (Worker[] workers) {
        double max = Integer.MIN_VALUE;
        for (int i = 0; i < workers.length; i++) {
            if (max < workers[i].getSalary()) {
                max = workers[i].getSalary();
            }
        }
        return max;
    }

    public static Manager searchMinCount(Manager[] managers) {
        Manager min = null;
        for (int i = 0; i < managers.length; i++) {
            if (min == null || min.getNumberOfSubordinates() > managers[i].getNumberOfSubordinates()) {
                min = managers[i];
            }
        }
        return min;
    }

    public static Manager searchMaxCount(Manager[] managers) {
        Manager max = null;
        for (int i = 0; i < managers.length; i++) {
            if (max == null ||max.getNumberOfSubordinates() < managers[i].getNumberOfSubordinates()) {
                max = managers[i];
            }
        }
        return max;
    }

    public static double searchMore (Manager[] managers) {
        double result = 0;
        for (int i = 0; i < managers.length; i++) {
           // result += managers[i];

        }
        return result;
    }
}