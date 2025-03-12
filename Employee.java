class Employee {
    private int empId;
    private String name;
    private double salary;

    // Constructor
    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void display() {
        System.out.println(empId + " " + name + " " + salary);
    }
    public static void main(String[] args) {
        // Array of Employee objects
        Employee[] employees = {
            new Employee(101, "Alice", 50000),
            new Employee(102, "Bob", 55000),
            new Employee(103, "Charlie", 60000)
        };

        // Iterate and display each employee
        for (Employee emp : employees) {
            emp.display();
        }
    }
}
