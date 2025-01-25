import java.util.Objects;

public class Employee {
    private static int idCounter = 0;
    private final int id;
    private String fullName;
    private int department;
    private double salary;



    public Employee(String fullName, int department, double salary) {
        this.id = ++idCounter;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullname(String fullName) {
        this.fullName = fullName;
    }


    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Double.compare(salary, employee.salary) == 0 && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary);
    }

    @Override
    public String toString() {
        return "[Идентификатор]: " + id + "[Сотрудник]: " + fullName + "[Подразделение]: " + department + "[Зарплата]: " + salary;
    }

}
