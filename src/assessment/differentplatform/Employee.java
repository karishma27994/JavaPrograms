package assessment.differentplatform;

public class Employee {

    private int id,salary;
    private String name;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public Employee(int id, String name, int salary)
    {
        this.id=id;
        this.name= name;
        this.salary=salary;
        System.out.printf("Employee ID: %d Employee Name: %s Employee Salary: %d", id,name,salary);

    }

    public static void main(String[] args) {
        Employee e1= new Employee(1,"John",5000);
    }
}
