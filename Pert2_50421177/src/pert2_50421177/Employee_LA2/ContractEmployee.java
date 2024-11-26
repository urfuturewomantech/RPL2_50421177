/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert2_50421177.Employee_LA2;

/**
 *
 * @author ASUS
 */

    class ContractEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    // Constructor
    public ContractEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Overriding calculateSalary method (Polymorphism)
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    // Method to display details (overridden)
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Status: Contract, Salary: " + calculateSalary());
    }
}


