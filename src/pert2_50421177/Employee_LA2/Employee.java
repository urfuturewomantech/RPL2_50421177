/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert2_50421177.Employee_LA2;

/**
 *
 * @author ASUS
 */

    class Employee {
    String name;
    int id;

    // Constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Method to calculate salary (Polymorphism: will be overridden in subclasses)
    public double calculateSalary() {
        return 0.0;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name + ", ID: " + id);
    }
}

