package cc.moecraft.school.chapter3.student;

public class StudentTester
{
    public static void main(String[] args)
    {
        Student aristotle = new Student("Aristotle");

        aristotle.addQuiz(100);
        aristotle.addQuiz(100);
        aristotle.addQuiz(10);

        System.out.println("Total Score: " + aristotle.getTotalQuizScore());
        System.out.println("Expected: 210");

        System.out.println("\nAverage Score: " + aristotle.getAverageQuizScore());
        System.out.println("Expected: 70");
    }
}
