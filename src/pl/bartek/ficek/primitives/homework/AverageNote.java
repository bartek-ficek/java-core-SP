package pl.bartek.ficek.primitives.homework;

import java.util.Scanner;

public class AverageNote {

    private static final int NUMBER_OF_SUBJECTS = 3;
    private static final int NUMBER_OF_NOTES = 4;

    private static int[][] tableOfNotes = new int[NUMBER_OF_SUBJECTS][NUMBER_OF_NOTES];

    public static float computeAverage() {
        Scanner scanner = new Scanner(System.in);

        for (int subjectId = 0; subjectId < tableOfNotes.length; subjectId++) {
            System.out.println("Type " + (subjectId + 1) + " subject:");
            String subject = scanner.next();

            for (int noteId = 0; noteId < tableOfNotes[subjectId].length; noteId++) {
                System.out.println("Type " + (noteId + 1) + " note in " + subject + ":");
                tableOfNotes[subjectId][noteId] = scanner.nextInt();
            }
        }

        int sumOfNotes = 0;
        for (int[] subject : tableOfNotes) {
            for (int note : subject) {
                sumOfNotes += note;
            }
        }

        return (float) sumOfNotes/(NUMBER_OF_SUBJECTS*NUMBER_OF_NOTES);
    }
}
