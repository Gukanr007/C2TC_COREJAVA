package com.gukan.assignmentone.employees;

public class Developer extends Employee {
    private String programmingLanguage;

    /**
     * Gets the developer's primary programming language.
     * @return the programming language.
     */
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    /**
     * Sets the developer's primary programming language.
     * @param programmingLanguage the language to set.
     */
    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}