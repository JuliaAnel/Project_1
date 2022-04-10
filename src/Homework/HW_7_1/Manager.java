package Homework.HW_7_1;
/** Необходимо создать класс Manager в который нужно добавить следующие методы:
 getNumberOfSubordinates - получить количество подчиненных
 setNumberOfSubordinates
 в классе, метод getSalary будет возвращать значение по формуле
 - <базовая ставка> * (<количество подчиненных> / 100 * 3).
 Если количество подчиненных 0, то результат как у обычного рабочего. */
public class Manager {
    private int numberOfSubordinates;

    public int getNumberOfSubordinates () {
        return numberOfSubordinates;
    }

    void setNumberOfSubordinates (int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

//    public double getSalary () {
//        int salary = 0;
////        salary = baseSalary * ()
//    }

}
