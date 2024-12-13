package com.gukan.assignmentone.employees;

public class Manager extends Employee {
    private String department;

    /**
     * Gets the manager's department.
     * @return the department name.
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the manager's department.
     * @param department the department to set.
     */
    public void setDepartment(String department) {
        this.department = department;
    }
}