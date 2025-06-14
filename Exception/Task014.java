public class Task014 {
    public static void main(String[] args) {
        Customer cust = new Customer("Nirupama", 30, "123");
        Employee emp = new Employee("Joseph", 28, "456");
        Manager manager = new Manager("Abhilash", 35, "789");

        System.out.println("Customer : " + cust);
        System.out.println("Employee : " + emp);
        System.out.println("Manager : " + manager);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Name:" + name + " Age:" + age;
    }
}

class Customer extends Person {
    private String customerId;

    public Customer(String name, int age, String customerId) {
        super(name, age);
        this.customerId = customerId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String toString() {
        return super.toString() + " Customer ID: " + customerId;
    }
}

class Employee extends Person {
    private String employeeId;

    public Employee(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String toString() {
        return super.toString() + ", Employee ID: " + employeeId;
    }
}

class Manager extends Person {
    private String managerId;

    public Manager(String name, int age, String managerId) {
        super(name, age);
        this.managerId = managerId;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String toString() {
        return super.toString() + ", Manager ID:" + managerId;
    }
}