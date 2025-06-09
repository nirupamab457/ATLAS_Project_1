class Employee {
    private int password = 12345678;
    protected int salary = 4567000;
    public int empId = 587664;
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void employeeInfo() {
        System.out.println();
        System.out.println("Employee Info:");

        System.out.println(name);
        System.out.println(empId);
        System.out.println(salary);
        System.out.println(password);
    }
}

public class Task037 {
    public static void main(String[] args) {
        Employee e = new Employee("Nirupama");

        System.out.println(e.getPassword());
        System.out.println(e.salary);
        System.out.println(e.empId);
        System.out.println(e.getName());

        e.employeeInfo() ;
    }
}