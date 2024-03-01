/*Import Number Format (probably).
Import Scanner

Initiate class
Initiate scanner

/Defining assignment tyoes
Ask for Assignment Type
Ask for assignment title(give options based on Type)
--->Save assignment title
	--If title does not match available options give option to enter new assignment title
	--> Write function to take on new value????


What was the maximum possible number of points you could recieve on the assignment?
---> add towards total possible points for assignment type.
How many points did you recieve?
---> add to total points recieved for assignment type


/Get Assignment Type percentage
Average Assignment grade = (Sum of recieved points/# of instances)/(Sum of total possible/#of instances)
Average Test and Quiz grade= (Sum of recieved points/# of instances)/(Sum of total possible/#of instances)

/Final project and participation grade
final project = (recieved #/Possible #)
participation grade = (recieved #/Possible #)

/Weighted totals
/Associate weights with assignment types
Weight of Assignments = Average assignment grade * .20
Weight of final Project = Final project grade *.30
Weight of Test and Quizzes = Average Test and Quizes grade * 40
Wieght of Participation = participation grade * .10

Total = Weighed A + Weighted F + Weighted T + Weighted P

If total == 1:
	weighted averaf

error handleing: does total = 1?

----OR stick to points nut either way: error handling here needs to check if equal to 1 and multiply by 100,
or check for 100 formated as a percent

If yes ---> New variable: Define grades

Print "This is your weighted averager percentage in this class"
			"This is your overall grade for the class"

------------------------------------------------------------------------------------------------*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        //Welcome message
        System.out.println("Hello! Welcome to the AITC 251 grade calculator. This program will provide your weighted average and letter grade for the class.");

        //Initialize variables
        double assignmentPossible = 0;
        double assignmentEarned = 0;
        double assignmentAmount = 0;

        double tAndQPossible = 0;
        double tAndQEarned = 0;
        double tAndQAmount = 0;

        double participationPossible = 0;
        double participationEarned = 0;

        double finalProjectPossible = 0;
        double finalProjectEarned = 0;

        boolean addNewGrade = true;

        while (addNewGrade) {
            //Get user input for new grade entry
            System.out.println("Would you like to enter a new grade? (Yes/No): ");
            String newGrade = userInput.nextLine();

            if (newGrade.equalsIgnoreCase("Yes")) {
                //Get grade type
                System.out.println("What type of grade would you like to enter? It may be an Assignment, a Test, a Quiz, a Participation grade, or the Final Project:");
                String gradeType = userInput.nextLine();

                //Check
                switch (gradeType.toLowerCase()) {
                    case "assignment":
                        System.out.println("Great! How many points was it possible to get on the assignment?: ");
                        double assignmentPossibleInput = userInput.nextDouble();
                        assignmentPossible += assignmentPossibleInput;

                        System.out.println("How many points did you receive on the assignment?: ");
                        double assignmentEarnedInput = userInput.nextDouble();
                        assignmentEarned += assignmentEarnedInput;
                        assignmentAmount += 1;
                        break;
                    case "test":
                    case "quiz":
                        System.out.println("Got it. How many points was it possible to get on the " + gradeType + "?: ");
                        double tAndQPossibleInput = userInput.nextDouble();
                        tAndQPossible += tAndQPossibleInput;

                        System.out.println("How many points did you receive on the " + gradeType + "?: ");
                        double tAndQEarnedInput = userInput.nextDouble();
                        tAndQEarned += tAndQEarnedInput;
                        tAndQAmount += 1;
                        break;
                    case "participation grade":
                        System.out.println("Got it. How many points was it possible to receive for participation?: ");
                        double participationPossibleInput = userInput.nextDouble();
                        participationPossible += participationPossibleInput;

                        System.out.println("How many points did you receive for participation: ");
                        double participationEarnedInput = userInput.nextDouble();
                        participationEarned += participationEarnedInput;
                        break;
                    case "final project":
                        System.out.println("Congratulations on finishing! How many points was it possible to get for the Final Project: ");
                        double finalProjectPossibleInput = userInput.nextDouble();
                        finalProjectPossible += finalProjectPossibleInput;

                        System.out.println("How many points did you receive for the project?: ");
                        double finalProjectEarnedInput = userInput.nextDouble();
                        finalProjectEarned += finalProjectEarnedInput;
                        break;
                    default:
                        System.out.println("I'm not sure what you mean. Please try again.");
                        break;
                }
            } else if (newGrade.equalsIgnoreCase("No")) {
                //Check if any grades have been entered
                if (assignmentPossible == 0 && tAndQPossible == 0 && participationPossible == 0 && finalProjectPossible == 0) {
                    addNewGrade = false;
                    System.out.println("Ok well I mean thanks for stopping by I guess?");
                } else {
                    //Calculate and display weighted average
                    double assignmentPercentage = (assignmentEarned * 0.20) / assignmentPossible;
                    double tAndQPercentage = (tAndQEarned * 0.40) / tAndQPossible;
                    double participationPercentage = (participationEarned * 0.10) / participationPossible;
                    double finalProjectPercentage = (finalProjectEarned * 0.30) / finalProjectPossible;
                    double weightedAverage = (assignmentPercentage + tAndQPercentage + participationPercentage + finalProjectPercentage) / 4;
                    System.out.println("Your current weighted average in AITC 251 is: " + weightedAverage);
                    addNewGrade = false;
                }
            } else {
                System.out.println("I'm sorry, I didn't understand that. Please enter 'Yes' or 'No'.");
            }


            userInput.nextLine();
        }

        userInput.close();
    }
}
