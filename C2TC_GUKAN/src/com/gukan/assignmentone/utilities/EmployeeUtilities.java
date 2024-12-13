package com.gukan.assignmentone.utilities;

import com.gukan.assignmentone.employees.Employee;
import com.gukan.assignmentone.employees.Manager;
import com.gukan.assignmentone.employees.Developer;


public class EmployeeUtilities {

    /**
     * Prints basic details of an employee.
     * @param employee the employee to print details for.
     */
    public static void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
    }

    /**
     * Prints details specific to a manager.
     * @param manager the manager to print details for.
     */
    public static void printManagerDetails(Manager manager) {
        printEmployeeDetails(manager);
        System.out.println("Department: " + manager.getDepartment());
    }

    /**
     * Prints details specific to a developer.
     * @param developer the developer to print details for.
     */
    public static void printDeveloperDetails(Developer developer) {
        printEmployeeDetails(developer);
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
    }
}