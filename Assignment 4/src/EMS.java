
/**
 * Adler G Luders
 * COP 3337
 * 30 Jan 2024
 * Employee Management System
 */

import java.util.*;

// Parent Employee
class Employee {
  int employeeId;
  String name;
  String department;
  double salary;
  String designation;

  public Employee(int employeeId, String name, String department, double salary, String designation) {
    this.employeeId = employeeId;
    this.name = name;
    this.department = department;
    this.salary = salary;
    this.designation = designation;
  }

  // Getters
  int getEmployeeId() {
    return this.employeeId;
  }

  String getName() {
    return this.name;
  }

  String getDepartment() {
    return this.department;
  }

  double getSalary() {
    return this.salary;
  }

  String getDesignation() {
    return this.designation;
  }

  // Setters
  void setEmployeeId(int id) {
    this.employeeId = id;
  }

  void setName(String name) {
    this.name = name;
  }

  void setDepartment(String department) {
    this.department = department;
  }

  void setSalary(double salary) {
    this.salary = salary;
  }

  void setDesignation(String designation) {
    this.designation = designation;
  }

  // method to compare employee based on designation
  boolean equals(Employee emp1, Employee emp2) {
    return emp1.designation == emp2.designation;
  }

  // calculate employee bonus
  double addBonus() {
    return salary = this.salary + 200.00;
  }

}

// Subclass Manager
class Manager extends Employee {
  public Manager(int employeeId, String name, String department, double salary, String designation) {
    super(employeeId, name, department, salary, designation);
  }

  @Override
  double addBonus() {
    return salary = this.salary + 300.00;
  }
}

// Subclass Clerk
class Clerk extends Employee {
  public Clerk(int employeeId, String name, String department, double salary, String designation) {
    super(employeeId, name, department, salary, designation);
  }

  @Override
  double addBonus() {
    return salary = this.salary + 100;
  }
}

public class EMS {
  public static void main(String[] args) {
    Employee employee = new Employee(1, "John", "HR", 3000.00, "Employee");
    Manager manager = new Manager(2, "Alice", "Finance", 4000.00, "Manager");
    Clerk clerk = new Clerk(3, "Bob", "Admin", 2500.0, "Clerk");

    System.out.println("Salaries with bonuses: ");
    employee.addBonus();
    manager.addBonus();
    clerk.addBonus();
    System.out.println(employee.getName() + " Salary with Bonus: " + employee.salary);
    System.out.println(manager.getName() + " Salary with Bonus: " + manager.salary);
    System.out.println(clerk.getName() + " Salary with Bonus: " + clerk.salary);

    System.out.println(employee.equals(manager, manager));
  }
}