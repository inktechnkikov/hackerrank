package Employee;


public class Employee {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }
    private double getSalary(){
        return this.salary;
    }
    public void printSalary(){
        System.out.println("Salary = " + this.getSalary());
    }
}
