package StudentDepartment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declare and initialize array
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[4];
        // Get scores from user
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = sc.nextInt();
        }
        // Calculate average
        double average = calculateAverage(scores);
        System.out.println(average);
    }

    public static double calculateAverage(int[] array) {
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        return average / array.length;
    }
}
