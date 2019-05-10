package cc.moecraft.school.chapter3.student;

/**
 * P3.7
 *
 * @author Ticrizon
 */
public class Student
{
    private String name;
    // The book didn't say what type is it,
    // so I'm going to use double for efficiency.
    private double totalQuizScore;
    private int quizCount;

    public Student(String name, double totalQuizScore)
    {
        this.name = name;
        this.totalQuizScore = totalQuizScore;
    }

    public Student(String name)
    {
        this(name, 0);
    }

    /**
     * Add a quiz score.
     * @param score A score in int.
     */
    public void addQuiz(int score)
    {
        quizCount ++;
        totalQuizScore += score;
    }

    /**
     * Get the average score of all the quizzes
     * @return Average score.
     */
    public double getAverageQuizScore()
    {
        return getTotalQuizScore() / (double) quizCount;
    }

    public String getName()
    {
        return this.name;
    }

    public double getTotalQuizScore()
    {
        return this.totalQuizScore;
    }
}
