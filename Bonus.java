import java.util.Random;
import java.text.DecimalFormat;
public class Bonus {
    public static void main(String[]Args){
        Random rnd = new Random();
        int students = 5;
        int quizzes = 4;
        int[][] scores = new int[students][quizzes];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < quizzes; j++) {
                scores[i][j] = rnd.nextInt(101);
            }
        }
        System.out.println("Scores Table:");
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < quizzes; j++) {
                System.out.printf("%4d", scores[i][j]); // format: 4 spaces wide
            }
            System.out.println();
        }
        System.out.println("Student Averages:");
        for (int i = 0; i < students; i++) {
            int sum = 0;
            for (int j = 0; j < quizzes; j++) {
                sum += scores[i][j];
            }
            double avg = (double) sum / quizzes;
            System.out.printf("Student %d: %.2f%n", i, avg);
        }
        System.out.println("Quiz Averages:");
        for (int j = 0; j < quizzes; j++) {
            int sum = 0;
            for (int i = 0; i < students; i++) {
                sum += scores[i][j];
            }
            double avg = (double) sum / students;
            System.out.printf("Quiz %d: %.2f%n", j, avg);
        }
        int highest = scores[0][0];
        int bestStudent = 0;
        int bestQuiz = 0;
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < quizzes; j++) {
                if (scores[i][j] > highest) {
                    highest = scores[i][j];
                    bestStudent = i;
                    bestQuiz = j;
                }
            }
        }
        System.out.printf("Highest score: %d at (studentIndex=%d, quizIndex=%d)%n",
                highest, bestStudent, bestQuiz);
        System.out.println("My github username: ceylanarda");
    }
}