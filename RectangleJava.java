import java.util.Scanner;

public class MarkSheet {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String studentName = input.nextLine();

        System.out.print("Enter Total Marks: ");
        double totalMarks = input.nextDouble();

        System.out.print("Enter Obtained Marks: ");
        double obtainedMarks = input.nextDouble();

        double percentage = (obtainedMarks / totalMarks) * 100;
        String grade = calculateGrade(percentage);
        double gpa = calculateGPA(percentage);

        System.out.println("\n----- Mark Sheet -----");
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Obtained Marks: " + obtainedMarks);
        System.out.println("Percentage: " + String.format("%.2f", percentage) + "%");
        System.out.println("Grade: " + grade);
        System.out.println("GPA: " + String.format("%.2f", gpa));
    }

    public static String calculateGrade(double percentage) {
        if (percentage >= 90) return "A";
        else if (percentage >= 80) return "B";
        else if (percentage >= 70) return "C";
        else if (percentage >= 60) return "D";
        else return "F";
    }

    public static double calculateGPA(double percentage) {
        if (percentage >= 90) return 4.0;
        else if (percentage >= 80) return 3.5;
        else if (percentage >= 70) return 3.0;
        else if (percentage >= 60) return 2.5;
        else return 0.0;
    }
}
