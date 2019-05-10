package cc.moecraft.school.chapter3.employee;

public class EmployeeTester
{
    public static void main(String[] args)
    {
        Employee harry = new Employee("Hacker, Harry", 50000);
        harry.raiseSalary(10);

        System.out.println("New salary: " + harry.getSalary());
        System.out.println("Expected: 55000");
    }
}
