package cc.moecraft.school.chapter3.employee;

/**
 * E3.11
 *
 * @author Ticrizon
 */
public class Employee
{
    private String name;
    private double salary;

    /**
     * Default constructor
     * @param name Name of the employee
     * @param salary The salary
     */
    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    /**
     * Raise the salary by a percentage
     * @param byPercent Percentage
     */
    public void raiseSalary(double byPercent)
    {
        salary *= byPercent / 100d + 1d;
    }

    public String getName()
    {
        return this.name;
    }

    public double getSalary()
    {
        return this.salary;
    }
}
