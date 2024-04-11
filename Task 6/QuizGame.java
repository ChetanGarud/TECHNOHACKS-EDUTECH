import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Questions array
        String[] questions = {
            "What is the capital of France?",
            "Who wrote 'To Kill a Mockingbird'?",
            "What is the chemical symbol for water?",
            "What is the largest planet in our solar system?"
        };

        // Choices array
        String[][] choices = {
            {"A) Paris", "B) Rome", "C) Berlin", "D) Madrid"},
            {"A) Ernest Hemingway", "B) Harper Lee", "C) F. Scott Fitzgerald", "D) J.D. Salinger"},
            {"A) H", "B) W", "C) O", "D) H2O"},
            {"A) Jupiter", "B) Saturn", "C) Earth", "D) Mars"}
        };

        // Correct answers array
        char[] correctAnswers = {'A', 'B', 'D', 'A'};

        int score = 0;

        System.out.println("Welcome to the Quiz Game!");
        System.out.println("There are " + questions.length + " questions in total.");

        // Loop through each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);
            // Display choices
            for (String choice : choices[i]) {
                System.out.println(choice);
            }

            // Get user's answer
            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = scanner.next().toUpperCase().charAt(0);

            // Check if the answer is correct
            if (userAnswer == correctAnswers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect! The correct answer is " + correctAnswers[i]);
            }
        }

        // Display final score
        System.out.println("\nYour final score is: " + score + "/" + questions.length);

        scanner.close();
    }
}
