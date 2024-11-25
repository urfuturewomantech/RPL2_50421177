/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert2_50421177.Employee_LA2;

/**
 *
 * @author ASUS
 */
 
    public class Main {
    public static void main(String[] args) {
        // Create objects of PermanentEmployee and ContractEmployee
        PermanentEmployee permEmp = new PermanentEmployee("Alice", 101, 5000.0, 500.0);
        ContractEmployee contEmp = new ContractEmployee("Bob", 102, 20.0, 160);

        // Display employee details and salary
        permEmp.displayDetails();  // Polymorphism in action
        contEmp.displayDetails();  // Polymorphism in action
    }
}
