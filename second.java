class Employee {
    String name;
    int yearOfJoining;
    String address;

    Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }
}

public class second {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Robert", 1994, "64C- WallsStreat");
        employees[1] = new Employee("Sam   ", 2000, "68D- WallsStreat");
        employees[2] = new Employee("John  ", 1999, "26B- WallsStreat");

        System.out.println("Name          Year of Joining          Address");

        for (Employee employee : employees) {
            System.out.println(
                    employee.name + "             " + employee.yearOfJoining + "           " + employee.address);
        }
    }
}
