package udemy;

public class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student();

        student1.studentID = 1;
        student1.firstName = "Ivan";
        student1.lastName = "Ivanov";
        student1.course = 1;
        student1.economyAverageGrade = 6.8;
        student1.foreignLanguageAverageGrade = 10;
        student1.mathAverageGrade = 7.3;

        double averageOfStudent1 = (student1.economyAverageGrade + student1.foreignLanguageAverageGrade
                + student1.mathAverageGrade) / 3;

        Student student2 = new Student();

        student2.studentID = 2;
        student2.firstName = "Elena";
        student2.lastName = "Blinova";
        student2.course = 3;
        student2.economyAverageGrade = 8.5;
        student2.foreignLanguageAverageGrade = 9.1;
        student2.mathAverageGrade = 4.9;

        double averageOfStudent2 = (student2.economyAverageGrade + student2.foreignLanguageAverageGrade
                + student2.mathAverageGrade) / 3;

        Student student3 = new Student();

        student3.studentID = 3;
        student3.firstName = "Michail";
        student3.lastName = "Filipov";
        student3.course = 4;
        student3.economyAverageGrade = 5.8;
        student3.foreignLanguageAverageGrade = 7.2;
        student3.mathAverageGrade = 9.5;

        double averageOfStudent3 = (student3.economyAverageGrade + student2.foreignLanguageAverageGrade
                + student3.mathAverageGrade) / 3;

        System.out.printf("Average grade of student " + student1.firstName + " " + student1.lastName + " = "
                + "%.1f", averageOfStudent1);
        System.out.println();
        System.out.printf("Average grade of student " + student2.firstName + " " + student2.lastName + " = "
                + "%.1f", averageOfStudent2);
        System.out.println();
        System.out.printf("Average grade of student " + student3.firstName + " " + student3.lastName + " = "
                + "%.1f", averageOfStudent3);
    }
}
