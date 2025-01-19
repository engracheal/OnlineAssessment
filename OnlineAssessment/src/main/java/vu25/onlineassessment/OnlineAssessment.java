/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu25.onlineassessment;

/**
 *
 * @author drggf
 */
import java.util.Scanner;

public class OnlineAssessment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[6];
        int total = 0;

        // Input marks for six units
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter marks for unit " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            total += marks[i];
        }

        // Calculate average
        double average = total / 6.0;

        // Determine grade based on average
        char grade;
        if (average >= 70) {
            grade = 'A';
        } else if (average >= 60) {
            grade = 'B';
        } else if (average >= 50) {
            grade = 'C';
        } else if (average >= 40) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        // Output average and grade
        System.out.println("Average marks: " + average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
