import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Integer> studentGrades = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine(); // consume leftover newline
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = sc.nextLine();
            studentNames.add(name);

            System.out.print("Enter grade for " + name + ": ");
            int grade = sc.nextInt();
            studentGrades.add(grade);
        }

        // Calculations
        int total = 0, highest = Integer.MIN_VALUE, lowest = Integer.MAX_VALUE;
        for (int grade : studentGrades) {
            total += grade;
            if (grade > highest) highest = grade;
            if (grade < lowest) lowest = grade;
        }

        double average = (double) total / n;

        // Output
        System.out.println("\n--- Student Grades ---");
        for (int i = 0; i < n; i++) {
            System.out.println(studentNames.get(i) + ": " + studentGrades.get(i));
        }

        System.out.println("\nAverage Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);

        sc.close();
    }
}
