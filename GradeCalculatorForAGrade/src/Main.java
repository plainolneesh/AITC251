import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Define weights
        double assignmentWeight = 0.20;
        double tAndQWeight = 0.40;
        double participationWeight = 0.10;
        double finalProjectWeight = 0.30;


        // User input for different grade types
        System.out.println("Please enter your cumulative grades for each grade type as a whole number. For example, 87% would be entered as '87'.");
        System.out.print("Assignments: ");
        double assignmentsGrade = userInput.nextDouble();

        System.out.print("Tests and Quizzes: ");
        double tAndQGrade = userInput.nextDouble();

        System.out.print("Participation: ");
        double participationGrade = userInput.nextDouble();

        System.out.print("Final Project: ");
        double finalProjectGrade = userInput.nextDouble();


        // Find weighted average assuming 4 assignments and 12 tests/quizzes
        double weightedAverage = ((assignmentsGrade * assignmentWeight)) + ((tAndQGrade * tAndQWeight))
                + (participationGrade * participationWeight) + (finalProjectGrade * finalProjectWeight);


        // Determine final letter grade
        String letterGrade = "";
        if (weightedAverage >= 90) {
            letterGrade= "A";
        } else if (weightedAverage >= 80) {
            letterGrade = "B";
        } else if (weightedAverage >= 70) {
            letterGrade ="C";
        } else if (weightedAverage >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F ... sorry bud";
        }

        // Print total weighted average and letter grade
        System.out.println("Your final weighted average is: " + weightedAverage);
        System.out.println("Your final letter grade is: " + letterGrade);

        userInput.close();
    }
}
