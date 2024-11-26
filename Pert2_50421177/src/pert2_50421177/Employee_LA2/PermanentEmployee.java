/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert2_50421177.Employee_LA2;

/**
 *
 * @author ASUS
 */

    class PermanentEmployee extends Employee {
    double basicSalary;
    double bonus;

    // Constructor
    public PermanentEmployee(String name, int id, double basicSalary, double bonus) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    // Overriding calculateSalary method (Polymorphism)
    @Override
    public double calculateSalary() {
        return basicSalary + bonus;
    }

    // Method to display details (overridden)
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Status: Permanent, Salary: " + calculateSalary());
    }
}

