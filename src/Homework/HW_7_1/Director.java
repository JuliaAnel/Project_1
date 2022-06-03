package Homework.HW_7_1;

/**
 * Необходимо создать класс Director с теми же методами, что и Manager,
 * но метод getSalary должен возвращать результат по формуле
 * - <базовая ставка> * (<количество подчиненных> / 100 * 9).
 * Если количество подчиненных 0, то результат как у обычного рабочего.
 */
public class Director extends Manager {
    public Director(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }

    @Override
    public double getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return super.getBaseSalary();
        } else {
            return super.getBaseSalary() * (getNumberOfSubordinates() / 100.0 * 9);
        }
    }
}
