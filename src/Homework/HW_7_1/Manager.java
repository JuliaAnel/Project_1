package Homework.HW_7_1;

/**
 * Необходимо создать класс Manager в который нужно добавить следующие методы:
 * getNumberOfSubordinates - получить количество подчиненных
 * setNumberOfSubordinates
 * в классе, метод getSalary будет возвращать значение по формуле
 * - <базовая ставка> * (<количество подчиненных> / 100 * 3).
 * Если количество подчиненных 0, то результат как у обычного рабочего.
 */
public class Manager extends Worker {
    private int numberOfSubordinates;

    public Manager(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return super.getSalary();
        } else {
            return super.getSalary() * (getNumberOfSubordinates() / 100.0 * 3);
        }
    }
}

