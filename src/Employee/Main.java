package Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(450.5);
        Programmer programmer = new Programmer(600.5);
        employee.printSalary();
        programmer.printSalary();
    }
}
