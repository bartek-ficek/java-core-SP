package pl.bartek.ficek.primitives.homework;

import java.util.Arrays;
import java.util.Scanner;

public class AverageGrade {


    private int[][] tableOfGrades;
    private int numberOfSubjects;
    private int numberOfNotes;
    private String[] arrayOfSubjects = new String[numberOfSubjects];

    public AverageGrade(int numberOfSubjects, int numberOfNotes) {
        this.numberOfSubjects = numberOfSubjects;
        this.numberOfNotes = numberOfNotes;
        tableOfGrades = new int[numberOfSubjects][numberOfNotes];
    }

    private void takeNotesFromStudent() {
        Scanner scanner = new Scanner(System.in);

        for (int subjectId = 0; subjectId < tableOfGrades.length; subjectId++) {
            System.out.println("Type " + (subjectId + 1) + " subject:");
            String subjectName = scanner.next();
            arrayOfSubjects[subjectId] = subjectName;

            for (int noteId = 0; noteId < tableOfGrades[subjectId].length; noteId++) {
                System.out.println("Type " + (noteId + 1) + " note in " + subjectName + ":");
                tableOfGrades[subjectId][noteId] = scanner.nextInt();
            }
        }
    }

    public void printGradesAndAverages() {

        int sumOfNotesInSubject = 0;
        float totalAverage = 0;
        for (int[] subject : tableOfGrades) {
            int subjectId = 0;
            String subjectName = arrayOfSubjects[subjectId];
            subjectId++;
            for (int note : subject) {
                sumOfNotesInSubject += note;
            }
            float subjectAverage = (float) sumOfNotesInSubject / subject.length;
            System.out.println("Average degree in " + subjectName + ":  " + subjectAverage);
            totalAverage += subjectAverage;
        }

        System.out.println("\n All DEGREES:");
        System.out.println(Arrays.deepToString(tableOfGrades));
        System.out.println("\n AVERAGE DEGREE:");

        totalAverage /= numberOfSubjects;
        System.out.println(totalAverage);
    }
}
