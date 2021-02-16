package pl.bartek.ficek.primitives.homework;

import java.util.Arrays;
import java.util.Scanner;

public class AverageGrade {


    private int[][] tableOfGrades;
    private int numberOfSubjects;
    private int numberOfNotes;
    private String[] arrayOfSubjects;

    public AverageGrade(int numberOfSubjects, int numberOfNotes) {
        this.numberOfSubjects = numberOfSubjects;
        this.numberOfNotes = numberOfNotes;
        tableOfGrades = new int[numberOfSubjects][numberOfNotes];
        arrayOfSubjects = new String[numberOfSubjects];
    }

    public void takeNotesFromStudent() {
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

        float totalAverage = 0;
        int subjectId = 0;
        for (int[] subject : tableOfGrades) {
            int sumOfNotesInSubject = 0;
            String subjectName = arrayOfSubjects[subjectId];
            for (int note : subject) {
                sumOfNotesInSubject += note;
            }
            float subjectAverage = (float) sumOfNotesInSubject / subject.length;

            float multipliedAverage = subjectAverage * 100; // rounding
            int multipliedAndRounded = Math.round(multipliedAverage);
            multipliedAverage = (float) multipliedAndRounded / 100;

            System.out.println(subjectName + ": " + Arrays.toString(tableOfGrades[subjectId]) + "; Average degree: " + multipliedAverage);
            totalAverage += subjectAverage;
            subjectId++;
        }

        System.out.println("\nTOTAL AVERAGE DEGREE:");
        totalAverage /= numberOfSubjects;

        float multipliedTotalAverage = totalAverage * 100; // rounding
        int multipliedAndRoundedTotal = Math.round(multipliedTotalAverage);
        multipliedTotalAverage = (float) multipliedAndRoundedTotal / 100;

        System.out.println(multipliedTotalAverage);
    }
}
