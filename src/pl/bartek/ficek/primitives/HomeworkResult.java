package pl.bartek.ficek.primitives;

import pl.bartek.ficek.primitives.homework.AverageGrade;

public class HomeworkResult {

    public static void main(String[] args) {

        AverageGrade myGrades = new AverageGrade(3,3);
        myGrades.takeNotesFromStudent();
        myGrades.printGradesAndAverages();
    }
}